/*
package noobanidus.mods.shoulders.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.info.ShoulderData;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

public class LlamaModel extends AbstractQuadrupedShoulderModel {
  private final ModelRenderer chest1;
  private final ModelRenderer chest2;

  private static final LlamaModel decoLlama = new LlamaModel(0.5f);

  public LlamaModel() {
    this(0);
  }

  public LlamaModel(float scale) {
    super(15, scale);
    this.textureWidth = 128;
    this.textureHeight = 64;
    this.headModel = new ModelRenderer(this, 0, 0);
    this.headModel.addBox(-2.0F, -14.0F, -10.0F, 4, 4, 9, scale);
    this.headModel.setRotationPoint(0.0F, 7.0F, -6.0F);
    this.headModel.setTextureOffset(0, 14).addBox(-4.0F, -16.0F, -6.0F, 8, 18, 6, scale);
    this.headModel.setTextureOffset(17, 0).addBox(-4.0F, -19.0F, -4.0F, 3, 3, 2, scale);
    this.headModel.setTextureOffset(17, 0).addBox(1.0F, -19.0F, -4.0F, 3, 3, 2, scale);
    this.body = new ModelRenderer(this, 29, 0);
    this.body.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10, scale);
    this.body.setRotationPoint(0.0F, 5.0F, 2.0F);
    this.chest1 = new ModelRenderer(this, 45, 28);
    this.chest1.addBox(-3.0F, 0.0F, 0.0F, 8, 8, 3, scale);
    this.chest1.setRotationPoint(-8.5F, 3.0F, 3.0F);
    this.chest1.rotateAngleY = ((float) Math.PI / 2F);
    this.chest2 = new ModelRenderer(this, 45, 41);
    this.chest2.addBox(-3.0F, 0.0F, 0.0F, 8, 8, 3, scale);
    this.chest2.setRotationPoint(5.5F, 3.0F, 3.0F);
    this.chest2.rotateAngleY = ((float) Math.PI / 2F);
    this.legBackRight = new ModelRenderer(this, 29, 29);
    this.legBackRight.addBox(-2.0F, 0.0F, -2.0F, 4, 14, 4, scale);
    this.legBackRight.setRotationPoint(-2.5F, 10.0F, 6.0F);
    this.legBackLeft = new ModelRenderer(this, 29, 29);
    this.legBackLeft.addBox(-2.0F, 0.0F, -2.0F, 4, 14, 4, scale);
    this.legBackLeft.setRotationPoint(2.5F, 10.0F, 6.0F);
    this.legFrontRight = new ModelRenderer(this, 29, 29);
    this.legFrontRight.addBox(-2.0F, 0.0F, -2.0F, 4, 14, 4, scale);
    this.legFrontRight.setRotationPoint(-2.5F, 10.0F, -4.0F);
    this.legFrontLeft = new ModelRenderer(this, 29, 29);
    this.legFrontLeft.addBox(-2.0F, 0.0F, -2.0F, 4, 14, 4, scale);
    this.legFrontLeft.setRotationPoint(2.5F, 10.0F, -4.0F);
    --this.legBackRight.rotationPointX;
    ++this.legBackLeft.rotationPointX;
    this.legBackRight.rotationPointZ += 0.0F;
    this.legBackLeft.rotationPointZ += 0.0F;
    --this.legFrontRight.rotationPointX;
    ++this.legFrontLeft.rotationPointX;
    --this.legFrontRight.rotationPointZ;
    --this.legFrontLeft.rotationPointZ;
  }

  private static final List<ResourceLocation> LLAMA_TEXTURES = Arrays.asList(
      new ResourceLocation("textures/entity/llama/creamy.png"),
      new ResourceLocation("textures/entity/llama/white.png"),
      new ResourceLocation("textures/entity/llama/brown.png"),
      new ResourceLocation("textures/entity/llama/gray.png")
  );

  private static final ResourceLocation TRADER_LLAMA = new ResourceLocation("textures/entity/llama/decor/trader_llama.png");

  private static final List<ResourceLocation> DECOR = Arrays.asList(
      new ResourceLocation("textures/entity/llama/decor/white.png"),
      new ResourceLocation("textures/entity/llama/decor/orange.png"),
      new ResourceLocation("textures/entity/llama/decor/magenta.png"),
      new ResourceLocation("textures/entity/llama/decor/light_blue.png"),
      new ResourceLocation("textures/entity/llama/decor/yellow.png"),
      new ResourceLocation("textures/entity/llama/decor/lime.png"),
      new ResourceLocation("textures/entity/llama/decor/pink.png"),
      new ResourceLocation("textures/entity/llama/decor/gray.png"),
      new ResourceLocation("textures/entity/llama/decor/light_gray.png"),
      new ResourceLocation("textures/entity/llama/decor/cyan.png"),
      new ResourceLocation("textures/entity/llama/decor/purple.png"),
      new ResourceLocation("textures/entity/llama/decor/blue.png"),
      new ResourceLocation("textures/entity/llama/decor/brown.png"),
      new ResourceLocation("textures/entity/llama/decor/green.png"),
      new ResourceLocation("textures/entity/llama/decor/red.png"),
      new ResourceLocation("textures/entity/llama/decor/black.png")
  );

  @Nullable
  private static ResourceLocation getDecor(ShoulderData data) {
    int deco = data.getVariant() & 31;
    if (deco == 0) {
      return null;
    }
    deco--;
    if (deco < DECOR.size()) {
      return DECOR.get(deco);
    } else {
      return TRADER_LLAMA;
    }
  }

  @Override
  public void renderOnShoulder(ShoulderData data, float limbSwing, float limbSwingAmount, float netHeadYaw, float headPitch, float scaleFactor, int ticksExisted, float partialTicks) {
    this.setRotationAngles(data, ticksExisted, limbSwing, limbSwingAmount, partialTicks, netHeadYaw, headPitch);
    this.render(data, scaleFactor);
    ResourceLocation deco = getDecor(data);
    if (deco != null) {
      Minecraft mc = Minecraft.getInstance();
      mc.textureManager.bindTexture(deco);
      decoLlama.setRotationAngles(data, ticksExisted, limbSwing, limbSwingAmount, partialTicks, netHeadYaw, headPitch);
      decoLlama.render(data, scaleFactor);
    }
  }

  @Override
  public void scaleAndTranslate(ShoulderData data, boolean offsetArmor, boolean isSneaking, float limbSwing, float limbSwingAmount, float partialTicks, float netHeadYaw, float headPitch, float scaleIn) {
    double armorOffset = 0;
    if (offsetArmor) {
      armorOffset = -0.2;
    }
    GlStateManager.scaled(0.15, 0.15, 0.15);
    GlStateManager.translated(data.left() ? 2.47 : -2.47, isSneaking ? -0.8 + armorOffset : -1.48 + armorOffset, 0);
  }

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    int var = data.getVariant() >> 6;
    if (var < LLAMA_TEXTURES.size()) {
      return LLAMA_TEXTURES.get(var);
    }

    return LLAMA_TEXTURES.get(0);
  }
}
*/
