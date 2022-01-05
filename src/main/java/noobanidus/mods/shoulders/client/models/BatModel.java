package noobanidus.mods.shoulders.client.models;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.BatEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import noobanidus.mods.shoulders.info.ShoulderData;

public class BatModel extends SegmentedModel<LivingEntity> implements IShoulderRidingModel {
  private final ModelRenderer head;
  private final ModelRenderer body;
  private final ModelRenderer rightWing;
  private final ModelRenderer leftWing;
  private final ModelRenderer rightWingTip;
  private final ModelRenderer leftWingTip;

  public BatModel() {
    this.texWidth = 64;
    this.texHeight = 64;
    this.head = new ModelRenderer(this, 0, 0);
    this.head.addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F);
    ModelRenderer modelrenderer = new ModelRenderer(this, 24, 0);
    modelrenderer.addBox(-4.0F, -6.0F, -2.0F, 3.0F, 4.0F, 1.0F);
    this.head.addChild(modelrenderer);
    ModelRenderer modelrenderer1 = new ModelRenderer(this, 24, 0);
    modelrenderer1.mirror = true;
    modelrenderer1.addBox(1.0F, -6.0F, -2.0F, 3.0F, 4.0F, 1.0F);
    this.head.addChild(modelrenderer1);
    this.body = new ModelRenderer(this, 0, 16);
    this.body.addBox(-3.0F, 4.0F, -3.0F, 6.0F, 12.0F, 6.0F);
    this.body.texOffs(0, 34).addBox(-5.0F, 16.0F, 0.0F, 10.0F, 6.0F, 1.0F);
    this.rightWing = new ModelRenderer(this, 42, 0);
    this.rightWing.addBox(-12.0F, 1.0F, 1.5F, 10.0F, 16.0F, 1.0F);
    this.rightWingTip = new ModelRenderer(this, 24, 16);
    this.rightWingTip.setPos(-12.0F, 1.0F, 1.5F);
    this.rightWingTip.addBox(-8.0F, 1.0F, 0.0F, 8.0F, 12.0F, 1.0F);
    this.leftWing = new ModelRenderer(this, 42, 0);
    this.leftWing.mirror = true;
    this.leftWing.addBox(2.0F, 1.0F, 1.5F, 10.0F, 16.0F, 1.0F);
    this.leftWingTip = new ModelRenderer(this, 24, 16);
    this.leftWingTip.mirror = true;
    this.leftWingTip.setPos(12.0F, 1.0F, 1.5F);
    this.leftWingTip.addBox(0.0F, 1.0F, 0.0F, 8.0F, 12.0F, 1.0F);
    this.body.addChild(this.rightWing);
    this.body.addChild(this.leftWing);
    this.rightWing.addChild(this.rightWingTip);
    this.leftWing.addChild(this.leftWingTip);
  }

  public Iterable<ModelRenderer> parts() {
    return ImmutableList.of(this.head, this.body);
  }

  /**
   * Sets this entity's model rotation angles
   */
  public void setupAnim(LivingEntity pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
  }

  @Override
  public void setupAnim(ShoulderData data, int ticks, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
    this.head.xRot = (pHeadPitch * ((float) Math.PI / 180F));
    this.head.yRot = -((float) Math.PI - pNetHeadYaw * ((float) Math.PI / 180F));
    this.head.zRot = -((float) Math.PI);
    this.head.setPos(0.0F, -2.0F, 0.0F);
    this.rightWing.setPos(-3.0F, 0.0F, 3.0F);
    this.leftWing.setPos(3.0F, 0.0F, 3.0F);
    this.body.xRot = (float) Math.PI;
    this.rightWing.xRot = -0.15707964F;
    this.rightWing.yRot = -1.2566371F;
    this.rightWingTip.yRot = -1.7278761F;
    this.leftWing.xRot = this.rightWing.xRot;
    this.leftWing.yRot = -this.rightWing.yRot;
    this.leftWingTip.yRot = -this.rightWingTip.yRot;
  }

  @Override
  public void prepare(ShoulderData data) {

  }

  @Override
  public RenderType getRenderType(ShoulderData data) {
    return renderType(getTexture(data));
  }

  private static final ResourceLocation TEXTURE = new ResourceLocation("minecraft", "textures/entity/bat.png");

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    return TEXTURE;
  }

  @Override
  public EntityModel<LivingEntity> getModel() {
    return this;
  }

  @Override
  public Iterable<ModelRenderer> getParts() {
    return parts();
  }
}
