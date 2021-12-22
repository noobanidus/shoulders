/*
package noobanidus.mods.shoulders.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.info.ShoulderData;

import java.util.Arrays;
import java.util.List;

public class PandaModel extends AbstractQuadrupedShoulderModel {
  public PandaModel() {
    super(9, 0.0f);
    this.textureWidth = 64;
    this.textureHeight = 64;
    this.headModel = new ModelRenderer(this, 0, 6);
    this.headModel.addBox(-6.5F, -5.0F, -4.0F, 13, 10, 9);
    this.headModel.setRotationPoint(0.0F, 11.5F, -17.0F);
    this.headModel.setTextureOffset(45, 16).addBox(-3.5F, 0.0F, -6.0F, 7, 5, 2);
    this.headModel.setTextureOffset(52, 25).addBox(-8.5F, -8.0F, -1.0F, 5, 4, 1);
    this.headModel.setTextureOffset(52, 25).addBox(3.5F, -8.0F, -1.0F, 5, 4, 1);
    this.body = new ModelRenderer(this, 0, 25);
    this.body.addBox(-9.5F, -13.0F, -6.5F, 19, 26, 13);
    this.body.setRotationPoint(0.0F, 10.0F, 0.0F);
    this.legBackRight = new ModelRenderer(this, 40, 0);
    this.legBackRight.addBox(-3.0F, 0.0F, -3.0F, 6, 9, 6);
    this.legBackRight.setRotationPoint(-5.5F, 15.0F, 9.0F);
    this.legBackLeft = new ModelRenderer(this, 40, 0);
    this.legBackLeft.addBox(-3.0F, 0.0F, -3.0F, 6, 9, 6);
    this.legBackLeft.setRotationPoint(5.5F, 15.0F, 9.0F);
    this.legFrontRight = new ModelRenderer(this, 40, 0);
    this.legFrontRight.addBox(-3.0F, 0.0F, -3.0F, 6, 9, 6);
    this.legFrontRight.setRotationPoint(-5.5F, 15.0F, -9.0F);
    this.legFrontLeft = new ModelRenderer(this, 40, 0);
    this.legFrontLeft.addBox(-3.0F, 0.0F, -3.0F, 6, 9, 6);
    this.legFrontLeft.setRotationPoint(5.5F, 15.0F, -9.0F);
  }

  @Override
  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    super.setRotationAngles(data, ticksExisted, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
    this.legBackRight.rotateAngleZ = 0.0F;
    this.legBackLeft.rotateAngleZ = 0.0F;
    this.legFrontRight.rotateAngleZ = 0.0F;
    this.legFrontLeft.rotateAngleZ = 0.0F;
  }

  private static final List<ResourceLocation> TEXTURES = Arrays.asList(
      new ResourceLocation("textures/entity/panda/panda.png"),
      new ResourceLocation("textures/entity/panda/lazy_panda.png"),
      new ResourceLocation("textures/entity/panda/worried_panda.png"),
      new ResourceLocation("textures/entity/panda/playful_panda.png"),
      new ResourceLocation("textures/entity/panda/brown_panda.png"),
      new ResourceLocation("textures/entity/panda/weak_panda.png"),
      new ResourceLocation("textures/entity/panda/aggressive_panda.png")
  );

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    if (data.getVariant() < TEXTURES.size()) {
      return TEXTURES.get(data.getVariant());
    }

    return TEXTURES.get(0);
  }

  @Override
  public void scaleAndTranslate(ShoulderData data, boolean offsetArmor, boolean isSneaking, float limbSwing, float limbSwingAmount, float partialTicks, float netHeadYaw, float headPitch, float scaleIn) {
    double armorOffset = 0;
    if (offsetArmor) {
      armorOffset = -0.2;
    }
    GlStateManager.scaled(0.15, 0.15, 0.15);
    GlStateManager.translated(data.left() ? 2.47 : -2.47, isSneaking ? -0.8 + armorOffset : -1.48 + armorOffset, 0);
  }
}
*/
