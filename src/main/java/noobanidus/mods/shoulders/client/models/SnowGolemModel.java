package noobanidus.mods.shoulders.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import noobanidus.mods.shoulders.info.ShoulderData;

public class SnowGolemModel extends EntityModel<Entity> implements IShoulderRidingModel {
  private static final ResourceLocation SNOW_MAN_TEXTURES = new ResourceLocation("textures/entity/snow_golem.png");

  private final RendererModel body;
  private final RendererModel bottomBody;
  private final RendererModel head;
  private final RendererModel rightHand;
  private final RendererModel leftHand;

  public SnowGolemModel() {
    this.head = (new RendererModel(this, 0, 0)).setTextureSize(64, 64);
    this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, -0.5F);
    this.head.setRotationPoint(0.0F, 4.0F, 0.0F);
    this.rightHand = (new RendererModel(this, 32, 0)).setTextureSize(64, 64);
    this.rightHand.addBox(-1.0F, 0.0F, -1.0F, 12, 2, 2, -0.5F);
    this.rightHand.setRotationPoint(0.0F, 6.0F, 0.0F);
    this.leftHand = (new RendererModel(this, 32, 0)).setTextureSize(64, 64);
    this.leftHand.addBox(-1.0F, 0.0F, -1.0F, 12, 2, 2, -0.5F);
    this.leftHand.setRotationPoint(0.0F, 6.0F, 0.0F);
    this.body = (new RendererModel(this, 0, 16)).setTextureSize(64, 64);
    this.body.addBox(-5.0F, -10.0F, -5.0F, 10, 10, 10, -0.5F);
    this.body.setRotationPoint(0.0F, 13.0F, 0.0F);
    this.bottomBody = (new RendererModel(this, 0, 36)).setTextureSize(64, 64);
    this.bottomBody.addBox(-6.0F, -12.0F, -6.0F, 12, 12, 12, -0.5F);
    this.bottomBody.setRotationPoint(0.0F, 24.0F, 0.0F);
  }

  @Override
  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    this.head.rotateAngleY = (netHeadYaw * ((float) Math.PI / 180F)) * 0.8f;
    this.head.rotateAngleX = (headPitch * ((float) Math.PI / 180F)) * 0.8f;
    this.body.rotateAngleY = netHeadYaw * ((float) Math.PI / 180F) * 0.25F;
    float f = MathHelper.sin(this.body.rotateAngleY);
    float f1 = MathHelper.cos(this.body.rotateAngleY);
    this.rightHand.rotateAngleZ = 1.0F;
    this.leftHand.rotateAngleZ = -1.0F;
    this.rightHand.rotateAngleY = 0.0F + this.body.rotateAngleY;
    this.leftHand.rotateAngleY = (float) Math.PI + this.body.rotateAngleY;
    this.rightHand.rotationPointX = f1 * 5.0F;
    this.rightHand.rotationPointZ = -f * 5.0F;
    this.leftHand.rotationPointX = -f1 * 5.0F;
    this.leftHand.rotationPointZ = f * 5.0F;
  }

  @Override
  public void render(float scale) {
    this.body.render(scale);
    this.bottomBody.render(scale);
    this.head.render(scale);
    this.rightHand.render(scale);
    this.leftHand.render(scale);
  }

  @Override
  public void renderOnShoulder(ShoulderData data, float limbSwing, float limbSwingAmount, float netHeadYaw, float headPitch, float scaleFactor, int ticksExisted, float partialTicks) {
    this.setRotationAngles(data, ticksExisted, limbSwing, limbSwingAmount, partialTicks, netHeadYaw, headPitch);
    this.render(data, scaleFactor);
    GlStateManager.pushMatrix();
    head.postRender(0.0625F);
    GlStateManager.translatef(0.0F, -0.34375F, 0.0F);
    GlStateManager.rotatef(180.0F, 0.0F, 1.0F, 0.0F);
    GlStateManager.scalef(0.625F, -0.625F, -0.625F);
    // TODO:
    // Minecraft.getInstance().getFirstPersonRenderer().renderItem(entityIn, new ItemStack(Blocks.CARVED_PUMPKIN), ItemCameraTransforms.TransformType.HEAD);
    GlStateManager.popMatrix();
  }

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    return SNOW_MAN_TEXTURES;
  }
}
