package noobanidus.mods.shoulders.client.models;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import noobanidus.mods.shoulders.common.info.ShoulderData;

@OnlyIn(Dist.CLIENT)
public abstract class ShoulderRidingModel<T extends Entity> extends EntityModel<T> {
  public abstract void renderOnShoulder(ShoulderData data, float limbSwing, float limbSwingAmount, float netHeadYaw, float headPitch, float scaleFactor, int ticksExisted);
  public abstract void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch);
  public abstract void render(float scale);
  public abstract ResourceLocation getTexture (ShoulderData data);
}
