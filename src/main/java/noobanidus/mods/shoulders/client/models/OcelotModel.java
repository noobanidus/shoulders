package noobanidus.mods.shoulders.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.info.ShoulderData;

import java.util.Arrays;
import java.util.List;

public class OcelotModel extends EntityModel<Entity> implements IShoulderRidingModel {
  private RendererModel ocelotBody;
  private RendererModel field_78161_a;
  private RendererModel field_78159_b;
  private RendererModel field_78158_e;
  private RendererModel field_78155_f;
  private RendererModel field_78157_d;
  private RendererModel field_78160_c;
  private RendererModel ocelotHead;
  private RendererModel ear2;
  private RendererModel ear1;
  private RendererModel nose;

  public OcelotModel() {
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.field_78161_a = new RendererModel(this, 8, 13);
    this.field_78161_a.setRotationPoint(1.1F, 17.0F, -6.0F);
    this.field_78161_a.addBox(-1.0F, 1.0F, -1.0F, 2, 6, 2, 0.0F);
    this.setRotationOffset(field_78161_a, -2.356194490192345F, 0.0F, 0.0F);
    this.field_78160_c = new RendererModel(this, 40, 0);
    this.field_78160_c.setRotationPoint(1.2F, 4.8F, -8.0F);
    this.field_78160_c.addBox(-1.0F, -2.0F, 0.0F, 2, 10, 2, 0.0F);
    this.setRotationOffset(field_78160_c, -0.7853981633974483F, 0.0F, 0.0F);

    this.ocelotHead = new RendererModel(this, 0, 0);
    this.ocelotHead.setRotationPoint(0.0F, 1.0F, -5.0F);
    this.ocelotHead.addBox(-2.5F, -2.0F, -3.0F, 5, 4, 5, 0.0F);
    this.setRotationOffset(ocelotHead, -0.7853981633974483F, 0.0F, 0.0F);

    this.ear1 = new RendererModel(this, 0, 10);
    this.ear1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.ear1.addBox(-2.0F, -3.0F, 0.0F, 1, 1, 2, 0.0F);
    this.field_78157_d = new RendererModel(this, 40, 0);
    this.field_78157_d.setRotationPoint(-1.2F, 4.8F, -8.0F);
    this.field_78157_d.addBox(-1.0F, -2.0F, 0.0F, 2, 10, 2, 0.0F);
    this.setRotationOffset(field_78157_d, -0.7853981633974483F, 0.0F, 0.0F);
    this.field_78155_f = new RendererModel(this, 4, 15);
    this.field_78155_f.setRotationPoint(0.0F, 24.0F, 3.0F);
    this.field_78155_f.addBox(-0.5F, 0.0F, 1.0F, 1, 8, 1, 0.0F);
    this.setRotationOffset(field_78155_f, 1.3089969389957472F, 0.0F, 0.0F);
    this.field_78159_b = new RendererModel(this, 8, 13);
    this.field_78159_b.setRotationPoint(-1.1F, 17.0F, -6.0F);
    this.field_78159_b.addBox(-1.0F, 1.0F, -1.0F, 2, 6, 2, 0.0F);
    this.setRotationOffset(field_78159_b, -2.356194490192345F, 0.0F, 0.0F);
    this.ear2 = new RendererModel(this, 6, 10);
    this.ear2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.ear2.addBox(1.0F, -3.0F, 0.0F, 1, 1, 2, 0.0F);
    this.field_78158_e = new RendererModel(this, 0, 15);
    this.field_78158_e.setRotationPoint(0.0F, 18.0F, -3.0F);
    this.field_78158_e.addBox(-0.5F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
    this.setRotationOffset(field_78158_e, 0.8726646259971648F, 0.0F, 0.0F);
    this.ocelotBody = new RendererModel(this, 20, 0);
    this.ocelotBody.setRotationPoint(0.0F, 7.0F, -5.0F);
    this.ocelotBody.addBox(-2.0F, 3.0F, -8.0F, 4, 16, 6, 0.0F);
    this.setRotationOffset(ocelotBody, 0.7853981633974483F, 0.0F, 0.0F);
    this.nose = new RendererModel(this, 0, 24);
    this.nose.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.nose.addBox(-1.5F, 0.0F, -4.0F, 3, 2, 2, 0.0F);
    this.ocelotBody.addChild(this.field_78161_a);
    this.ocelotBody.addChild(this.field_78160_c);
    this.ocelotBody.addChild(this.ocelotHead);
    this.ocelotHead.addChild(this.ear1);
    this.ocelotBody.addChild(this.field_78157_d);
    this.ocelotBody.addChild(this.field_78155_f);
    this.ocelotBody.addChild(this.field_78159_b);
    this.ocelotHead.addChild(this.ear2);
    this.ocelotBody.addChild(this.field_78158_e);
    this.ocelotHead.addChild(this.nose);
  }

  public void render(float scale) {
    this.ocelotBody.render(scale);
  }

  private static final List<ResourceLocation> TEXTURES = Arrays.asList(
      new ResourceLocation("minecraft", "textures/entity/cat/ocelot.png"),
      new ResourceLocation("minecraft", "textures/entity/cat/tabby.png"),
      new ResourceLocation("minecraft", "textures/entity/cat/black.png"),
      new ResourceLocation("minecraft", "textures/entity/cat/red.png"),
      new ResourceLocation("minecraft", "textures/entity/cat/siamese.png"),
      new ResourceLocation("minecraft", "textures/entity/cat/british_shorthair.png"),
      new ResourceLocation("minecraft", "textures/entity/cat/calico.png"),
      new ResourceLocation("minecraft", "textures/entity/cat/persian.png"),
      new ResourceLocation("minecraft", "textures/entity/cat/ragdoll.png"),
      new ResourceLocation("minecraft", "textures/entity/cat/white.png"),
      new ResourceLocation("minecraft", "textures/entity/cat/jellie.png"),
      new ResourceLocation("minecraft", "textures/entity/cat/all_black.png"));

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
    this.ocelotHead.rotateAngleX = headPitch * ((float) Math.PI / 180F) - 0.55f;
    this.ocelotHead.rotateAngleY = netHeadYaw * ((float) Math.PI / 180F) * 0.8f;
  }
}
