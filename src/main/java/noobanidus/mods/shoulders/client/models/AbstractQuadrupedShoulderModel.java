package noobanidus.mods.shoulders.client.models;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import noobanidus.mods.shoulders.info.ShoulderData;

public abstract class AbstractQuadrupedShoulderModel extends EntityModel<Entity> implements IShoulderRidingModel {
  protected RendererModel headModel;
  protected RendererModel body;
  protected RendererModel legBackRight;
  protected RendererModel legBackLeft;
  protected RendererModel legFrontRight;
  protected RendererModel legFrontLeft;

  public AbstractQuadrupedShoulderModel() {
    this.headModel = new RendererModel(this, 0, 0);
    this.headModel.addBox(-4.0F, -4.0F, -6.0F, 8, 8, 6, 0.0F);
    this.headModel.setRotationPoint(0.0F, 4.0F, -8.0F);
    this.headModel.setTextureOffset(22, 0).addBox(-5.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
    this.headModel.setTextureOffset(22, 0).addBox(4.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
    this.body = new RendererModel(this, 18, 4);
    this.body.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10, 0.0F);
    this.body.setRotationPoint(0.0F, 5.0F, 2.0F);
    this.body.setTextureOffset(52, 0).addBox(-2.0F, 2.0F, -8.0F, 4, 6, 1);
    this.legBackRight = new RendererModel(this, 0, 16);
    this.legBackRight.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0);
    this.legBackRight.setRotationPoint(-3.0F, (float) (24 - 12), 7.0F);
    this.legBackLeft = new RendererModel(this, 0, 16);
    this.legBackLeft.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0);
    this.legBackLeft.setRotationPoint(3.0F, (float) (24 - 12), 7.0F);
    this.legFrontRight = new RendererModel(this, 0, 16);
    this.legFrontRight.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0);
    this.legFrontRight.setRotationPoint(-3.0F, (float) (24 - 12), -5.0F);
    this.legFrontLeft = new RendererModel(this, 0, 16);
    this.legFrontLeft.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0);
    this.legFrontLeft.setRotationPoint(3.0F, (float) (24 - 12), -5.0F);
  }

  public void render(float scale) {
    this.headModel.render(scale);
    this.body.render(scale);
    this.legBackRight.render(scale);
    this.legBackLeft.render(scale);
    this.legFrontRight.render(scale);
    this.legFrontLeft.render(scale);
  }

  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    this.headModel.rotateAngleX = headPitch * ((float) Math.PI / 180F);
    this.headModel.rotateAngleY = netHeadYaw * ((float) Math.PI / 180F);
    this.body.rotateAngleX = ((float) Math.PI / 2F);
    this.legBackRight.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    this.legBackLeft.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
    this.legFrontRight.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
    this.legFrontLeft.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
  }
}
