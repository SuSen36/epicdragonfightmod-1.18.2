package susen36.epicdragonfight.api.client.animation;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.util.GsonHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import susen36.epicdragonfight.api.animation.LivingMotions;
import susen36.epicdragonfight.api.animation.types.StaticAnimation;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.List;

@OnlyIn(Dist.CLIENT)
public class AnimationDataReader {
	static final Gson GSON = (new GsonBuilder()).registerTypeAdapter(AnimationDataReader.class, new Deserializer()).create();
	static final TypeToken<AnimationDataReader> TYPE = new TypeToken<AnimationDataReader>() {
	};
	
	public static void readAndApply(StaticAnimation animation, Resource iresource) {
		InputStream inputstream = null;

		try {
			inputstream = iresource.open();
		} catch (IOException var5) {
			var5.printStackTrace();
		}

		assert inputstream != null;
        Reader reader = new InputStreamReader(inputstream, StandardCharsets.UTF_8);
        AnimationDataReader propertySetter = GsonHelper.fromJson(GSON, reader, TYPE);

        if (propertySetter != null && propertySetter.jointMaskEntry.isValid()) {
            animation.addProperty(ClientAnimationProperties.JOINT_MASK, propertySetter.jointMaskEntry);
        }

        animation.addProperty(ClientAnimationProperties.PRIORITY, propertySetter.priority);
        animation.addProperty(ClientAnimationProperties.LAYER_TYPE, propertySetter.layerType);
	}
	
	private JointMaskEntry jointMaskEntry;
	private Layer.LayerType layerType;
	private Layer.Priority priority;
	
	private AnimationDataReader(JointMaskEntry jointMaskEntry, Layer.Priority priority, Layer.LayerType layerType) {
		this.jointMaskEntry = jointMaskEntry;
		this.priority = priority;
		this.layerType = layerType;
	}
	
	static class Deserializer implements JsonDeserializer<AnimationDataReader> {
		@Override
		public AnimationDataReader deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
			JsonObject jsonObject = json.getAsJsonObject();
			JointMaskEntry.Builder builder = JointMaskEntry.builder();
			Layer.Priority priority = jsonObject.has("priority") ? Layer.Priority.valueOf(GsonHelper.getAsString(jsonObject, "priority")) : Layer.Priority.LOWEST;
			Layer.LayerType layerType = jsonObject.has("layer") ? Layer.LayerType.valueOf(GsonHelper.getAsString(jsonObject, "layer")) : Layer.LayerType.BASE_LAYER;
			
			if (jsonObject.has("masks")) {
				JsonArray maskArray = jsonObject.get("masks").getAsJsonArray();
				maskArray.forEach((element) -> {
					JsonObject jointMaskEntry = element.getAsJsonObject();
					String livingMotionName = GsonHelper.getAsString(jointMaskEntry, "livingmotion");
					List<JointMask> mask = getJointMaskEntry(GsonHelper.getAsString(jointMaskEntry, "type"));
					
					if (livingMotionName.equals("ALL")) {
						builder.defaultMask(mask);
					} else {
						LivingMotions livingMotion = LivingMotions.valueOf(livingMotionName.toUpperCase());
						builder.mask(livingMotion, mask);
					}
				});
			}
			
			return new AnimationDataReader(builder.create(), priority, layerType);
		}
	}
	
	private static List<JointMask> getJointMaskEntry(String type) {
		if ("wings".equals(type)) {
			return JointMaskEntry.WINGS;
		}
		return List.of();
	}
}
