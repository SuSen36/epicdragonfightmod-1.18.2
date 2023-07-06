package susen36.epicdragonfight.api.animation;

import susen36.epicdragonfight.api.utils.math.OpenMatrix4f;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Joint {
	private final List<Joint> subJoints = new ArrayList<Joint> ();
	private final int jointId;
	private final String jointName;
	private final OpenMatrix4f localTransform;
	private OpenMatrix4f inversedTransform = new OpenMatrix4f();
	private OpenMatrix4f animatedTransform = new OpenMatrix4f();
	
	public Joint(String name, int jointID, OpenMatrix4f localTransform) {
		this.jointId = jointID;
		this.jointName = name;
		this.localTransform = localTransform;
	}

	public void addSubJoint(Joint... joints) {
		Collections.addAll(this.subJoints, joints);
	}
	
	public void setAnimatedTransform(OpenMatrix4f animatedTransform) {
		this.animatedTransform.load(animatedTransform);
	}

	public void initializeAnimationTransform() {
		this.animatedTransform.setIdentity();
		for (Joint joint : this.subJoints) {
			joint.initializeAnimationTransform();
		}
	}
	
	public void setInversedModelTransform(OpenMatrix4f parentTransform) {
		OpenMatrix4f modelTransform = OpenMatrix4f.mul(parentTransform, this.localTransform, null);
		OpenMatrix4f.invert(modelTransform, this.inversedTransform);
		
		for (Joint joint : this.subJoints) {
			joint.setInversedModelTransform(modelTransform);
		}
	}
	
	public OpenMatrix4f getLocalTrasnform() {
		return this.localTransform;
	}

	public OpenMatrix4f getAnimatedTransform() {
		return this.animatedTransform;
	}

	public OpenMatrix4f getInversedModelTransform() {
		return this.inversedTransform;
	}
	
	public List<Joint> getSubJoints() {
		return this.subJoints;
	}

	public String getName() {
		return this.jointName;
	}

	public int getId() {
		return this.jointId;
	}
	
	public String searchPath(String path, String joint) {
		if (joint.equals(this.getName())) {
			return path;
		} else {
			int i = 1;
			for (Joint subJoint : this.subJoints) {
				String str = subJoint.searchPath(String.valueOf(i) + path, joint);
				i++;
				if (str != null) {
					return str;
				}
			}
			return null;
		}
	}

}
