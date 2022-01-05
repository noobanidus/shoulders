/*
package noobanidus.mods.shoulders.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import noobanidus.mods.shoulders.info.ShoulderData;

import java.util.Arrays;
import java.util.List;

public class ParrotModel extends EntityModel<Entity> implements IShoulderRidingModel {
  private final ModelRenderer body;
  private final ModelRenderer tail;
  private final ModelRenderer wingLeft;
  private final ModelRenderer wingRight;
  private final ModelRenderer head;
  private final ModelRenderer head2;
  private final ModelRenderer beak1;
  private final ModelRenderer beak2;
  private final ModelRenderer feather;
  private final ModelRenderer legLeft;
  private final ModelRenderer legRight;

  public ParrotModel() {
    this.textureWidth = 32;
    this.textureHeight = 32;
    this.body = new ModelRenderer(this, 2, 8);
    this.body.addBox(-1.5F, 0.0F, -1.5F, 3, 6, 3);
    this.body.setRotationPoint(0.0F, 16.5F, -3.0F);
    this.tail = new ModelRenderer(this, 22, 1);
    this.tail.addBox(-1.5F, -1.0F, -1.0F, 3, 4, 1);
    this.tail.setRotationPoint(0.0F, 21.07F, 1.16F);
    this.wingLeft = new ModelRenderer(this, 19, 8);
    this.wingLeft.addBox(-0.5F, 0.0F, -1.5F, 1, 5, 3);
    this.wingLeft.setRotationPoint(1.5F, 16.94F, -2.76F);
    this.wingRight = new ModelRenderer(this, 19, 8);
    this.wingRight.addBox(-0.5F, 0.0F, -1.5F, 1, 5, 3);
    this.wingRight.setRotationPoint(-1.5F, 16.94F, -2.76F);
    this.head = new ModelRenderer(this, 2, 2);
    this.head.addBox(-1.0F, -1.5F, -1.0F, 2, 3, 2);
    this.head.setRotationPoint(0.0F, 15.69F, -2.76F);
    this.head2 = new ModelRenderer(this, 10, 0);
    this.head2.addBox(-1.0F, -0.5F, -2.0F, 2, 1, 4);
    this.head2.setRotationPoint(0.0F, -2.0F, -1.0F);
    this.head.addChild(this.head2);
    this.beak1 = new ModelRenderer(this, 11, 7);
    this.beak1.addBox(-0.5F, -1.0F, -0.5F, 1, 2, 1);
    this.beak1.setRotationPoint(0.0F, -0.5F, -1.5F);
    this.head.addChild(this.beak1);
    this.beak2 = new ModelRenderer(this, 16, 7);
    this.beak2.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1);
    this.beak2.setRotationPoint(0.0F, -1.75F, -2.45F);
    this.head.addChild(this.beak2);
    this.feather = new ModelRenderer(this, 2, 18);
    this.feather.addBox(0.0F, -4.0F, -2.0F, 0, 5, 4);
    this.feather.setRotationPoint(0.0F, -2.15F, 0.15F);
    this.head.addChild(this.feather);
    this.legLeft = new ModelRenderer(this, 14, 18);
    this.legLeft.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1);
    this.legLeft.setRotationPoint(1.0F, 22.0F, -1.05F);
    this.legRight = new ModelRenderer(this, 14, 18);
    this.legRight.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1);
    this.legRight.setRotationPoint(-1.0F, 22.0F, -1.05F);
  }

  @Override
  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    this.feather.rotateAngleX = -0.2214F;
    this.body.rotateAngleX = 0.4937F;
    this.wingLeft.rotateAngleX = -0.6981F;
    this.wingLeft.rotateAngleY = -(float) Math.PI;
    this.wingRight.rotateAngleX = -0.6981F;
    this.wingRight.rotateAngleY = -(float) Math.PI;
    this.legLeft.rotateAngleX = -0.0299F;
    this.legRight.rotateAngleX = -0.0299F;
    this.legLeft.rotationPointY = 22.0F;
    this.legRight.rotationPointY = 22.0F;
    this.legLeft.rotateAngleZ = 0.0F;
    this.legRight.rotateAngleZ = 0.0F;
    this.head.rotateAngleX = headPitch * ((float) Math.PI / 180F);
    this.head.rotateAngleY = netHeadYaw * ((float) Math.PI / 180F);
    this.head.rotateAngleZ = 0.0F;
    this.head.rotationPointX = 0.0F;
    this.body.rotationPointX = 0.0F;
    this.tail.rotationPointX = 0.0F;
    this.wingRight.rotationPointX = -1.5F;
    this.wingLeft.rotationPointX = 1.5F;
    float f2 = ageInTicks * 0.3F;
    this.head.rotationPointY = 15.69F + f2;
    this.tail.rotateAngleX = 1.015F + MathHelper.cos(limbSwing * 0.6662F) * 0.3F * limbSwingAmount;
    this.tail.rotationPointY = 21.07F + f2;
    this.body.rotationPointY = 16.5F + f2;
    this.wingLeft.rotateAngleZ = -0.0873F - ageInTicks;
    this.wingLeft.rotationPointY = 16.94F + f2;
    this.wingRight.rotateAngleZ = 0.0873F + ageInTicks;
    this.wingRight.rotationPointY = 16.94F + f2;
    this.legLeft.rotationPointY = 22.0F + f2;
    this.legRight.rotationPointY = 22.0F + f2;
  }

  @Override
  public void render(float scale) {
    this.body.render(scale);
    this.wingLeft.render(scale);
    this.wingRight.render(scale);
    this.tail.render(scale);
    this.head.render(scale);
    this.legLeft.render(scale);
    this.legRight.render(scale);
  }

  public static final List<ResourceLocation> TEXTURES = Arrays.asList(
      new ResourceLocation("textures/entity/parrot/parrot_red_blue.png"),
      new ResourceLocation("textures/entity/parrot/parrot_blue.png"),
      new ResourceLocation("textures/entity/parrot/parrot_green.png"),
      new ResourceLocation("textures/entity/parrot/parrot_yellow_blue.png"),
      new ResourceLocation("textures/entity/parrot/parrot_grey.png")
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
    GlStateManager.translatef(data.left() ? 0.4F : -0.4F, isSneaking ? -1.3F : -1.5F, 0.0F);
  }
}
*/
