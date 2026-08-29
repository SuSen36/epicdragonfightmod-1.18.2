package susen36.epicdragonfight.api.animation.types;

import susen36.epicdragonfight.entitypatch.IDragonPatch;

public class MainFrameAnimation extends StaticAnimation {
	public MainFrameAnimation(float convertTime, String name) {
		super(convertTime, false, name);
	}
	
	@Override
	public void begin(IDragonPatch entitypatch) {
		super.begin(entitypatch);
		entitypatch.updateEntityState();
	}

}