package noobanidus.mods.shoulders.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.texture.AtlasTexture;
import net.minecraft.entity.passive.MooshroomEntity;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.info.ShoulderData;

public class MooshroomModel extends CowModel {
  public MooshroomModel() {
    super();
  }

  @Override
  public void renderOnShoulder(ShoulderData data, float limbSwing, float limbSwingAmount, float netHeadYaw, float headPitch, float scaleFactor, int ticksExisted, float partialTicks) {
    this.setRotationAngles(data, ticksExisted, limbSwing, limbSwingAmount, partialTicks, netHeadYaw, headPitch);
    this.render(data, scaleFactor);
    BlockState blockstate = typeFromVariant(data).getRenderState();
    Minecraft mc = Minecraft.getInstance();
    mc.getRenderManager().textureManager.bindTexture(AtlasTexture.LOCATION_BLOCKS_TEXTURE);
    GlStateManager.enableCull();
    GlStateManager.cullFace(GlStateManager.CullFace.FRONT);
    GlStateManager.pushMatrix();
    GlStateManager.scalef(1.0F, -1.0F, 1.0F);
    GlStateManager.translatef(0.2F, 0.35F, 0.5F);
    GlStateManager.rotatef(42.0F, 0.0F, 1.0F, 0.0F);
    BlockRendererDispatcher blockrendererdispatcher = Minecraft.getInstance().getBlockRendererDispatcher();
    GlStateManager.pushMatrix();
    GlStateManager.translatef(-0.5F, -0.5F, 0.5F);
    blockrendererdispatcher.renderBlockBrightness(blockstate, 1.0F);
    GlStateManager.popMatrix();
    GlStateManager.pushMatrix();
    GlStateManager.translatef(0.1F, 0.0F, -0.6F);
    GlStateManager.rotatef(42.0F, 0.0F, 1.0F, 0.0F);
    GlStateManager.translatef(-0.5F, -0.5F, 0.5F);
    blockrendererdispatcher.renderBlockBrightness(blockstate, 1.0F);
    GlStateManager.popMatrix();
    GlStateManager.popMatrix();
    GlStateManager.pushMatrix();
    headModel.postRender(0.0625F);
    GlStateManager.scalef(1.0F, -1.0F, 1.0F);
    GlStateManager.translatef(0.0F, 0.7F, -0.2F);
    GlStateManager.rotatef(12.0F, 0.0F, 1.0F, 0.0F);
    GlStateManager.translatef(-0.5F, -0.5F, 0.5F);
    blockrendererdispatcher.renderBlockBrightness(blockstate, 1.0F);
    GlStateManager.popMatrix();
    GlStateManager.cullFace(GlStateManager.CullFace.BACK);
    GlStateManager.disableCull();
  }

  private static MooshroomEntity.Type typeFromVariant(ShoulderData data) {
    if (data.getVariant() == 0) {
      return MooshroomEntity.Type.BROWN;
    } else {
      return MooshroomEntity.Type.RED;
    }
  }

  private static final ResourceLocation BROWN = new ResourceLocation("textures/entity/cow/brown_mooshroom.png");
  private static final ResourceLocation RED = new ResourceLocation("textures/entity/cow/red_mooshroom.png");

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    if (data.getVariant() == 0) {
      return BROWN;
    } else {
      return RED;
    }
  }
}
