package noobanidus.mods.shoulders.client.models;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.AgeableModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import noobanidus.mods.shoulders.info.ShoulderData;

public abstract class QuadrupedModel extends AgeableModel<LivingEntity> implements IShoulderRidingModel {
  protected ModelRenderer head = new ModelRenderer(this, 0, 0);
  protected ModelRenderer body;
  protected ModelRenderer leg0;
  protected ModelRenderer leg1;
  protected ModelRenderer leg2;
  protected ModelRenderer leg3;

  public QuadrupedModel(int p_i225948_1_, float p_i225948_2_, boolean p_i225948_3_, float p_i225948_4_, float p_i225948_5_, float p_i225948_6_, float p_i225948_7_, int p_i225948_8_) {
    super(p_i225948_3_, p_i225948_4_, p_i225948_5_, p_i225948_6_, p_i225948_7_, (float) p_i225948_8_);
    this.head.addBox(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, p_i225948_2_);
    this.head.setPos(0.0F, (float) (18 - p_i225948_1_), -6.0F);
    this.body = new ModelRenderer(this, 28, 8);
    this.body.addBox(-5.0F, -10.0F, -7.0F, 10.0F, 16.0F, 8.0F, p_i225948_2_);
    this.body.setPos(0.0F, (float) (17 - p_i225948_1_), 2.0F);
    this.leg0 = new ModelRenderer(this, 0, 16);
    this.leg0.addBox(-2.0F, 0.0F, -2.0F, 4.0F, (float) p_i225948_1_, 4.0F, p_i225948_2_);
    this.leg0.setPos(-3.0F, (float) (24 - p_i225948_1_), 7.0F);
    this.leg1 = new ModelRenderer(this, 0, 16);
    this.leg1.addBox(-2.0F, 0.0F, -2.0F, 4.0F, (float) p_i225948_1_, 4.0F, p_i225948_2_);
    this.leg1.setPos(3.0F, (float) (24 - p_i225948_1_), 7.0F);
    this.leg2 = new ModelRenderer(this, 0, 16);
    this.leg2.addBox(-2.0F, 0.0F, -2.0F, 4.0F, (float) p_i225948_1_, 4.0F, p_i225948_2_);
    this.leg2.setPos(-3.0F, (float) (24 - p_i225948_1_), -5.0F);
    this.leg3 = new ModelRenderer(this, 0, 16);
    this.leg3.addBox(-2.0F, 0.0F, -2.0F, 4.0F, (float) p_i225948_1_, 4.0F, p_i225948_2_);
    this.leg3.setPos(3.0F, (float) (24 - p_i225948_1_), -5.0F);
  }

  protected Iterable<ModelRenderer> headParts() {
    return ImmutableList.of(this.head);
  }

  protected Iterable<ModelRenderer> bodyParts() {
    return ImmutableList.of(this.body, this.leg0, this.leg1, this.leg2, this.leg3);
  }

  public void setupAnim(LivingEntity pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
  }

  public void setupAnim(ShoulderData data, int ticks, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
    this.head.xRot = pHeadPitch * ((float) Math.PI / 180F);
    this.head.yRot = pNetHeadYaw * ((float) Math.PI / 180F);
    this.body.xRot = ((float) Math.PI / 2F);
  }
}
