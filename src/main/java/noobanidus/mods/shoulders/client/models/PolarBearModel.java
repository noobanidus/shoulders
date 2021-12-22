/*
package noobanidus.mods.shoulders.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.info.ShoulderData;

public class PolarBearModel extends AbstractQuadrupedShoulderModel {
  public PolarBearModel() {
    super(12, 0.0F);
    this.textureWidth = 128;
    this.textureHeight = 64;
    this.headModel = new ModelRenderer(this, 0, 0);
    this.headModel.addBox(-3.5F, -3.0F, -3.0F, 7, 7, 7, 0.0F);
    this.headModel.setRotationPoint(0.0F, 10.0F, -16.0F);
    this.headModel.setTextureOffset(0, 44).addBox(-2.5F, 1.0F, -6.0F, 5, 3, 3, 0.0F);
    this.headModel.setTextureOffset(26, 0).addBox(-4.5F, -4.0F, -1.0F, 2, 2, 1, 0.0F);
    ModelRenderer ModelRenderer = this.headModel.setTextureOffset(26, 0);
    ModelRenderer.mirror = true;
    ModelRenderer.addBox(2.5F, -4.0F, -1.0F, 2, 2, 1, 0.0F);
    this.body = new ModelRenderer(this);
    this.body.setTextureOffset(0, 19).addBox(-5.0F, -13.0F, -7.0F, 14, 14, 11, 0.0F);
    this.body.setTextureOffset(39, 0).addBox(-4.0F, -25.0F, -7.0F, 12, 12, 10, 0.0F);
    this.body.setRotationPoint(-2.0F, 9.0F, 12.0F);
    int i = 10;
    this.legBackRight = new ModelRenderer(this, 50, 22);
    this.legBackRight.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 8, 0.0F);
    this.legBackRight.setRotationPoint(-3.5F, 14.0F, 6.0F);
    this.legBackLeft = new ModelRenderer(this, 50, 22);
    this.legBackLeft.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 8, 0.0F);
    this.legBackLeft.setRotationPoint(3.5F, 14.0F, 6.0F);
    this.legFrontRight = new ModelRenderer(this, 50, 40);
    this.legFrontRight.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 6, 0.0F);
    this.legFrontRight.setRotationPoint(-2.5F, 14.0F, -7.0F);
    this.legFrontLeft = new ModelRenderer(this, 50, 40);
    this.legFrontLeft.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 6, 0.0F);
    this.legFrontLeft.setRotationPoint(2.5F, 14.0F, -7.0F);
    --this.legBackRight.rotationPointX;
    ++this.legBackLeft.rotationPointX;
    this.legBackRight.rotationPointZ += 0.0F;
    this.legBackLeft.rotationPointZ += 0.0F;
    --this.legFrontRight.rotationPointX;
    ++this.legFrontLeft.rotationPointX;
    --this.legFrontRight.rotationPointZ;
    --this.legFrontLeft.rotationPointZ;
  }

  @Override
  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    this.headModel.rotateAngleX = (headPitch * ((float) Math.PI / 180F)) * 0.5f;
    this.headModel.rotateAngleY = (netHeadYaw * ((float) Math.PI / 180F)) * 0.5f;
    this.body.rotateAngleX = ((float) Math.PI / 2F);
  }

  private static final ResourceLocation POLAR_BEAR_TEXTURE = new ResourceLocation("textures/entity/bear/polarbear.png");

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    return POLAR_BEAR_TEXTURE;
  }

  @Override
  public void scaleAndTranslate(ShoulderData data, boolean offsetArmor, boolean isSneaking, float limbSwing, float limbSwingAmount, float partialTicks, float netHeadYaw, float headPitch, float scaleIn) {
    double armorOffset = 0;
    GlStateManager.scaled(0.2, 0.2, 0.2);
    GlStateManager.translated(data.left() ? 1.85 : -1.85, isSneaking ? -0.5 + armorOffset : -1.5 + armorOffset, 0);
  }
}
*/
