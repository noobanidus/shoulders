package noobanidus.mods.shoulders.client.models;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import noobanidus.mods.shoulders.common.info.ShoulderData;

@SuppressWarnings("WeakerAccess")
@OnlyIn(Dist.CLIENT)
public abstract class ShoulderRidingModel extends EntityModel<Entity> {
  public abstract void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch);

  public abstract void render(float scale);

  public abstract ResourceLocation getTexture(ShoulderData data);

  protected void setRotationOffset(RendererModel renderer, float x, float y, float z) {
    renderer.rotateAngleX = x;
    renderer.rotateAngleY = y;
    renderer.rotateAngleZ = z;
  }

  protected float getSwing(float deg, float ageInTicks) {
    return (float) Math.sin(ageInTicks * 0.125f * (Math.PI * 2.0f) + Math.toRadians(deg));
  }

  protected float getBobble(float deg, float ageInTicks) {
    return (float) Math.sin(ageInTicks * 0.03125f * (Math.PI * 2.0f) + Math.toRadians(deg));
  }

  public void renderOnShoulder(ShoulderData data, float limbSwing, float limbSwingAmount, float netHeadYaw, float headPitch, float scaleFactor, int ticksExisted) {
    this.setRotationAngles(data, ticksExisted, limbSwing, limbSwingAmount, 0.0F, netHeadYaw, headPitch);
    this.render(scaleFactor);
  }
}
