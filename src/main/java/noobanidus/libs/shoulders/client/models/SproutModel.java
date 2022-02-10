package noobanidus.libs.shoulders.client.models;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.AgeableModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;
import noobanidus.libs.shoulders.Constants;
import noobanidus.libs.shoulders.client.bootstrap.Bootstrap;
import noobanidus.libs.shoulders.info.ShoulderData;

import java.util.Arrays;
import java.util.List;

public class SproutModel extends AgeableModel<LivingEntity> implements IShoulderRidingModel {
  private final ModelRenderer head;
  private final ModelRenderer legL;
  private final ModelRenderer legR;
  private final ModelRenderer leafTop;
  private final ModelRenderer leafBottom;

  public SproutModel() {
    super(true, 5.0f, 2.0f);
    texWidth = 32;
    texHeight = 32;

    head = new ModelRenderer(this, 12, 0);
    head.addBox(-2.5F, 0F, -2.5F, 5, 5, 5);
    head.setPos(0F, 11F, 0F);
    head.setTexSize(32, 32);
    head.mirror = true;
    setRotation(head, 0F, 0F, 0F);
    legL = new ModelRenderer(this, 0, 0);
    legL.addBox(-1F, 0F, -1F, 2, 8, 2);
    legL.setPos(1.5F, 16F, 0F);
    legL.setTexSize(32, 32);
    legL.mirror = true;
    setRotation(legL, 0F, 0F, 0F);
    legR = new ModelRenderer(this, 0, 0);
    legR.addBox(-1F, 0F, -1F, 2, 8, 2);
    legR.setPos(-1.5F, 16F, 0F);
    legR.setTexSize(32, 32);
    legR.mirror = true;
    setRotation(legR, 0F, 0F, 0F);
    leafTop = new ModelRenderer(this, 8, 0);
    leafTop.addBox(-0.5F, 0F, -0.5F, 1, 2, 1);
    leafTop.setPos(0F, 9F, -1F);
    leafTop.setTexSize(32, 32);
    leafTop.mirror = true;
    setRotation(leafTop, 0F, 0F, 0F);
    leafBottom = new ModelRenderer(this, 0, 10);
    leafBottom.addBox(-1.5F, -0.5F, -0.5F, 3, 4, 1);
    leafBottom.setPos(0F, 9F, -1F);
    leafBottom.setTexSize(32, 32);
    leafBottom.mirror = true;
    setRotation(leafBottom, 1.963495F, 0.5235988F, 0F);
  }

  @Override
  protected Iterable<ModelRenderer> headParts() {
    return ImmutableList.of();
  }

  @Override
  protected Iterable<ModelRenderer> bodyParts() {
    return ImmutableList.of(head, leafTop, leafBottom, legL, legR);
  }

  @Override
  public void setupAnim(LivingEntity entity, float f, float f1, float age, float f3, float f4) {
  }

  @Override
  public void setupAnim(ShoulderData data, int ticks, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
  }

  @Override
  public void prepare(ShoulderData data) {

  }

  @Override
  public RenderType getRenderType(ShoulderData data) {
    return renderType(getTexture(data));
  }

  private static final List<ResourceLocation> TEXTURES = Arrays.asList(Constants.rl("textures/entity/sprout_green.png"), Constants.rl("textures/entity/sprout_hell.png"), Constants.rl("textures/entity/sprout_purple.png"), Constants.rl("textures/entity/sprout_red.png"), Constants.rl("textures/entity/sprout_tan.png"));

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    switch (data.getVariant()) {
      default:
      case 0:
        return Bootstrap.modTex("sprout_green");
      case 1:
        return Bootstrap.modTex("sprout_hell");
      case 2:
        return Bootstrap.modTex("sprout_purple");
      case 3:
        return Bootstrap.modTex("sprout_red");
      case 4:
        return Bootstrap.modTex("sprout_tan");
    }
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
