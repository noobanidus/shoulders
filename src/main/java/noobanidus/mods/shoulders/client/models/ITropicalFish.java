package noobanidus.mods.shoulders.client.models;

import net.minecraft.item.DyeColor;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.info.ShoulderData;

import javax.annotation.Nullable;
import java.util.List;

public interface ITropicalFish {
  default float[] getBodyColour(ShoulderData data) {
    return DyeColor.byId((data.getVariant() >> 8) & 255).getTextureDiffuseColors();
  }

  default float[] getPatternColour(ShoulderData data) {
    return DyeColor.byId(data.getVariant() & 255).getTextureDiffuseColors();
  }

  @Nullable
  default ResourceLocation getPattern(List<ResourceLocation> PATTERNS, ShoulderData data) {
    int var = data.getVariant() >> 16;
    if (var < PATTERNS.size()) {
      return PATTERNS.get(var);
    }

    return null;
  }
}
