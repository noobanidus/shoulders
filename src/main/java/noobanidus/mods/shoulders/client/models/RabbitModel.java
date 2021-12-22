/*
package noobanidus.mods.shoulders.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.info.ShoulderData;

import java.util.Arrays;
import java.util.List;

public class RabbitModel extends EntityModel<Entity> implements IShoulderRidingModel {
  private final ModelRenderer rabbitLeftFoot = new ModelRenderer(this, 26, 24);
  private final ModelRenderer rabbitRightFoot;
  private final ModelRenderer rabbitLeftThigh;
  private final ModelRenderer rabbitRightThigh;
  private final ModelRenderer rabbitBody;
  private final ModelRenderer rabbitLeftArm;
  private final ModelRenderer rabbitRightArm;
  private final ModelRenderer rabbitHead;
  private final ModelRenderer rabbitRightEar;
  private final ModelRenderer rabbitLeftEar;
  private final ModelRenderer rabbitTail;
  private final ModelRenderer rabbitNose;

  public RabbitModel() {
    this.rabbitLeftFoot.addBox(-1.0F, 5.5F, -3.7F, 2, 1, 7);
    this.rabbitLeftFoot.setRotationPoint(3.0F, 17.5F, 3.7F);
    this.rabbitLeftFoot.mirror = true;
    this.setRotationOffset(this.rabbitLeftFoot, 0.0F, 0.0F, 0.0F);
    this.rabbitRightFoot = new ModelRenderer(this, 8, 24);
    this.rabbitRightFoot.addBox(-1.0F, 5.5F, -3.7F, 2, 1, 7);
    this.rabbitRightFoot.setRotationPoint(-3.0F, 17.5F, 3.7F);
    this.rabbitRightFoot.mirror = true;
    this.setRotationOffset(this.rabbitRightFoot, 0.0F, 0.0F, 0.0F);
    this.rabbitLeftThigh = new ModelRenderer(this, 30, 15);
    this.rabbitLeftThigh.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 5);
    this.rabbitLeftThigh.setRotationPoint(3.0F, 17.5F, 3.7F);
    this.rabbitLeftThigh.mirror = true;
    this.setRotationOffset(this.rabbitLeftThigh, -0.34906584F, 0.0F, 0.0F);
    this.rabbitRightThigh = new ModelRenderer(this, 16, 15);
    this.rabbitRightThigh.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 5);
    this.rabbitRightThigh.setRotationPoint(-3.0F, 17.5F, 3.7F);
    this.rabbitRightThigh.mirror = true;
    this.setRotationOffset(this.rabbitRightThigh, -0.34906584F, 0.0F, 0.0F);
    this.rabbitBody = new ModelRenderer(this, 0, 0);
    this.rabbitBody.addBox(-3.0F, -2.0F, -10.0F, 6, 5, 10);
    this.rabbitBody.setRotationPoint(0.0F, 19.0F, 8.0F);
    this.rabbitBody.mirror = true;
    this.setRotationOffset(this.rabbitBody, -0.34906584F, 0.0F, 0.0F);
    this.rabbitLeftArm = new ModelRenderer(this, 8, 15);
    this.rabbitLeftArm.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2);
    this.rabbitLeftArm.setRotationPoint(3.0F, 17.0F, -1.0F);
    this.rabbitLeftArm.mirror = true;
    this.setRotationOffset(this.rabbitLeftArm, -0.17453292F, 0.0F, 0.0F);
    this.rabbitRightArm = new ModelRenderer(this, 0, 15);
    this.rabbitRightArm.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2);
    this.rabbitRightArm.setRotationPoint(-3.0F, 17.0F, -1.0F);
    this.rabbitRightArm.mirror = true;
    this.setRotationOffset(this.rabbitRightArm, -0.17453292F, 0.0F, 0.0F);
    this.rabbitHead = new ModelRenderer(this, 32, 0);
    this.rabbitHead.addBox(-2.5F, -4.0F, -5.0F, 5, 4, 5);
    this.rabbitHead.setRotationPoint(0.0F, 16.0F, -1.0F);
    this.rabbitHead.mirror = true;
    this.setRotationOffset(this.rabbitHead, 0.0F, 0.0F, 0.0F);
    this.rabbitRightEar = new ModelRenderer(this, 52, 0);
    this.rabbitRightEar.addBox(-2.5F, -9.0F, -1.0F, 2, 5, 1);
    this.rabbitRightEar.setRotationPoint(0.0F, 16.0F, -1.0F);
    this.rabbitRightEar.mirror = true;
    this.setRotationOffset(this.rabbitRightEar, 0.0F, -0.2617994F, 0.0F);
    this.rabbitLeftEar = new ModelRenderer(this, 58, 0);
    this.rabbitLeftEar.addBox(0.5F, -9.0F, -1.0F, 2, 5, 1);
    this.rabbitLeftEar.setRotationPoint(0.0F, 16.0F, -1.0F);
    this.rabbitLeftEar.mirror = true;
    this.setRotationOffset(this.rabbitLeftEar, 0.0F, 0.2617994F, 0.0F);
    this.rabbitTail = new ModelRenderer(this, 52, 6);
    this.rabbitTail.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 2);
    this.rabbitTail.setRotationPoint(0.0F, 20.0F, 7.0F);
    this.rabbitTail.mirror = true;
    this.setRotationOffset(this.rabbitTail, -0.3490659F, 0.0F, 0.0F);
    this.rabbitNose = new ModelRenderer(this, 32, 9);
    this.rabbitNose.addBox(-0.5F, -2.5F, -5.5F, 1, 1, 1);
    this.rabbitNose.setRotationPoint(0.0F, 16.0F, -1.0F);
    this.rabbitNose.mirror = true;
    this.setRotationOffset(this.rabbitNose, 0.0F, 0.0F, 0.0F);
  }

  @Override
  public void render(float scale) {
    GlStateManager.pushMatrix();
    GlStateManager.scalef(0.6F, 0.6F, 0.6F);
    GlStateManager.translatef(0.0F, 16.0F * scale, 0.0F);
    this.rabbitLeftFoot.render(scale);
    this.rabbitRightFoot.render(scale);
    this.rabbitLeftThigh.render(scale);
    this.rabbitRightThigh.render(scale);
    this.rabbitBody.render(scale);
    this.rabbitLeftArm.render(scale);
    this.rabbitRightArm.render(scale);
    this.rabbitHead.render(scale);
    this.rabbitRightEar.render(scale);
    this.rabbitLeftEar.render(scale);
    this.rabbitTail.render(scale);
    this.rabbitNose.render(scale);
    GlStateManager.popMatrix();
  }

  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    this.rabbitNose.rotateAngleX = headPitch * ((float) Math.PI / 180F);
    this.rabbitHead.rotateAngleX = headPitch * ((float) Math.PI / 180F);
    this.rabbitRightEar.rotateAngleX = headPitch * ((float) Math.PI / 180F);
    this.rabbitLeftEar.rotateAngleX = headPitch * ((float) Math.PI / 180F);
    this.rabbitNose.rotateAngleY = netHeadYaw * ((float) Math.PI / 180F);
    this.rabbitHead.rotateAngleY = netHeadYaw * ((float) Math.PI / 180F);
    this.rabbitRightEar.rotateAngleY = this.rabbitNose.rotateAngleY - 0.2617994F;
    this.rabbitLeftEar.rotateAngleY = this.rabbitNose.rotateAngleY + 0.2617994F;
    this.rabbitLeftThigh.rotateAngleX = (-21.0F) * ((float) Math.PI / 180F);
    this.rabbitRightThigh.rotateAngleX = (-21.0F) * ((float) Math.PI / 180F);
    this.rabbitLeftFoot.rotateAngleX = 0;
    this.rabbitRightFoot.rotateAngleX = 0;
    this.rabbitLeftArm.rotateAngleX = (-11.0F) * ((float) Math.PI / 180F);
    this.rabbitRightArm.rotateAngleX = (-11.0F) * ((float) Math.PI / 180F);
  }

  private static final List<ResourceLocation> TEXTURES = Arrays.asList(
      new ResourceLocation("minecraft", "textures/entity/rabbit/brown.png"),
      new ResourceLocation("minecraft", "textures/entity/rabbit/white.png"),
      new ResourceLocation("minecraft", "textures/entity/rabbit/black.png"),
      new ResourceLocation("minecraft", "textures/entity/rabbit/gold.png"),
      new ResourceLocation("minecraft", "textures/entity/rabbit/salt.png"),
      new ResourceLocation("minecraft", "textures/entity/rabbit/white_splotched.png"),
      new ResourceLocation("minecraft", "textures/entity/rabbit/toast.png"),
      new ResourceLocation("minecraft", "textures/entity/rabbit/caerbannog.png")
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
      armorOffset = -0.1;
    }
    GlStateManager.scaled(0.65, 0.65, 0.65);
    GlStateManager.translated(data.left() ? 0.6 : -0.6, isSneaking ? -1.2 + armorOffset : -1.50 + armorOffset, -0.06);
  }
}
*/
