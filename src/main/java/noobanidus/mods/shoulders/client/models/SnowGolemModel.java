/*
package noobanidus.mods.shoulders.client.models;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.entity.model.SnowManModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import noobanidus.mods.shoulders.info.ShoulderData;

public class SnowGolemModel extends SegmentedModel<LivingEntity> implements IShoulderRidingModel {
  private final ModelRenderer piece1;
  private final ModelRenderer piece2;
  private final ModelRenderer head;
  private final ModelRenderer arm1;
  private final ModelRenderer arm2;

  public SnowGolemModel() {
    this.head = (new ModelRenderer(this, 0, 0)).setTexSize(64, 64);
    this.head.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, -0.5F);
    this.head.setPos(0.0F, 4.0F, 0.0F);
    this.arm1 = (new ModelRenderer(this, 32, 0)).setTexSize(64, 64);
    this.arm1.addBox(-1.0F, 0.0F, -1.0F, 12.0F, 2.0F, 2.0F, -0.5F);
    this.arm1.setPos(0.0F, 6.0F, 0.0F);
    this.arm2 = (new ModelRenderer(this, 32, 0)).setTexSize(64, 64);
    this.arm2.addBox(-1.0F, 0.0F, -1.0F, 12.0F, 2.0F, 2.0F, -0.5F);
    this.arm2.setPos(0.0F, 6.0F, 0.0F);
    this.piece1 = (new ModelRenderer(this, 0, 16)).setTexSize(64, 64);
    this.piece1.addBox(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, -0.5F);
    this.piece1.setPos(0.0F, 13.0F, 0.0F);
    this.piece2 = (new ModelRenderer(this, 0, 36)).setTexSize(64, 64);
    this.piece2.addBox(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, -0.5F);
    this.piece2.setPos(0.0F, 24.0F, 0.0F);
  }

  public void setupAnim(LivingEntity pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
  }

  public void setupAnim(ShoulderData data, int ticks, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
    this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
    this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
    this.piece1.yRot = pNetHeadYaw * ((float)Math.PI / 180F) * 0.25F;
    float f = MathHelper.sin(this.piece1.yRot);
    float f1 = MathHelper.cos(this.piece1.yRot);
    this.arm1.zRot = 1.0F;
    this.arm2.zRot = -1.0F;
    this.arm1.yRot = 0.0F + this.piece1.yRot;
    this.arm2.yRot = (float)Math.PI + this.piece1.yRot;
    this.arm1.x = f1 * 5.0F;
    this.arm1.z = -f * 5.0F;
    this.arm2.x = -f1 * 5.0F;
    this.arm2.z = f * 5.0F;
  }

  @Override
  public void prepare(ShoulderData data) {
  }

  @Override
  public RenderType getRenderType(ShoulderData data) {
    return renderType(getTexture(data));
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

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    return null;
  }

  @Override
  public EntityModel<LivingEntity> getModel() {
    return this;
  }

  @Override
  public Iterable<ModelRenderer> getParts() {
    return parts();
  }

  public Iterable<ModelRenderer> parts() {
    return ImmutableList.of(this.piece1, this.piece2, this.head, this.arm1, this.arm2);
  }

}
*/
