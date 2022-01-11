package noobanidus.mods.shoulders.client.models;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.info.ShoulderData;

import java.util.Arrays;
import java.util.List;

public class RabbitModel extends EntityModel<LivingEntity> implements IShoulderRidingModel {
  private final ModelRenderer rearFootLeft = new ModelRenderer(this, 26, 24);
  private final ModelRenderer rearFootRight;
  private final ModelRenderer haunchLeft;
  private final ModelRenderer haunchRight;
  private final ModelRenderer body;
  private final ModelRenderer frontLegLeft;
  private final ModelRenderer frontLegRight;
  private final ModelRenderer head;
  private final ModelRenderer earRight;
  private final ModelRenderer earLeft;
  private final ModelRenderer tail;
  private final ModelRenderer nose;

  public RabbitModel() {
    this.rearFootLeft.addBox(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F);
    this.rearFootLeft.setPos(3.0F, 17.5F, 3.7F);
    this.rearFootLeft.mirror = true;
    this.setRotation(this.rearFootLeft, 0.0F, 0.0F, 0.0F);
    this.rearFootRight = new ModelRenderer(this, 8, 24);
    this.rearFootRight.addBox(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F);
    this.rearFootRight.setPos(-3.0F, 17.5F, 3.7F);
    this.rearFootRight.mirror = true;
    this.setRotation(this.rearFootRight, 0.0F, 0.0F, 0.0F);
    this.haunchLeft = new ModelRenderer(this, 30, 15);
    this.haunchLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F);
    this.haunchLeft.setPos(3.0F, 17.5F, 3.7F);
    this.haunchLeft.mirror = true;
    this.setRotation(this.haunchLeft, -0.34906584F, 0.0F, 0.0F);
    this.haunchRight = new ModelRenderer(this, 16, 15);
    this.haunchRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F);
    this.haunchRight.setPos(-3.0F, 17.5F, 3.7F);
    this.haunchRight.mirror = true;
    this.setRotation(this.haunchRight, -0.34906584F, 0.0F, 0.0F);
    this.body = new ModelRenderer(this, 0, 0);
    this.body.addBox(-3.0F, -2.0F, -10.0F, 6.0F, 5.0F, 10.0F);
    this.body.setPos(0.0F, 19.0F, 8.0F);
    this.body.mirror = true;
    this.setRotation(this.body, -0.34906584F, 0.0F, 0.0F);
    this.frontLegLeft = new ModelRenderer(this, 8, 15);
    this.frontLegLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F);
    this.frontLegLeft.setPos(3.0F, 17.0F, -1.0F);
    this.frontLegLeft.mirror = true;
    this.setRotation(this.frontLegLeft, -0.17453292F, 0.0F, 0.0F);
    this.frontLegRight = new ModelRenderer(this, 0, 15);
    this.frontLegRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F);
    this.frontLegRight.setPos(-3.0F, 17.0F, -1.0F);
    this.frontLegRight.mirror = true;
    this.setRotation(this.frontLegRight, -0.17453292F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 32, 0);
    this.head.addBox(-2.5F, -4.0F, -5.0F, 5.0F, 4.0F, 5.0F);
    this.head.setPos(0.0F, 16.0F, -1.0F);
    this.head.mirror = true;
    this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.earRight = new ModelRenderer(this, 52, 0);
    this.earRight.addBox(-2.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F);
    this.earRight.setPos(0.0F, 16.0F, -1.0F);
    this.earRight.mirror = true;
    this.setRotation(this.earRight, 0.0F, -0.2617994F, 0.0F);
    this.earLeft = new ModelRenderer(this, 58, 0);
    this.earLeft.addBox(0.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F);
    this.earLeft.setPos(0.0F, 16.0F, -1.0F);
    this.earLeft.mirror = true;
    this.setRotation(this.earLeft, 0.0F, 0.2617994F, 0.0F);
    this.tail = new ModelRenderer(this, 52, 6);
    this.tail.addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 2.0F);
    this.tail.setPos(0.0F, 20.0F, 7.0F);
    this.tail.mirror = true;
    this.setRotation(this.tail, -0.3490659F, 0.0F, 0.0F);
    this.nose = new ModelRenderer(this, 32, 9);
    this.nose.addBox(-0.5F, -2.5F, -5.5F, 1.0F, 1.0F, 1.0F);
    this.nose.setPos(0.0F, 16.0F, -1.0F);
    this.nose.mirror = true;
    this.setRotation(this.nose, 0.0F, 0.0F, 0.0F);
  }

  public void renderToBuffer(MatrixStack pMatrixStack, IVertexBuilder pBuffer, int pPackedLight, int pPackedOverlay, float pRed, float pGreen, float pBlue, float pAlpha) {
    pMatrixStack.pushPose();
    pMatrixStack.scale(0.6F, 0.6F, 0.6F);
    pMatrixStack.translate(0.0D, 1.0D, 0.0D);
    getParts().forEach((p_228290_8_) -> {
      p_228290_8_.render(pMatrixStack, pBuffer, pPackedLight, pPackedOverlay, pRed, pGreen, pBlue, pAlpha);
    });
    pMatrixStack.popPose();
  }

  public void setupAnim(LivingEntity pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
  }

  public void setupAnim(ShoulderData data, int ticks, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
    this.nose.xRot = pHeadPitch * ((float) Math.PI / 180F);
    this.head.xRot = pHeadPitch * ((float) Math.PI / 180F);
    this.earRight.xRot = pHeadPitch * ((float) Math.PI / 180F);
    this.earLeft.xRot = pHeadPitch * ((float) Math.PI / 180F);
    this.nose.yRot = pNetHeadYaw * ((float) Math.PI / 180F);
    this.head.yRot = pNetHeadYaw * ((float) Math.PI / 180F);
    this.earRight.yRot = this.nose.yRot - 0.2617994F;
    this.earLeft.yRot = this.nose.yRot + 0.2617994F;
    this.haunchLeft.xRot = (-21.0F) * ((float) Math.PI / 180F);
    this.haunchRight.xRot = (-21.0F) * ((float) Math.PI / 180F);
    this.rearFootLeft.xRot = 0;
    this.rearFootRight.xRot = 0;
    this.frontLegLeft.xRot = (-11.0F) * ((float) Math.PI / 180F);
    this.frontLegRight.xRot = (-11.0F) * ((float) Math.PI / 180F);
  }

  @Override
  public void prepare(ShoulderData data) {
  }

  @Override
  public RenderType getRenderType(ShoulderData data) {
    return renderType(getTexture(data));
  }

  private static final List<ResourceLocation> TEXTURES = Arrays.asList(
      new ResourceLocation("minecraft", "textures/entity/rabbit/brown.png"),
      new ResourceLocation("minecraft", "textures/entity/rabbit/white.png"),
      new ResourceLocation("minecraft", "textures/entity/rabbit/black.png"),
      new ResourceLocation("minecraft", "textures/entity/rabbit/gold.png"),
      new ResourceLocation("minecraft", "textures/entity/rabbit/salt.png"),
      new ResourceLocation("minecraft", "textures/entity/rabbit/white_splotched.png"),
      new ResourceLocation("minecraft", "textures/entity/rabbit/toast.png"),
      new ResourceLocation("minecraft", "textures/entity/rabbit/caerbannog.png")
  );

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    if (data.getVariant() < TEXTURES.size()) {
      return TEXTURES.get(data.getVariant());
    }

    return TEXTURES.get(0);
  }

  @Override
  public EntityModel<LivingEntity> getModel() {
    return this;
  }

  @Override
  public Iterable<ModelRenderer> getParts() {
    return ImmutableList.of(this.rearFootLeft, this.rearFootRight, this.haunchLeft, this.haunchRight, this.body, this.frontLegLeft, this.frontLegRight, this.head, this.earRight, this.earLeft, this.tail, this.nose);
  }

  public void prepareMobModel(LivingEntity pEntity, float pLimbSwing, float pLimbSwingAmount, float pPartialTick) {
  }
}
