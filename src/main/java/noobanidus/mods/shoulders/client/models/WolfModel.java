package noobanidus.mods.shoulders.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;
import net.minecraft.item.DyeColor;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.info.ShoulderData;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

public class WolfModel extends EntityModel<Entity> implements IShoulderRidingModel {
  private final RendererModel head;
  private final RendererModel body;
  private final RendererModel legBackRight;
  private final RendererModel legBackLeft;
  private final RendererModel legFrontRight;
  private final RendererModel legFrontLeft;
  private final RendererModel tail;
  private final RendererModel mane;


  public WolfModel() {
    this.head = new RendererModel(this, 0, 0);
    this.head.addBox(-2.0F, -3.0F, -2.0F, 6, 6, 4, 0.0F);
    this.head.setRotationPoint(-1.0F, 13.5F, -7.0F);
    this.body = new RendererModel(this, 18, 14);
    this.body.addBox(-3.0F, -2.0F, -3.0F, 6, 9, 6, 0.0F);
    this.body.setRotationPoint(0.0F, 14.0F, 2.0F);
    this.mane = new RendererModel(this, 21, 0);
    this.mane.addBox(-3.0F, -3.0F, -3.0F, 8, 6, 7, 0.0F);
    this.mane.setRotationPoint(-1.0F, 14.0F, 2.0F);
    this.legBackRight = new RendererModel(this, 0, 18);
    this.legBackRight.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
    this.legBackRight.setRotationPoint(-2.5F, 16.0F, 7.0F);
    this.legBackLeft = new RendererModel(this, 0, 18);
    this.legBackLeft.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
    this.legBackLeft.setRotationPoint(0.5F, 16.0F, 7.0F);
    this.legFrontRight = new RendererModel(this, 0, 18);
    this.legFrontRight.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
    this.legFrontRight.setRotationPoint(-2.5F, 16.0F, -4.0F);
    this.legFrontLeft = new RendererModel(this, 0, 18);
    this.legFrontLeft.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
    this.legFrontLeft.setRotationPoint(0.5F, 16.0F, -4.0F);
    this.tail = new RendererModel(this, 9, 18);
    this.tail.addBox(0.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
    this.tail.setRotationPoint(-1.0F, 12.0F, 8.0F);
    this.head.setTextureOffset(16, 14).addBox(-2.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F);
    this.head.setTextureOffset(16, 14).addBox(2.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F);
    this.head.setTextureOffset(0, 10).addBox(-0.5F, 0.0F, -5.0F, 3, 3, 4, 0.0F);
  }

  @Override
  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    this.mane.setRotationPoint(-1.0F, 16.0F, -3.0F);
    this.mane.rotateAngleX = 1.2566371F;
    this.mane.rotateAngleY = 0.0F;
    this.body.setRotationPoint(0.0F, 18.0F, 0.0F);
    this.body.rotateAngleX = ((float) Math.PI / 4F);
    this.tail.setRotationPoint(-1.0F, 21.0F, 6.0F);
    this.legBackRight.setRotationPoint(-2.5F, 22.0F, 2.0F);
    this.legBackRight.rotateAngleX = ((float) Math.PI * 1.5F);
    this.legBackLeft.setRotationPoint(0.5F, 22.0F, 2.0F);
    this.legBackLeft.rotateAngleX = ((float) Math.PI * 1.5F);
    this.legFrontRight.rotateAngleX = 5.811947F;
    this.legFrontRight.setRotationPoint(-2.49F, 17.0F, -4.0F);
    this.legFrontLeft.rotateAngleX = 5.811947F;
    this.legFrontLeft.setRotationPoint(0.51F, 17.0F, -4.0F);
    this.head.rotateAngleX = headPitch * ((float) Math.PI / 180F);
    this.head.rotateAngleY = netHeadYaw * ((float) Math.PI / 180F);
    //this.tail.rotateAngleZ = (float) Math.sin(ageInTicks * 0.15f);

    //this.tail.rotateAngleX = 0; // = ageInTicks % 3;
    //this.tail.rotateAngleZ = getSwing(45 / 360.0f, ageInTicks);
  }

  @Override
  public void render(float scale) {
    this.head.renderWithRotation(scale);
    this.body.render(scale);
    this.legBackRight.render(scale);
    this.legBackLeft.render(scale);
    this.legFrontRight.render(scale);
    this.legFrontLeft.render(scale);
    this.tail.renderWithRotation(scale);
    this.mane.render(scale);
  }

  @Override
  public void renderOnShoulder(ShoulderData data, float limbSwing, float limbSwingAmount, float netHeadYaw, float headPitch, float scaleFactor, int ticksExisted, float partialTicks) {
    this.setRotationAngles(data, ticksExisted, limbSwing, limbSwingAmount, partialTicks, netHeadYaw, headPitch);
    this.render(data, scaleFactor);
    float[] b = getCollarColor(data);
    if (b != null) {
      Minecraft mc = Minecraft.getInstance();
      mc.textureManager.bindTexture(WOLF_COLLAR);
      GlStateManager.color3f(b[0], b[1], b[2]);
      this.render(data, scaleFactor);
      GlStateManager.color3f(1f, 1f, 1f);
    }
  }

  @Override
  public void scaleAndTranslate(ShoulderData data, boolean offsetArmor, boolean isSneaking, float limbSwing, float limbSwingAmount, float partialTicks, float netHeadYaw, float headPitch, float scaleIn) {
    double armorOffset = 0;
    if (offsetArmor) {
      armorOffset = -0.1;
    }
    GlStateManager.scaled(0.45, 0.45, 0.45);
    GlStateManager.translated(data.left() ? 0.85 : -0.85, isSneaking ? -1.2 + armorOffset : -1.50 + armorOffset, 0.1);
  }

  private static final List<ResourceLocation> TEXTURES = Arrays.asList(
      new ResourceLocation("textures/entity/wolf/wolf.png"),
      new ResourceLocation("textures/entity/wolf/wolf_tame.png"),
      new ResourceLocation("textures/entity/wolf/wolf_angry.png")
  );

  private static final ResourceLocation WOLF_COLLAR = new ResourceLocation("textures/entity/wolf/wolf_collar.png");

  @Nullable
  private float[] getCollarColor(ShoulderData data) {
    int color = data.getVariant() & 31;
    if (color == 0) {
      return null;
    }
    return DyeColor.byId(color - 1).getColorComponentValues();
  }

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    int var = data.getVariant() >> 5;
    if (var < TEXTURES.size()) {
      return TEXTURES.get(var);
    }

    return TEXTURES.get(0);
  }
}
