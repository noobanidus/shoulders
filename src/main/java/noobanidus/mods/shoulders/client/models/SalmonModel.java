/*
package noobanidus.mods.shoulders.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.info.ShoulderData;

public class SalmonModel extends EntityModel<Entity> implements IShoulderRidingModel {
  private final ModelRenderer bodyFront;
  private final ModelRenderer bodyRear;
  private final ModelRenderer head;
  private final ModelRenderer finTopFront;
  private final ModelRenderer finTopRear;
  private final ModelRenderer tail;
  private final ModelRenderer finRight;
  private final ModelRenderer finLeft;

  public SalmonModel() {
    this.textureWidth = 32;
    this.textureHeight = 32;
    this.bodyFront = new ModelRenderer(this, 0, 0);
    this.bodyFront.addBox(-1.5F, -2.5F, 0.0F, 3, 5, 8);
    this.bodyFront.setRotationPoint(0.0F, 20.0F, 0.0F);
    this.bodyRear = new ModelRenderer(this, 0, 13);
    this.bodyRear.addBox(-1.5F, -2.5F, 0.0F, 3, 5, 8);
    this.bodyRear.setRotationPoint(0.0F, 20.0F, 8.0F);
    this.head = new ModelRenderer(this, 22, 0);
    this.head.addBox(-1.0F, -2.0F, -3.0F, 2, 4, 3);
    this.head.setRotationPoint(0.0F, 20.0F, 0.0F);
    this.tail = new ModelRenderer(this, 20, 10);
    this.tail.addBox(0.0F, -2.5F, 0.0F, 0, 5, 6);
    this.tail.setRotationPoint(0.0F, 0.0F, 8.0F);
    this.bodyRear.addChild(this.tail);
    this.finTopFront = new ModelRenderer(this, 2, 1);
    this.finTopFront.addBox(0.0F, 0.0F, 0.0F, 0, 2, 3);
    this.finTopFront.setRotationPoint(0.0F, -4.5F, 5.0F);
    this.bodyFront.addChild(this.finTopFront);
    this.finTopRear = new ModelRenderer(this, 0, 2);
    this.finTopRear.addBox(0.0F, 0.0F, 0.0F, 0, 2, 4);
    this.finTopRear.setRotationPoint(0.0F, -4.5F, -1.0F);
    this.bodyRear.addChild(this.finTopRear);
    this.finRight = new ModelRenderer(this, -4, 0);
    this.finRight.addBox(-2.0F, 0.0F, 0.0F, 2, 0, 2);
    this.finRight.setRotationPoint(-1.5F, 21.5F, 0.0F);
    this.finRight.rotateAngleZ = (-(float) Math.PI / 4F);
    this.finLeft = new ModelRenderer(this, 0, 0);
    this.finLeft.addBox(0.0F, 0.0F, 0.0F, 2, 0, 2);
    this.finLeft.setRotationPoint(1.5F, 21.5F, 0.0F);
    this.finLeft.rotateAngleZ = ((float) Math.PI / 4F);
  }

  @Override
  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    //this.bodyRear.rotateAngleY = 0.5f * 0.25F * MathHelper.sin(0.6f * 0.6F * ageInTicks);
    this.head.rotateAngleX = ((headPitch * ((float) Math.PI / 180F)) * 0.5f) * 0.2f;
    this.head.rotateAngleY = ((netHeadYaw * ((float) Math.PI / 180F)) * 0.5f) * 0.8f;
    this.tail.rotateAngleY = -(((netHeadYaw * ((float) Math.PI / 180F)) * 0.5f) * 0.8f);
  }

  @Override
  public void render(float scale) {
    this.bodyFront.render(scale);
    this.bodyRear.render(scale);
    this.head.render(scale);
    this.finRight.render(scale);
    this.finLeft.render(scale);
  }

  private static final ResourceLocation SALMON_LOCATION = new ResourceLocation("textures/entity/fish/salmon.png");

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    return SALMON_LOCATION;
  }

  @Override
  public void scaleAndTranslate(ShoulderData data, boolean offsetArmor, boolean isSneaking, float limbSwing, float limbSwingAmount, float partialTicks, float netHeadYaw, float headPitch, float scaleIn) {
    double armorOffset = 0;
    if (offsetArmor) {
      armorOffset = -0.35;
    }
    GlStateManager.scaled(0.22, 0.22, 0.22);
    GlStateManager.translated(data.left() ? 1.68 : -1.68, isSneaking ? -1.08 + armorOffset : -1.45 + armorOffset, -0.5);
  }
}
*/
