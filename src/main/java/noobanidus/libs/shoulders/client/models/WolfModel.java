package noobanidus.libs.shoulders.client.models;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.TintedAgeableModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.DyeColor;
import net.minecraft.util.ResourceLocation;
import noobanidus.libs.shoulders.info.ShoulderData;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

public class WolfModel extends TintedAgeableModel<LivingEntity> implements IShoulderRidingModel {
  private final ModelRenderer head;
  private final ModelRenderer realHead;
  private final ModelRenderer body;
  private final ModelRenderer leg0;
  private final ModelRenderer leg1;
  private final ModelRenderer leg2;
  private final ModelRenderer leg3;
  private final ModelRenderer tail;
  private final ModelRenderer realTail;
  private final ModelRenderer upperBody;

  public WolfModel() {
    float f = 0.0F;
    float f1 = 13.5F;
    this.head = new ModelRenderer(this, 0, 0);
    this.head.setPos(-1.0F, 13.5F, -7.0F);
    this.realHead = new ModelRenderer(this, 0, 0);
    this.realHead.addBox(-2.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, 0.0F);
    this.head.addChild(this.realHead);
    this.body = new ModelRenderer(this, 18, 14);
    this.body.addBox(-3.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F);
    this.body.setPos(0.0F, 14.0F, 2.0F);
    this.upperBody = new ModelRenderer(this, 21, 0);
    this.upperBody.addBox(-3.0F, -3.0F, -3.0F, 8.0F, 6.0F, 7.0F, 0.0F);
    this.upperBody.setPos(-1.0F, 14.0F, 2.0F);
    this.leg0 = new ModelRenderer(this, 0, 18);
    this.leg0.addBox(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
    this.leg0.setPos(-2.5F, 16.0F, 7.0F);
    this.leg1 = new ModelRenderer(this, 0, 18);
    this.leg1.addBox(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
    this.leg1.setPos(0.5F, 16.0F, 7.0F);
    this.leg2 = new ModelRenderer(this, 0, 18);
    this.leg2.addBox(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
    this.leg2.setPos(-2.5F, 16.0F, -4.0F);
    this.leg3 = new ModelRenderer(this, 0, 18);
    this.leg3.addBox(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
    this.leg3.setPos(0.5F, 16.0F, -4.0F);
    this.tail = new ModelRenderer(this, 9, 18);
    this.tail.setPos(-1.0F, 12.0F, 8.0F);
    this.realTail = new ModelRenderer(this, 9, 18);
    this.realTail.addBox(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F);
    this.tail.addChild(this.realTail);
    this.realHead.texOffs(16, 14).addBox(-2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F);
    this.realHead.texOffs(16, 14).addBox(2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F);
    this.realHead.texOffs(0, 10).addBox(-0.5F, 0.0F, -5.0F, 3.0F, 3.0F, 4.0F, 0.0F);
  }

  protected Iterable<ModelRenderer> headParts() {
    return ImmutableList.of(this.head);
  }

  protected Iterable<ModelRenderer> bodyParts() {
    return ImmutableList.of(this.body, this.leg0, this.leg1, this.leg2, this.leg3, this.tail, this.upperBody);
  }

  public void prepareMobModel(LivingEntity pEntity, float pLimbSwing, float pLimbSwingAmount, float pPartialTick) {
  }

  public void prepare (ShoulderData data) {
    this.upperBody.setPos(-1.0F, 16.0F, -3.0F);
    this.upperBody.xRot = 1.2566371F;
    this.upperBody.yRot = 0.0F;
    this.body.setPos(0.0F, 18.0F, 0.0F);
    this.body.xRot = ((float) Math.PI / 4F);
    this.tail.setPos(-1.0F, 21.0F, 6.0F);
    this.leg0.setPos(-2.5F, 22.7F, 2.0F);
    this.leg0.xRot = ((float) Math.PI * 1.5F);
    this.leg1.setPos(0.5F, 22.7F, 2.0F);
    this.leg1.xRot = ((float) Math.PI * 1.5F);
    this.leg2.xRot = 5.811947F;
    this.leg2.setPos(-2.49F, 17.0F, -4.0F);
    this.leg3.xRot = 5.811947F;
    this.leg3.setPos(0.51F, 17.0F, -4.0F);

  }

  @Override
  public RenderType getRenderType(ShoulderData data) {
    return renderType(getTexture(data));
  }

  private static final List<ResourceLocation> TEXTURES = Arrays.asList(
      new ResourceLocation("textures/entity/wolf/wolf.png"),
      new ResourceLocation("textures/entity/wolf/wolf_tame.png"),
      new ResourceLocation("textures/entity/wolf/wolf_angry.png")
  );

  private static final ResourceLocation WOLF_COLLAR = new ResourceLocation("textures/entity/wolf/wolf_collar.png");

  @Nullable
  private float[] getCollarColor(ShoulderData data) {
    int color = data.getVariant() & 31;
    if (color == 0) {
      return null;
    }
    return DyeColor.byId(color - 1).getTextureDiffuseColors();
  }

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    int var = data.getVariant() >> 5;
    if (var < TEXTURES.size()) {
      return TEXTURES.get(var);
    }

    return TEXTURES.get(0);
  }

  @Override
  public EntityModel<LivingEntity> getModel() {
    return this;
  }

  @Override
  public Iterable<ModelRenderer> getParts() {
    return Iterables.concat(headParts(), bodyParts());
  }

  public void setupAnim(LivingEntity pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
  }

  public void setupAnim(ShoulderData data, int ticks, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
    this.head.xRot = pHeadPitch * ((float) Math.PI / 180F);
    this.head.yRot = pNetHeadYaw * ((float) Math.PI / 180F);
    this.tail.xRot = pAgeInTicks;
  }

  public void renderExtra (ShoulderData data, @Nonnull MatrixStack pMatrixStack, @Nonnull IRenderTypeBuffer pBuffer, int pPackedLight, @Nonnull PlayerEntity pLivingEntity, float pLimbSwing, float pLimbSwingAmount, float pPartialTicks, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
    IVertexBuilder vertex = pBuffer.getBuffer(RenderType.entityCutoutNoCull(WOLF_COLLAR));
    float[] color = getCollarColor(data);
    if (color != null) {
      prepare(data);
      this.setupAnim(data, pLivingEntity.tickCount, pLimbSwing, pLimbSwingAmount, 0.0F, pNetHeadYaw, pHeadPitch);
      getParts().forEach(part -> part.render(pMatrixStack, vertex, pPackedLight, OverlayTexture.NO_OVERLAY, color[0], color[1], color[2], 1.0f));
    }
  }
}