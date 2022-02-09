package noobanidus.mods.shoulders.client.models;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.AgeableModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import noobanidus.mods.shoulders.info.ShoulderData;

public class FoxModel extends AgeableModel<LivingEntity> implements IShoulderRidingModel {
  public final ModelRenderer head;
  private final ModelRenderer earL;
  private final ModelRenderer earR;
  private final ModelRenderer nose;
  private final ModelRenderer body;
  private final ModelRenderer leg0;
  private final ModelRenderer leg1;
  private final ModelRenderer leg2;
  private final ModelRenderer leg3;
  private final ModelRenderer tail;
  private float legMotionPos;

  public FoxModel() {
    super(true, 8.0F, 3.35F);
    this.texWidth = 48;
    this.texHeight = 32;
    this.head = new ModelRenderer(this, 1, 5);
    this.head.addBox(-3.0F, -2.0F, -5.0F, 8.0F, 6.0F, 6.0F);
    this.head.setPos(-1.0F, 16.5F, -3.0F);
    this.earL = new ModelRenderer(this, 8, 1);
    this.earL.addBox(-3.0F, -4.0F, -4.0F, 2.0F, 2.0F, 1.0F);
    this.earR = new ModelRenderer(this, 15, 1);
    this.earR.addBox(3.0F, -4.0F, -4.0F, 2.0F, 2.0F, 1.0F);
    this.nose = new ModelRenderer(this, 6, 18);
    this.nose.addBox(-1.0F, 2.01F, -8.0F, 4.0F, 2.0F, 3.0F);
    this.head.addChild(this.earL);
    this.head.addChild(this.earR);
    this.head.addChild(this.nose);
    this.body = new ModelRenderer(this, 24, 15);
    this.body.addBox(-3.0F, 3.999F, -3.5F, 6.0F, 11.0F, 6.0F);
    this.body.setPos(0.0F, 16.0F, -6.0F);
    float f = 0.001F;
    this.leg0 = new ModelRenderer(this, 13, 24);
    this.leg0.addBox(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.001F);
    this.leg0.setPos(-5.0F, 17.5F, 7.0F);
    this.leg1 = new ModelRenderer(this, 4, 24);
    this.leg1.addBox(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.001F);
    this.leg1.setPos(-1.0F, 17.5F, 7.0F);
    this.leg2 = new ModelRenderer(this, 13, 24);
    this.leg2.addBox(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.001F);
    this.leg2.setPos(-5.0F, 17.5F, 0.0F);
    this.leg3 = new ModelRenderer(this, 4, 24);
    this.leg3.addBox(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.001F);
    this.leg3.setPos(-1.0F, 17.5F, 0.0F);
    this.tail = new ModelRenderer(this, 30, 0);
    this.tail.addBox(2.0F, 0.0F, -1.0F, 4.0F, 9.0F, 5.0F);
    this.tail.setPos(-4.0F, 15.0F, -1.0F);
    this.body.addChild(this.tail);
  }

  public void prepareMobModel(LivingEntity pEntity, float pLimbSwing, float pLimbSwingAmount, float pPartialTick) {
  }

  protected Iterable<ModelRenderer> headParts() {
    return ImmutableList.of(this.head);
  }

  protected Iterable<ModelRenderer> bodyParts() {
    return ImmutableList.of(this.body, this.leg0, this.leg1, this.leg2, this.leg3);
  }

  /**
   * Sets this entity's model rotation angles
   */
  public void setupAnim(LivingEntity pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
  }

  public void setupAnim(ShoulderData data, int ticks, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
    this.body.xRot = ((float) Math.PI / 2F);
    this.tail.xRot = -0.05235988F;
    this.head.yRot = 0.0F;
    this.body.zRot = 0.0F;
    this.body.xRot = ((float) Math.PI / 6F);
    this.body.setPos(0.0F, 9.0F, -3.0F);
    this.tail.xRot = ((float) Math.PI / 4F);
    this.tail.setPos(-4.0F, 15.0F, -2.0F);
/*    this.head.setPos(1.0F, 19.49F, -3.0F);*/
    this.head.setPos(-1.0F, 10.0F, -3.0F);
    this.head.xRot = 0.0F;
    this.head.yRot = 0.0F;
    this.leg0.xRot = -1.3089969F;
    this.leg0.setPos(-5.0F, 21.5F, 6.75F);
    this.leg1.xRot = -1.3089969F;
    this.leg1.setPos(-1.0F, 21.5F, 6.75F);
    this.leg2.xRot = -0.2617994F;
    this.leg3.xRot = -0.2617994F;
    this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
    this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
  }

  @Override
  public void prepare(ShoulderData data) {

  }

  @Override
  public RenderType getRenderType(ShoulderData data) {
    return renderType(getTexture(data));
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
  public EntityModel<LivingEntity> getModel() {
    return this;
  }

  @Override
  public Iterable<ModelRenderer> getParts() {
    return Iterables.concat(headParts(), bodyParts());
  }
}