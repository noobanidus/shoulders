package noobanidus.mods.shoulders.client.models;

import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.info.ShoulderData;

import java.util.Arrays;
import java.util.List;

public class LlamaModel extends AbstractQuadrupedShoulderModel {
  public LlamaModel() {
    super(15, 0);
    this.textureWidth = 128;
    this.textureHeight = 64;
    this.headModel = new RendererModel(this, 0, 0);
    this.headModel.addBox(-2.0F, -14.0F, -10.0F, 4, 4, 9, 0);
    this.headModel.setRotationPoint(0.0F, 7.0F, -6.0F);
    this.headModel.setTextureOffset(0, 14).addBox(-4.0F, -16.0F, -6.0F, 8, 18, 6, 0);
    this.headModel.setTextureOffset(17, 0).addBox(-4.0F, -19.0F, -4.0F, 3, 3, 2, 0);
    this.headModel.setTextureOffset(17, 0).addBox(1.0F, -19.0F, -4.0F, 3, 3, 2, 0);
    this.body = new RendererModel(this, 29, 0);
    this.body.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10, 0);
    this.body.setRotationPoint(0.0F, 5.0F, 2.0F);
    this.legBackRight = new RendererModel(this, 29, 29);
    this.legBackRight.addBox(-2.0F, 0.0F, -2.0F, 4, 14, 4, 0);
    this.legBackRight.setRotationPoint(-2.5F, 10.0F, 6.0F);
    this.legBackLeft = new RendererModel(this, 29, 29);
    this.legBackLeft.addBox(-2.0F, 0.0F, -2.0F, 4, 14, 4, 0);
    this.legBackLeft.setRotationPoint(2.5F, 10.0F, 6.0F);
    this.legFrontRight = new RendererModel(this, 29, 29);
    this.legFrontRight.addBox(-2.0F, 0.0F, -2.0F, 4, 14, 4, 0);
    this.legFrontRight.setRotationPoint(-2.5F, 10.0F, -4.0F);
    this.legFrontLeft = new RendererModel(this, 29, 29);
    this.legFrontLeft.addBox(-2.0F, 0.0F, -2.0F, 4, 14, 4, 0);
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

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
     if (data.getVariant() < LLAMA_TEXTURES.size()) {
       return LLAMA_TEXTURES.get(data.getVariant());
     }

     return LLAMA_TEXTURES.get(0);
  }
}
