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

public class SproutModel extends EntityModel<Entity> implements IShoulderRidingModel {
  private RendererModel head;
  private RendererModel legL;
  private RendererModel legR;
  private RendererModel leafTop;
  private RendererModel leafBottom;

  public SproutModel() {
    textureWidth = 32;
    textureHeight = 32;

    head = new RendererModel(this, 12, 0);
    head.addBox(-2.5F, 0F, -2.5F, 5, 5, 5);
    head.setRotationPoint(0F, 11F, 0F);
    head.setTextureSize(32, 32);
    head.mirror = true;
    setRotation(head, 0F, 0F, 0F);
    legL = new RendererModel(this, 0, 0);
    legL.addBox(-1F, 0F, -1F, 2, 8, 2);
    legL.setRotationPoint(1.5F, 16F, 0F);
    legL.setTextureSize(32, 32);
    legL.mirror = true;
    setRotation(legL, 0F, 0F, 0F);
    legR = new RendererModel(this, 0, 0);
    legR.addBox(-1F, 0F, -1F, 2, 8, 2);
    legR.setRotationPoint(-1.5F, 16F, 0F);
    legR.setTextureSize(32, 32);
    legR.mirror = true;
    setRotation(legR, 0F, 0F, 0F);
    leafTop = new RendererModel(this, 8, 0);
    leafTop.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
    leafTop.setRotationPoint(0F, 9F, -1F);
    leafTop.setTextureSize(32, 32);
    leafTop.mirror = true;
    setRotation(leafTop, 0F, 0F, 0F);
    leafBottom = new RendererModel(this, 0, 10);
    leafBottom.addBox(-1.5F, -0.5F, -0.5F, 3, 4, 1);
    leafBottom.setRotationPoint(0F, 9F, -1F);
    leafBottom.setTextureSize(32, 32);
    leafBottom.mirror = true;
    setRotation(leafBottom, 1.963495F, 0.5235988F, 0F);
  }

  public void render(float scale) {
    head.render(scale);
    legL.render(scale);
    legR.render(scale);
    leafTop.render(scale);
    leafBottom.render(scale);
  }

  private static final List<ResourceLocation> TEXTURES = Arrays.asList(
      new ResourceLocation(Constants.MODID, "textures/entity/sprout_green.png"),
      new ResourceLocation(Constants.MODID, "textures/entity/sprout_red.png"),
      new ResourceLocation(Constants.MODID, "textures/entity/sprout_purple.png"),
      new ResourceLocation(Constants.MODID, "textures/entity/sprout_tan.png"),
      new ResourceLocation(Constants.MODID, "textures/entity/sprout_hell.png")
  );

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
      armorOffset = -0.1;
    }
    GlStateManager.scaled(0.45, 0.45, 0.45);
    GlStateManager.translated(data.left() ? 0.85 : -0.85, isSneaking ? -1.2 + armorOffset : -1.50 + armorOffset, -0.06);
  }

  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
  }
}
