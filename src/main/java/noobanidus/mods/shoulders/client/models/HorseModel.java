package noobanidus.mods.shoulders.client.models;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.texture.LayeredTexture;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.Constants;
import noobanidus.mods.shoulders.info.ShoulderData;

import java.util.Arrays;
import java.util.List;

public class HorseModel extends EntityModel<Entity> implements IShoulderRidingModel {
  protected final RendererModel field_217127_a;
  protected final RendererModel field_217128_b;
  private final RendererModel field_217129_f;
  private final RendererModel field_217130_g;
  private final RendererModel field_217131_h;
  private final RendererModel field_217132_i;
  private final RendererModel field_217133_j;
  private final RendererModel[] field_217134_k;
  private final RendererModel[] field_217135_l;

  public HorseModel() {
    this.textureWidth = 64;
    this.textureHeight = 64;
    this.field_217127_a = new RendererModel(this, 0, 32);
    this.field_217127_a.addBox(-5.0F, -8.0F, -17.0F, 10, 10, 22, 0.05F);
    this.field_217127_a.setRotationPoint(0.0F, 11.0F, 5.0F);
    this.field_217128_b = new RendererModel(this, 0, 35);
    this.field_217128_b.addBox(-2.05F, -6.0F, -2.0F, 4, 12, 7);
    this.field_217128_b.rotateAngleX = ((float) Math.PI / 6F);
    RendererModel renderermodel = new RendererModel(this, 0, 13);
    renderermodel.addBox(-3.0F, -11.0F, -2.0F, 6, 5, 7, 1.1f);
    RendererModel renderermodel1 = new RendererModel(this, 56, 36);
    renderermodel1.addBox(-1.0F, -11.0F, 5.01F, 2, 16, 2, 1.1f);
    RendererModel renderermodel2 = new RendererModel(this, 0, 25);
    renderermodel2.addBox(-2.0F, -11.0F, -7.0F, 4, 5, 5, 1.1f);
    this.field_217128_b.addChild(renderermodel);
    this.field_217128_b.addChild(renderermodel1);
    this.field_217128_b.addChild(renderermodel2);
    this.func_199047_a(this.field_217128_b);
    this.field_217129_f = new RendererModel(this, 48, 21);
    this.field_217129_f.mirror = true;
    this.field_217129_f.addBox(-3.0F, -1.01F, -1.0F, 4, 11, 4, 1.1f);
    this.field_217129_f.setRotationPoint(4.0F, 14.0F, 7.0F);
    this.field_217130_g = new RendererModel(this, 48, 21);
    this.field_217130_g.addBox(-1.0F, -1.01F, -1.0F, 4, 11, 4, 1.1f);
    this.field_217130_g.setRotationPoint(-4.0F, 14.0F, 7.0F);
    this.field_217131_h = new RendererModel(this, 48, 21);
    this.field_217131_h.mirror = true;
    this.field_217131_h.addBox(-3.0F, -1.01F, -1.9F, 4, 11, 4, 1.1f);
    this.field_217131_h.setRotationPoint(4.0F, 6.0F, -12.0F);
    this.field_217132_i = new RendererModel(this, 48, 21);
    this.field_217132_i.addBox(-1.0F, -1.01F, -1.9F, 4, 11, 4, 1.1f);
    this.field_217132_i.setRotationPoint(-4.0F, 6.0F, -12.0F);
    this.field_217133_j = new RendererModel(this, 42, 36);
    this.field_217133_j.addBox(-1.5F, 0.0F, 0.0F, 3, 14, 4, 1.1f);
    this.field_217133_j.setRotationPoint(0.0F, -5.0F, 2.0F);
    this.field_217133_j.rotateAngleX = ((float) Math.PI / 6F);
    this.field_217127_a.addChild(this.field_217133_j);
    RendererModel renderermodel3 = new RendererModel(this, 26, 0);
    renderermodel3.addBox(-5.0F, -8.0F, -9.0F, 10, 9, 9, 0.5F);
    this.field_217127_a.addChild(renderermodel3);
    RendererModel renderermodel4 = new RendererModel(this, 29, 5);
    renderermodel4.addBox(2.0F, -9.0F, -6.0F, 1, 2, 2, 1.1f);
    this.field_217128_b.addChild(renderermodel4);
    RendererModel renderermodel5 = new RendererModel(this, 29, 5);
    renderermodel5.addBox(-3.0F, -9.0F, -6.0F, 1, 2, 2, 1.1f);
    this.field_217128_b.addChild(renderermodel5);
    RendererModel renderermodel6 = new RendererModel(this, 32, 2);
    renderermodel6.addBox(3.1F, -6.0F, -8.0F, 0, 3, 16, 1.1f);
    renderermodel6.rotateAngleX = (-(float) Math.PI / 6F);
    this.field_217128_b.addChild(renderermodel6);
    RendererModel renderermodel7 = new RendererModel(this, 32, 2);
    renderermodel7.addBox(-3.1F, -6.0F, -8.0F, 0, 3, 16, 1.1f);
    renderermodel7.rotateAngleX = (-(float) Math.PI / 6F);
    this.field_217128_b.addChild(renderermodel7);
    RendererModel renderermodel8 = new RendererModel(this, 1, 1);
    renderermodel8.addBox(-3.0F, -11.0F, -1.9F, 6, 5, 6, 0.2F);
    this.field_217128_b.addChild(renderermodel8);
    RendererModel renderermodel9 = new RendererModel(this, 19, 0);
    renderermodel9.addBox(-2.0F, -11.0F, -4.0F, 4, 5, 2, 0.2F);
    this.field_217128_b.addChild(renderermodel9);
    this.field_217134_k = new RendererModel[]{renderermodel3, renderermodel4, renderermodel5, renderermodel8, renderermodel9};
    this.field_217135_l = new RendererModel[]{renderermodel6, renderermodel7};
  }

