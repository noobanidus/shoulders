package noobanidus.mods.shoulders.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.AgeableModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.info.ShoulderData;

import javax.annotation.Nonnull;

public interface IShoulderRidingModel {
  void setupAnim(ShoulderData data, int ticks, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch);

  void prepare(ShoulderData data);

  RenderType getRenderType(ShoulderData data);

  ResourceLocation getTexture(ShoulderData data);

  EntityModel<LivingEntity> getModel();

  Iterable<ModelRenderer> getParts();

  default float getSwing(float deg, float ageInTicks) {
    return (float) Math.sin(ageInTicks * 0.125f * (Math.PI * 2.0f) + Math.toRadians(deg));
  }

  default float getBobble(float deg, float ageInTicks) {
    return (float) Math.sin(ageInTicks * 0.03125f * (Math.PI * 2.0f) + Math.toRadians(deg));
  }

  default void setRotation(@Nonnull ModelRenderer model, float x, float y, float z) {
    model.xRot = x;
    model.yRot = y;
    model.zRot = z;
  }

  default void setRotateAngle(@Nonnull ModelRenderer model, float x, float y, float z) {
    setRotation(model, x, y, z);
  }

  default void renderOnShoulder(MatrixStack pMatrixStack, ShoulderData data, IVertexBuilder pBuffer, int pPackedLight, int pPackedOverlay, float pLimbSwing, float pLimbSwingAmount, float pNetHeadYaw, float pHeadPitch, int ticks) {
    this.prepare(data);
    this.setupAnim(data, ticks, pLimbSwing, pLimbSwingAmount, 0.0F, pNetHeadYaw, pHeadPitch);
    this.getParts().forEach((part) -> part.render(pMatrixStack, pBuffer, pPackedLight, pPackedOverlay));
  }
}
