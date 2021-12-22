package noobanidus.mods.shoulders.client.models;

import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import noobanidus.mods.shoulders.info.ShoulderData;

import javax.annotation.Nonnull;

@SuppressWarnings("WeakerAccess")
@OnlyIn(Dist.CLIENT)
public interface IShoulderRidingModel {
  void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch);

  default void render (ShoulderData data, float scale) {
    render(scale);
  }

  void render(float scale);

  ResourceLocation getTexture(ShoulderData data);

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

  default void renderOnShoulder(ShoulderData data, float limbSwing, float limbSwingAmount, float netHeadYaw, float headPitch, float scaleFactor, int ticksExisted, float partialTicks) {
    this.setRotationAngles(data, ticksExisted, limbSwing, limbSwingAmount, ticksExisted + partialTicks, netHeadYaw, headPitch);
    this.render(data, scaleFactor);
  }

  void scaleAndTranslate (ShoulderData data, boolean offsetArmor, boolean isSneaking, float limbSwing, float limbSwingAmount, float partialTicks, float netHeadYaw, float headPitch, float scaleIn);

  default void setRotation(@Nonnull ModelRenderer model, float x, float y, float z) {
    model.xRot = x;
    model.yRot = y;
    model.zRot = z;
  }
}
