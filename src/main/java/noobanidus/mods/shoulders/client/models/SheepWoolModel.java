package noobanidus.mods.shoulders.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.SheepRenderer;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.item.DyeColor;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.info.ShoulderData;

public class SheepWoolModel extends AbstractQuadrupedShoulderModel {
  public SheepWoolModel() {
    super(12, 0.0f);
      this.headModel = new RendererModel(this, 0, 0);
      this.headModel.addBox(-3.0F, -4.0F, -4.0F, 6, 6, 6, 0.6F);
      this.headModel.setRotationPoint(0.0F, 6.0F, -8.0F);
      this.body = new RendererModel(this, 28, 8);
      this.body.addBox(-4.0F, -10.0F, -7.0F, 8, 16, 6, 1.75F);
      this.body.setRotationPoint(0.0F, 5.0F, 2.0F);
      this.legBackRight = new RendererModel(this, 0, 16);
      this.legBackRight.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.5F);
      this.legBackRight.setRotationPoint(-3.0F, 12.0F, 7.0F);
      this.legBackLeft = new RendererModel(this, 0, 16);
      this.legBackLeft.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.5F);
      this.legBackLeft.setRotationPoint(3.0F, 12.0F, 7.0F);
      this.legFrontRight = new RendererModel(this, 0, 16);
      this.legFrontRight.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.5F);
      this.legFrontRight.setRotationPoint(-3.0F, 12.0F, -5.0F);
      this.legFrontLeft = new RendererModel(this, 0, 16);
      this.legFrontLeft.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.5F);
      this.legFrontLeft.setRotationPoint(3.0F, 12.0F, -5.0F);
  }

  @Override
  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    super.setRotationAngles(data, ticksExisted, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
/*      this.headModel.rotationPointY = 6.0F + entityIn.getHeadRotationPointY(partialTick) * 9.0F;
      this.headRotationAngleX = entityIn.getHeadRotationAngleX(partialTick);    */
  }

   private static final ResourceLocation TEXTURE = new ResourceLocation("textures/entity/sheep/sheep_fur.png");

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    float[] afloat = SheepEntity.getDyeRgb(DyeColor.byId(data.getVariant()));
    //noinspection ConstantConditions
    if (afloat != null) {
      GlStateManager.color3f(afloat[0], afloat[1], afloat[2]);
    }
    return TEXTURE;
  }

  @Override
  public void scaleAndTranslate(ShoulderData data, boolean offsetArmor, boolean isSneaking, float limbSwing, float limbSwingAmount, float partialTicks, float netHeadYaw, float headPitch, float scaleIn) {
  }
}
