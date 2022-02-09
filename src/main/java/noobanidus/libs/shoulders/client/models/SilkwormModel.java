package noobanidus.libs.shoulders.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import noobanidus.libs.shoulders.Constants;
import noobanidus.libs.shoulders.info.ShoulderData;

import java.util.Arrays;

public class SilkwormModel extends EntityModel<LivingEntity> implements IShoulderRidingModel {
  private static final int[][] BODY_SIZES = new int[][]{{4, 3, 2}, {6, 4, 5}, {3, 3, 1}, {1, 2, 1}};
  private static final int[][] BODY_TEXS = new int[][]{{0, 0}, {0, 5}, {0, 14}, {0, 18}};
  private static final int BODY_COUNT = BODY_SIZES.length;
  private final ModelRenderer[] bodyParts;

  public SilkwormModel() {
    this.bodyParts = new ModelRenderer[BODY_COUNT];
    float f = -3.5F;

    for (int i = 0; i < this.bodyParts.length; ++i) {
      this.bodyParts[i] = new ModelRenderer(this, BODY_TEXS[i][0], BODY_TEXS[i][1]);
      this.bodyParts[i].addBox((float) BODY_SIZES[i][0] * -0.5F, 0.0F, (float) BODY_SIZES[i][2] * -0.5F, BODY_SIZES[i][0], BODY_SIZES[i][1], BODY_SIZES[i][2]);
      this.bodyParts[i].setPos(0.0F, (float) (24 - BODY_SIZES[i][1]), f);

      if (i < this.bodyParts.length - 1) {
        f += (float) (BODY_SIZES[i][2] + BODY_SIZES[i + 1][2]) * 0.5F;
      }
    }
  }

  @Override
  public void setupAnim(LivingEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
  }

  public void setupAnim(ShoulderData data, int ticks, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    for (int i = 0; i < this.bodyParts.length; ++i) {
      this.bodyParts[i].yRot = MathHelper.cos(ageInTicks * 0.25F + (float) i * 0.15F * (float) Math.PI) * (float) Math.PI * 0.01F * (float) (1 + Math.abs(i - 2));
      this.bodyParts[i].x = MathHelper.sin(ageInTicks * 0.25F + (float) i * 0.15F * (float) Math.PI) * (float) Math.PI * 0.1F * (float) Math.abs(i - 2);
    }
  }

  @Override
  public void prepare(ShoulderData data) {

  }

  @Override
  public RenderType getRenderType(ShoulderData data) {
    return renderType(getTexture(data));
  }

  private static final ResourceLocation TEXTURE = Constants.rl("textures/entity/silkworm.png");

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    return TEXTURE;
  }

  @Override
  public EntityModel<LivingEntity> getModel() {
    return this;
  }

  @Override
  public Iterable<ModelRenderer> getParts() {
    return Arrays.asList(bodyParts);
  }

  @Override
  public void renderToBuffer(MatrixStack pMatrixStack, IVertexBuilder pBuffer, int pPackedLight, int pPackedOverlay, float pRed, float pGreen, float pBlue, float pAlpha) {
  }
}
