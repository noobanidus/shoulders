package noobanidus.mods.shoulders.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.info.ShoulderData;

public abstract class AbstractTropicalFishModel<T extends EntityModel<Entity> & IShoulderRidingModel> extends EntityModel<Entity> implements IShoulderRidingModel, ITropicalFish {
  protected RendererModel body;
  protected RendererModel tail;
  protected RendererModel finRight;
  protected RendererModel finLeft;
  protected RendererModel finTop;
  protected T pattern;

  public AbstractTropicalFishModel(T pattern) {
    this.pattern = pattern;
  }

  @Override
  public void renderOnShoulder(ShoulderData data, float limbSwing, float limbSwingAmount, float netHeadYaw, float headPitch, float scaleFactor, int ticksExisted, float partialTicks) {
    this.setRotationAngles(data, ticksExisted, limbSwing, limbSwingAmount, partialTicks, netHeadYaw, headPitch);
    float[] b = getBodyColour(data);
    GlStateManager.color3f(b[0], b[1], b[2]);
    this.render(data, scaleFactor);
    Minecraft mc = Minecraft.getInstance();
    ResourceLocation pattern = getPattern(data);
    mc.textureManager.bindTexture(pattern);
    b = getPatternColour(data);
    GlStateManager.color3f(b[0], b[1], b[2]);
    this.pattern.setRotationAngles(data, ticksExisted, limbSwing, limbSwingAmount, partialTicks, netHeadYaw, headPitch);
    this.pattern.render(scaleFactor);
    GlStateManager.color3f(1f, 1f, 1f);
  }

  public abstract ResourceLocation getPattern(ShoulderData data);

  @Override
  public void render(float scale) {
    this.body.render(scale);
    this.tail.render(scale);
    this.finRight.render(scale);
    this.finLeft.render(scale);
    this.finTop.render(scale);
  }
}
