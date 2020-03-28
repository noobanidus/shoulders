package noobanidus.mods.shoulders.client.models;

import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.info.ShoulderData;

public class PigModel extends AbstractQuadrupedShoulderModel {
  public PigModel() {
    super(6, 0.0f);
    this.headModel.setTextureOffset(16, 16).addBox(-2.0F, 0.0F, -9.0F, 4, 3, 1, 0f);
  }

   private static final ResourceLocation PIG_TEXTURES = new ResourceLocation("textures/entity/pig/pig.png");

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    return PIG_TEXTURES;

    // TODO: Quark and charm extras support
  }
}
