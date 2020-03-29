package noobanidus.mods.shoulders.client.models;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import noobanidus.mods.shoulders.info.ShoulderData;

import java.util.Arrays;
import java.util.List;

public class SnowGolemModel extends EntityModel<Entity> implements IShoulderRidingModel {
  private static final ResourceLocation SNOW_MAN_TEXTURES = new ResourceLocation("textures/entity/snow_golem.png");

  private final RendererModel body;
  private final RendererModel bottomBody;
  private final RendererModel head;
  private final RendererModel rightHand;
  private final RendererModel leftHand;

  private int var = 0;

  public SnowGolemModel() {
    this.head = (new RendererModel(this, 0, 0)).setTextureSize(64, 64);
    this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, -0.5F);
    this.head.setRotationPoint(0.0F, 4.0F, 0.0F);
    this.rightHand = (new RendererModel(this, 32, 0)).setTextureSize(64, 64);
    this.rightHand.addBox(-1.0F, 0.0F, -1.0F, 12, 2, 2, -0.5F);
    this.rightHand.setRotationPoint(0.0F, 6.0F, 0.0F);
    this.leftHand = (new RendererModel(this, 32, 0)).setTextureSize(64, 64);
    this.leftHand.addBox(-1.0F, 0.0F, -1.0F, 12, 2, 2, -0.5F);
    this.leftHand.setRotationPoint(0.0F, 6.0F, 0.0F);
    this.body = (new RendererModel(this, 0, 16)).setTextureSize(64, 64);
    this.body.addBox(-5.0F, -10.0F, -5.0F, 10, 10, 10, -0.5F);
    this.body.setRotationPoint(0.0F, 13.0F, 0.0F);
    this.bottomBody = (new RendererModel(this, 0, 36)).setTextureSize(64, 64);
    this.bottomBody.addBox(-6.0F, -12.0F, -6.0F, 12, 12, 12, -0.5F);
    this.bottomBody.setRotationPoint(0.0F, 24.0F, 0.0F);
  }

  @Override
  public void setRotationAngles(ShoulderData data, int ticksExisted, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    this.head.rotateAngleY = (netHeadYaw * ((float) Math.PI / 180F)) * 0.8f;
    this.head.rotateAngleX = (headPitch * ((float) Math.PI / 180F)) * 0.8f;
    this.body.rotateAngleY = netHeadYaw * ((float) Math.PI / 180F) * 0.25F;
    float f = MathHelper.sin(this.body.rotateAngleY);
    float f1 = MathHelper.cos(this.body.rotateAngleY);
    this.rightHand.rotateAngleZ = 1.0F;
    this.leftHand.rotateAngleZ = -1.0F;
    this.rightHand.rotateAngleY = 0.0F + this.body.rotateAngleY;
    this.leftHand.rotateAngleY = (float) Math.PI + this.body.rotateAngleY;
    this.rightHand.rotationPointX = f1 * 5.0F;
    this.rightHand.rotationPointZ = -f * 5.0F;
    this.leftHand.rotationPointX = -f1 * 5.0F;
    this.leftHand.rotationPointZ = f * 5.0F;
  }

  @Override
  public void render(float scale) {
    this.body.render(scale);
    this.bottomBody.render(scale);
    this.head.render(scale);
    this.rightHand.render(scale);
    this.leftHand.render(scale);
  }

  public static List<ItemStack> VARIANT_ITEMSTACKS = Arrays.asList(
      ItemStack.EMPTY,
      new ItemStack(Blocks.CARVED_PUMPKIN),
      new ItemStack(Blocks.JACK_O_LANTERN),
      new ItemStack(Blocks.TNT),
      new ItemStack(Blocks.BEDROCK),
      new ItemStack(Blocks.BOOKSHELF),
      new ItemStack(Blocks.CRAFTING_TABLE),
      new ItemStack(Blocks.FURNACE),
      new ItemStack(Blocks.JUKEBOX),
      new ItemStack(Blocks.CACTUS),
      new ItemStack(Blocks.BEACON),
      new ItemStack(Blocks.EMERALD_BLOCK),
      new ItemStack(Blocks.REDSTONE_LAMP),
      new ItemStack(Blocks.GOLD_BLOCK),
      new ItemStack(Blocks.IRON_BLOCK),
      new ItemStack(Blocks.DIAMOND_BLOCK),
      new ItemStack(Blocks.CHORUS_FLOWER),
      new ItemStack(Blocks.CHORUS_PLANT),
      new ItemStack(Blocks.MELON),
      new ItemStack(Blocks.DROPPER),
      new ItemStack(Blocks.DISPENSER),
      new ItemStack(Blocks.OBSERVER),
      new ItemStack(Blocks.HAY_BLOCK),
      new ItemStack(Blocks.REDSTONE_BLOCK),
      new ItemStack(Blocks.SNOW_BLOCK),
      new ItemStack(Blocks.ICE),
      new ItemStack(Blocks.BLUE_ICE),
      new ItemStack(Blocks.FROSTED_ICE),
      new ItemStack(Blocks.PACKED_ICE),
      new ItemStack(Blocks.SLIME_BLOCK),
      new ItemStack(Blocks.SEA_LANTERN),
      new ItemStack(Blocks.MAGMA_BLOCK),
      new ItemStack(Blocks.COMPOSTER),
      new ItemStack(Blocks.DRIED_KELP_BLOCK),
      new ItemStack(Blocks.LOOM),
      new ItemStack(Blocks.BARREL),
      new ItemStack(Blocks.SMOKER),
      new ItemStack(Blocks.BLAST_FURNACE),
      new ItemStack(Blocks.CARTOGRAPHY_TABLE),
      new ItemStack(Blocks.FLETCHING_TABLE),
      new ItemStack(Blocks.SMITHING_TABLE),
      new ItemStack(Blocks.STONECUTTER),
      new ItemStack(Blocks.LECTERN),
      new ItemStack(Blocks.GRINDSTONE)
  );

  @SuppressWarnings("deprecation")
  @Override
  public void renderOnShoulder(ShoulderData data, float limbSwing, float limbSwingAmount, float netHeadYaw, float headPitch, float scaleFactor, int ticksExisted, float partialTicks) {
    this.setRotationAngles(data, ticksExisted, limbSwing, limbSwingAmount, partialTicks, netHeadYaw, headPitch);
    this.render(data, scaleFactor);
    if (ticksExisted % (10 * 20) == 0) {
      var++;
    }
    if (var > VARIANT_ITEMSTACKS.size()) {
      var = 0;
    }
    int variant = var; //data.getVariant();
    if (variant != 0 && variant < VARIANT_ITEMSTACKS.size()) {
      GlStateManager.pushMatrix();
      head.postRender(0.0625F);
      GlStateManager.translatef(0.0F, -0.34375F, 0.0F);
      GlStateManager.rotatef(180.0F, 0.0F, 1.0F, 0.0F);
      GlStateManager.scalef(0.625F, -0.625F, -0.625F);
      Minecraft mc = Minecraft.getInstance();
      ItemStack item = VARIANT_ITEMSTACKS.get(variant);
      mc.getFirstPersonRenderer().renderItem(mc.player, item, ItemCameraTransforms.TransformType.HEAD);
      GlStateManager.popMatrix();
    }
  }

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    return SNOW_MAN_TEXTURES;
  }
}
