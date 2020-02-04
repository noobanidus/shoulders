package noobanidus.mods.shoulders.client.layers;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import noobanidus.mods.shoulders.client.models.ShoulderRidingModel;
import noobanidus.mods.shoulders.common.data.ShoulderList;
import noobanidus.mods.shoulders.common.info.ShoulderData;
import noobanidus.mods.shoulders.common.info.ShoulderEntity;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

@OnlyIn(Dist.CLIENT)
public class ShoulderLayer<T extends PlayerEntity> extends LayerRenderer<T, PlayerModel<T>> {
  private final Map<ShoulderEntity, ShoulderRidingModel> MODEL_MAP = new HashMap<>();

  public ShoulderLayer(IEntityRenderer<T, PlayerModel<T>> player) {
    super(player);
  }

  @Nullable
  public ShoulderRidingModel getModelFor(ShoulderData data) {
    return MODEL_MAP.computeIfAbsent(data.getEntity(), (e) -> e.getModel().get());
  }

  @Override
  public void render(T entityIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scaleIn) {
    GlStateManager.enableRescaleNormal();
    GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
    ShoulderData data = ShoulderList.getData(entityIn);
    if (data != null) {
      this.renderModel(entityIn, data, limbSwing, limbSwingAmount, partialTicks, netHeadYaw, headPitch, scaleIn, getModelFor(data));
    }
    GlStateManager.disableRescaleNormal();
  }

  private void renderModel(T player, ShoulderData data, float limbSwing, float limbSwingAmount, float partialTicks, float netHeadYaw, float headPitch, float scaleIn, ShoulderRidingModel model) {
    GlStateManager.pushMatrix();
    switch (data.getEntity()) {
      case BEETLE:
        GlStateManager.translated(data.left() ? 0.375 : -0.375, player.shouldRenderSneaking() ? -0.3 : -0.5, 0.0);
        GlStateManager.scaled(0.35, 0.35, 0.35);
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
