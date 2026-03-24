package susen36.epicdragonfight.api.utils.math;

import com.google.common.collect.Lists;
import net.minecraft.util.Mth;
import org.joml.Quaternionf;
import org.joml.Vector3f;
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
		this.target.set(target);

		for (int i = 0; i < iteration; i++) {
			this.backward();
			this.forward();
		}
		Quaternionf parentQuaternion = new Quaternionf();

		for (Chain chain : this.chains) {
			Vector3f tailToHead = new Vector3f(chain.tailToHead);
			tailToHead.rotate(parentQuaternion);

			Vector3f tailToNewHead = new Vector3f(chain.head);
			tailToNewHead.sub(chain.tail);

			Vector3f axis = new Vector3f(tailToNewHead);
			axis.cross(tailToHead);

			if (axis.lengthSquared() > 1.0E-7F) {
				axis.normalize();
			} else {
				axis.set(1, 0, 0);
			}

			float dot = tailToNewHead.dot(tailToHead);
			float lens = (float) Math.sqrt(tailToNewHead.lengthSquared() * tailToHead.lengthSquared());
			float radian = (float) Math.acos(Mth.clamp(dot / lens, -1.0f, 1.0f));

			Quaternionf rotationQuat = new Quaternionf().rotationAxis(radian, axis);

			Vector3f invAxis = new Vector3f(axis).mul(-1.0F);
			parentQuaternion = new Quaternionf().rotationAxis(radian, invAxis);

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
			Vector3f diff = new Vector3f(head);
			diff.sub(tail);
			this.tailToHead = diff;
			this.length = head.distance(tail);
		}

		public void forwardAlign(Vector3f newHeadPos) {
			this.correct(this.tail, this.head, newHeadPos);
		}

		public void backwardAlign(Vector3f newHeadPos) {
			this.correct(this.head, this.tail, newHeadPos);
		}

		private void correct(Vector3f start, Vector3f end, Vector3f newpos) {
			start.set(newpos);

			Vector3f startToEnd = new Vector3f(end).sub(start);
			float currentDistance = startToEnd.length();

			if (currentDistance > 1.0E-7F) {
				float lengthRatio = this.length / currentDistance;

				startToEnd.mul(lengthRatio);
				end.set(start).add(startToEnd);
			}
		}
	}
}