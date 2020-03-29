package noobanidus.mods.shoulders.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.info.ShoulderData;

public class SheepModel extends AbstractQuadrupedShoulderModel {
  private SheepWoolModel wool = new SheepWoolModel();

  public SheepModel() {
    super(12, 0.0f);
    this.headModel = new RendererModel(this, 0, 0);
    this.headModel.addBox(-3.0F, -4.0F, -6.0F, 6, 6, 8, 0.0F);
    this.headModel.setRotationPoint(0.0F, 6.0F, -8.0F);
    this.body = new RendererModel(this, 28, 8);
    this.body.addBox(-4.0F, -10.0F, -7.0F, 8, 16, 6, 0.0F);
    this.body.setRotationPoint(0.0F, 5.0F, 2.0F);
  }

  @Override
  public void renderOnShoulder(ShoulderData data, float limbSwing, float limbSwingAmount, float netHeadYaw, float headPitch, float scaleFactor, int ticksExisted, float partialTicks) {
    this.setRotationAngles(data, ticksExisted, limbSwing, limbSwingAmount, 0.0F, netHeadYaw, headPitch);
    this.render(data, scaleFactor);
    if (data.getVariant() != -1) {
      Minecraft mc = Minecraft.getInstance();
      mc.getRenderManager().textureManager.bindTexture(this.wool.getTexture(data));
      GlStateManager.pushMatrix();
      this.wool.renderOnShoulder(data, limbSwing, limbSwingAmount, netHeadYaw, headPitch, scaleFactor, ticksExisted, partialTicks);
      GlStateManager.popMatrix();
      GlStateManager.color4f(1f, 1f, 1f, 1f);
    }
  }

  @Override
  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    super.setRotationAngles(data, ticksExisted, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
/*      this.headModel.rotationPointY = 6.0F + entityIn.getHeadRotationPointY(partialTick) * 9.0F;
      this.headRotationAngleX = entityIn.getHeadRotationAngleX(partialTick);    */
  }

  private static final ResourceLocation SHEARED_SHEEP_TEXTURES = new ResourceLocation("textures/entity/sheep/sheep.png");

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    return SHEARED_SHEEP_TEXTURES;
    // TODO: Quark and charm extras support
  }
}
