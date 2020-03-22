package noobanidus.mods.shoulders.client.layers;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import noobanidus.mods.shoulders.client.models.IShoulderRidingModel;
import noobanidus.mods.shoulders.common.info.Shoulder;
import noobanidus.mods.shoulders.common.info.ShoulderData;
import noobanidus.mods.shoulders.common.info.ShoulderEntity;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

@OnlyIn(Dist.CLIENT)
public class ShoulderLayer<T extends PlayerEntity> extends LayerRenderer<T, PlayerModel<T>> {
  private final Map<ShoulderEntity, IShoulderRidingModel> MODEL_MAP = new HashMap<>();

  public ShoulderLayer(IEntityRenderer<T, PlayerModel<T>> player) {
    super(player);
  }

  @Nullable
  private IShoulderRidingModel getModelFor(ShoulderData data) {
    return MODEL_MAP.computeIfAbsent(data.getEntity(), (e) -> e.getModel().get());
  }

  private float getScaleFor(ShoulderData data) {
    switch (data.getEntity()) {
      case OCELOT:
        return 0.5f;
      default:
        return 1.0f;
    }
  }

  @Override
  public void render(T entityIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scaleIn) {
    GlStateManager.enableRescaleNormal();
    GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
    ShoulderData data = new ShoulderData(null, ShoulderEntity.TURTLE, Shoulder.RIGHT, 0); //ShoulderList.getData(entityIn);
    if (data != null) {
      this.renderModel(entityIn, data, limbSwing, limbSwingAmount, partialTicks, netHeadYaw, headPitch, scaleIn, getModelFor(data));
    }
    GlStateManager.disableRescaleNormal();
  }

  private void renderModel(T player, ShoulderData data, float limbSwing, float limbSwingAmount, float partialTicks, float netHeadYaw, float headPitch, float scaleIn, IShoulderRidingModel model) {
    GlStateManager.pushMatrix();
    switch (data.getEntity()) {
      case BEETLE:
        GlStateManager.scaled(0.35, 0.35, 0.35);
        GlStateManager.translated(data.left() ? 0.375 : -0.375, player.shouldRenderSneaking() ? -0.3 : -0.5, 0.0);
        break;
      case RABBIT:
        GlStateManager.scaled(0.65, 0.65, 0.65);
        GlStateManager.translated(data.left() ? 0.375 : -0.375, player.shouldRenderSneaking() ? -0.7 : -0.98, -0.07);
        break;
      case OCELOT:
        GlStateManager.scaled(0.45, 0.45, 0.45);
        GlStateManager.translated(data.left() ? 0.375 : -0.375, player.shouldRenderSneaking() ? -0.5 : -0.68, -0.0);
        break;
      case BAT:
        GlStateManager.scaled(0.45, 0.45, 0.45);
        GlStateManager.translated(data.left() ? 0.375 : -0.375, player.shouldRenderSneaking() ? -0.5 : -0.68, -0.0);
        break;
      case TURTLE:
        GlStateManager.scaled(0.45, 0.45, 0.45);
        GlStateManager.translated(data.left() ? 0.375 : -0.375, player.shouldRenderSneaking() ? -0.5 : -0.68, -0.0);
        break;
    }
    this.bindTexture(model.getTexture(data));
    model.renderOnShoulder(data, limbSwing, limbSwingAmount, netHeadYaw, headPitch, scaleIn, player.ticksExisted);
    GlStateManager.popMatrix();
  }

  @Override
  public boolean shouldCombineTextures() {
    return false;
  }
}
