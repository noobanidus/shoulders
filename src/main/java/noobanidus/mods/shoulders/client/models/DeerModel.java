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

public class DeerModel extends EntityModel<Entity> implements IShoulderRidingModel {
  private RendererModel head;
  private RendererModel ear1;
  private RendererModel ear2;
  private RendererModel neck;
  private RendererModel body;
  private RendererModel tail;
  private RendererModel legRF;
  private RendererModel legLF;
  private RendererModel legLB;
  private RendererModel legRB;
  private RendererModel horn1;
  private RendererModel horn2;
  private RendererModel horn3;
  private RendererModel horn4;
  private RendererModel horn5;
  private RendererModel horn6;
  private RendererModel horn7;
  private RendererModel horn8;

  public DeerModel() {
    textureWidth = 64;
    textureHeight = 64;

    head = new RendererModel(this, 0, 16);
    head.addBox(-2F, 0F, -2.5F, 4, 7, 4);
    head.setRotationPoint(0F, 7F, -6.953333F);
    head.setTextureSize(64, 64);
    head.mirror = true;
    setRotation(head, 1.047198F, 0F, 0F);
    ear1 = new RendererModel(this, 17, 0);
    ear1.addBox(-1.5F, -4F, -0.5F, 3, 4, 1);
    ear1.setRotationPoint(-2F, 5.5F, -6.5F);
    ear1.setTextureSize(64, 64);
    ear1.mirror = true;
    setRotation(ear1, -0.174532925F, -0.174532925F, -1.178097F);
    ear2 = new RendererModel(this, 17, 0);
    ear2.mirror = true;
    ear2.addBox(-1.5F, -4F, -0.5F, 3, 4, 1);
    ear2.setRotationPoint(2F, 5.5F, -6.5F);
    ear2.setTextureSize(64, 64);
    setRotation(ear2, 0.174532925F, 0.174532925F, 1.178097F);
    neck = new RendererModel(this, 0, 0);
    neck.addBox(-2.5F, -2.5F, -7F, 5, 5, 7);
    neck.setRotationPoint(0F, 6F, -5F);
    neck.setTextureSize(64, 64);
    neck.mirror = true;
    setRotation(neck, 0.3926991F, 0F, 0F);
    body = new RendererModel(this, 16, 16);
    body.addBox(-2.5F, 0F, 0F, 5, 7, 9);
    body.setRotationPoint(0F, 8F, -3.953333F);
    body.setTextureSize(64, 64);
    body.mirror = true;
    setRotation(body, 0F, 0F, 0F);
    tail = new RendererModel(this, 32, 0);
    tail.addBox(-1.5F, -1.5F, 0F, 3, 3, 4);
    tail.setRotationPoint(0F, 9F, 4F);
    tail.setTextureSize(64, 64);
    tail.mirror = true;
    setRotation(tail, 0.7853982F, 0F, 0F);
    legRF = new RendererModel(this, 0, 32);
    legRF.addBox(-1F, 0F, -1F, 2, 9, 2);
    legRF.setRotationPoint(-1.5F, 15F, -2.953333F);
    legRF.setTextureSize(64, 64);
    legRF.mirror = true;
    setRotation(legRF, 0F, 0F, 0F);
    legLF = new RendererModel(this, 0, 32);
    legLF.addBox(-1F, 0F, -1F, 2, 9, 2);
    legLF.setRotationPoint(1.5F, 15F, -2.953333F);
    legLF.setTextureSize(64, 64);
    legLF.mirror = true;
    setRotation(legLF, 0F, 0F, 0F);
    legLB = new RendererModel(this, 0, 32);
    legLB.addBox(-1F, 0F, -1F, 2, 9, 2);
    legLB.setRotationPoint(-1.5F, 15F, 4F);
    legLB.setTextureSize(64, 64);
    legLB.mirror = true;
    setRotation(legLB, 0F, 0F, 0F);
    legRB = new RendererModel(this, 0, 32);
    legRB.addBox(-1F, 0F, -1F, 2, 9, 2);
    legRB.setRotationPoint(1.5F, 15F, 4F);
    legRB.setTextureSize(64, 64);
    legRB.mirror = true;
    setRotation(legRB, 0F, 0F, 0F);
    horn1 = new RendererModel(this, 16, 32);
    horn1.addBox(-0.5F, -5F, -0.5F, 1, 5, 1);
    horn1.setRotationPoint(1F, 4F, -6F);
    horn1.setTextureSize(64, 64);
    horn1.mirror = true;
    setRotation(horn1, 0F, 0F, 0.2617994F);
    horn2 = new RendererModel(this, 16, 32);
    horn2.addBox(-0.5F, -5F, -0.5F, 1, 5, 1);
    horn2.setRotationPoint(-1F, 4F, -6F);
    horn2.setTextureSize(64, 64);
    horn2.mirror = true;
    setRotation(horn2, 0F, 0F, -0.2617994F);
    horn3 = new RendererModel(this, 16, 32);
    horn3.addBox(-0.5F, -5F, -0.5F, 1, 5, 1);
    horn3.setRotationPoint(1.75F, 2F, -6F);
    horn3.setTextureSize(64, 64);
    horn3.mirror = true;
    setRotation(horn3, 0F, 0.0872665F, 1.047198F);
    horn4 = new RendererModel(this, 16, 32);
    horn4.addBox(-0.5F, -5F, -0.5F, 1, 5, 1);
    horn4.setRotationPoint(-1.8F, 2F, -6F);
    horn4.setTextureSize(64, 64);
    horn4.mirror = true;
    setRotation(horn4, 0F, -0.0872665F, -1.047198F);
    horn5 = new RendererModel(this, 16, 32);
    horn5.addBox(-0.5F, -5F, -0.5F, 1, 5, 1);
    horn5.setRotationPoint(-4.36F, 0.2F, -6.2F);
    horn5.setTextureSize(64, 64);
    horn5.mirror = true;
    setRotation(horn5, 0F, -0.0872665F, 0.2617994F);
    horn6 = new RendererModel(this, 16, 32);
    horn6.addBox(-0.5F, -5F, -0.5F, 1, 5, 1);
    horn6.setRotationPoint(4.4F, 0.2F, -6.2F);
    horn6.setTextureSize(64, 64);
    horn6.mirror = true;
    setRotation(horn6, 0F, 0.0872665F, -0.2617994F);
    horn7 = new RendererModel(this, 20, 32);
    horn7.addBox(-0.5F, -3F, -0.5F, 1, 3, 1);
    horn7.setRotationPoint(-3.8F, -2F, -6.2F);
    horn7.setTextureSize(64, 64);
    horn7.mirror = true;
    setRotation(horn7, 0F, -0.1745329F, -0.7853982F);
    horn8 = new RendererModel(this, 20, 32);
    horn8.addBox(-0.5F, -3F, -0.5F, 1, 3, 1);
    horn8.setRotationPoint(3.8F, -2F, -6.2F);
    horn8.setTextureSize(64, 64);
    horn8.mirror = true;
    setRotation(horn8, 0F, 0.1745329F, 0.7853982F);
  }

