/*
package noobanidus.mods.shoulders.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.info.ShoulderData;

public class DolphinModel extends EntityModel<Entity> implements IShoulderRidingModel {
  private final ModelRenderer field_205081_a;
  private final ModelRenderer body;
  private final ModelRenderer tail;
  private final ModelRenderer tailFin;

  public DolphinModel() {
    this.textureWidth = 64;
    this.textureHeight = 64;
    this.body = new ModelRenderer(this, 22, 0);
    this.body.addBox(-4.0F, -7.0F, 0.0F, 8, 7, 13);
    this.body.setRotationPoint(0.0F, 22.0F, -5.0F);
    ModelRenderer ModelRenderer = new ModelRenderer(this, 51, 0);
    ModelRenderer.addBox(-0.5F, 0.0F, 8.0F, 1, 4, 5);
    ModelRenderer.rotateAngleX = ((float) Math.PI / 3F);
    this.body.addChild(ModelRenderer);
    ModelRenderer ModelRenderer1 = new ModelRenderer(this, 48, 20);
    ModelRenderer1.mirror = true;
    ModelRenderer1.addBox(-0.5F, -4.0F, 0.0F, 1, 4, 7);
    ModelRenderer1.setRotationPoint(2.0F, -2.0F, 4.0F);
    ModelRenderer1.rotateAngleX = ((float) Math.PI / 3F);
    ModelRenderer1.rotateAngleZ = 2.0943952F;
    this.body.addChild(ModelRenderer1);
    ModelRenderer ModelRenderer2 = new ModelRenderer(this, 48, 20);
    ModelRenderer2.addBox(-0.5F, -4.0F, 0.0F, 1, 4, 7);
    ModelRenderer2.setRotationPoint(-2.0F, -2.0F, 4.0F);
    ModelRenderer2.rotateAngleX = ((float) Math.PI / 3F);
    ModelRenderer2.rotateAngleZ = -2.0943952F;
    this.body.addChild(ModelRenderer2);
    this.tail = new ModelRenderer(this, 0, 19);
    this.tail.addBox(-2.0F, -2.5F, 0.0F, 4, 5, 11);
    this.tail.setRotationPoint(0.0F, -2.5F, 11.0F);
    this.tail.rotateAngleX = -0.10471976F;
    this.body.addChild(this.tail);
    this.tailFin = new ModelRenderer(this, 19, 20);
    this.tailFin.addBox(-5.0F, -0.5F, 0.0F, 10, 1, 6);
    this.tailFin.setRotationPoint(0.0F, 0.0F, 9.0F);
    this.tailFin.rotateAngleX = 0.0F;
    this.tail.addChild(this.tailFin);
    this.field_205081_a = new ModelRenderer(this, 0, 0);
    this.field_205081_a.addBox(-4.0F, -3.0F, -3.0F, 8, 7, 6);
    this.field_205081_a.setRotationPoint(0.0F, -4.0F, -3.0F);
    ModelRenderer ModelRenderer3 = new ModelRenderer(this, 0, 13);
    ModelRenderer3.addBox(-1.0F, 2.0F, -7.0F, 2, 2, 4);
    this.field_205081_a.addChild(ModelRenderer3);
    this.body.addChild(this.field_205081_a);
  }

  @Override
  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    this.body.rotateAngleX = (headPitch * ((float) Math.PI / 180F) * 0.1f);
    this.body.rotateAngleY = (netHeadYaw * ((float) Math.PI / 180F) * 0.1f);
  }

  @Override
  public void render(float scale) {
    this.body.render(scale);
  }

  private static final ResourceLocation DOLPHIN_LOCATION = new ResourceLocation("textures/entity/dolphin.png");

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    return DOLPHIN_LOCATION;
  }

  @Override
  public void scaleAndTranslate(ShoulderData data, boolean offsetArmor, boolean isSneaking, float limbSwing, float limbSwingAmount, float partialTicks, float netHeadYaw, float headPitch, float scaleIn) {
    double armorOffset = 0;
    if (offsetArmor) {
      armorOffset = -0.35;
    }
    GlStateManager.scaled(0.2, 0.2, 0.2);
    GlStateManager.translated(data.left() ? 1.875 : -1.875, isSneaking ? -0.88 + armorOffset : -1.55 + armorOffset, -0.1);
  }
}
*/
