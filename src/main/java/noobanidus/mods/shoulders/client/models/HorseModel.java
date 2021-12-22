/*
package noobanidus.mods.shoulders.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import noobanidus.mods.shoulders.Constants;
import noobanidus.mods.shoulders.info.ShoulderData;

import java.util.Arrays;
import java.util.List;

public class HorseModel extends EntityModel<Entity> implements IShoulderRidingModel {
  protected final ModelRenderer body;
  protected final ModelRenderer head;
  private final ModelRenderer legLeftBack;
  private final ModelRenderer legRightBack;
  private final ModelRenderer legLeftFront;
  private final ModelRenderer legRightFront;
  private final ModelRenderer tail;

  public HorseModel() {
    this.textureWidth = 64;
    this.textureHeight = 64;
    this.body = new ModelRenderer(this, 0, 32);
    this.body.addBox(-5.0F, -8.0F, -17.0F, 10, 10, 22, 0.05F);
    this.body.setRotationPoint(0.0F, 11.0F, 5.0F);
    this.head = new ModelRenderer(this, 0, 35);
    this.head.addBox(-2.05F, -6.0F, -2.0F, 4, 12, 7);
    this.head.rotateAngleX = ((float) Math.PI / 6F);
    ModelRenderer ModelRenderer = new ModelRenderer(this, 0, 13);
    ModelRenderer.addBox(-3.0F, -11.0F, -2.0F, 6, 5, 7, 0);
    ModelRenderer ModelRenderer1 = new ModelRenderer(this, 56, 36);
    ModelRenderer1.addBox(-1.0F, -11.0F, 5.01F, 2, 16, 2, 0);
    ModelRenderer ModelRenderer2 = new ModelRenderer(this, 0, 25);
    ModelRenderer2.addBox(-2.0F, -11.0F, -7.0F, 4, 5, 5, 0);
    this.head.addChild(ModelRenderer);
    this.head.addChild(ModelRenderer1);
    this.head.addChild(ModelRenderer2);
    this.addEarModels(this.head);
    this.legLeftBack = new ModelRenderer(this, 48, 21);
    this.legLeftBack.mirror = true;
    this.legLeftBack.addBox(-3.0F, -1.01F, -1.0F, 4, 11, 4, 0);
    this.legLeftBack.setRotationPoint(4.0F, 14.0F, 7.0F);
    this.legRightBack = new ModelRenderer(this, 48, 21);
    this.legRightBack.addBox(-1.0F, -1.01F, -1.0F, 4, 11, 4, 0);
    this.legRightBack.setRotationPoint(-4.0F, 14.0F, 7.0F);
    this.legLeftFront = new ModelRenderer(this, 48, 21);
    this.legLeftFront.mirror = true;
    this.legLeftFront.addBox(-3.0F, -1.01F, -1.9F, 4, 11, 4, 0);
    this.legLeftFront.setRotationPoint(4.0F, 6.0F, -12.0F);
    this.legRightFront = new ModelRenderer(this, 48, 21);
    this.legRightFront.addBox(-1.0F, -1.01F, -1.9F, 4, 11, 4, 0);
    this.legRightFront.setRotationPoint(-4.0F, 6.0F, -12.0F);
    this.tail = new ModelRenderer(this, 42, 36);
    this.tail.addBox(-1.5F, 0.0F, 0.0F, 3, 14, 4, 0);
    this.tail.setRotationPoint(0.0F, -5.0F, 2.0F);
    this.tail.rotateAngleX = ((float) Math.PI / 6F);
    this.body.addChild(this.tail);
  }

  protected void addEarModels(ModelRenderer p_199047_1_) {
    ModelRenderer ModelRenderer = new ModelRenderer(this, 19, 16);
    ModelRenderer.addBox(0.55F, -13.0F, 4.0F, 2, 3, 1, -0.001F);
    ModelRenderer ModelRenderer1 = new ModelRenderer(this, 19, 16);
    ModelRenderer1.addBox(-2.55F, -13.0F, 4.0F, 2, 3, 1, -0.001F);
    p_199047_1_.addChild(ModelRenderer);
    p_199047_1_.addChild(ModelRenderer1);
  }

  public void render(float scale) {
    this.legLeftBack.render(scale);
    this.legRightBack.render(scale);
    this.legLeftFront.render(scale);
    this.legRightFront.render(scale);
    this.body.render(scale);
    this.head.render(scale);
  }

  private static final List<ResourceLocation> TEXTURES = Arrays.asList(
      new ResourceLocation("minecraft", "textures/entity/horse/horse_white.png"),
      new ResourceLocation("minecraft", "textures/entity/horse/horse_creamy.png"),
      new ResourceLocation("minecraft", "textures/entity/horse/horse_chestnut.png"),
      new ResourceLocation("minecraft", "textures/entity/horse/horse_brown.png"),
      new ResourceLocation("minecraft", "textures/entity/horse/horse_black.png"),
      new ResourceLocation("minecraft", "textures/entity/horse/horse_gray.png"),
      new ResourceLocation("minecraft", "textures/entity/horse/horse_darkbrown.png"),
      new ResourceLocation("minecraft", "textures/entity/horse/donkey.png"),
      new ResourceLocation("minecraft", "textures/entity/horse/horse_mule.png"),
      new ResourceLocation("minecraft", "textures/entity/horse/horse_skeleton.png"),
      new ResourceLocation("minecraft", "textures/entity/horse/horse_zombie.png")
  );

  private static final List<ResourceLocation> OVERLAYS = Arrays.asList(
      new ResourceLocation("minecraft", "textures/entity/horse/horse_markings_white.png"),
      new ResourceLocation("minecraft", "textures/entity/horse/horse_markings_whitefield.png"),
      new ResourceLocation("minecraft", "textures/entity/horse/horse_markings_whitedots.png"),
      new ResourceLocation("minecraft", "textures/entity/horse/horse_markings_blackdots.png")
  );

  private static Int2ObjectOpenHashMap<ResourceLocation> MAPPED_OVERLAYS = new Int2ObjectOpenHashMap<>();

  private static final String[] HORSE_TEXTURES_ABBR = new String[]{"hwh", "hcr", "hch", "hbr", "hbl", "hgr", "hdb"};
  private static final String[] HORSE_MARKING_TEXTURES_ABBR = new String[]{"", "wo_", "wmo", "wdo", "bdo"};

  public ResourceLocation getTexture(ShoulderData data) {
    int index = data.getVariant();
    ResourceLocation rl = MAPPED_OVERLAYS.get(index);
    if (rl == null) {
      int main = index >> 3;
      int overlay = index & 7;
      if (overlay == 0 || main > 7 || (overlay - 1) > OVERLAYS.size()) {
        if (main < TEXTURES.size()) {
          MAPPED_OVERLAYS.put(index, TEXTURES.get(main));
        } else {
          MAPPED_OVERLAYS.put(index, TEXTURES.get(0));
        }
      } else {
        overlay--;
        rl = new ResourceLocation(Constants.MODID, "shoulder_horse/" + HORSE_TEXTURES_ABBR[main] + HORSE_MARKING_TEXTURES_ABBR[overlay]);
        Minecraft.getInstance().getTextureManager().loadTexture(rl, new LayeredTexture(TEXTURES.get(main).getPath(), OVERLAYS.get(overlay).getPath()));
        MAPPED_OVERLAYS.put(index, rl);
      }
    }

    return MAPPED_OVERLAYS.get(index);
  }

  @Override
  public void scaleAndTranslate(ShoulderData data, boolean offsetArmor, boolean isSneaking, float limbSwing, float limbSwingAmount, float partialTicks, float netHeadYaw, float headPitch, float scaleIn) {
    double armorOffset = 0;
    if (offsetArmor) {
      armorOffset = -0.2;
    }
    GlStateManager.scaled(0.17, 0.17, 0.17);
    GlStateManager.translated(data.left() ? 2.15 : -2.15, isSneaking ? -0.5 + armorOffset : -1.50 + armorOffset, 0);
  }

  @Override
  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float partialTick, float netHeadYaw, float headPitch) {
    float f4 = 0;

    if (limbSwingAmount > 0.2F) {
      f4 += MathHelper.cos(limbSwing * 0.4F) * 0.15F * limbSwingAmount;
    }

    this.head.rotationPointZ = -12.0F;
    this.body.rotateAngleX = 0.0F;
    this.head.rotateAngleX = ((float) Math.PI / 6F) + f4;
    this.head.rotateAngleY = 0;
    float f11 = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI);
    float f12 = f11 * 0.8F * limbSwingAmount;
    this.head.rotateAngleX = (((float) Math.PI / 6F) + f4);
    this.legLeftFront.rotationPointY = 14.0F;
    this.legLeftFront.rotationPointZ = -10.0F;
    this.legRightFront.rotationPointY = this.legLeftFront.rotationPointY;
    this.legRightFront.rotationPointZ = this.legLeftFront.rotationPointZ;
    this.legLeftBack.rotateAngleX = -f11 * 0.5F * limbSwingAmount;
    this.legRightBack.rotateAngleX = f11 * 0.5F * limbSwingAmount;
    this.legLeftFront.rotateAngleX = f12;
    this.legRightFront.rotateAngleX = f12;
    this.tail.rotateAngleX = ((float) Math.PI / 6F) + limbSwingAmount * 0.75F;
    this.tail.rotationPointY = -5.0F + limbSwingAmount;
    this.tail.rotationPointZ = 2.0F + limbSwingAmount * 2.0F;
    this.tail.rotateAngleY = 0.0F;
  }
}
*/