  @Override
  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    float sin = (float) Math.sin(ageInTicks * 0.125f * (Math.PI * 2.0f));
    legRF.rotateAngleX = limbSwingAmount * sin;
    legLF.rotateAngleX = -limbSwingAmount * sin;
    legLB.rotateAngleX = limbSwingAmount * sin;
    legRB.rotateAngleX = -limbSwingAmount * sin;
    if (hasHorns(data)) {
      horn1.showModel = true;
      horn2.showModel = true;
      horn3.showModel = true;
      horn4.showModel = true;
      horn5.showModel = true;
      horn6.showModel = true;
      horn7.showModel = true;
      horn8.showModel = true;
    } else {
      horn1.showModel = false;
      horn2.showModel = false;
      horn3.showModel = false;
      horn4.showModel = false;
      horn5.showModel = false;
      horn6.showModel = false;
      horn7.showModel = false;
      horn8.showModel = false;
    }
  }

  private static boolean hasHorns(ShoulderData data) {
    return data.getVariant() >> 6 == 1;
  }

  @Override
  public void render(float scale) {
    head.render(scale);
    ear1.render(scale);
    ear2.render(scale);
    neck.render(scale);
    body.render(scale);
    tail.render(scale);
    legRF.render(scale);
    legLF.render(scale);
    legLB.render(scale);
    legRB.render(scale);
    horn1.render(scale);
    horn2.render(scale);
    horn3.render(scale);
    horn4.render(scale);
    horn5.render(scale);
    horn6.render(scale);
    horn7.render(scale);
    horn8.render(scale);
  }

  public static List<ResourceLocation> TEXTURES = Arrays.asList(new ResourceLocation(Constants.MODID, "textures/entity/deer.png"), new ResourceLocation(Constants.MODID, "textures/entity/rudolph.png"));

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    int texture = data.getVariant() & 31;
    if (texture > TEXTURES.size()) {
      return TEXTURES.get(0);
    }

    return TEXTURES.get(texture);
  }

  @Override
  public void scaleAndTranslate(ShoulderData data, boolean offsetArmor, boolean isSneaking, float limbSwing, float limbSwingAmount, float partialTicks, float netHeadYaw, float headPitch, float scaleIn) {
    double armorOffset = 0;
    if (offsetArmor) {
      armorOffset = -0.2;
    }
    GlStateManager.scaled(0.3, 0.3, 0.3);
    GlStateManager.translated(data.left() ? 1.275 : -1.275, isSneaking ? -0.8 + armorOffset : -1.48 + armorOffset, 0);
  }
}
