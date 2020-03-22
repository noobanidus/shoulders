package noobanidus.mods.shoulders.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import noobanidus.mods.shoulders.common.info.ShoulderData;

public class TurtleModel extends EntityModel<Entity> implements IShoulderRidingModel {
  private final RendererModel headModel;
  private final RendererModel body;
  private final RendererModel legBackRight;
  private final RendererModel legBackLeft;
  private final RendererModel legFrontRight;
  private final RendererModel legFrontLeft;

  public TurtleModel () {
    this.textureWidth = 128;
    this.textureHeight = 64;
    this.headModel = new RendererModel(this, 3, 0);
    this.headModel.addBox(-3.0F, -1.0F, -3.0F, 6, 5, 6, 0.0F);
    this.headModel.setRotationPoint(0.0F, 19.0F, -10.0F);
    this.body = new RendererModel(this);
    this.body.setTextureOffset(7, 37).addBox(-9.5F, 3.0F, -10.0F, 19, 20, 6, 0.0F);
    this.body.setTextureOffset(31, 1).addBox(-5.5F, 3.0F, -13.0F, 11, 18, 3, 0.0F);
    this.body.setRotationPoint(0.0F, 11.0F, -10.0F);
    this.legBackRight = new RendererModel(this, 1, 23);
    this.legBackRight.addBox(-2.0F, 0.0F, 0.0F, 4, 1, 10, 0.0F);
    this.legBackRight.setRotationPoint(-3.5F, 22.0F, 11.0F);
    this.legBackLeft = new RendererModel(this, 1, 12);
    this.legBackLeft.addBox(-2.0F, 0.0F, 0.0F, 4, 1, 10, 0.0F);
    this.legBackLeft.setRotationPoint(3.5F, 22.0F, 11.0F);
    this.legFrontRight = new RendererModel(this, 27, 30);
    this.legFrontRight.addBox(-13.0F, 0.0F, -2.0F, 13, 1, 5, 0.0F);
    this.legFrontRight.setRotationPoint(-5.0F, 21.0F, -4.0F);
    this.legFrontLeft = new RendererModel(this, 27, 24);
    this.legFrontLeft.addBox(0.0F, 0.0F, -2.0F, 13, 1, 5, 0.0F);
    this.legFrontLeft.setRotationPoint(5.0F, 21.0F, -4.0F);
  }

  public void render(float scale) {
    GlStateManager.pushMatrix();
    this.headModel.render(scale);
    this.body.render(scale);
    GlStateManager.pushMatrix();
    this.legBackRight.render(scale);
    this.legBackLeft.render(scale);
    GlStateManager.popMatrix();
    this.legFrontRight.render(scale);
    this.legFrontLeft.render(scale);
    GlStateManager.popMatrix();
  }

  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    this.headModel.rotateAngleX = headPitch * 0.017453292F;
    this.headModel.rotateAngleY = netHeadYaw * 0.017453292F;
    this.body.rotateAngleX = 1.5707964F;
    this.legFrontRight.rotateAngleX = 0.0F;
    this.legFrontLeft.rotateAngleX = 0.0F;
    this.legFrontRight.rotateAngleY = 0.0F;
    this.legFrontLeft.rotateAngleY = 0.0F;
    this.legBackRight.rotateAngleY = 0.0F;
    this.legBackLeft.rotateAngleY = 0.0F;
    this.legFrontRight.rotateAngleY = MathHelper.cos(limbSwing * 5.0F + 3.1415927F) * 8.0F * limbSwingAmount;
    this.legFrontRight.rotateAngleZ = 0.0F;
    this.legFrontLeft.rotateAngleY = MathHelper.cos(limbSwing * 5.0F) * 8.0F * limbSwingAmount;
    this.legFrontLeft.rotateAngleZ = 0.0F;
    this.legBackRight.rotateAngleY = MathHelper.cos(limbSwing * 5.0F + 3.1415927F) * 3.0F * limbSwingAmount;
    this.legBackRight.rotateAngleX = 0.0F;
    this.legBackLeft.rotateAngleY = MathHelper.cos(limbSwing * 5.0F) * 3.0F * limbSwingAmount;
    this.legBackLeft.rotateAngleX = 0.0F;
  }

  private static final ResourceLocation BIG_SEA_TURTLE = new ResourceLocation("textures/entity/turtle/big_sea_turtle.png");

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    return BIG_SEA_TURTLE;
  }
}
