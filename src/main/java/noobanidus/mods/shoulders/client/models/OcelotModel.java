package noobanidus.mods.shoulders.client.models;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.AgeableModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.info.ShoulderData;

import java.util.Arrays;
import java.util.List;

public class OcelotModel extends AgeableModel<LivingEntity> implements IShoulderRidingModel {
  protected final ModelRenderer backLegL;
  protected final ModelRenderer backLegR;
  protected final ModelRenderer frontLegL;
  protected final ModelRenderer frontLegR;
  protected final ModelRenderer tail1;
  protected final ModelRenderer tail2;
  protected final ModelRenderer head;
  protected final ModelRenderer body;
  protected int state = 1;

  public OcelotModel() {
    super(true, 10.0F, 4.0F);
    float scale = 0.0f;
    this.head = new ModelRenderer(this);
    this.head.addBox("main", -2.5F, -2.0F, -3.0F, 5, 4, 5, scale, 0, 0);
    this.head.addBox("nose", -1.5F, 0.0F, -4.0F, 3, 2, 2, scale, 0, 24);
    this.head.addBox("ear1", -2.0F, -3.0F, 0.0F, 1, 1, 2, scale, 0, 10);
    this.head.addBox("ear2", 1.0F, -3.0F, 0.0F, 1, 1, 2, scale, 6, 10);
    this.head.setPos(0.0F, 15.0F, -9.0F);
    this.body = new ModelRenderer(this, 20, 0);
    this.body.addBox(-2.0F, 3.0F, -8.0F, 4.0F, 16.0F, 6.0F, scale);
    this.body.setPos(0.0F, 12.0F, -10.0F);
    this.tail1 = new ModelRenderer(this, 0, 15);
    this.tail1.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, scale);
    this.tail1.xRot = 0.9F;
    this.tail1.setPos(0.0F, 15.0F, 8.0F);
    this.tail2 = new ModelRenderer(this, 4, 15);
    this.tail2.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, scale);
    this.tail2.setPos(0.0F, 20.0F, 14.0F);
    this.backLegL = new ModelRenderer(this, 8, 13);
    this.backLegL.addBox(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, scale);
    this.backLegL.setPos(1.1F, 18.0F, 5.0F);
    this.backLegR = new ModelRenderer(this, 8, 13);
    this.backLegR.addBox(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, scale);
    this.backLegR.setPos(-1.1F, 18.0F, 5.0F);
    this.frontLegL = new ModelRenderer(this, 40, 0);
    this.frontLegL.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, scale);
    this.frontLegL.setPos(1.2F, 14.1F, -5.0F);
    this.frontLegR = new ModelRenderer(this, 40, 0);
    this.frontLegR.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, scale);
    this.frontLegR.setPos(-1.2F, 14.1F, -5.0F);
  }

  protected Iterable<ModelRenderer> headParts() {
    return ImmutableList.of(this.head);
  }

  protected Iterable<ModelRenderer> bodyParts() {
    return ImmutableList.of(this.body, this.backLegL, this.backLegR, this.frontLegL, this.frontLegR, this.tail1, this.tail2);
  }

  public void setupAnim(LivingEntity pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
  }

  public void setupAnim(ShoulderData data, int ticks, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
    this.head.xRot = pHeadPitch * ((float) Math.PI / 180F);
    this.head.yRot = pNetHeadYaw * ((float) Math.PI / 180F);
  }

  public void prepareMobModel(LivingEntity pEntity, float pLimbSwing, float pLimbSwingAmount, float pPartialTick) {
  }

  public void prepare(ShoulderData data) {
    this.body.y = 12.0F;
    this.body.z = -10.0F;
    this.head.y = 15.0F;
    this.head.z = -9.0F;
    this.tail1.y = 15.0F;
    this.tail1.z = 8.0F;
    this.tail2.y = 20.0F;
    this.tail2.z = 14.0F;
    this.body.xRot = ((float) Math.PI / 4F);
    this.body.y += -4.0F;
    this.body.z += 5.0F;
    this.head.y += -3.3F;
    ++this.head.z;
    this.tail1.y += 8.0F;
    this.tail1.z += -2.0F;
    this.tail2.y += 2.0F;
    this.tail2.z += -0.8F;
    this.tail1.xRot = 1.7278761F;
    this.tail2.xRot = 2.670354F;
    this.frontLegL.xRot = -0.15707964F;
    this.frontLegL.y = 16.1F;
    this.frontLegL.z = -7.0F;
    this.frontLegR.xRot = -0.15707964F;
    this.frontLegR.y = 16.1F;
    this.frontLegR.z = -7.0F;
    this.backLegL.xRot = (-(float) Math.PI / 2F);
    this.backLegL.y = 21.0F;
    this.backLegL.z = 1.0F;
    this.backLegR.xRot = (-(float) Math.PI / 2F);
    this.backLegR.y = 21.0F;
    this.backLegR.z = 1.0F;
  }

  @Override
  public RenderType getRenderType(ShoulderData data) {
    return renderType(getTexture(data));
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
  public EntityModel<LivingEntity> getModel() {
    return this;
  }

  @Override
  public Iterable<ModelRenderer> getParts() {
    return Iterables.concat(headParts(), bodyParts());
  }
}
