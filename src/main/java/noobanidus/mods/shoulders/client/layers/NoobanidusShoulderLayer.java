package noobanidus.mods.shoulders.client.layers;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import noobanidus.mods.shoulders.client.models.IShoulderRidingModel;
import noobanidus.mods.shoulders.info.Shoulder;
import noobanidus.mods.shoulders.info.ShoulderData;
import noobanidus.mods.shoulders.info.ShoulderEntity;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

@OnlyIn(Dist.CLIENT)
public class NoobanidusShoulderLayer<T extends PlayerEntity> extends LayerRenderer<T, PlayerModel<T>> {
  private final Map<ShoulderEntity, IShoulderRidingModel> MODEL_MAP = new HashMap<>();

  public NoobanidusShoulderLayer(IEntityRenderer<T, PlayerModel<T>> player) {
    super(player);
  }

  @Nullable
  private IShoulderRidingModel getModelFor(ShoulderData data) {
    return MODEL_MAP.computeIfAbsent(data.getEntity(), (e) -> e.getModel().get());
  }

  @Override
  public void render(T entityIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scaleIn) {
    ShoulderData data = new ShoulderData(null, ShoulderEntity.WOLF, Shoulder.RIGHT, 45); //ShoulderList.getData(entityIn);
    //noinspection ConstantConditions
    if (data != null) {
      IShoulderRidingModel model = getModelFor(data);
      if (model != null) {
        GlStateManager.enableRescaleNormal();
        GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.renderModel(entityIn, data, limbSwing, limbSwingAmount, partialTicks, netHeadYaw, headPitch, scaleIn, model);
        GlStateManager.disableRescaleNormal();
      }
    }
  }

  private void renderModel(T player, ShoulderData data, float limbSwing, float limbSwingAmount, float partialTicks, float netHeadYaw, float headPitch, float scaleIn, IShoulderRidingModel model) {
    GlStateManager.pushMatrix();
    boolean offsetArmor = !player.getItemStackFromSlot(EquipmentSlotType.CHEST).isEmpty();
    model.scaleAndTranslate(data, offsetArmor, player.shouldRenderSneaking(), limbSwing, limbSwingAmount, partialTicks, netHeadYaw, headPitch, scaleIn);
    this.bindTexture(model.getTexture(data));
    model.renderOnShoulder(data, limbSwing, limbSwingAmount, netHeadYaw, headPitch, scaleIn, player.ticksExisted, partialTicks);
    GlStateManager.popMatrix();
  }

  @Override
  public boolean shouldCombineTextures() {
    return false;
  }
}
