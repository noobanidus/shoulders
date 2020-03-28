package noobanidus.mods.shoulders.client.models;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.info.ShoulderData;

public class DolphinModel extends EntityModel<Entity> implements IShoulderRidingModel {
  private final RendererModel field_205081_a;
  private final RendererModel field_205082_b;
  private final RendererModel field_205083_c;
  private final RendererModel field_205084_d;

  public DolphinModel() {
    this.textureWidth = 64;
    this.textureHeight = 64;
    this.field_205082_b = new RendererModel(this, 22, 0);
    this.field_205082_b.addBox(-4.0F, -7.0F, 0.0F, 8, 7, 13);
    this.field_205082_b.setRotationPoint(0.0F, 22.0F, -5.0F);
    RendererModel renderermodel = new RendererModel(this, 51, 0);
    renderermodel.addBox(-0.5F, 0.0F, 8.0F, 1, 4, 5);
    renderermodel.rotateAngleX = ((float) Math.PI / 3F);
    this.field_205082_b.addChild(renderermodel);
    RendererModel renderermodel1 = new RendererModel(this, 48, 20);
    renderermodel1.mirror = true;
    renderermodel1.addBox(-0.5F, -4.0F, 0.0F, 1, 4, 7);
    renderermodel1.setRotationPoint(2.0F, -2.0F, 4.0F);
    renderermodel1.rotateAngleX = ((float) Math.PI / 3F);
    renderermodel1.rotateAngleZ = 2.0943952F;
    this.field_205082_b.addChild(renderermodel1);
    RendererModel renderermodel2 = new RendererModel(this, 48, 20);
    renderermodel2.addBox(-0.5F, -4.0F, 0.0F, 1, 4, 7);
    renderermodel2.setRotationPoint(-2.0F, -2.0F, 4.0F);
    renderermodel2.rotateAngleX = ((float) Math.PI / 3F);
    renderermodel2.rotateAngleZ = -2.0943952F;
    this.field_205082_b.addChild(renderermodel2);
    this.field_205083_c = new RendererModel(this, 0, 19);
    this.field_205083_c.addBox(-2.0F, -2.5F, 0.0F, 4, 5, 11);
    this.field_205083_c.setRotationPoint(0.0F, -2.5F, 11.0F);
    this.field_205083_c.rotateAngleX = -0.10471976F;
    this.field_205082_b.addChild(this.field_205083_c);
    this.field_205084_d = new RendererModel(this, 19, 20);
    this.field_205084_d.addBox(-5.0F, -0.5F, 0.0F, 10, 1, 6);
    this.field_205084_d.setRotationPoint(0.0F, 0.0F, 9.0F);
    this.field_205084_d.rotateAngleX = 0.0F;
    this.field_205083_c.addChild(this.field_205084_d);
    this.field_205081_a = new RendererModel(this, 0, 0);
    this.field_205081_a.addBox(-4.0F, -3.0F, -3.0F, 8, 7, 6);
    this.field_205081_a.setRotationPoint(0.0F, -4.0F, -3.0F);
    RendererModel renderermodel3 = new RendererModel(this, 0, 13);
    renderermodel3.addBox(-1.0F, 2.0F, -7.0F, 2, 2, 4);
    this.field_205081_a.addChild(renderermodel3);
    this.field_205082_b.addChild(this.field_205081_a);
  }

  @Override
  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    this.field_205082_b.rotateAngleX = (headPitch * ((float) Math.PI / 180F) * 0.1f);
    this.field_205082_b.rotateAngleY = (netHeadYaw * ((float) Math.PI / 180F) * 0.1f);
  }

  @Override
  public void render(float scale) {
    this.field_205082_b.render(scale);
  }

  private static final ResourceLocation DOLPHIN_LOCATION = new ResourceLocation("textures/entity/dolphin.png");

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    return DOLPHIN_LOCATION;
  }
}
