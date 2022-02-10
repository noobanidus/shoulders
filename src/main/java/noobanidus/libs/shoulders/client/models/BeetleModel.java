package noobanidus.libs.shoulders.client.models;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.AgeableModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;
import noobanidus.libs.shoulders.Constants;
import noobanidus.libs.shoulders.client.bootstrap.Bootstrap;
import noobanidus.libs.shoulders.info.ShoulderData;

import javax.annotation.Nonnull;

public class BeetleModel extends AgeableModel<LivingEntity> implements IShoulderRidingModel {
  private final ModelRenderer body;
  private final ModelRenderer wingL;
  private final ModelRenderer wingR;
  private final ModelRenderer head;
  private final ModelRenderer legL1;
  private final ModelRenderer legL2;
  private final ModelRenderer legL3;
  private final ModelRenderer legR1;
  private final ModelRenderer legR2;
  private final ModelRenderer legR3;
  private final ModelRenderer antennaR1;
  private final ModelRenderer antennaL1;
  private final ModelRenderer antennaR2;
  private final ModelRenderer antennaR2_1;

  public BeetleModel() {
    super(true, 5.0f, 2.0f);
    this.texWidth = 32;
    this.texHeight = 32;
    this.legL2 = new ModelRenderer(this, 18, 6);
    this.legL2.setPos(2.0F, 1.0F, 3.5F);
    this.legL2.addBox(-0.5F, 0.0F, -0.5F, 1, 7, 1, 0.0F);
    this.setRotateAngle(legL2, 0.0F, 0.0F, -0.2617993877991494F);
    this.antennaL1 = new ModelRenderer(this, 24, 6);
    this.antennaL1.setPos(1.0F, 0.0F, -0.5F);
    this.antennaL1.addBox(-0.5F, -5.0F, -0.5F, 1, 5, 1, 0.0F);
    this.setRotateAngle(antennaL1, 0.1308996938995747F, 0.0F, 0.2617993877991494F);
    this.wingL = new ModelRenderer(this, 0, 0);
    this.wingL.setPos(1.5F, -0.5F, 1.0F);
    this.wingL.addBox(-2.5F, 0.0F, -1.0F, 5, 8, 3, 0.0F);
    this.setRotateAngle(wingL, 1.7453292519943295F, 0.17453292519943295F, 0.2617993877991494F);
    this.wingR = new ModelRenderer(this, 0, 0);
    this.wingR.mirror = true;
    this.wingR.setPos(-1.5F, -0.5F, 1.0F);
    this.wingR.addBox(-2.5F, 0.0F, -1.0F, 5, 8, 3, 0.0F);
    this.setRotateAngle(wingR, 1.7453292519943295F, -0.17453292519943295F, -0.2617993877991494F);
    this.legR1 = new ModelRenderer(this, 18, 6);
    this.legR1.setPos(-1.5F, 1.0F, 1.0F);
    this.legR1.addBox(-0.5F, 0.0F, -0.5F, 1, 7, 1, 0.0F);
    this.setRotateAngle(legR1, -0.2617993877991494F, 0.0F, 0.2617993877991494F);
    this.body = new ModelRenderer(this, 0, 11);
    this.body.setPos(0.0F, 16.0F, -4.0F);
    this.body.addBox(-2.5F, -2.0F, 0.0F, 5, 4, 8, 0.0F);
    this.antennaR1 = new ModelRenderer(this, 24, 6);
    this.antennaR1.setPos(-1.0F, 0.0F, -0.5F);
    this.antennaR1.addBox(-0.5F, -5.0F, -0.5F, 1, 5, 1, 0.0F);
    this.setRotateAngle(antennaR1, 0.1308996938995747F, 0.0F, -0.2617993877991494F);
    this.legR2 = new ModelRenderer(this, 18, 6);
    this.legR2.setPos(-2.0F, 1.0F, 3.5F);
    this.legR2.addBox(-0.5F, 0.0F, -0.5F, 1, 7, 1, 0.0F);
    this.setRotateAngle(legR2, 0.0F, 0.0F, 0.2617993877991494F);
    this.head = new ModelRenderer(this, 16, 0);
    this.head.setPos(0.0F, 0.0F, 0.0F);
    this.head.addBox(-2.0F, -1.25F, -3.0F, 4, 3, 3, 0.0F);
    this.setRotateAngle(head, 0.17453292519943295F, 0.0F, 0.0F);
    this.antennaR2 = new ModelRenderer(this, 24, 6);
    this.antennaR2.setPos(0.0F, -5.0F, 0.0F);
    this.antennaR2.addBox(-0.5F, -5.0F, -0.5F, 1, 5, 1, 0.0F);
    this.setRotateAngle(antennaR2, 0.39269908169872414F, 0.0F, 0.0F);
    this.legL1 = new ModelRenderer(this, 18, 6);
    this.legL1.setPos(1.5F, 1.0F, 1.0F);
    this.legL1.addBox(-0.5F, 0.0F, -0.5F, 1, 7, 1, 0.0F);
    this.setRotateAngle(legL1, -0.2617993877991494F, 0.0F, -0.2617993877991494F);
    this.legL3 = new ModelRenderer(this, 18, 6);
    this.legL3.setPos(1.5F, 1.0F, 6.0F);
    this.legL3.addBox(-0.5F, 0.0F, -0.5F, 1, 7, 1, 0.0F);
    this.setRotateAngle(legL3, 0.2617993877991494F, 0.0F, -0.2617993877991494F);
    this.legR3 = new ModelRenderer(this, 18, 6);
    this.legR3.setPos(-1.5F, 1.0F, 6.0F);
    this.legR3.addBox(-0.5F, 0.0F, -0.5F, 1, 7, 1, 0.0F);
    this.setRotateAngle(legR3, 0.2617993877991494F, 0.0F, 0.2617993877991494F);
    this.antennaR2_1 = new ModelRenderer(this, 24, 6);
    this.antennaR2_1.setPos(0.0F, -5.0F, 0.0F);
    this.antennaR2_1.addBox(-0.5F, -5.0F, -0.5F, 1, 5, 1, 0.0F);
    this.setRotateAngle(antennaR2_1, 0.39269908169872414F, 0.0F, 0.0F);
    this.body.addChild(this.legL2);
    this.head.addChild(this.antennaL1);
    this.body.addChild(this.wingL);
    this.body.addChild(this.wingR);
    this.body.addChild(this.legR1);
    this.head.addChild(this.antennaR1);
    this.body.addChild(this.legR2);
    this.body.addChild(this.head);
    this.antennaR1.addChild(this.antennaR2);
    this.body.addChild(this.legL1);
    this.body.addChild(this.legL3);
    this.body.addChild(this.legR3);
    this.antennaL1.addChild(this.antennaR2_1);
  }

