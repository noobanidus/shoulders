package noobanidus.mods.shoulders.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.info.ShoulderData;

import java.util.Arrays;
import java.util.List;

public class SmallTropicalFishModel extends AbstractTropicalFishModel<SmallTropicalFishModel> {
  private static final SmallTropicalFishModel model = new SmallTropicalFishModel(0.008f);

  public SmallTropicalFishModel() {
    this(0.0F);
  }

  private SmallTropicalFishModel(float scale) {
    super(model);
    this.textureWidth = 32;
    this.textureHeight = 32;
    this.body = new RendererModel(this, 0, 0);
    this.body.addBox(-1.0F, -1.5F, -3.0F, 2, 3, 6, scale);
    this.body.setRotationPoint(0.0F, 22.0F, 0.0F);
    this.tail = new RendererModel(this, 22, -6);
    this.tail.addBox(0.0F, -1.5F, 0.0F, 0, 3, 6, scale);
    this.tail.setRotationPoint(0.0F, 22.0F, 3.0F);
    this.finRight = new RendererModel(this, 2, 16);
    this.finRight.addBox(-2.0F, -1.0F, 0.0F, 2, 2, 0, scale);
    this.finRight.setRotationPoint(-1.0F, 22.5F, 0.0F);
    this.finRight.rotateAngleY = ((float) Math.PI / 4F);
    this.finLeft = new RendererModel(this, 2, 12);
    this.finLeft.addBox(0.0F, -1.0F, 0.0F, 2, 2, 0, scale);
    this.finLeft.setRotationPoint(1.0F, 22.5F, 0.0F);
    this.finLeft.rotateAngleY = (-(float) Math.PI / 4F);
    this.finTop = new RendererModel(this, 10, -5);
    this.finTop.addBox(0.0F, -3.0F, 0.0F, 0, 3, 6, scale);
    this.finTop.setRotationPoint(0.0F, 20.5F, -3.0F);
  }

  @Override
  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    this.tail.rotateAngleY = -(((netHeadYaw * ((float) Math.PI / 180F)) * 0.5f) * 0.8f);
  }

  private static final ResourceLocation TEXTURE = new ResourceLocation("textures/entity/fish/tropical_a.png");

  private static final List<ResourceLocation> PATTERNS = Arrays.asList(
      new ResourceLocation("textures/entity/fish/tropical_a_pattern_1.png"),
      new ResourceLocation("textures/entity/fish/tropical_a_pattern_2.png"),
      new ResourceLocation("textures/entity/fish/tropical_a_pattern_3.png"),
      new ResourceLocation("textures/entity/fish/tropical_a_pattern_4.png"),
      new ResourceLocation("textures/entity/fish/tropical_a_pattern_5.png"),
      new ResourceLocation("textures/entity/fish/tropical_a_pattern_6.png")
  );

  public ResourceLocation getPattern(ShoulderData data) {
    return getPattern(PATTERNS, data);
  }

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    return TEXTURE;
  }

  @Override
  public void scaleAndTranslate(ShoulderData data, boolean offsetArmor, boolean isSneaking, float limbSwing, float limbSwingAmount, float partialTicks, float netHeadYaw, float headPitch, float scaleIn) {
    double armorOffset = 0;
    GlStateManager.scaled(0.35, 0.35, 0.35);
    GlStateManager.translated(data.left() ? 1.05 : -1.05, isSneaking ? -0.9 + armorOffset : -1.455 + armorOffset, 0);
  }
}
