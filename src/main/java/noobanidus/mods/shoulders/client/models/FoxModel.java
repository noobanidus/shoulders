/*
package noobanidus.mods.shoulders.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.info.ShoulderData;

public class FoxModel extends EntityModel<Entity> implements IShoulderRidingModel {
  private final ModelRenderer head;
  private final ModelRenderer earL;
  private final ModelRenderer earR;
  private final ModelRenderer nose;
  private final ModelRenderer body;
  private final ModelRenderer leg0;
  private final ModelRenderer leg1;
  private final ModelRenderer leg2;
  private final ModelRenderer leg3;
  private final ModelRenderer tail;

  public FoxModel() {
    this.textureWidth = 48;
    this.textureHeight = 32;
    this.head = new ModelRenderer(this, 1, 5);
    this.head.addBox(-3.0F, -2.0F, -5.0F, 8, 6, 6);
    this.head.setRotationPoint(-1.0F, 16.5F, -3.0F);
    this.earL = new ModelRenderer(this, 8, 1);
    this.earL.addBox(-3.0F, -4.0F, -4.0F, 2, 2, 1);
    this.earR = new ModelRenderer(this, 15, 1);
    this.earR.addBox(3.0F, -4.0F, -4.0F, 2, 2, 1);
    this.nose = new ModelRenderer(this, 6, 18);
    this.nose.addBox(-1.0F, 2.01F, -8.0F, 4, 2, 3);
    this.head.addChild(this.earL);
    this.head.addChild(this.earR);
    this.head.addChild(this.nose);
    this.body = new ModelRenderer(this, 24, 15);
    this.body.addBox(-3.0F, 3.999F, -3.5F, 6, 11, 6);
    this.body.setRotationPoint(0.0F, 16.0F, -6.0F);
    this.leg0 = new ModelRenderer(this, 13, 24);
    this.leg0.addBox(2.0F, 0.5F, -1.0F, 2, 6, 2, 0.001F);
    this.leg0.setRotationPoint(-5.0F, 17.5F, 7.0F);
    this.leg1 = new ModelRenderer(this, 4, 24);
    this.leg1.addBox(2.0F, 0.5F, -1.0F, 2, 6, 2, 0.001F);
    this.leg1.setRotationPoint(-1.0F, 17.5F, 7.0F);
    this.leg2 = new ModelRenderer(this, 13, 24);
    this.leg2.addBox(2.0F, 0.5F, -1.0F, 2, 6, 2, 0.001F);
    this.leg2.setRotationPoint(-5.0F, 17.5F, 0.0F);
    this.leg3 = new ModelRenderer(this, 4, 24);
    this.leg3.addBox(2.0F, 0.5F, -1.0F, 2, 6, 2, 0.001F);
    this.leg3.setRotationPoint(-1.0F, 17.5F, 0.0F);
    this.tail = new ModelRenderer(this, 30, 0);
    this.tail.addBox(2.0F, 0.0F, -1.0F, 4, 9, 5);
    this.tail.setRotationPoint(-4.0F, 15.0F, -1.0F);
    this.body.addChild(this.tail);
  }

  @Override
  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    this.head.rotateAngleX = headPitch * ((float) Math.PI / 180F);
    this.head.rotateAngleY = netHeadYaw * ((float) Math.PI / 180F);
    this.body.rotateAngleX = ((float) Math.PI / 2F);
    this.tail.rotateAngleX = -0.05235988F;
    this.head.setRotationPoint(-1.0F, 16.5F, -3.0F);
    this.head.rotateAngleZ = netHeadYaw * ((float) Math.PI / 180F) * 0.11F;
    this.leg0.showModel = true;
    this.leg1.showModel = true;
    this.leg2.showModel = true;
    this.leg3.showModel = true;
    this.body.setRotationPoint(0.0F, 16.0F, -6.0F);
    this.body.rotateAngleZ = 0.0F;
    this.leg0.setRotationPoint(-5.0F, 17.5F, 7.0F);
    this.leg1.setRotationPoint(-1.0F, 17.5F, 7.0F);

  }

  @Override
  public void render(float scale) {
    this.head.render(scale);
    this.body.render(scale);
    this.leg0.render(scale);
    this.leg1.render(scale);
    this.leg2.render(scale);
    this.leg3.render(scale);
  }

  private static final ResourceLocation FOX = new ResourceLocation("textures/entity/fox/fox.png");
  private static final ResourceLocation SNOW_FOX = new ResourceLocation("textures/entity/fox/snow_fox.png");

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    if (data.getVariant() == 0) {
      return FOX;
    } else {
      return SNOW_FOX;
    }
  }

  @Override
  public void scaleAndTranslate(ShoulderData data, boolean offsetArmor, boolean isSneaking, float limbSwing, float limbSwingAmount, float partialTicks, float netHeadYaw, float headPitch, float scaleIn) {
    double armorOffset = 0;
    if (offsetArmor) {
      armorOffset = -0.3;
    }
    GlStateManager.scaled(0.2, 0.2, 0.2);
    GlStateManager.translated(data.left() ? 1.875 : -1.875, isSneaking ? -0.83 + armorOffset : -1.50 + armorOffset, -0.2);
  }
}
*/
