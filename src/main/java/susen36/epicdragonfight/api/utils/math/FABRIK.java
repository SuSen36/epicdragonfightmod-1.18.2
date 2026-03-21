package susen36.epicdragonfight.api.utils.math;

import com.google.common.collect.Lists;
import com.mojang.math.Quaternion;
import com.mojang.math.Vector3f;
import susen36.epicdragonfight.api.animation.Animator;
import susen36.epicdragonfight.api.animation.Joint;
import susen36.epicdragonfight.api.animation.JointTransform;
import susen36.epicdragonfight.api.animation.Pose;
import susen36.epicdragonfight.api.model.Armature;

import java.util.List;

public class FABRIK {
	private Armature armature;
	private List<Chain> chains = Lists.newArrayList();
	private Vector3f target = new Vector3f();
	private Vector3f startPos = new Vector3f();
	private Pose pose;
	
	public FABRIK(Pose pose, Armature armature, String startJoint, String endJoint) {
		this.armature = armature;
		this.pose = pose;
		this.addChain(pose, this.armature.searchJointByName(startJoint), this.armature.searchJointByName(endJoint));
	}

	public void addChain(Pose pose, Joint startJoint, Joint endJoint) {
		OpenMatrix4f bindTransform = Animator.getBindedJointTransformByIndex(pose, this.armature, this.armature.searchPathIndex(startJoint.getName()));
		int pathIndex = Integer.parseInt(startJoint.searchPath(new String(""), endJoint.getName()));
		this.startPos.set(bindTransform.m30, bindTransform.m31, bindTransform.m32);
		this.addChainInternal(pose, bindTransform, startJoint, pathIndex);
	}
	
	private void addChainInternal(Pose pose, OpenMatrix4f parentTransform, Joint joint, int pathIndex) {
		Joint nextJoint = joint.getSubJoints().get((pathIndex % 10) - 1);
		JointTransform jt = pose.getOrDefaultTransform(nextJoint.getName());
		OpenMatrix4f result = jt.getAnimationBindedMatrix(nextJoint, parentTransform);
		this.chains.add(new Chain(joint.getName(), parentTransform.toTranslationVector(), result.toTranslationVector()));
		int remainPath = pathIndex / 10;
		
		if (remainPath > 0) {
			this.addChainInternal(pose, result, nextJoint, remainPath);
		}
	}
	
	public void run(Vector3f target, int iteration) {
		this.target.set(target.x, target.y, target.z);

		for (int i = 0; i < iteration; i++) {
			this.backward();
			this.forward();
		}

		Quaternion parentQuaternion = Quaternion.ONE.copy();

		for (Chain chain : this.chains) {
			Vector3f tailToHead = chain.tailToHead.copy();
			tailToHead.transform(parentQuaternion);

			Vector3f tailToNewHead = chain.head.copy();
			tailToNewHead.sub(chain.tail);

			Vector3f axis = tailToNewHead.copy();
			axis.cross(tailToHead);
			axis.normalize();

			float dot = tailToNewHead.dot(tailToHead);
			float lens = (float) Math.sqrt(tailToNewHead.dot(tailToNewHead) * tailToHead.dot(tailToHead));
			float radian = (float) Math.acos(Math.max(-1.0f, Math.min(1.0f, dot / lens)));

			Quaternion rotationQuat = new Quaternion(axis, radian, false);

			Vector3f invAxis = axis.copy();
			invAxis.mul(-1.0F);
			parentQuaternion = new Quaternion(invAxis, radian, false);

			JointTransform jt = this.pose.getOrDefaultTransform(chain.jointName);
			jt.frontResult(JointTransform.getRotation(rotationQuat), OpenMatrix4f::mulAsOriginFront);
		}
	}
	
	private void forward() {
		int chainNum = this.chains.size();
		Vector3f newTailPos = new Vector3f(this.startPos.x(), this.startPos.y(), this.startPos.z());

        for (Chain chain : this.chains) {
            chain.forwardAlign(newTailPos);
            newTailPos.set(chain.head.x(), chain.head.y(), chain.head.z());
        }
	}
	
	private void backward() {
		int chainNum = this.chains.size();
		Vector3f newHeadPos = new Vector3f(this.target.x(), this.target.y(), this.target.z());
		
		for (int i = chainNum - 1; i >= 0; i--) {
			Chain chain = this.chains.get(i);
			chain.backwardAlign(newHeadPos);
			newHeadPos.set(chain.tail.x(), chain.tail.y(), chain.tail.z());
		}
	}
	
	public List<Vector3f> getChainingPosition() {
		List<Vector3f> list = Lists.newArrayList();
		for (Chain chain : this.chains) {
			list.add(chain.tail);
		}
		
		list.add(this.chains.get(this.chains.size() - 1).head);
		return list;
	}

	class Chain {
		final String jointName;
		float length;
		Vector3f tail;
		Vector3f head;
		Vector3f tailToHead;

		Chain(String jointName, Vector3f tail, Vector3f head) {
			this.jointName = jointName;
			this.tail = tail;
			this.head = head;

			Vector3f diff = head.copy();
			diff.sub(tail);
			this.tailToHead = diff;

			float dx = head.x() - tail.x();
			float dy = head.y() - tail.y();
			float dz = head.z() - tail.z();
			this.length = (float) Math.sqrt(dx * dx + dy * dy + dz * dz);
		}

		public void forwardAlign(Vector3f newHeadPos) {
			this.correct(this.tail, this.head, newHeadPos);
		}

		public void backwardAlign(Vector3f newHeadPos) {
			this.correct(this.head, this.tail, newHeadPos);
		}

		private void correct(Vector3f start, Vector3f end, Vector3f newpos) {
			start.set(newpos.x(), newpos.y(), newpos.z());
			Vector3f startToEnd = end.copy(); startToEnd.sub(start);
			float newLength = (float) Math.sqrt(startToEnd.dot(startToEnd));
			float lengthRatio = this.length / newLength;
			Vector3f startToEndScaled = startToEnd.copy(); startToEndScaled.mul(lengthRatio);
			Vector3f finalPos = start.copy(); finalPos.add(startToEndScaled); end.set(finalPos.x(), finalPos.y(), finalPos.z());
		}
	}
}