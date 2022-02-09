package noobanidus.libs.shoulders.client.models;

import com.google.common.collect.Iterables;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;
import noobanidus.libs.shoulders.info.ShoulderData;

public class PolarBearModel extends QuadrupedModel {
  public PolarBearModel() {
    super(12, 0.0F, true, 16.0F, 4.0F, 2.25F, 2.0F, 24);
    this.texWidth = 128;
    this.texHeight = 64;
    this.head = new ModelRenderer(this, 0, 0);
    this.head.addBox(-3.5F, -3.0F, -3.0F, 7.0F, 7.0F, 7.0F, 0.0F);
    this.head.setPos(0.0F, 10.0F, -16.0F);
    this.head.texOffs(0, 44).addBox(-2.5F, 1.0F, -6.0F, 5.0F, 3.0F, 3.0F, 0.0F);
    this.head.texOffs(26, 0).addBox(-4.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F);
    ModelRenderer modelrenderer = this.head.texOffs(26, 0);
    modelrenderer.mirror = true;
    modelrenderer.addBox(2.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F);
    this.body = new ModelRenderer(this);
    this.body.texOffs(0, 19).addBox(-5.0F, -13.0F, -7.0F, 14.0F, 14.0F, 11.0F, 0.0F);
    this.body.texOffs(39, 0).addBox(-4.0F, -25.0F, -7.0F, 12.0F, 12.0F, 10.0F, 0.0F);
    this.body.setPos(-2.0F, 9.0F, 12.0F);
    int i = 10;
    this.leg0 = new ModelRenderer(this, 50, 22);
    this.leg0.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 8.0F, 0.0F);
    this.leg0.setPos(-3.5F, 14.0F, 6.0F);
    this.leg1 = new ModelRenderer(this, 50, 22);
    this.leg1.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 8.0F, 0.0F);
    this.leg1.setPos(3.5F, 14.0F, 6.0F);
    this.leg2 = new ModelRenderer(this, 50, 40);
    this.leg2.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 6.0F, 0.0F);
    this.leg2.setPos(-2.5F, 14.0F, -7.0F);
    this.leg3 = new ModelRenderer(this, 50, 40);
    this.leg3.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 6.0F, 0.0F);
    this.leg3.setPos(2.5F, 14.0F, -7.0F);
    --this.leg0.x;
    ++this.leg1.x;
    this.leg0.z += 0.0F;
    this.leg1.z += 0.0F;
    --this.leg2.x;
    ++this.leg3.x;
    --this.leg2.z;
    --this.leg3.z;
  }

  public void setupAnim(LivingEntity pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
  }

  @Override
  public void prepare(ShoulderData data) {

  }

  @Override
  public RenderType getRenderType(ShoulderData data) {
    return renderType(getTexture(data));
  }

  private static final ResourceLocation POLAR_BEAR_TEXTURE = new ResourceLocation("textures/entity/bear/polarbear.png");

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    return POLAR_BEAR_TEXTURE;
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
