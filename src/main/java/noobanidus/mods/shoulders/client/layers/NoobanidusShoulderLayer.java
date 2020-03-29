package noobanidus.mods.shoulders.client.layers;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.LlamaRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.client.renderer.entity.model.SquidModel;
import net.minecraft.client.renderer.entity.model.WolfModel;
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
    GlStateManager.enableRescaleNormal();
    GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
    ShoulderData data = new ShoulderData(null, ShoulderEntity.WOLF, Shoulder.RIGHT, 45); //ShoulderList.getData(entityIn);
    if (data != null) {
      this.renderModel(entityIn, data, limbSwing, limbSwingAmount, partialTicks, netHeadYaw, headPitch, scaleIn, getModelFor(data));
    }
    GlStateManager.disableRescaleNormal();
  }

  private void renderModel(T player, ShoulderData data, float limbSwing, float limbSwingAmount, float partialTicks, float netHeadYaw, float headPitch, float scaleIn, IShoulderRidingModel model) {
    GlStateManager.pushMatrix();
    boolean offsetArmor = !player.getItemStackFromSlot(EquipmentSlotType.CHEST).isEmpty();
    double armorOffset = 0;
    switch (data.getEntity()) {
      case BEETLE:
        if (offsetArmor) {
          armorOffset = -0.2;
        }
        GlStateManager.scaled(0.3, 0.3, 0.3);
        GlStateManager.translated(data.left() ? 1.275 : -1.275, player.shouldRenderSneaking() ? -0.8 + armorOffset : -1.48 + armorOffset, 0);
        break;
      case RABBIT:
        if (offsetArmor) {
          armorOffset = -0.1;
        }
        GlStateManager.scaled(0.65, 0.65, 0.65);
        GlStateManager.translated(data.left() ? 0.6 : -0.6, player.shouldRenderSneaking() ? -1.2 + armorOffset : -1.50 + armorOffset, -0.06);
        break;
      case CHICKEN:
        if (offsetArmor) {
          armorOffset = -0.15;
        }
        GlStateManager.scaled(0.4, 0.4, 0.4);
        GlStateManager.translated(data.left() ? 0.95 : -0.95, player.shouldRenderSneaking() ? -1.25 + armorOffset : -1.55 + armorOffset, -0.06);
        break;
      case OCELOT:
        if (offsetArmor) {
          armorOffset = -0.1;
        }
        GlStateManager.scaled(0.45, 0.45, 0.45);
        //GlStateManager.translated(data.left() ? 0.375 : -0.375, player.shouldRenderSneaking() ? -0.5 : -0.68, -0.0);
        GlStateManager.translated(data.left() ? 0.85 : -0.85, player.shouldRenderSneaking() ? -1.2 + armorOffset : -1.50 + armorOffset, -0.06);
        break;
      case BAT: // TODO
        GlStateManager.rotated(180, 0, 0, 1);
        GlStateManager.rotated(180, 0, 1, 0);
        GlStateManager.scaled(0.26, 0.26, 0.26);
        GlStateManager.translated(data.left() ? 1.575 : -1.575, player.shouldRenderSneaking() ? 0 : 1.5, 0);
        break;
      case TURTLE:
        if (offsetArmor) {
          armorOffset = -0.2;
        }
        GlStateManager.scaled(0.25, 0.25, 0.25);
        GlStateManager.translated(data.left() ? 1.675 : -1.675, player.shouldRenderSneaking() ? -0.8 + armorOffset : -1.48 + armorOffset, -0.3);
        break;
      case MOOSHROOM:
      case COW:
        if (offsetArmor) {
          armorOffset = -0.2;
        }
        GlStateManager.scaled(0.2, 0.2, 0.2);
        GlStateManager.translated(data.left() ? 1.875 : -1.875, player.shouldRenderSneaking() ? -0.8 + armorOffset : -1.48 + armorOffset, 0);
        break;
      case HORSE:
        if (offsetArmor) {
          armorOffset = -0.2;
        }
        GlStateManager.scaled(0.17, 0.17, 0.17);
        GlStateManager.translated(data.left() ? 2.15 : -2.15, player.shouldRenderSneaking() ? -0.5 + armorOffset : -1.50 + armorOffset, 0);
        break;
      case PIG:
        if (offsetArmor) {
          armorOffset = -0.3;
        }
        GlStateManager.scaled(0.2, 0.2, 0.2);
        GlStateManager.translated(data.left() ? 1.875 : -1.875, player.shouldRenderSneaking() ? -0.83 + armorOffset : -1.50 + armorOffset, -0.1);
        break;
      case SHEEP:
        if (offsetArmor) {
          armorOffset = -0.3;
        }
        GlStateManager.scaled(0.2, 0.2, 0.2);
        GlStateManager.translated(data.left() ? 1.875 : -1.875, player.shouldRenderSneaking() ? -0.83 + armorOffset : -1.50 + armorOffset, -0.1);
        break;
      case DOLPHIN:
        if (offsetArmor) {
          armorOffset = -0.35;
        }
        GlStateManager.scaled(0.2, 0.2, 0.2);
        GlStateManager.translated(data.left() ? 1.875 : -1.875, player.shouldRenderSneaking() ? -0.88 + armorOffset : -1.55 + armorOffset, -0.1);
        break;
      case COD:
        if (offsetArmor) {
          armorOffset = -0.35;
        }
        GlStateManager.scaled(0.35, 0.35, 0.35);
        GlStateManager.translated(data.left() ? 1.08 : -1.08, player.shouldRenderSneaking() ? -1.08 + armorOffset : -1.55 + armorOffset, -0.1);
        break;
      case FOX:
        if (offsetArmor) {
          armorOffset = -0.3;
        }
        GlStateManager.scaled(0.2, 0.2, 0.2);
        GlStateManager.translated(data.left() ? 1.875 : -1.875, player.shouldRenderSneaking() ? -0.83 + armorOffset : -1.50 + armorOffset, -0.2);
        break;
      case LLAMA:
        if (offsetArmor) {
          armorOffset = -0.2;
        }
        GlStateManager.scaled(0.15, 0.15, 0.15);
        GlStateManager.translated(data.left() ? 2.47 : -2.47, player.shouldRenderSneaking() ? -0.8 + armorOffset : -1.48 + armorOffset, 0);
        break;
      case PANDA:
        if (offsetArmor) {
          armorOffset = -0.2;
        }
        GlStateManager.scaled(0.15, 0.15, 0.15);
        GlStateManager.translated(data.left() ? 2.47 : -2.47, player.shouldRenderSneaking() ? -0.8 + armorOffset : -1.48 + armorOffset, 0);
        break;
      case PARROT:
        GlStateManager.translatef(data.left() ? 0.4F : -0.4F, player.shouldRenderSneaking() ? -1.3F : -1.5F, 0.0F);
        break;
      case PUFFERFISH:
        GlStateManager.scaled(0.35, 0.35, 0.35);
        GlStateManager.translated(data.left() ? 1.05 : -1.05, player.shouldRenderSneaking() ? -0.9 + armorOffset : -1.455 + armorOffset, 0);
        break;
      case POLAR_BEAR:
        GlStateManager.scaled(0.2, 0.2, 0.2);
        GlStateManager.translated(data.left() ? 1.85 : -1.85, player.shouldRenderSneaking() ? -0.5 + armorOffset : -1.5 + armorOffset, 0);
        break;
      case SALMON:
        // TODO
        if (offsetArmor) {
          armorOffset = -0.35;
        }
        GlStateManager.scaled(0.22, 0.22, 0.22);
        GlStateManager.translated(data.left() ? 1.68 : -1.68, player.shouldRenderSneaking() ? -1.08 + armorOffset : -1.45 + armorOffset, -0.5);
        break;
      case SNOW_GOLEM:
        // TODO
        if (offsetArmor) {
          armorOffset = -0.35;
        }
        GlStateManager.scaled(0.2, 0.2, 0.2);
        GlStateManager.translated(data.left() ? 1.88 : -1.88, player.shouldRenderSneaking() ? -1.08 + armorOffset : -1.45 + armorOffset, -0.1);
        break;
      case LARGE_TROPICAL_FISH:
        GlStateManager.scaled(0.35, 0.35, 0.35);
        GlStateManager.translated(data.left() ? 1.05 : -1.05, player.shouldRenderSneaking() ? -0.9 + armorOffset : -1.455 + armorOffset, 0);
        break;
      case SMALL_TROPICAL_FISH:
        GlStateManager.scaled(0.35, 0.35, 0.35);
        GlStateManager.translated(data.left() ? 1.05 : -1.05, player.shouldRenderSneaking() ? -0.9 + armorOffset : -1.455 + armorOffset, 0);
        break;
      case WOLF:
        if (offsetArmor) {
          armorOffset = -0.1;
        }
        GlStateManager.scaled(0.45, 0.45, 0.45);
        GlStateManager.translated(data.left() ? 0.85 : -0.85, player.shouldRenderSneaking() ? -1.2 + armorOffset : -1.50 + armorOffset, 0.1);
        break;
    }
    this.bindTexture(model.getTexture(data));
    model.renderOnShoulder(data, limbSwing, limbSwingAmount, netHeadYaw, headPitch, scaleIn, player.ticksExisted, partialTicks);
    GlStateManager.popMatrix();
  }

  @Override
  public boolean shouldCombineTextures() {
    return false;
  }
}
