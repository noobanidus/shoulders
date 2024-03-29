package noobanidus.libs.shoulders.client.layers;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.player.PlayerEntity;
import noobanidus.libs.shoulders.client.models.IShoulderRidingModel;
import noobanidus.libs.shoulders.data.ShoulderList;
import noobanidus.libs.shoulders.info.Shoulder;
import noobanidus.libs.shoulders.info.ShoulderData;
import noobanidus.libs.shoulders.info.ShoulderEntity;

import javax.annotation.Nonnull;
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

  @Override
  public void render(@Nonnull MatrixStack pMatrixStack, @Nonnull IRenderTypeBuffer pBuffer, int pPackedLight, @Nonnull T pLivingEntity, float pLimbSwing, float pLimbSwingAmount, float pPartialTicks, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
    //ShoulderData data = new ShoulderData(pLivingEntity.getUUID(), ShoulderEntity.JERBOA, Shoulder.LEFT, 2);
    ShoulderData data = ShoulderList.getData(pLivingEntity);
    //noinspection ConstantConditions
    if (data != null) {
      if ((data.getShoulder().left() && !pLivingEntity.getShoulderEntityLeft().isEmpty()) || data.getShoulder().right() && !pLivingEntity.getShoulderEntityRight().isEmpty()) {
        return;
      }

      IShoulderRidingModel model = getModelFor(data);
      if (model != null) {
        pMatrixStack.pushPose();
        data.getEntity().getTransformers().transform(pMatrixStack, data, pLivingEntity, data.getEntity().getArmorOffset());
        IVertexBuilder vertex = pBuffer.getBuffer(model.getRenderType(data));
        model.renderOnShoulder(pMatrixStack, data, vertex, pPackedLight, OverlayTexture.NO_OVERLAY, pLimbSwing, pLimbSwingAmount, pNetHeadYaw, pHeadPitch, pLivingEntity.tickCount);
        model.renderExtra(data, pMatrixStack, pBuffer, pPackedLight, pLivingEntity, pLimbSwing, pLimbSwingAmount, pPartialTicks, pAgeInTicks, pNetHeadYaw, pHeadPitch);
        pMatrixStack.popPose();
      }
    }
  }
}