  protected void func_199047_a(RendererModel p_199047_1_) {
    RendererModel renderermodel = new RendererModel(this, 19, 16);
    renderermodel.addBox(0.55F, -13.0F, 4.0F, 2, 3, 1, -0.001F);
    RendererModel renderermodel1 = new RendererModel(this, 19, 16);
    renderermodel1.addBox(-2.55F, -13.0F, 4.0F, 2, 3, 1, -0.001F);
    p_199047_1_.addChild(renderermodel);
    p_199047_1_.addChild(renderermodel1);
  }

  public void render(float scale) {
    this.field_217129_f.render(scale);
    this.field_217130_g.render(scale);
    this.field_217131_h.render(scale);
    this.field_217132_i.render(scale);
    this.field_217127_a.render(scale);
    this.field_217128_b.render(scale);
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
  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    this.field_217127_a.rotateAngleX = 0.0F;
    this.field_217128_b.rotationPointY = 4.0F;
    this.field_217128_b.rotationPointZ = -12.0F;
    this.field_217131_h.rotationPointY = 14.0F;
    this.field_217131_h.rotationPointZ = -10.0F;
    this.field_217132_i.rotationPointY = this.field_217131_h.rotationPointY;
    this.field_217132_i.rotationPointZ = this.field_217131_h.rotationPointZ;
    field_217127_a.showModel = true; // body
    field_217128_b.showModel = true; // head
    field_217129_f.showModel = true; // legLeftBack
    field_217130_g.showModel = true; // legRightBack
    field_217131_h.showModel = true; // legLeftFront
    field_217132_i.showModel = true; // legRightFront
    field_217133_j.showModel = true; // tail
    for (RendererModel r : field_217134_k) {
      r.showModel = false; // Saddle
    }
    for (RendererModel r : field_217135_l) {
      r.showModel = false; // Bridle
    }
  }
}
