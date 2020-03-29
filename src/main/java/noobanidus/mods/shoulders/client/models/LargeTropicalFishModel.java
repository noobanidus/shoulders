package noobanidus.mods.shoulders.client.models;

import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.info.ShoulderData;

import java.util.Arrays;
import java.util.List;

public class LargeTropicalFishModel extends AbstractTropicalFishModel<LargeTropicalFishModel> {
  private static final LargeTropicalFishModel model = new LargeTropicalFishModel(0.008f);
  private final RendererModel finBottom;

  public LargeTropicalFishModel() {
    this(0.0F);
  }

  private LargeTropicalFishModel(float scale) {
    super(model);
    this.textureWidth = 32;
    this.textureHeight = 32;
    this.body = new RendererModel(this, 0, 20);
    this.body.addBox(-1.0F, -3.0F, -3.0F, 2, 6, 6, scale);
    this.body.setRotationPoint(0.0F, 19.0F, 0.0F);
    this.tail = new RendererModel(this, 21, 16);
    this.tail.addBox(0.0F, -3.0F, 0.0F, 0, 6, 5, scale);
    this.tail.setRotationPoint(0.0F, 19.0F, 3.0F);
    this.finRight = new RendererModel(this, 2, 16);
    this.finRight.addBox(-2.0F, 0.0F, 0.0F, 2, 2, 0, scale);
    this.finRight.setRotationPoint(-1.0F, 20.0F, 0.0F);
    this.finRight.rotateAngleY = ((float) Math.PI / 4F);
    this.finLeft = new RendererModel(this, 2, 12);
    this.finLeft.addBox(0.0F, 0.0F, 0.0F, 2, 2, 0, scale);
    this.finLeft.setRotationPoint(1.0F, 20.0F, 0.0F);
    this.finLeft.rotateAngleY = (-(float) Math.PI / 4F);
    this.finTop = new RendererModel(this, 20, 11);
    this.finTop.addBox(0.0F, -4.0F, 0.0F, 0, 4, 6, scale);
    this.finTop.setRotationPoint(0.0F, 16.0F, -3.0F);
    this.finBottom = new RendererModel(this, 20, 21);
    this.finBottom.addBox(0.0F, 0.0F, 0.0F, 0, 4, 6, scale);
    this.finBottom.setRotationPoint(0.0F, 22.0F, -3.0F);
  }

  @Override
  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    this.tail.rotateAngleY = -(((netHeadYaw * ((float) Math.PI / 180F)) * 0.5f) * 0.8f);
  }

  @Override
  public void render(float scale) {
    super.render(scale);
    this.finBottom.render(scale);
  }

  private static final ResourceLocation TEXTURE = new ResourceLocation("textures/entity/fish/tropical_b.png");

  private static final List<ResourceLocation> PATTERNS = Arrays.asList(
      new ResourceLocation("textures/entity/fish/tropical_b_pattern_1.png"),
      new ResourceLocation("textures/entity/fish/tropical_b_pattern_2.png"),
      new ResourceLocation("textures/entity/fish/tropical_b_pattern_3.png"),
      new ResourceLocation("textures/entity/fish/tropical_b_pattern_4.png"),
      new ResourceLocation("textures/entity/fish/tropical_b_pattern_5.png"),
      new ResourceLocation("textures/entity/fish/tropical_b_pattern_6.png")
  );

  public ResourceLocation getPattern(ShoulderData data) {
    return getPattern(PATTERNS, data);
  }

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    return TEXTURE;
  }
}
