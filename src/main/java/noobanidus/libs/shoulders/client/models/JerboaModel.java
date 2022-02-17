package noobanidus.libs.shoulders.client.models;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.AgeableModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;
import noobanidus.libs.shoulders.Constants;
import noobanidus.libs.shoulders.info.ShoulderData;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JerboaModel extends AgeableModel<LivingEntity> implements IShoulderRidingModel {
  public ModelRenderer body;
  public ModelRenderer tail;
  public ModelRenderer nose;
  public ModelRenderer leftFoot;
  public ModelRenderer rightFoot;
  public ModelRenderer leftArm;
  public ModelRenderer rightArm;
  public ModelRenderer leftEar;
  public ModelRenderer rightEar;

  public JerboaModel() {
    this.texWidth= 32;
    this.texHeight= 32;
    this.tail = new ModelRenderer(this, 0, 8);
    this.tail.setPos(0.0F, 1.0F, 2.5F);
    this.tail.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, 0.0F, 0.0F, 0.0F);
    this.leftArm = new ModelRenderer(this, 0, 11);
    this.leftArm.setPos(1.0F, 1.5F, 0.0F);
    this.leftArm.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
    this.rightFoot = new ModelRenderer(this, 0, 8);
    this.rightFoot.setPos(-1.0F, 1.5F, 2.0F);
    this.rightFoot.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
    this.setRotateAngle(rightFoot, 0.0F, 0.6981317007977318F, 0.0F);
    this.leftFoot = new ModelRenderer(this, 0, 8);
    this.leftFoot.setPos(1.0F, 1.5F, 2.0F);
    this.leftFoot.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
    this.setRotateAngle(leftFoot, 0.0F, -0.6981317007977318F, 0.0F);
    this.nose = new ModelRenderer(this, 0, 0);
    this.nose.setPos(0.0F, 1.0F, -2.5F);
    this.nose.addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
    this.rightArm = new ModelRenderer(this, 0, 11);
    this.rightArm.setPos(-1.0F, 1.5F, 0.0F);
    this.rightArm.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
    this.rightEar = new ModelRenderer(this, 0, 0);
    this.rightEar.setPos(-1.5F, 0.0F, -1.0F);
    this.rightEar.addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
    this.setRotateAngle(rightEar, -0.3490658503988659F, -0.17453292519943295F, -0.2617993877991494F);
    this.body = new ModelRenderer(this, 0, 0);
    this.body.setPos(0.0F, 21.5F, 0.0F);
    this.body.addBox(-1.5F, -1.5F, -2.5F, 3.0F, 3.0F, 5.0F, 0.0F, 0.0F, 0.0F);
    this.leftEar = new ModelRenderer(this, 0, 0);
    this.leftEar.mirror = true;
    this.leftEar.setPos(1.5F, 0.0F, -1.0F);
    this.leftEar.addBox(0.0F, -3.0F, -0.5F, 0.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
    this.setRotateAngle(leftEar, -0.3490658503988659F, 0.17453292519943295F, 0.2617993877991494F);
    this.body.addChild(this.tail);
    this.body.addChild(this.leftArm);
    this.body.addChild(this.rightFoot);
    this.body.addChild(this.leftFoot);
    this.body.addChild(this.nose);
    this.body.addChild(this.rightArm);
    this.body.addChild(this.rightEar);
    this.body.addChild(this.leftEar);
  }

  @Override
  public void setupAnim(LivingEntity pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {

  }

  @Override
  protected Iterable<ModelRenderer> headParts() {
    return Collections.emptyList();
  }

  @Override
  protected Iterable<ModelRenderer> bodyParts() {
    return ImmutableList.of(body);
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

  private static final List<ResourceLocation> TEXTURES = Arrays.asList(Constants.entityTexture("jerboa_black"), Constants.entityTexture("jerboa_brown"), Constants.entityTexture("jerboa_tan"), Constants.entityTexture("jerboa_white"));

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    return getTexture(data, TEXTURES);
  }

  @Override
  public EntityModel<LivingEntity> getModel() {
    return this;
  }

  @Override
  public Iterable<ModelRenderer> getParts() {
    return bodyParts();
  }
}
