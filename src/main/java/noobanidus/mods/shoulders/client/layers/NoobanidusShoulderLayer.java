package noobanidus.mods.shoulders.client.layers;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.player.PlayerEntity;
import noobanidus.mods.shoulders.client.models.IShoulderRidingModel;
import noobanidus.mods.shoulders.info.Shoulder;
import noobanidus.mods.shoulders.info.ShoulderData;
import noobanidus.mods.shoulders.info.ShoulderEntity;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class NoobanidusShoulderLayer<T extends PlayerEntity> extends LayerRenderer<T, PlayerModel<T>> {
  private static final Map<ShoulderEntity, IShoulderRidingModel> modelMap = new HashMap<>();

  public NoobanidusShoulderLayer(IEntityRenderer<T, PlayerModel<T>> p_i50929_1_) {
    super(p_i50929_1_);
  }

  @Nullable
  private IShoulderRidingModel getModelFor(ShoulderData data) {
    return modelMap.computeIfAbsent(data.getEntity(), (k) -> k.getModel().get());
  }

  public void render(MatrixStack pMatrixStack, IRenderTypeBuffer pBuffer, int pPackedLight, T pLivingEntity, float pLimbSwing, float pLimbSwingAmount, float pPartialTicks, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
    ShoulderData data = new ShoulderData(null, ShoulderEntity.BEETLE, Shoulder.LEFT, 0);  //ShoulderList.getData(pLivingEntity);
    //noinspection ConstantConditions
    if (data != null) {
      IShoulderRidingModel model = getModelFor(data);
      if (model != null) {
        pMatrixStack.pushPose();
        data.getEntity().getTransformers().transform(pMatrixStack, data, pLivingEntity);
        IVertexBuilder vertex = pBuffer.getBuffer(model.getRenderType(data));
        model.renderOnShoulder(pMatrixStack, data, vertex, pPackedLight, OverlayTexture.NO_OVERLAY, pLimbSwing, pLimbSwingAmount, pNetHeadYaw, pHeadPitch, pLivingEntity.tickCount);
        pMatrixStack.popPose();
      }
    }
  }
}
