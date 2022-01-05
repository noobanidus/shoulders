/*
package noobanidus.mods.shoulders.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.info.ShoulderData;

public class CowModel extends AbstractQuadrupedShoulderModel {
  public CowModel() {
    super(12, 0.0f);
    this.headModel = new ModelRenderer(this, 0, 0);
    this.headModel.addBox(-4.0F, -4.0F, -6.0F, 8, 8, 6, 0.0F);
    this.headModel.setRotationPoint(0.0F, 4.0F, -8.0F);
    this.headModel.setTextureOffset(22, 0).addBox(-5.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
    this.headModel.setTextureOffset(22, 0).addBox(4.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
    this.body = new ModelRenderer(this, 18, 4);
    this.body.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10, 0.0F);
    this.body.setRotationPoint(0.0F, 5.0F, 2.0F);
    this.body.setTextureOffset(52, 0).addBox(-2.0F, 2.0F, -8.0F, 4, 6, 1);
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

  @Override
  public void scaleAndTranslate(ShoulderData data, boolean offsetArmor, boolean isSneaking, float limbSwing, float limbSwingAmount, float partialTicks, float netHeadYaw, float headPitch, float scaleIn) {
    double armorOffset = 0;
    if (offsetArmor) {
      armorOffset = -0.2;
    }
    GlStateManager.scaled(0.2, 0.2, 0.2);
    GlStateManager.translated(data.left() ? 1.875 : -1.875, isSneaking ? -0.8 + armorOffset : -1.48 + armorOffset, 0);
  }
}
*/
