package noobanidus.libs.shoulders.client.transforms;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import noobanidus.libs.shoulders.info.ShoulderData;

@FunctionalInterface
public interface ITransformer {
  void transform (MatrixStack stack, ShoulderData data, PlayerEntity player, double armorOffset);
}
