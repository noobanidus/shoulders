package noobanidus.mods.shoulders.client.models;

import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import noobanidus.mods.shoulders.common.info.ShoulderData;

@SuppressWarnings("WeakerAccess")
@OnlyIn(Dist.CLIENT)
public interface IShoulderRidingModel {
  void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch);

  void render(float scale);

  ResourceLocation getTexture(ShoulderData data);

  default void setRotationOffset(RendererModel renderer, float x, float y, float z) {
    renderer.rotateAngleX = x;
    renderer.rotateAngleY = y;
    renderer.rotateAngleZ = z;
  }

  default float getSwing(float deg, float ageInTicks) {
    return (float) Math.sin(ageInTicks * 0.125f * (Math.PI * 2.0f) + Math.toRadians(deg));
  }

  default float getBobble(float deg, float ageInTicks) {
    return (float) Math.sin(ageInTicks * 0.03125f * (Math.PI * 2.0f) + Math.toRadians(deg));
  }

  default void renderOnShoulder(ShoulderData data, float limbSwing, float limbSwingAmount, float netHeadYaw, float headPitch, float scaleFactor, int ticksExisted) {
    this.setRotationAngles(data, ticksExisted, limbSwing, limbSwingAmount, 0.0F, netHeadYaw, headPitch);
    this.render(scaleFactor);
  }
}
