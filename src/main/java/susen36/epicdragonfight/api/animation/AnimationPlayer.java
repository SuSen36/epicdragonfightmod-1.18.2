package susen36.epicdragonfight.api.animation;

import susen36.epicdragonfight.api.animation.types.DynamicAnimation;
import susen36.epicdragonfight.entitypatch.IDragonPatch;
import susen36.epicdragonfight.gameasset.Animations;

public class AnimationPlayer {
	private float elapsedTime;
	private float prevElapsedTime;
	private boolean isEnd;
	private boolean doNotResetNext;
	private boolean reversed;
	private DynamicAnimation play;
	
	public AnimationPlayer() {
		this.setPlayAnimation(Animations.DUMMY_ANIMATION);
	}
	
	public void tick(IDragonPatch entitypatch) {
		float delta = (float) (0.05 * this.getAnimation().getPlaySpeed(entitypatch) *
                        (this.isReversed() && this.getAnimation().canBePlayedReverse() ? -1.0F : 1.0F));
		this.prevElapsedTime = this.elapsedTime;
		this.elapsedTime += delta;
		
		if (this.play.isRepeat()) {
			// 循环动画无休止累计时间，循环取模由 vanilla KeyframeAnimations 处理，避免此处 totalTime 未设置时卡回首帧
			return;
		}
		
		if (this.elapsedTime >= this.play.getTotalTime()) {
			this.elapsedTime = this.play.getTotalTime();
			this.isEnd = true;
		} else if (this.elapsedTime < 0) {
			System.out.println("?? " + this.getAnimation());
			this.elapsedTime = 0.0F;
			this.isEnd = true;
		}
	}

	public void reset() {
		this.elapsedTime = 0;
		this.prevElapsedTime = 0;
		this.isEnd = false;
	}
	
	public void setPlayAnimation(DynamicAnimation animation) {
		if (this.doNotResetNext) {
			this.doNotResetNext = false;
		} else {
			this.reset();
		}
		
		this.play = animation;
	}
	
	public float getElapsedTime() {
		return this.elapsedTime;
	}
	
	public float getPrevElapsedTime() {
		return this.prevElapsedTime;
	}
	
	public void setElapsedTime(float elapsedTime) {
		this.elapsedTime = elapsedTime;
		this.prevElapsedTime = elapsedTime;
		this.isEnd = false;
	}
	
	public DynamicAnimation getAnimation() {
		return this.play;
	}

	public void markToDoNotReset() {
		this.doNotResetNext = true;
	}

	public boolean isEnd() {
		return this.isEnd;
	}
	
	public boolean isReversed() {
		return this.reversed;
	}
	
	public void setReversed(boolean reversed) {
		this.reversed = reversed;
	}

}