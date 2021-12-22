/*
package noobanidus.mods.shoulders.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import noobanidus.mods.shoulders.info.ShoulderData;

public class PufferfishModel extends EntityModel<Entity> implements IShoulderRidingModel {
  private static PufferfishBigModel bigModel = new PufferfishBigModel();
  private static PufferfishMediumModel mediumModel = new PufferfishMediumModel();
  private static PufferfishSmallModel smallModel = new PufferfishSmallModel();
  private static final ResourceLocation TEXTURE = new ResourceLocation("textures/entity/fish/pufferfish.png");

  public PufferfishModel() {
  }

  @Override
  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    modelForData(data).setRotationAngles(data, ticksExisted, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
  }

  @Override
  public void render(ShoulderData data, float scale) {
    modelForData(data).render(scale);
  }

  // No-op
  @Override
  public void render(float scale) {
  }

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    return modelForData(data).getTexture(data);
  }

  @Override
  public void scaleAndTranslate(ShoulderData data, boolean offsetArmor, boolean isSneaking, float limbSwing, float limbSwingAmount, float partialTicks, float netHeadYaw, float headPitch, float scaleIn) {
    modelForData(data).scaleAndTranslate(data, offsetArmor, isSneaking, limbSwing, limbSwingAmount, partialTicks, netHeadYaw, headPitch, scaleIn);
  }

  private PufferfishBaseModel modelForData(ShoulderData data) {
    switch (data.getVariant()) {
      default:
      case 0:
        return smallModel;
      case 1:
        return mediumModel;
      case 2:
        return bigModel;
    }
  }

  public static abstract class PufferfishBaseModel extends EntityModel<Entity> implements IShoulderRidingModel {
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

  public static class PufferfishBigModel extends PufferfishBaseModel {
    private final ModelRenderer cube;
    private final ModelRenderer blueFin0;
    private final ModelRenderer blueFin1;
    private final ModelRenderer topFrontFin;
    private final ModelRenderer topMidFin;
    private final ModelRenderer topBackFin;
    private final ModelRenderer sideFrontFin0;
    private final ModelRenderer sideFrontFin1;
    private final ModelRenderer bottomFrontFin;
    private final ModelRenderer bottomBackFin;
    private final ModelRenderer bottomMidFin;
    private final ModelRenderer sideBackFin0;
    private final ModelRenderer sideBackFin1;

    public PufferfishBigModel() {
      this.textureWidth = 32;
      this.textureHeight = 32;
      int i = 22;
      this.cube = new ModelRenderer(this, 0, 0);
      this.cube.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
      this.cube.setRotationPoint(0.0F, 22.0F, 0.0F);
      this.blueFin0 = new ModelRenderer(this, 24, 0);
      this.blueFin0.addBox(-2.0F, 0.0F, -1.0F, 2, 1, 2);
      this.blueFin0.setRotationPoint(-4.0F, 15.0F, -2.0F);
      this.blueFin1 = new ModelRenderer(this, 24, 3);
      this.blueFin1.addBox(0.0F, 0.0F, -1.0F, 2, 1, 2);
      this.blueFin1.setRotationPoint(4.0F, 15.0F, -2.0F);
      this.topFrontFin = new ModelRenderer(this, 15, 17);
      this.topFrontFin.addBox(-4.0F, -1.0F, 0.0F, 8, 1, 0);
      this.topFrontFin.setRotationPoint(0.0F, 14.0F, -4.0F);
      this.topFrontFin.rotateAngleX = ((float) Math.PI / 4F);
      this.topMidFin = new ModelRenderer(this, 14, 16);
      this.topMidFin.addBox(-4.0F, -1.0F, 0.0F, 8, 1, 1);
      this.topMidFin.setRotationPoint(0.0F, 14.0F, 0.0F);
      this.topBackFin = new ModelRenderer(this, 23, 18);
      this.topBackFin.addBox(-4.0F, -1.0F, 0.0F, 8, 1, 0);
      this.topBackFin.setRotationPoint(0.0F, 14.0F, 4.0F);
      this.topBackFin.rotateAngleX = (-(float) Math.PI / 4F);
      this.sideFrontFin0 = new ModelRenderer(this, 5, 17);
      this.sideFrontFin0.addBox(-1.0F, -8.0F, 0.0F, 1, 8, 0);
      this.sideFrontFin0.setRotationPoint(-4.0F, 22.0F, -4.0F);
      this.sideFrontFin0.rotateAngleY = (-(float) Math.PI / 4F);
      this.sideFrontFin1 = new ModelRenderer(this, 1, 17);
      this.sideFrontFin1.addBox(0.0F, -8.0F, 0.0F, 1, 8, 0);
      this.sideFrontFin1.setRotationPoint(4.0F, 22.0F, -4.0F);
      this.sideFrontFin1.rotateAngleY = ((float) Math.PI / 4F);
      this.bottomFrontFin = new ModelRenderer(this, 15, 20);
      this.bottomFrontFin.addBox(-4.0F, 0.0F, 0.0F, 8, 1, 0);
      this.bottomFrontFin.setRotationPoint(0.0F, 22.0F, -4.0F);
      this.bottomFrontFin.rotateAngleX = (-(float) Math.PI / 4F);
      this.bottomMidFin = new ModelRenderer(this, 15, 20);
      this.bottomMidFin.addBox(-4.0F, 0.0F, 0.0F, 8, 1, 0);
      this.bottomMidFin.setRotationPoint(0.0F, 22.0F, 0.0F);
      this.bottomBackFin = new ModelRenderer(this, 15, 20);
      this.bottomBackFin.addBox(-4.0F, 0.0F, 0.0F, 8, 1, 0);
      this.bottomBackFin.setRotationPoint(0.0F, 22.0F, 4.0F);
      this.bottomBackFin.rotateAngleX = ((float) Math.PI / 4F);
      this.sideBackFin0 = new ModelRenderer(this, 9, 17);
      this.sideBackFin0.addBox(-1.0F, -8.0F, 0.0F, 1, 8, 0);
      this.sideBackFin0.setRotationPoint(-4.0F, 22.0F, 4.0F);
      this.sideBackFin0.rotateAngleY = ((float) Math.PI / 4F);
      this.sideBackFin1 = new ModelRenderer(this, 9, 17);
      this.sideBackFin1.addBox(0.0F, -8.0F, 0.0F, 1, 8, 0);
      this.sideBackFin1.setRotationPoint(4.0F, 22.0F, 4.0F);
      this.sideBackFin1.rotateAngleY = (-(float) Math.PI / 4F);
    }

    @Override
    public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.blueFin0.rotateAngleZ = -0.2F + 0.4F * MathHelper.sin(netHeadYaw * 0.2F);
      this.blueFin1.rotateAngleZ = 0.2F - 0.4F * MathHelper.sin(netHeadYaw * 0.2F);
    }

    @Override
    public void render(float scale) {
      this.cube.render(scale);
      this.blueFin0.render(scale);
      this.blueFin1.render(scale);
      this.topFrontFin.render(scale);
      this.topMidFin.render(scale);
      this.topBackFin.render(scale);
      this.sideFrontFin0.render(scale);
      this.sideFrontFin1.render(scale);
      this.bottomFrontFin.render(scale);
      this.bottomMidFin.render(scale);
      this.bottomBackFin.render(scale);
      this.sideBackFin0.render(scale);
      this.sideBackFin1.render(scale);
    }
  }

  public static class PufferfishMediumModel extends PufferfishBaseModel {
    private final ModelRenderer cube;
    private final ModelRenderer finBlue0;
    private final ModelRenderer finBlue1;
    private final ModelRenderer finTop0;
    private final ModelRenderer finTop1;
    private final ModelRenderer finSide0;
    private final ModelRenderer finSide1;
    private final ModelRenderer finSide2;
    private final ModelRenderer finSide3;
    private final ModelRenderer finBottom0;
    private final ModelRenderer finBottom1;

    public PufferfishMediumModel() {
      this.textureWidth = 32;
      this.textureHeight = 32;
      int i = 22;
      this.cube = new ModelRenderer(this, 12, 22);
      this.cube.addBox(-2.5F, -5.0F, -2.5F, 5, 5, 5);
      this.cube.setRotationPoint(0.0F, 22.0F, 0.0F);
      this.finBlue0 = new ModelRenderer(this, 24, 0);
      this.finBlue0.addBox(-2.0F, 0.0F, 0.0F, 2, 0, 2);
      this.finBlue0.setRotationPoint(-2.5F, 17.0F, -1.5F);
      this.finBlue1 = new ModelRenderer(this, 24, 3);
      this.finBlue1.addBox(0.0F, 0.0F, 0.0F, 2, 0, 2);
      this.finBlue1.setRotationPoint(2.5F, 17.0F, -1.5F);
      this.finTop0 = new ModelRenderer(this, 15, 16);
      this.finTop0.addBox(-2.5F, -1.0F, 0.0F, 5, 1, 1);
      this.finTop0.setRotationPoint(0.0F, 17.0F, -2.5F);
      this.finTop0.rotateAngleX = ((float) Math.PI / 4F);
      this.finTop1 = new ModelRenderer(this, 10, 16);
      this.finTop1.addBox(-2.5F, -1.0F, -1.0F, 5, 1, 1);
      this.finTop1.setRotationPoint(0.0F, 17.0F, 2.5F);
      this.finTop1.rotateAngleX = (-(float) Math.PI / 4F);
      this.finSide0 = new ModelRenderer(this, 8, 16);
      this.finSide0.addBox(-1.0F, -5.0F, 0.0F, 1, 5, 1);
      this.finSide0.setRotationPoint(-2.5F, 22.0F, -2.5F);
      this.finSide0.rotateAngleY = (-(float) Math.PI / 4F);
      this.finSide1 = new ModelRenderer(this, 8, 16);
      this.finSide1.addBox(-1.0F, -5.0F, 0.0F, 1, 5, 1);
      this.finSide1.setRotationPoint(-2.5F, 22.0F, 2.5F);
      this.finSide1.rotateAngleY = ((float) Math.PI / 4F);
      this.finSide2 = new ModelRenderer(this, 4, 16);
      this.finSide2.addBox(0.0F, -5.0F, 0.0F, 1, 5, 1);
      this.finSide2.setRotationPoint(2.5F, 22.0F, 2.5F);
      this.finSide2.rotateAngleY = (-(float) Math.PI / 4F);
      this.finSide3 = new ModelRenderer(this, 0, 16);
      this.finSide3.addBox(0.0F, -5.0F, 0.0F, 1, 5, 1);
      this.finSide3.setRotationPoint(2.5F, 22.0F, -2.5F);
      this.finSide3.rotateAngleY = ((float) Math.PI / 4F);
      this.finBottom0 = new ModelRenderer(this, 8, 22);
      this.finBottom0.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
      this.finBottom0.setRotationPoint(0.5F, 22.0F, 2.5F);
      this.finBottom0.rotateAngleX = ((float) Math.PI / 4F);
      this.finBottom1 = new ModelRenderer(this, 17, 21);
      this.finBottom1.addBox(-2.5F, 0.0F, 0.0F, 5, 1, 1);
      this.finBottom1.setRotationPoint(0.0F, 22.0F, -2.5F);
      this.finBottom1.rotateAngleX = (-(float) Math.PI / 4F);
    }

    @Override
    public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.finBlue0.rotateAngleZ = -0.2F + 0.4F * MathHelper.sin(netHeadYaw * 0.2F);
      this.finBlue1.rotateAngleZ = 0.2F - 0.4F * MathHelper.sin(netHeadYaw * 0.2F);
    }

    @Override
    public void render(float scale) {
      this.cube.render(scale);
      this.finBlue0.render(scale);
      this.finBlue1.render(scale);
      this.finTop0.render(scale);
      this.finTop1.render(scale);
      this.finSide0.render(scale);
      this.finSide1.render(scale);
      this.finSide2.render(scale);
      this.finSide3.render(scale);
      this.finBottom0.render(scale);
      this.finBottom1.render(scale);
    }
  }

  public static class PufferfishSmallModel extends PufferfishBaseModel {
    private final ModelRenderer cube;
    private final ModelRenderer eye0;
    private final ModelRenderer eye1;
    private final ModelRenderer fin0;
    private final ModelRenderer fin1;
    private final ModelRenderer finBack;

    public PufferfishSmallModel() {
      this.textureWidth = 32;
      this.textureHeight = 32;
      int i = 23;
      this.cube = new ModelRenderer(this, 0, 27);
      this.cube.addBox(-1.5F, -2.0F, -1.5F, 3, 2, 3);
      this.cube.setRotationPoint(0.0F, 23.0F, 0.0F);
      this.eye0 = new ModelRenderer(this, 24, 6);
      this.eye0.addBox(-1.5F, 0.0F, -1.5F, 1, 1, 1);
      this.eye0.setRotationPoint(0.0F, 20.0F, 0.0F);
      this.eye1 = new ModelRenderer(this, 28, 6);
      this.eye1.addBox(0.5F, 0.0F, -1.5F, 1, 1, 1);
      this.eye1.setRotationPoint(0.0F, 20.0F, 0.0F);
      this.finBack = new ModelRenderer(this, -3, 0);
      this.finBack.addBox(-1.5F, 0.0F, 0.0F, 3, 0, 3);
      this.finBack.setRotationPoint(0.0F, 22.0F, 1.5F);
      this.fin0 = new ModelRenderer(this, 25, 0);
      this.fin0.addBox(-1.0F, 0.0F, 0.0F, 1, 0, 2);
      this.fin0.setRotationPoint(-1.5F, 22.0F, -1.5F);
      this.fin1 = new ModelRenderer(this, 25, 0);
      this.fin1.addBox(0.0F, 0.0F, 0.0F, 1, 0, 2);
      this.fin1.setRotationPoint(1.5F, 22.0F, -1.5F);
    }

    @Override
    public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.fin0.rotateAngleZ = -0.2F + 0.4F * MathHelper.sin(netHeadYaw * 0.2F);
      this.fin1.rotateAngleZ = 0.2F - 0.4F * MathHelper.sin(netHeadYaw * 0.2F);
    }

    @Override
    public void render(float scale) {
      this.cube.render(scale);
      this.eye0.render(scale);
      this.eye1.render(scale);
      this.finBack.render(scale);
      this.fin0.render(scale);
      this.fin1.render(scale);
    }
  }
}
*/
