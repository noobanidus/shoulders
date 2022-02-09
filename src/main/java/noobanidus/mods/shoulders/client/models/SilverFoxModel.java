package noobanidus.mods.shoulders.client.models;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.AgeableModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;
import noobanidus.mods.shoulders.Constants;
import noobanidus.mods.shoulders.info.ShoulderData;

import javax.annotation.Nonnull;
import java.util.Arrays;
import java.util.List;

public class SilverFoxModel extends AgeableModel<LivingEntity> implements IShoulderRidingModel {
  private final ModelRenderer body1;
  private final ModelRenderer frontL;
  private final ModelRenderer frontR;
  private final ModelRenderer body2;
  private final ModelRenderer neck;
  private final ModelRenderer backL;
  private final ModelRenderer backR;
  private final ModelRenderer tail1;
  private final ModelRenderer tail2;
  private final ModelRenderer tail3;
  private final ModelRenderer tail4;
  private final ModelRenderer head;
  private final ModelRenderer snout;
  private final ModelRenderer earR;
  private final ModelRenderer earL;

  public SilverFoxModel() {
    super(true, 5.0f, 2.0f);
    this.texWidth = 32;
    this.texHeight = 32;
    this.backL = new ModelRenderer(this, 0, 16);
    this.backL.mirror = true;
    this.backL.setPos(1.0F, 4.0F, 1.5F);
    this.backL.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
    this.tail4 = new ModelRenderer(this, 8, 18);
    this.tail4.setPos(0.0F, 3.5F, 0.0F);
    this.tail4.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
    this.setRotateAngle(tail4, 0.39269908169872414F, 0.0F, 0.0F);
    this.body1 = new ModelRenderer(this, 12, 8);
    this.body1.setPos(0.0F, 15.5F, -2.0F);
    this.body1.addBox(-2.5F, 0.0F, 0.0F, 5, 4, 5, 0.0F);
    this.backR = new ModelRenderer(this, 0, 16);
    this.backR.setPos(-1.0F, 4.0F, 1.5F);
    this.backR.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
    this.neck = new ModelRenderer(this, 16, 0);
    this.neck.setPos(0.0F, 1.5F, 2.0F);
    this.neck.addBox(-2.0F, -2.0F, -4.0F, 4, 4, 4, 0.0F);
    this.setRotateAngle(neck, -0.2617993877991494F, 0.0F, 0.0F);
    this.earR = new ModelRenderer(this, 0, 12);
    this.earR.setPos(-1.5F, -1.0F, -1.0F);
    this.earR.addBox(-1.0F, -3.0F, -0.5F, 2, 3, 1, 0.0F);
    this.setRotateAngle(earR, 0.0F, 0.2617993877991494F, -0.5235987755982988F);
    this.tail3 = new ModelRenderer(this, 0, 24);
    this.tail3.setPos(0.0F, 3.0F, 0.0F);
    this.tail3.addBox(-2.0F, 0.0F, -2.0F, 4, 4, 4, 0.0F);
    this.snout = new ModelRenderer(this, 0, 0);
    this.snout.setPos(0.0F, 0.0F, -3.0F);
    this.snout.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 3, 0.0F);
    this.setRotateAngle(snout, 0.17453292519943295F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 0, 5);
    this.head.setPos(0.0F, 0.0F, -4.0F);
    this.head.addBox(-2.5F, -2.0F, -3.0F, 5, 4, 3, 0.0F);
    this.setRotateAngle(head, 0.2617993877991494F, 0.0F, 0.0F);
    this.tail1 = new ModelRenderer(this, 12, 0);
    this.tail1.setPos(0.0F, 1.0F, 2.5F);
    this.tail1.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
    this.setRotateAngle(tail1, 1.1780972450961724F, 0.0F, 0.0F);
    this.earL = new ModelRenderer(this, 0, 12);
    this.earL.mirror = true;
    this.earL.setPos(1.5F, -1.0F, -1.0F);
    this.earL.addBox(-1.0F, -3.0F, -0.5F, 2, 3, 1, 0.0F);
    this.setRotateAngle(earL, 0.0F, -0.2617993877991494F, 0.5235987755982988F);
    this.frontL = new ModelRenderer(this, 0, 16);
    this.frontL.mirror = true;
    this.frontL.setPos(1.0F, 4.0F, 1.0F);
    this.frontL.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
    this.body2 = new ModelRenderer(this, 16, 17);
    this.body2.setPos(0.0F, 0.0F, 5.0F);
    this.body2.addBox(-2.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F);
    this.frontR = new ModelRenderer(this, 0, 16);
    this.frontR.setPos(-1.0F, 4.0F, 1.0F);
    this.frontR.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
    this.tail2 = new ModelRenderer(this, 16, 24);
    this.tail2.setPos(0.0F, 1.5F, 0.0F);
    this.tail2.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F);
    this.setRotateAngle(tail2, -0.39269908169872414F, 0.0F, 0.0F);
    this.body2.addChild(this.backL);
    this.tail3.addChild(this.tail4);
    this.body2.addChild(this.backR);
    this.body1.addChild(this.neck);
    this.head.addChild(this.earR);
    this.tail2.addChild(this.tail3);
    this.head.addChild(this.snout);
    this.neck.addChild(this.head);
    this.body2.addChild(this.tail1);
    this.head.addChild(this.earL);
    this.body1.addChild(this.frontL);
    this.body1.addChild(this.body2);
    this.body1.addChild(this.frontR);
    this.tail1.addChild(this.tail2);
  }

  @Nonnull
  @Override
  protected Iterable<ModelRenderer> headParts() {
    return ImmutableSet.of();
  }

  @Nonnull
  @Override
  protected Iterable<ModelRenderer> bodyParts() {
    return ImmutableSet.of(body1);
  }


  @Override
  public void setupAnim(LivingEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
  }

  @Override
  public void setupAnim(ShoulderData data, int ticks, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    this.backL.setPos(1.0F, 4.0F, 1.5F);
    this.backR.setPos(-1.0F, 4.0F, 1.5F);
    this.body1.setPos(0.0F, 15.5F, -2.0F);
    this.body2.setPos(0.0F, 0.0F, 5.0F);
    this.earL.setPos(1.5F, -1.0F, -1.0F);
    this.earR.setPos(-1.5F, -1.0F, -1.0F);
    this.frontL.setPos(1.0F, 4.0F, 1.0F);
    this.frontR.setPos(-1.0F, 4.0F, 1.0F);
    this.head.setPos(0.0F, 0.0F, -4.0F);
    this.neck.setPos(0.0F, 1.5F, 2.0F);
    this.snout.setPos(0.0F, 0.0F, -3.0F);
    this.tail1.setPos(0.0F, 1.0F, 2.5F);
    this.tail2.setPos(0.0F, 1.5F, 0.0F);
    this.tail3.setPos(0.0F, 3.0F, 0.0F);
    this.tail4.setPos(0.0F, 3.5F, 0.0F);

    this.setRotateAngle(backL, -0.8196066167365371F, -0.31869712141416456F, 0.0F);
    this.setRotateAngle(backR, -0.8196066167365371F, 0.36425021489121656F, 0.0F);
    this.setRotateAngle(body1, -0.6829473363053812F, 0.0F, 0.0F);
    this.setRotateAngle(body2, -0.045553093477052F, 0.0F, 0.0F);
    this.setRotateAngle(earL, 0.0F, -0.2617993877991494F, 0.6085963101704227F);
    this.setRotateAngle(earR, 0.0F, 0.2617993877991494F, -0.5988224663592545F);
    this.setRotateAngle(frontL, 0.31869712141416456F, 0.0F, 0.0F);
    this.setRotateAngle(frontR, 0.31869712141416456F, 0.0F, 0.0F);
    this.setRotateAngle(neck, 0.3f, 0.0F, 0.0F);
    this.setRotateAngle(snout, 0.17453292519943295F, 0.0F, 0.0F);
    this.setRotateAngle(tail1, 2.5497515042385164F, 0.0F, 0.06178465552059926F);
    this.setRotateAngle(tail2, -0.39269908169872414F, 0.0F, 0.08726646259971647F);
    this.setRotateAngle(tail3, 0.0F, 0.0F, 0.06178465552059926F);
    this.setRotateAngle(tail4, 0.39269908169872414F, 0.0F, 0.0F);

    this.head.xRot = 0.3f + headPitch * 0.017453292F;
    this.head.yRot = netHeadYaw * 0.017453292F;
  }

  @Override
  public void prepare(ShoulderData data) {
  }

  @Override
  public RenderType getRenderType(ShoulderData data) {
    return renderType(getTexture(data));
  }

  private static final List<ResourceLocation> TEXTURES = Arrays.asList(Constants.rl("textures/entity/red_fox.png"), Constants.rl("textures/entity/silver_fox.png"), Constants.rl("textures/entity/aqua_fox.png"));

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    if (data.getVariant() > TEXTURES.size()) {
      return TEXTURES.get(0);
    }

    return TEXTURES.get(data.getVariant());
  }

  @Override
  public EntityModel<LivingEntity> getModel() {
    return this;
  }

  @Override
  public Iterable<ModelRenderer> getParts() {
    return Iterables.concat(headParts(), bodyParts());
  }
}
