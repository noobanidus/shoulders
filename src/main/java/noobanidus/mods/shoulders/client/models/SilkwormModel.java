package noobanidus.mods.shoulders.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import noobanidus.mods.shoulders.Constants;
import noobanidus.mods.shoulders.info.ShoulderData;

import java.util.Arrays;
import java.util.List;

public class SilkwormModel extends EntityModel<Entity> implements IShoulderRidingModel {
  private static final int[][] BODY_SIZES = new int[][]{{4, 3, 2}, {6, 4, 5}, {3, 3, 1}, {1, 2, 1}};
  private static final int[][] BODY_TEXS = new int[][]{{0, 0}, {0, 5}, {0, 14}, {0, 18}};
  private static final int BODY_COUNT = BODY_SIZES.length;
  private final RendererModel[] bodyParts;

  public SilkwormModel() {
    this.bodyParts = new RendererModel[BODY_COUNT];
    float f = -3.5F;

    for (int i = 0; i < this.bodyParts.length; ++i) {
      this.bodyParts[i] = new RendererModel(this, BODY_TEXS[i][0], BODY_TEXS[i][1]);
      this.bodyParts[i].addBox((float) BODY_SIZES[i][0] * -0.5F, 0.0F, (float) BODY_SIZES[i][2] * -0.5F, BODY_SIZES[i][0], BODY_SIZES[i][1], BODY_SIZES[i][2]);
      this.bodyParts[i].setRotationPoint(0.0F, (float) (24 - BODY_SIZES[i][1]), f);

      if (i < this.bodyParts.length - 1) {
        f += (float) (BODY_SIZES[i][2] + BODY_SIZES[i + 1][2]) * 0.5F;
      }
    }
  }

  public void render(float scale) {
    for (RendererModel modelrenderer : this.bodyParts) {
      modelrenderer.render(scale);
    }
  }

  private static final ResourceLocation TEXTURE = new ResourceLocation(Constants.MODID, "textures/entity/silkworm.png");

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    return TEXTURE;
  }

  @Override
  public void scaleAndTranslate(ShoulderData data, boolean offsetArmor, boolean isSneaking, float limbSwing, float limbSwingAmount, float partialTicks, float netHeadYaw, float headPitch, float scaleIn) {
    double armorOffset = 0;
    if (offsetArmor) {
      armorOffset = -0.1;
    }
    GlStateManager.scaled(0.45, 0.45, 0.45);
    GlStateManager.scalef(0.9F, 1.1F, 1.5F);
    GlStateManager.translated(data.left() ? 0.85 : -0.85, isSneaking ? -1.2 + armorOffset : -1.50 + armorOffset, -0.06);
  }

  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    for (int i = 0; i < this.bodyParts.length; ++i) {
      this.bodyParts[i].rotateAngleY = MathHelper.cos(ageInTicks * 0.25F + (float) i * 0.15F * (float) Math.PI) * (float) Math.PI * 0.01F * (float) (1 + Math.abs(i - 2));
      this.bodyParts[i].rotationPointX = MathHelper.sin(ageInTicks * 0.25F + (float) i * 0.15F * (float) Math.PI) * (float) Math.PI * 0.1F * (float) Math.abs(i - 2);
    }
  }
}
