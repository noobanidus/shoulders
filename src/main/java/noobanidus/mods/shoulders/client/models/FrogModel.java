package noobanidus.mods.shoulders.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.Constants;
import noobanidus.mods.shoulders.info.ShoulderData;

import java.util.Arrays;
import java.util.List;

public class FrogModel extends EntityModel<Entity> implements IShoulderRidingModel {
  private RendererModel body;
  private RendererModel backR;
  private RendererModel backL;
  private RendererModel frontR;
  private RendererModel frontL;
  private RendererModel head;

  public FrogModel() {
    this.textureWidth = 16;
    this.textureHeight = 16;
    this.head = new RendererModel(this, 4, 3);
    this.head.setRotationPoint(0.0F, 0.0F, -3.0F);
    this.head.addBox(-1.5F, -1.0F, -3.0F, 3, 2, 3, 0.0F);
    this.setRotation(head, 0.39269908169872414F, 0.0F, 0.0F);
    this.backL = new RendererModel(this, 0, 0);
    this.backL.setRotationPoint(1.0F, 0.5F, 1.5F);
    this.backL.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
    this.setRotation(backL, -0.6981317007977318F, -0.5235987755982988F, -0.5235987755982988F);
    this.frontL = new RendererModel(this, 0, 5);
    this.frontL.mirror = true;
    this.frontL.setRotationPoint(1.0F, -0.25F, -2.5F);
    this.frontL.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
    this.setRotation(frontL, 0.2617993877991494F, 0.0F, -0.2617993877991494F);
    this.body = new RendererModel(this, 0, 9);
    this.body.setRotationPoint(0.0F, 22.0F, 0.0F);
    this.body.addBox(-1.5F, -1.0F, -3.0F, 3, 2, 5, 0.0F);
    this.setRotation(body, -0.5235987755982988F, 0.0F, 0.0F);
    this.backR = new RendererModel(this, 0, 0);
    this.backR.mirror = true;
    this.backR.setRotationPoint(-1.0F, 0.5F, 1.5F);
    this.backR.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
    this.setRotation(backR, -0.6981317007977318F, 0.5235987755982988F, 0.5235987755982988F);
    this.frontR = new RendererModel(this, 0, 5);
    this.frontR.mirror = true;
    this.frontR.setRotationPoint(-1.0F, -0.25F, -2.5F);
    this.frontR.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
    this.setRotation(frontR, 0.2617993877991494F, 0.0F, 0.2617993877991494F);
    this.body.addChild(this.head);
    this.body.addChild(this.backL);
    this.body.addChild(this.frontL);
    this.body.addChild(this.backR);
    this.body.addChild(this.frontR);
  }

  public void render(float scale) {
    this.body.render(scale);
  }

  private static final List<ResourceLocation> TEXTURES = Arrays.asList(
      new ResourceLocation(Constants.MODID, "textures/entity/frog.png"),
      new ResourceLocation(Constants.MODID, "textures/entity/toad.png"));

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    int index = data.getVariant();
    if (index >= TEXTURES.size()) {
      return TEXTURES.get(0);
    }

    return TEXTURES.get(index);
  }

  @Override
  public void scaleAndTranslate(ShoulderData data, boolean offsetArmor, boolean isSneaking, float limbSwing, float limbSwingAmount, float partialTicks, float netHeadYaw, float headPitch, float scaleIn) {
    double armorOffset = 0;
    if (offsetArmor) {
      armorOffset = -0.3;
    }
    GlStateManager.scaled(0.45, 0.45, 0.45);
    GlStateManager.translated(data.left() ? 0.85 : -0.85, isSneaking ? -1.5 + armorOffset : -1.55 + armorOffset, -0.06);
  }

  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    this.backL.rotateAngleX = 0;
    this.backR.rotateAngleX = 0;
    this.head.rotateAngleX = headPitch * 0.017453292F;
    this.head.rotateAngleY = netHeadYaw * 0.017453292F;
  }
}
