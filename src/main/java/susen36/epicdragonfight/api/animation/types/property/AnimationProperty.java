package susen36.epicdragonfight.api.animation.types.property;

import susen36.epicdragonfight.api.animation.types.StaticAnimation;

public abstract class AnimationProperty<T> {
	public static class StaticAnimationProperty<T> extends AnimationProperty<T> {
		/**
		 * You can put the various events in animation. Must be registered in order of time.
		 */
		public static final StaticAnimationProperty<StaticAnimation.Event[]> EVENTS = new StaticAnimationProperty<StaticAnimation.Event[]> ();
		
		/**
		 * You can set the fixed play speed of the animation.
		 */
		public static final StaticAnimationProperty<Float> PLAY_SPEED = new StaticAnimationProperty<Float> ();
	}
	
	public static class ActionAnimationProperty<T> extends AnimationProperty<T> {
		/**
		 * This property will set the entity's delta movement to (0, 0, 0) on beginning of the animation if true.
		 */
		public static final ActionAnimationProperty<Boolean> STOP_MOVEMENT = new ActionAnimationProperty<Boolean> ();
		}
	
	public static class AttackAnimationProperty<T> extends AnimationProperty<T> {
		/**
		 * This property determines if the player's camera is fixed during the attacking phase.
		 */
		public static final AttackAnimationProperty<Boolean> LOCK_ROTATION = new AttackAnimationProperty<Boolean> ();
	}

}