  @Override
  public void setupAnim(LivingEntity pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
  }

  @Nonnull
  @Override
  protected Iterable<ModelRenderer> headParts() {
    return ImmutableSet.of();
  }

  @Nonnull
  @Override
  protected Iterable<ModelRenderer> bodyParts() {
    return ImmutableSet.of(body);
  }

  @Override
  public void setupAnim(ShoulderData state, int ticks, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    this.head.xRot = headPitch * 0.017453292F;
    this.head.yRot = netHeadYaw * 0.017453292F;
    this.antennaR1.xRot = 0.1308996938995747F + getBobble(30, ageInTicks) * 0.2617993877991494F;
    this.antennaL1.xRot = 0.1308996938995747F + getBobble(100, ageInTicks) * 0.2617993877991494F;
    this.wingL.yRot = 0.17453292519943295F + 0.0872664626F * getBobble(45, ageInTicks);
    this.wingR.yRot = -0.17453292519943295F - 0.0872664626F * getBobble(160, ageInTicks);
  }

  @Override
  public void prepare(ShoulderData state) {
    this.body.setPos(0.0F, 16.0F, -4.0F);
    this.setRotateAngle(legR1, -0.2617993877991494F, 0.0F, 0.2617993877991494F);
    this.setRotateAngle(legR2, 0.0F, 0.0F, 0.2617993877991494F);
    this.setRotateAngle(legR3, 0.2617993877991494F, 0.0F, 0.2617993877991494F);
    this.setRotateAngle(legL1, -0.2617993877991494F, 0.0F, -0.2617993877991494F);
    this.setRotateAngle(legL2, 0.0F, 0.0F, -0.2617993877991494F);
    this.setRotateAngle(legL3, 0.2617993877991494F, 0.0F, -0.2617993877991494F);
  }

  @Override
  public RenderType getRenderType(ShoulderData data) {
    return renderType(getTexture(data));
  }

  @Override
  public ResourceLocation getTexture(ShoulderData state) {
    return Bootstrap.modTex("beetle_blue");
  }

  @Override
  public Iterable<ModelRenderer> getParts() {
    return Iterables.concat(headParts(), bodyParts());
  }

  @Override
  public EntityModel<LivingEntity> getModel () {
    return this;
  }
}

