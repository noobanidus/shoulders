package noobanidus.mods.shoulders.client.models;

import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.info.ShoulderData;

public class CowModel extends AbstractQuadrupedShoulderModel {
  public CowModel() {
    super(12, 0.0f);
    --this.legBackRight.rotationPointX;
    ++this.legBackLeft.rotationPointX;
    this.legBackRight.rotationPointZ += 0.0F;
    this.legBackLeft.rotationPointZ += 0.0F;
    --this.legFrontRight.rotationPointX;
    ++this.legFrontLeft.rotationPointX;
    --this.legFrontRight.rotationPointZ;
    --this.legFrontLeft.rotationPointZ;
  }

  private static final ResourceLocation COW_TEXTURES = new ResourceLocation("textures/entity/cow/cow.png");

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    return COW_TEXTURES;
  }
}
