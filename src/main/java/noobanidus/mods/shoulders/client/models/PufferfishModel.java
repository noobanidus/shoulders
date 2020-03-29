package noobanidus.mods.shoulders.client.models;

import net.minecraft.client.renderer.entity.PufferfishRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import noobanidus.mods.shoulders.info.ShoulderData;

public class PufferfishModel extends EntityModel<Entity> implements IShoulderRidingModel {
  private static PufferfishBigModel bigModel = new PufferfishBigModel();
  private static PufferfishMediumModel mediumModel = new PufferfishMediumModel();
  private static PufferfishSmallModel smallModel = new PufferfishSmallModel();
  private static final ResourceLocation TEXTURE = new ResourceLocation("textures/entity/fish/pufferfish.png");

  public PufferfishModel() {
  }

  @Override
  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    modelForData(data).setRotationAngles(data, ticksExisted, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
  }

  @Override
  public void render(ShoulderData data, float scale) {
    modelForData(data).render(scale);
  }

  // No-op
  @Override
  public void render(float scale) {
  }

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    return modelForData(data).getTexture(data);
  }

  private PufferfishBaseModel modelForData (ShoulderData data) {
    switch (data.getVariant()) {
      default:
      case 0:
        return smallModel;
      case 1:
        return mediumModel;
      case 2:
        return bigModel;
    }
  }

  public static abstract class PufferfishBaseModel extends EntityModel<Entity> implements IShoulderRidingModel {
    @Override
    public ResourceLocation getTexture(ShoulderData data) {
      return TEXTURE;
    }
  }

  public static class PufferfishBigModel extends PufferfishBaseModel {
    private final RendererModel field_203741_a;
    private final RendererModel field_203742_b;
    private final RendererModel field_203743_c;
    private final RendererModel field_203744_d;
    private final RendererModel field_203745_e;
    private final RendererModel field_203746_f;
    private final RendererModel field_203747_g;
    private final RendererModel field_203748_h;
    private final RendererModel field_203749_i;
    private final RendererModel field_203750_j;
    private final RendererModel field_203751_k;
    private final RendererModel field_203752_l;
    private final RendererModel field_203753_m;

    public PufferfishBigModel() {
      this.textureWidth = 32;
      this.textureHeight = 32;
      int i = 22;
      this.field_203741_a = new RendererModel(this, 0, 0);
      this.field_203741_a.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
      this.field_203741_a.setRotationPoint(0.0F, 22.0F, 0.0F);
      this.field_203742_b = new RendererModel(this, 24, 0);
      this.field_203742_b.addBox(-2.0F, 0.0F, -1.0F, 2, 1, 2);
      this.field_203742_b.setRotationPoint(-4.0F, 15.0F, -2.0F);
      this.field_203743_c = new RendererModel(this, 24, 3);
      this.field_203743_c.addBox(0.0F, 0.0F, -1.0F, 2, 1, 2);
      this.field_203743_c.setRotationPoint(4.0F, 15.0F, -2.0F);
      this.field_203744_d = new RendererModel(this, 15, 17);
      this.field_203744_d.addBox(-4.0F, -1.0F, 0.0F, 8, 1, 0);
      this.field_203744_d.setRotationPoint(0.0F, 14.0F, -4.0F);
      this.field_203744_d.rotateAngleX = ((float) Math.PI / 4F);
      this.field_203745_e = new RendererModel(this, 14, 16);
      this.field_203745_e.addBox(-4.0F, -1.0F, 0.0F, 8, 1, 1);
      this.field_203745_e.setRotationPoint(0.0F, 14.0F, 0.0F);
      this.field_203746_f = new RendererModel(this, 23, 18);
      this.field_203746_f.addBox(-4.0F, -1.0F, 0.0F, 8, 1, 0);
      this.field_203746_f.setRotationPoint(0.0F, 14.0F, 4.0F);
      this.field_203746_f.rotateAngleX = (-(float) Math.PI / 4F);
      this.field_203747_g = new RendererModel(this, 5, 17);
      this.field_203747_g.addBox(-1.0F, -8.0F, 0.0F, 1, 8, 0);
      this.field_203747_g.setRotationPoint(-4.0F, 22.0F, -4.0F);
      this.field_203747_g.rotateAngleY = (-(float) Math.PI / 4F);
      this.field_203748_h = new RendererModel(this, 1, 17);
      this.field_203748_h.addBox(0.0F, -8.0F, 0.0F, 1, 8, 0);
      this.field_203748_h.setRotationPoint(4.0F, 22.0F, -4.0F);
      this.field_203748_h.rotateAngleY = ((float) Math.PI / 4F);
      this.field_203749_i = new RendererModel(this, 15, 20);
      this.field_203749_i.addBox(-4.0F, 0.0F, 0.0F, 8, 1, 0);
      this.field_203749_i.setRotationPoint(0.0F, 22.0F, -4.0F);
      this.field_203749_i.rotateAngleX = (-(float) Math.PI / 4F);
      this.field_203751_k = new RendererModel(this, 15, 20);
      this.field_203751_k.addBox(-4.0F, 0.0F, 0.0F, 8, 1, 0);
      this.field_203751_k.setRotationPoint(0.0F, 22.0F, 0.0F);
      this.field_203750_j = new RendererModel(this, 15, 20);
      this.field_203750_j.addBox(-4.0F, 0.0F, 0.0F, 8, 1, 0);
      this.field_203750_j.setRotationPoint(0.0F, 22.0F, 4.0F);
      this.field_203750_j.rotateAngleX = ((float) Math.PI / 4F);
      this.field_203752_l = new RendererModel(this, 9, 17);
      this.field_203752_l.addBox(-1.0F, -8.0F, 0.0F, 1, 8, 0);
      this.field_203752_l.setRotationPoint(-4.0F, 22.0F, 4.0F);
      this.field_203752_l.rotateAngleY = ((float) Math.PI / 4F);
      this.field_203753_m = new RendererModel(this, 9, 17);
      this.field_203753_m.addBox(0.0F, -8.0F, 0.0F, 1, 8, 0);
      this.field_203753_m.setRotationPoint(4.0F, 22.0F, 4.0F);
      this.field_203753_m.rotateAngleY = (-(float) Math.PI / 4F);
    }

    @Override
    public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.field_203742_b.rotateAngleZ = -0.2F + 0.4F * MathHelper.sin(netHeadYaw * 0.2F);
      this.field_203743_c.rotateAngleZ = 0.2F - 0.4F * MathHelper.sin(netHeadYaw * 0.2F);
    }

    @Override
    public void render(float scale) {
      this.field_203741_a.render(scale);
      this.field_203742_b.render(scale);
      this.field_203743_c.render(scale);
      this.field_203744_d.render(scale);
      this.field_203745_e.render(scale);
      this.field_203746_f.render(scale);
      this.field_203747_g.render(scale);
      this.field_203748_h.render(scale);
      this.field_203749_i.render(scale);
      this.field_203751_k.render(scale);
      this.field_203750_j.render(scale);
      this.field_203752_l.render(scale);
      this.field_203753_m.render(scale);
    }
  }

  public static class PufferfishMediumModel extends PufferfishBaseModel {
    private final RendererModel field_203730_a;
    private final RendererModel field_203731_b;
    private final RendererModel field_203732_c;
    private final RendererModel field_203733_d;
    private final RendererModel field_203734_e;
    private final RendererModel field_203735_f;
    private final RendererModel field_203736_g;
    private final RendererModel field_203737_h;
    private final RendererModel field_203738_i;
    private final RendererModel field_203739_j;
    private final RendererModel field_203740_k;

    public PufferfishMediumModel() {
      this.textureWidth = 32;
      this.textureHeight = 32;
      int i = 22;
      this.field_203730_a = new RendererModel(this, 12, 22);
      this.field_203730_a.addBox(-2.5F, -5.0F, -2.5F, 5, 5, 5);
      this.field_203730_a.setRotationPoint(0.0F, 22.0F, 0.0F);
      this.field_203731_b = new RendererModel(this, 24, 0);
      this.field_203731_b.addBox(-2.0F, 0.0F, 0.0F, 2, 0, 2);
      this.field_203731_b.setRotationPoint(-2.5F, 17.0F, -1.5F);
      this.field_203732_c = new RendererModel(this, 24, 3);
      this.field_203732_c.addBox(0.0F, 0.0F, 0.0F, 2, 0, 2);
      this.field_203732_c.setRotationPoint(2.5F, 17.0F, -1.5F);
      this.field_203733_d = new RendererModel(this, 15, 16);
      this.field_203733_d.addBox(-2.5F, -1.0F, 0.0F, 5, 1, 1);
      this.field_203733_d.setRotationPoint(0.0F, 17.0F, -2.5F);
      this.field_203733_d.rotateAngleX = ((float) Math.PI / 4F);
      this.field_203734_e = new RendererModel(this, 10, 16);
      this.field_203734_e.addBox(-2.5F, -1.0F, -1.0F, 5, 1, 1);
      this.field_203734_e.setRotationPoint(0.0F, 17.0F, 2.5F);
      this.field_203734_e.rotateAngleX = (-(float) Math.PI / 4F);
      this.field_203735_f = new RendererModel(this, 8, 16);
      this.field_203735_f.addBox(-1.0F, -5.0F, 0.0F, 1, 5, 1);
      this.field_203735_f.setRotationPoint(-2.5F, 22.0F, -2.5F);
      this.field_203735_f.rotateAngleY = (-(float) Math.PI / 4F);
      this.field_203736_g = new RendererModel(this, 8, 16);
      this.field_203736_g.addBox(-1.0F, -5.0F, 0.0F, 1, 5, 1);
      this.field_203736_g.setRotationPoint(-2.5F, 22.0F, 2.5F);
      this.field_203736_g.rotateAngleY = ((float) Math.PI / 4F);
      this.field_203737_h = new RendererModel(this, 4, 16);
      this.field_203737_h.addBox(0.0F, -5.0F, 0.0F, 1, 5, 1);
      this.field_203737_h.setRotationPoint(2.5F, 22.0F, 2.5F);
      this.field_203737_h.rotateAngleY = (-(float) Math.PI / 4F);
      this.field_203738_i = new RendererModel(this, 0, 16);
      this.field_203738_i.addBox(0.0F, -5.0F, 0.0F, 1, 5, 1);
      this.field_203738_i.setRotationPoint(2.5F, 22.0F, -2.5F);
      this.field_203738_i.rotateAngleY = ((float) Math.PI / 4F);
      this.field_203739_j = new RendererModel(this, 8, 22);
      this.field_203739_j.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
      this.field_203739_j.setRotationPoint(0.5F, 22.0F, 2.5F);
      this.field_203739_j.rotateAngleX = ((float) Math.PI / 4F);
      this.field_203740_k = new RendererModel(this, 17, 21);
      this.field_203740_k.addBox(-2.5F, 0.0F, 0.0F, 5, 1, 1);
      this.field_203740_k.setRotationPoint(0.0F, 22.0F, -2.5F);
      this.field_203740_k.rotateAngleX = (-(float) Math.PI / 4F);
    }

    @Override
    public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.field_203731_b.rotateAngleZ = -0.2F + 0.4F * MathHelper.sin(netHeadYaw * 0.2F);
      this.field_203732_c.rotateAngleZ = 0.2F - 0.4F * MathHelper.sin(netHeadYaw * 0.2F);
    }

    @Override
    public void render(float scale) {
      this.field_203730_a.render(scale);
      this.field_203731_b.render(scale);
      this.field_203732_c.render(scale);
      this.field_203733_d.render(scale);
      this.field_203734_e.render(scale);
      this.field_203735_f.render(scale);
      this.field_203736_g.render(scale);
      this.field_203737_h.render(scale);
      this.field_203738_i.render(scale);
      this.field_203739_j.render(scale);
      this.field_203740_k.render(scale);
    }
  }

  public static class PufferfishSmallModel extends PufferfishBaseModel {
   private final RendererModel field_203754_a;
   private final RendererModel field_203755_b;
   private final RendererModel field_203756_c;
   private final RendererModel field_203757_d;
   private final RendererModel field_203758_e;
   private final RendererModel field_203759_f;

    public PufferfishSmallModel() {
      this.textureWidth = 32;
      this.textureHeight = 32;
      int i = 23;
      this.field_203754_a = new RendererModel(this, 0, 27);
      this.field_203754_a.addBox(-1.5F, -2.0F, -1.5F, 3, 2, 3);
      this.field_203754_a.setRotationPoint(0.0F, 23.0F, 0.0F);
      this.field_203755_b = new RendererModel(this, 24, 6);
      this.field_203755_b.addBox(-1.5F, 0.0F, -1.5F, 1, 1, 1);
      this.field_203755_b.setRotationPoint(0.0F, 20.0F, 0.0F);
      this.field_203756_c = new RendererModel(this, 28, 6);
      this.field_203756_c.addBox(0.5F, 0.0F, -1.5F, 1, 1, 1);
      this.field_203756_c.setRotationPoint(0.0F, 20.0F, 0.0F);
      this.field_203759_f = new RendererModel(this, -3, 0);
      this.field_203759_f.addBox(-1.5F, 0.0F, 0.0F, 3, 0, 3);
      this.field_203759_f.setRotationPoint(0.0F, 22.0F, 1.5F);
      this.field_203757_d = new RendererModel(this, 25, 0);
      this.field_203757_d.addBox(-1.0F, 0.0F, 0.0F, 1, 0, 2);
      this.field_203757_d.setRotationPoint(-1.5F, 22.0F, -1.5F);
      this.field_203758_e = new RendererModel(this, 25, 0);
      this.field_203758_e.addBox(0.0F, 0.0F, 0.0F, 1, 0, 2);
      this.field_203758_e.setRotationPoint(1.5F, 22.0F, -1.5F);
    }

    @Override
    public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.field_203757_d.rotateAngleZ = -0.2F + 0.4F * MathHelper.sin(netHeadYaw * 0.2F);
      this.field_203758_e.rotateAngleZ = 0.2F - 0.4F * MathHelper.sin(netHeadYaw * 0.2F);
    }

    @Override
    public void render(float scale) {
      this.field_203754_a.render(scale);
      this.field_203755_b.render(scale);
      this.field_203756_c.render(scale);
      this.field_203759_f.render(scale);
      this.field_203757_d.render(scale);
      this.field_203758_e.render(scale);
    }
  }
}
