package noobanidus.mods.shoulders.info;

import noobanidus.mods.shoulders.client.models.*;
import noobanidus.mods.shoulders.client.transforms.ModelTransformer;

import java.util.function.Supplier;

public enum ShoulderEntity {
  BEETLE("beetle",
      BeetleModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p) -> s.translate(1.275, p.isCrouching() ? -0.8 : -1.48, -0.06))
          .s((s, d, p) -> s.scale(0.3f, 0.3f, 0.3f))
          .right()
          .t((s, d, p) -> s.translate(-1.275, p.isCrouching() ? -0.8 : -1.48, -0.06))
          .s((s, d, p) -> s.scale(0.3f, 0.3f, 0.3f))
  ),
  CHICKEN("chicken",
      ChickenModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p) -> s.translate(0.95, p.isCrouching() ? -1 : -1.48, -0.06))
          .s((s, d, p) -> s.scale(0.4f, 0.4f, 0.4f))
          .right()
          .t((s, d, p) -> s.translate(-0.95, p.isCrouching() ? -1 : -1.48, -0.06))
          .s((s, d, p) -> s.scale(0.4f, 0.4f, 0.4f))
  ),
  DEER("deer",
      DeerModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p) -> s.translate(1.275, p.isCrouching() ? -0.8 : -1.48, -0.06))
          .s((s, d, p) -> s.scale(0.3f, 00.3f, 0.3f))
          .right()
          .t((s, d, p) -> s.translate(-1.275, p.isCrouching() ? -0.8 : -1.48, -0.06))
          .s((s, d, p) -> s.scale(0.3f, 0.3f, 0.3f))
  ),
  DUCK("duck",
      DuckModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p) -> s.translate(0.95, p.isCrouching() ? -1.05 : -1.51, -0.06))
          .s((s, d, p) -> s.scale(0.4f, 0.4f, 0.4f))
          .right()
          .t((s, d, p) -> s.translate(-0.95, p.isCrouching() ? -1.05 : -1.51, -0.06))
          .s((s, d, p) -> s.scale(0.4f, 0.4f, 0.4f))
  ),
  SILVER_FOX("silver_fox",
      SilverFoxModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p) -> s.translate(0.85, p.isCrouching() ? -1.2 : -1.5, -0.06))
          .s((s, d, p) -> s.scale(0.45f, 0.45f, 0.45f))
          .right()
          .t((s, d, p) -> s.translate(-0.85, p.isCrouching() ? -1.2 : -1.5, -0.06))
          .s((s, d, p) -> s.scale(0.45f, 0.45f, 0.45f))
  ),
  FROG("frog",
      FrogModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p) -> s.translate(0.85, p.isCrouching() ? -1.5 : -1.55, -0.06))
          .s((s, d, p) -> s.scale(0.45f, 0.45f, 0.45f))
          .right()
          .t((s, d, p) -> s.translate(-0.85, p.isCrouching() ? -1.5 : -1.55, -0.06))
          .s((s, d, p) -> s.scale(0.45f, 0.45f, 0.45f))
  ),
  OWL("owl",
      OwlModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p) -> s.translate(0.95, p.isCrouching() ? -1.25 : -1.55, -0.06))
          .s((s, d, p) -> s.scale(0.4f, 0.4f, 0.4f))
          .right()
          .t((s, d, p) -> s.translate(-0.95, p.isCrouching() ? -1.25 : -1.55, -0.06))
          .s((s, d, p) -> s.scale(0.4f, 0.4f, 0.4f))
  ),
  SILKWORM("silkworm",
      SilkwormModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p) -> s.translate(0.85, p.isCrouching() ? -1.2 : -1.5, -0.06))
          .s((s, d, p) -> s.scale(0.45f, 0.45f, 0.45f))
          .s((s, d, p) -> s.scale(0.9f, 1.1f, 1.5f))
          .right()
          .t((s, d, p) -> s.translate(-0.85, p.isCrouching() ? -1.2 : -1.5, -0.06))
          .s((s, d, p) -> s.scale(0.54f, 0.4f, 0.45f))
          .s((s, d, p) -> s.scale(0.9f, 1.1f, 1.5f))
  ),
  SPROUT("sprout",
      SproutModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p) -> s.translate(0.85, p.isCrouching() ? -1.2 : -1.5, -0.06))
          .s((s, d, p) -> s.scale(0.45f, 0.45f, 0.45f))
          .right()
          .t((s, d, p) -> s.translate(-0.85, p.isCrouching() ? -1.2 : -1.5, -0.06))
          .s((s, d, p) -> s.scale(0.45f, 0.45f, 0.45f))
  ),
  RABBIT("rabbit",
      RabbitModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p) -> s.translate(0.95, p.isCrouching() ? -1 : -1.5, -0.06))
          .s((s, d, p) -> s.scale(0.4f, 0.4f, 0.4f))
          .right()
          .t((s, d, p) -> s.translate(-0.95, p.isCrouching() ? -1 : -1.5, -0.06))
          .s((s, d, p) -> s.scale(0.4f, 0.4f, 0.4f))
  ),
  OCELOT("ocelot",
      OcelotModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p) -> s.translate(0.85, p.isCrouching() ? -1.2 : -1.5, 0.1))
          .s((s, d, p) -> s.scale(0.45f, 0.45f, 0.45f))
          .right()
          .t((s, d, p) -> s.translate(-0.85, p.isCrouching() ? -1.2 : -1.5, 0.1))
          .s((s, d, p) -> s.scale(0.45f, 0.45f, 0.45f))
  ),
  TURTLE("turtle",
      TurtleModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p) -> s.translate(1.675, p.isCrouching() ? -0.8 : -1.48, -0.06))
          .s((s, d, p) -> s.scale(0.25f, 0.25f, 0.25f))
          .right()
          .t((s, d, p) -> s.translate(-1.675, p.isCrouching() ? -0.8 : -1.48, -0.06))
          .s((s, d, p) -> s.scale(0.25f, 0.25f, 0.25f))
  ),
  DOLPHIN("dolphin",
      DolphinModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p) -> s.translate(1.875, p.isCrouching() ? -0.88 : -1.55, -0.06))
          .s((s, d, p) -> s.scale(0.2f, 0.2f, 0.2f))
          .right()
          .t((s, d, p) -> s.translate(-1.875, p.isCrouching() ? -0.88 : -1.55, -0.06))
          .s((s, d, p) -> s.scale(0.2f, 0.2f, 0.2f))
  ),
  FOX("fox",
      FoxModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p) -> s.translate(1.075, p.isCrouching() ? -0.83 : -1.5, -0.2))
          .s((s, d, p) -> s.scale(0.35f, 0.35f, 0.35f))
          .right()
          .t((s, d, p) -> s.translate(-1.075, p.isCrouching() ? -0.83 : -1.5, -0.2))
          .s((s, d, p) -> s.scale(0.35f, 0.35f, 0.35f))
  ),
  PANDA("panda",
      PandaModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p) -> s.translate(2.47, p.isCrouching() ? -0.8 : -1.48, 0))
          .s((s, d, p) -> s.scale(0.15f, 0.15f, 0.15f))
          .right()
          .t((s, d, p) -> s.translate(-2.47, p.isCrouching() ? -0.8 : -1.48, 0))
          .s((s, d, p) -> s.scale(0.15f, 0.15f, 0.15f))
  ),
  PARROT("parrot",
      ParrotModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p) -> s.translate(0.4, p.isCrouching() ? -1.3 : -1.5, 0))
          .right()
          .t((s, d, p) -> s.translate(-0.4, p.isCrouching() ? -1.3 : -1.5, 0))
  ),
  POLAR_BEAR("polar_bear",
      PolarBearModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p) -> s.translate(1.85, p.isCrouching() ? -0.5 : -1.5, 0))
          .s((s, d, p) -> s.scale(0.2f, 0.2f, 0.2f))
          .right()
          .t((s, d, p) -> s.translate(-1.85, p.isCrouching() ? -0.5 : -1.5, 0))
          .s((s, d, p) -> s.scale(0.2f, 0.2f, 0.2f))
  ),
  WOLF("wolf",
      WolfModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p) -> s.translate(0.85, p.isCrouching() ? -1.2 : -1.5, 0))
          .s((s, d, p) -> s.scale(0.45f, 0.45f, 0.45f))
          .right()
          .t((s, d, p) -> s.translate(-0.85, p.isCrouching() ? -1.2 : -1.5, 0))
          .s((s, d, p) -> s.scale(0.45f, 0.45f, 0.45f))
  );

  private final String entity;
  private final Supplier<IShoulderRidingModel> model;
  private final ModelTransformer transforms;

  ShoulderEntity(String entity, Supplier<IShoulderRidingModel> model) {
    this.entity = entity;
    this.model = model;
    this.transforms = ModelTransformer.EMPTY;
  }

  ShoulderEntity(String entity, Supplier<IShoulderRidingModel> model, ModelTransformer transforms) {
    this.entity = entity;
    this.model = model;
    this.transforms = transforms;
  }

  public Supplier<IShoulderRidingModel> getModel() {
    return model;
  }

  public ModelTransformer getTransformers() {
    return transforms;
  }

  public String getName() {
    return this.entity;
  }

  public static ShoulderEntity getByName(String value) {
    for (ShoulderEntity val : values()) {
      if (val.getName().equals(value)) {
        return val;
      }
    }

    return null;
  }
}
