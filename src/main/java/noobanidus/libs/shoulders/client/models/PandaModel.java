package noobanidus.libs.shoulders.client.models;

import com.google.common.collect.Iterables;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.ModelUtils;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;
import noobanidus.libs.shoulders.info.ShoulderData;

import java.util.Arrays;
import java.util.List;

public class PandaModel extends QuadrupedModel {
  public PandaModel() {
    super(9, 0, true, 23.0F, 4.8F, 2.7F, 3.0F, 49);
    this.texWidth = 64;
    this.texHeight = 64;
    this.head = new ModelRenderer(this, 0, 6);
    this.head.addBox(-6.5F, -5.0F, -4.0F, 13.0F, 10.0F, 9.0F);
    this.head.setPos(0.0F, 11.5F, -17.0F);
    this.head.texOffs(45, 16).addBox(-3.5F, 0.0F, -6.0F, 7.0F, 5.0F, 2.0F);
    this.head.texOffs(52, 25).addBox(-8.5F, -8.0F, -1.0F, 5.0F, 4.0F, 1.0F);
    this.head.texOffs(52, 25).addBox(3.5F, -8.0F, -1.0F, 5.0F, 4.0F, 1.0F);
    this.body = new ModelRenderer(this, 0, 25);
    this.body.addBox(-9.5F, -13.0F, -6.5F, 19.0F, 26.0F, 13.0F);
    this.body.setPos(0.0F, 10.0F, 0.0F);
    int i = 9;
    int j = 6;
    this.leg0 = new ModelRenderer(this, 40, 0);
    this.leg0.addBox(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
    this.leg0.setPos(-5.5F, 15.0F, 9.0F);
    this.leg1 = new ModelRenderer(this, 40, 0);
    this.leg1.addBox(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
    this.leg1.setPos(5.5F, 15.0F, 9.0F);
    this.leg2 = new ModelRenderer(this, 40, 0);
    this.leg2.addBox(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
    this.leg2.setPos(-5.5F, 15.0F, -9.0F);
    this.leg3 = new ModelRenderer(this, 40, 0);
    this.leg3.addBox(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
    this.leg3.setPos(5.5F, 15.0F, -9.0F);
  }

  public void setupAnim(ShoulderData data, int ticks, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
    super.setupAnim(data, ticks, pLimbSwing, pLimbSwingAmount, pAgeInTicks, pNetHeadYaw, pHeadPitch);
    this.head.zRot = 0.0F;
    this.body.xRot = ModelUtils.rotlerpRad(this.body.xRot, 1.7407963F, 1f);
/*    this.head.xRot = ModelUtils.rotlerpRad(this.head.xRot, ((float) Math.PI / 2F), 1f);
    this.head.zRot = 0;*/
    this.head.xRot = pHeadPitch * ((float) Math.PI / 180F);
    this.head.yRot = pNetHeadYaw * ((float) Math.PI / 180F);
    this.leg2.zRot = -0.27079642F;
    this.leg3.zRot = 0.27079642F;
    this.leg0.zRot = 0.5707964F;
    this.leg1.zRot = -0.5707964F;
  }

  @Override
  public void prepare(ShoulderData data) {
  }

  @Override
  public RenderType getRenderType(ShoulderData data) {
    return renderType(getTexture(data));
  }

  private static final List<ResourceLocation> TEXTURES = Arrays.asList(
      new ResourceLocation("textures/entity/panda/panda.png"),
      new ResourceLocation("textures/entity/panda/lazy_panda.png"),
      new ResourceLocation("textures/entity/panda/worried_panda.png"),
      new ResourceLocation("textures/entity/panda/playful_panda.png"),
      new ResourceLocation("textures/entity/panda/brown_panda.png"),
      new ResourceLocation("textures/entity/panda/weak_panda.png"),
      new ResourceLocation("textures/entity/panda/aggressive_panda.png")
  );

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    if (data.getVariant() < TEXTURES.size()) {
      return TEXTURES.get(data.getVariant());
    }

    return TEXTURES.get(0);
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