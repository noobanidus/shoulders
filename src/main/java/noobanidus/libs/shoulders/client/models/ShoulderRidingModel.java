package noobanidus.libs.shoulders.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import noobanidus.libs.shoulders.info.ShoulderData;

public interface ShoulderRidingModel<T extends Entity> {
/*  public void setupAnim(T pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
    this.setupAnim(getStateFor(pEntity), pEntity.tickCount, pLimbSwing, pLimbSwingAmount, pAgeInTicks, pNetHeadYaw, pHeadPitch);
  }

  public void prepareMobModel(T pEntity, float pLimbSwing, float pLimbSwingAmount, float pPartialTick) {
    this.prepare(getStateFor(pEntity));
  }*/

  default void setRotationOffset(ModelRenderer renderer, float x, float y, float z) {
    renderer.xRot = x;
    renderer.yRot = y;
    renderer.zRot = z;
  }

  default float getSwing(float deg, float ageInTicks) {
    return (float) Math.sin(ageInTicks * 0.125f * (Math.PI * 2.0f) + Math.toRadians(deg));
  }

  default float getBobble(float deg, float ageInTicks) {
    return (float) Math.sin(ageInTicks * 0.03125f * (Math.PI * 2.0f) + Math.toRadians(deg));
  }

  default void renderOnShoulder(ShoulderData data, MatrixStack pMatrixStack, IVertexBuilder pBuffer, int pPackedLight, int pPackedOverlay, float pLimbSwing, float pLimbSwingAmount, float pNetHeadYaw, float pHeadPitch, int ticks) {
    this.prepare(data);
    this.setupAnim(data, ticks, pLimbSwing, pLimbSwingAmount, 0.0F, pNetHeadYaw, pHeadPitch);
    this.shoulderHeadParts().forEach((part) -> {
      part.render(pMatrixStack, pBuffer, pPackedLight, pPackedOverlay);
    });
    this.shoulderBodyParts().forEach((part) -> {
      part.render(pMatrixStack, pBuffer, pPackedLight, pPackedOverlay);
    });
  }

  void setupAnim(ShoulderData data, int ticks, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch);

  void prepare(ShoulderData data);

  ResourceLocation getTexture(ShoulderData data);

  Iterable<ModelRenderer> shoulderHeadParts();
  Iterable<ModelRenderer> shoulderBodyParts();
}
