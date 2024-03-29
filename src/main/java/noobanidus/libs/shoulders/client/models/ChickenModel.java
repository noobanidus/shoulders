package noobanidus.libs.shoulders.client.models;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.AgeableModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;
import noobanidus.libs.shoulders.info.ShoulderData;

public class ChickenModel extends AgeableModel<LivingEntity> implements IShoulderRidingModel {
  private final ModelRenderer head;
  private final ModelRenderer body;
  private final ModelRenderer leg0;
  private final ModelRenderer leg1;
  private final ModelRenderer wing0;
  private final ModelRenderer wing1;
  private final ModelRenderer beak;
  private final ModelRenderer redThing;

  public ChickenModel() {
    this.head = new ModelRenderer(this, 0, 0);
    this.head.addBox(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 3.0F, 0.0F);
    this.head.setPos(0.0F, 15.0F, -4.0F);
    this.beak = new ModelRenderer(this, 14, 0);
    this.beak.addBox(-2.0F, -4.0F, -4.0F, 4.0F, 2.0F, 2.0F, 0.0F);
    this.beak.setPos(0.0F, 15.0F, -4.0F);
    this.redThing = new ModelRenderer(this, 14, 4);
    this.redThing.addBox(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F);
    this.redThing.setPos(0.0F, 15.0F, -4.0F);
    this.body = new ModelRenderer(this, 0, 9);
    this.body.addBox(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F);
    this.body.setPos(0.0F, 16.0F, 0.0F);
    this.leg0 = new ModelRenderer(this, 26, 0);
    this.leg0.addBox(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
    this.leg0.setPos(-2.0F, 19.0F, 1.0F);
    this.leg1 = new ModelRenderer(this, 26, 0);
    this.leg1.addBox(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
    this.leg1.setPos(1.0F, 19.0F, 1.0F);
    this.wing0 = new ModelRenderer(this, 24, 13);
    this.wing0.addBox(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F);
    this.wing0.setPos(-4.0F, 13.0F, 0.0F);
    this.wing1 = new ModelRenderer(this, 24, 13);
    this.wing1.addBox(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F);
    this.wing1.setPos(4.0F, 13.0F, 0.0F);
  }

  @Override
  public void setupAnim(LivingEntity pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {

  }

  protected Iterable<ModelRenderer> headParts() {
    return ImmutableList.of(this.head, this.beak, this.redThing);
  }

  protected Iterable<ModelRenderer> bodyParts() {
    return ImmutableList.of(this.body, this.leg0, this.leg1, this.wing0, this.wing1);
  }

  @Override
  public void setupAnim(ShoulderData data, int ticks, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
    this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
    this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
    this.beak.xRot = this.head.xRot;
    this.beak.yRot = this.head.yRot;
    this.redThing.xRot = this.head.xRot;
    this.redThing.yRot = this.head.yRot;
    this.body.xRot = ((float)Math.PI / 2F);
    this.wing0.zRot = pAgeInTicks;
    this.wing1.zRot = -pAgeInTicks;
  }

  @Override
  public void prepare(ShoulderData data) {
  }

  @Override
  public RenderType getRenderType(ShoulderData data) {
    return renderType(getTexture(data));
  }

  private static final ResourceLocation CHICKEN_TEXTURES = new ResourceLocation("minecraft", "textures/entity/chicken.png");

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    return CHICKEN_TEXTURES;
  }

  @Override
  public EntityModel<LivingEntity> getModel() {
    return this;
  }

  @Override
  public Iterable<ModelRenderer> getParts() {
    return Iterables.concat(headParts(), bodyParts());
  }
}
