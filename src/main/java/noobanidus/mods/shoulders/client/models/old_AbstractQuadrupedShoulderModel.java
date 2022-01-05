/*
package noobanidus.mods.shoulders.client.models;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import noobanidus.mods.shoulders.info.ShoulderData;

public abstract class AbstractQuadrupedShoulderModel extends EntityModel<Entity> {
  protected ModelRenderer headModel;
  protected ModelRenderer body;
  protected ModelRenderer legBackRight;
  protected ModelRenderer legBackLeft;
  protected ModelRenderer legFrontRight;
  protected ModelRenderer legFrontLeft;

  public AbstractQuadrupedShoulderModel(int height, float scale) {
    this.headModel = new ModelRenderer(this, 0, 0);
    this.headModel.addBox(-4.0F, -4.0F, -8.0F, 8, 8, 8, scale);
    this.headModel.setRotationPoint(0.0F, (float) (18 - height), -6.0F);
    this.body = new ModelRenderer(this, 28, 8);
    this.body.addBox(-5.0F, -10.0F, -7.0F, 10, 16, 8, scale);
    this.body.setRotationPoint(0.0F, (float) (17 - height), 2.0F);
    this.legBackRight = new ModelRenderer(this, 0, 16);
    this.legBackRight.addBox(-2.0F, 0.0F, -2.0F, 4, height, 4, scale);
    this.legBackRight.setRotationPoint(-3.0F, (float) (24 - height), 7.0F);
    this.legBackLeft = new ModelRenderer(this, 0, 16);
    this.legBackLeft.addBox(-2.0F, 0.0F, -2.0F, 4, height, 4, scale);
    this.legBackLeft.setRotationPoint(3.0F, (float) (24 - height), 7.0F);
    this.legFrontRight = new ModelRenderer(this, 0, 16);
    this.legFrontRight.addBox(-2.0F, 0.0F, -2.0F, 4, height, 4, scale);
    this.legFrontRight.setRotationPoint(-3.0F, (float) (24 - height), -5.0F);
    this.legFrontLeft = new ModelRenderer(this, 0, 16);
    this.legFrontLeft.addBox(-2.0F, 0.0F, -2.0F, 4, height, 4, scale);
    this.legFrontLeft.setRotationPoint(3.0F, (float) (24 - height), -5.0F);
  }

  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    this.headModel.rotateAngleX = headPitch * ((float) Math.PI / 180F);
    this.headModel.rotateAngleY = netHeadYaw * ((float) Math.PI / 180F);
    this.body.rotateAngleX = ((float) Math.PI / 2F);
  }
}

*/
