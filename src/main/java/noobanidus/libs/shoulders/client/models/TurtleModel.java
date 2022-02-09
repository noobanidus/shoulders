package noobanidus.libs.shoulders.client.models;

import com.google.common.collect.Iterables;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.ResourceLocation;
import noobanidus.libs.shoulders.info.ShoulderData;

public class TurtleModel extends QuadrupedModel {
  public TurtleModel() {
    super(12, 0.0f, true, 120.0F, 0.0F, 9.0F, 6.0F, 120);
    this.texWidth = 128;
    this.texHeight = 64;
    this.head = new ModelRenderer(this, 3, 0);
    this.head.addBox(-3.0F, -1.0F, -3.0F, 6.0F, 5.0F, 6.0F, 0.0F);
    this.head.setPos(0.0F, 19.0F, -10.0F);
    this.body = new ModelRenderer(this);
    this.body.texOffs(7, 37).addBox(-9.5F, 3.0F, -10.0F, 19.0F, 20.0F, 6.0F, 0.0F);
    this.body.texOffs(31, 1).addBox(-5.5F, 3.0F, -13.0F, 11.0F, 18.0F, 3.0F, 0.0F);
    this.body.setPos(0.0F, 11.0F, -10.0F);
    this.leg0 = new ModelRenderer(this, 1, 23);
    this.leg0.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F, 0.0F);
    this.leg0.setPos(-3.5F, 22.0F, 11.0F);
    this.leg1 = new ModelRenderer(this, 1, 12);
    this.leg1.addBox(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F, 0.0F);
    this.leg1.setPos(3.5F, 22.0F, 11.0F);
    this.leg2 = new ModelRenderer(this, 27, 30);
    this.leg2.addBox(-13.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F, 0.0F);
    this.leg2.setPos(-5.0F, 21.0F, -4.0F);
    this.leg3 = new ModelRenderer(this, 27, 24);
    this.leg3.addBox(0.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F, 0.0F);
    this.leg3.setPos(5.0F, 21.0F, -4.0F);
  }

  @Override
  public void prepare(ShoulderData data) {
  }

  @Override
  public RenderType getRenderType(ShoulderData data) {
    return renderType(getTexture(data));
  }

  private static final ResourceLocation BIG_SEA_TURTLE = new ResourceLocation("textures/entity/turtle/big_sea_turtle.png");

  @Override
  public ResourceLocation getTexture(ShoulderData data) {
    return BIG_SEA_TURTLE;
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
