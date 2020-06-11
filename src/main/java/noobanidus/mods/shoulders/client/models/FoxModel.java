package noobanidus.mods.shoulders.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.info.ShoulderData;

public class FoxModel extends EntityModel<Entity> implements IShoulderRidingModel {
  private final RendererModel field_217115_a;
  private final RendererModel field_217116_b;
  private final RendererModel field_217117_f;
  private final RendererModel field_217118_g;
  private final RendererModel field_217119_h;
  private final RendererModel field_217120_i;
  private final RendererModel field_217121_j;
  private final RendererModel field_217122_k;
  private final RendererModel field_217123_l;
  private final RendererModel field_217124_m;

  public FoxModel() {
    this.textureWidth = 48;
    this.textureHeight = 32;
    this.field_217115_a = new RendererModel(this, 1, 5);
    this.field_217115_a.addBox(-3.0F, -2.0F, -5.0F, 8, 6, 6);
    this.field_217115_a.setRotationPoint(-1.0F, 16.5F, -3.0F);
    this.field_217116_b = new RendererModel(this, 8, 1);
    this.field_217116_b.addBox(-3.0F, -4.0F, -4.0F, 2, 2, 1);
    this.field_217117_f = new RendererModel(this, 15, 1);
    this.field_217117_f.addBox(3.0F, -4.0F, -4.0F, 2, 2, 1);
    this.field_217118_g = new RendererModel(this, 6, 18);
    this.field_217118_g.addBox(-1.0F, 2.01F, -8.0F, 4, 2, 3);
    this.field_217115_a.addChild(this.field_217116_b);
    this.field_217115_a.addChild(this.field_217117_f);
    this.field_217115_a.addChild(this.field_217118_g);
    this.field_217119_h = new RendererModel(this, 24, 15);
    this.field_217119_h.addBox(-3.0F, 3.999F, -3.5F, 6, 11, 6);
    this.field_217119_h.setRotationPoint(0.0F, 16.0F, -6.0F);
    this.field_217120_i = new RendererModel(this, 13, 24);
    this.field_217120_i.addBox(2.0F, 0.5F, -1.0F, 2, 6, 2, 0.001F);
    this.field_217120_i.setRotationPoint(-5.0F, 17.5F, 7.0F);
    this.field_217121_j = new RendererModel(this, 4, 24);
    this.field_217121_j.addBox(2.0F, 0.5F, -1.0F, 2, 6, 2, 0.001F);
    this.field_217121_j.setRotationPoint(-1.0F, 17.5F, 7.0F);
    this.field_217122_k = new RendererModel(this, 13, 24);
    this.field_217122_k.addBox(2.0F, 0.5F, -1.0F, 2, 6, 2, 0.001F);
    this.field_217122_k.setRotationPoint(-5.0F, 17.5F, 0.0F);
    this.field_217123_l = new RendererModel(this, 4, 24);
    this.field_217123_l.addBox(2.0F, 0.5F, -1.0F, 2, 6, 2, 0.001F);
    this.field_217123_l.setRotationPoint(-1.0F, 17.5F, 0.0F);
    this.field_217124_m = new RendererModel(this, 30, 0);
    this.field_217124_m.addBox(2.0F, 0.0F, -1.0F, 4, 9, 5);
    this.field_217124_m.setRotationPoint(-4.0F, 15.0F, -1.0F);
    this.field_217119_h.addChild(this.field_217124_m);
  }

  @Override
  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    this.field_217115_a.rotateAngleX = headPitch * ((float) Math.PI / 180F);
    this.field_217115_a.rotateAngleY = netHeadYaw * ((float) Math.PI / 180F);
    this.field_217119_h.rotateAngleX = ((float) Math.PI / 2F);
    this.field_217124_m.rotateAngleX = -0.05235988F;
    this.field_217115_a.setRotationPoint(-1.0F, 16.5F, -3.0F);
    this.field_217115_a.rotateAngleZ = netHeadYaw * ((float) Math.PI / 180F) * 0.11F;
    this.field_217120_i.showModel = true;
    this.field_217121_j.showModel = true;
    this.field_217122_k.showModel = true;
    this.field_217123_l.showModel = true;
    this.field_217119_h.setRotationPoint(0.0F, 16.0F, -6.0F);
    this.field_217119_h.rotateAngleZ = 0.0F;
    this.field_217120_i.setRotationPoint(-5.0F, 17.5F, 7.0F);
    this.field_217121_j.setRotationPoint(-1.0F, 17.5F, 7.0F);

  }

  @Override
  public void render(float scale) {
    this.field_217115_a.render(scale);
    this.field_217119_h.render(scale);
    this.field_217120_i.render(scale);
    this.field_217121_j.render(scale);
    this.field_217122_k.render(scale);
    this.field_217123_l.render(scale);
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
