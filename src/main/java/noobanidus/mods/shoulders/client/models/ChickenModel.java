/*
package noobanidus.mods.shoulders.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import noobanidus.mods.shoulders.info.ShoulderData;

public class ChickenModel extends EntityModel<Entity> implements IShoulderRidingModel {
  private final ModelRenderer head;
  private final ModelRenderer body;
  private final ModelRenderer rightLeg;
  private final ModelRenderer leftLeg;
  private final ModelRenderer rightWing;
  private final ModelRenderer leftWing;
  private final ModelRenderer beak;
  private final ModelRenderer redThing;

  public ChickenModel() {
    this.head = new ModelRenderer(this, 0, 0);
    this.head.addBox(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
    this.head.setRotationPoint(0.0F, 15.0F, -4.0F);
    this.beak = new ModelRenderer(this, 14, 0);
    this.beak.addBox(-2.0F, -4.0F, -4.0F, 4, 2, 2, 0.0F);
    this.beak.setRotationPoint(0.0F, 15.0F, -4.0F);
    this.redThing = new ModelRenderer(this, 14, 4);
    this.redThing.addBox(-1.0F, -2.0F, -3.0F, 2, 2, 2, 0.0F);
    this.redThing.setRotationPoint(0.0F, 15.0F, -4.0F);
    this.body = new ModelRenderer(this, 0, 9);
    this.body.addBox(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
    this.body.setRotationPoint(0.0F, 16.0F, 0.0F);
    this.rightLeg = new ModelRenderer(this, 26, 0);
    this.rightLeg.addBox(-1.0F, 0.0F, -3.0F, 3, 5, 3);
    this.rightLeg.setRotationPoint(-2.0F, 19.0F, 1.0F);
    this.leftLeg = new ModelRenderer(this, 26, 0);
    this.leftLeg.addBox(-1.0F, 0.0F, -3.0F, 3, 5, 3);
    this.leftLeg.setRotationPoint(1.0F, 19.0F, 1.0F);
    this.rightWing = new ModelRenderer(this, 24, 13);
    this.rightWing.addBox(0.0F, 0.0F, -3.0F, 1, 4, 6);
    this.rightWing.setRotationPoint(-4.0F, 13.0F, 0.0F);
    this.leftWing = new ModelRenderer(this, 24, 13);
    this.leftWing.addBox(-1.0F, 0.0F, -3.0F, 1, 4, 6);
    this.leftWing.setRotationPoint(4.0F, 13.0F, 0.0F);
  }

  public void render(float scale) {
    this.head.render(scale);
    this.beak.render(scale);
    this.redThing.render(scale);
    this.body.render(scale);
    this.rightLeg.render(scale);
    this.leftLeg.render(scale);
    this.rightWing.render(scale);
    this.leftWing.render(scale);
  }

  private static final ResourceLocation CHICKEN_TEXTURES = new ResourceLocation("minecraft", "textures/entity/chicken.png");

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    return CHICKEN_TEXTURES;
  }

  @Override
  public void scaleAndTranslate(ShoulderData data, boolean offsetArmor, boolean isSneaking, float limbSwing, float limbSwingAmount, float partialTicks, float netHeadYaw, float headPitch, float scaleIn) {
    double armorOffset = 0;
    if (offsetArmor) {
      armorOffset = -0.15;
    }
    GlStateManager.scaled(0.4, 0.4, 0.4);
    GlStateManager.translated(data.left() ? 0.95 : -0.95, isSneaking ? -1.25 + armorOffset : -1.55 + armorOffset, -0.06);
  }

  @Override
  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    this.head.rotateAngleX = headPitch * ((float) Math.PI / 180F);
    this.head.rotateAngleY = netHeadYaw * ((float) Math.PI / 180F);
    this.beak.rotateAngleX = this.head.rotateAngleX;
    this.beak.rotateAngleY = this.head.rotateAngleY;
    this.redThing.rotateAngleX = this.head.rotateAngleX;
    this.redThing.rotateAngleY = this.head.rotateAngleY;
    this.body.rotateAngleX = ((float) Math.PI / 2F);
    this.rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    this.leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
    this.rightWing.rotateAngleZ = ageInTicks;
    this.leftWing.rotateAngleZ = -ageInTicks;
  }
}
*/
