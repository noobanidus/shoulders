package noobanidus.libs.shoulders.info;

import noobanidus.libs.shoulders.client.models.*;
import noobanidus.libs.shoulders.client.transforms.ModelTransformer;

import java.util.function.Supplier;

public enum ShoulderEntity {
  BEETLE("beetle",
      BeetleModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p, o) -> s.translate(1.275, p.isCrouching() ? -0.8 + o : -1.48 + o, -0.06))
          .s((s, d, p, o) -> s.scale(0.3f, 0.3f, 0.3f))
          .right()
          .t((s, d, p, o) -> s.translate(-1.275, p.isCrouching() ? -0.8 + o : -1.48 + o, -0.06))
          .s((s, d, p, o) -> s.scale(0.3f, 0.3f, 0.3f)),
      -0.2
  ),
  CHICKEN("chicken",
      ChickenModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p, o) -> s.translate(0.95, p.isCrouching() ? -1 + o : -1.48 + o, -0.06))
          .s((s, d, p, o) -> s.scale(0.4f, 0.4f, 0.4f))
          .right()
          .t((s, d, p, o) -> s.translate(-0.95, p.isCrouching() ? -1 + o: -1.48 + o, -0.06))
          .s((s, d, p, o) -> s.scale(0.4f, 0.4f, 0.4f)),
      -0.15
  ),
  DUCK("duck",
      DuckModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p, o) -> s.translate(0.95, p.isCrouching() ? -1.05 + o: -1.51 + o, -0.06))
          .s((s, d, p, o) -> s.scale(0.4f, 0.4f, 0.4f))
          .right()
          .t((s, d, p, o) -> s.translate(-0.95, p.isCrouching() ? -1.05 + o : -1.51 + o, -0.06))
          .s((s, d, p, o) -> s.scale(0.4f, 0.4f, 0.4f)),
      -0.15
  ),
  SILVER_FOX("silver_fox",
      SilverFoxModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p, o) -> s.translate(0.85, p.isCrouching() ? -1 + o : -1.5 + o, -0.06))
          .s((s, d, p, o) -> s.scale(0.45f, 0.45f, 0.45f))
          .right()
          .t((s, d, p, o) -> s.translate(-0.85, p.isCrouching() ? -1 + o: -1.5 + o, -0.06))
          .s((s, d, p, o) -> s.scale(0.45f, 0.45f, 0.45f)),
      -0.1
  ),
  FROG("frog",
      FrogModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p, o) -> s.translate(0.85, p.isCrouching() ? -1.05 + o : -1.55 + o, -0.06))
          .s((s, d, p, o) -> s.scale(0.45f, 0.45f, 0.45f))
          .right()
          .t((s, d, p, o) -> s.translate(-0.85, p.isCrouching() ? -1.05 + o: -1.55 + o, -0.06))
          .s((s, d, p, o) -> s.scale(0.45f, 0.45f, 0.45f)),
      -0.1
  ),
  OWL("owl",
      OwlModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p, o) -> s.translate(0.95, p.isCrouching() ? -1.05 + o: -1.55 + o, -0.06))
          .s((s, d, p, o) -> s.scale(0.4f, 0.4f, 0.4f))
          .right()
          .t((s, d, p, o) -> s.translate(-0.95, p.isCrouching() ? -1.05 + o : -1.55 + o, -0.06))
          .s((s, d, p, o) -> s.scale(0.4f, 0.4f, 0.4f)),
      -0.15
  ),
  SPROUT("sprout",
      SproutModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p, o) -> s.translate(0.85, p.isCrouching() ? -1.1 + o: -1.5 + o, -0.06))
          .s((s, d, p, o) -> s.scale(0.45f, 0.45f, 0.45f))
          .right()
          .t((s, d, p, o) -> s.translate(-0.85, p.isCrouching() ? -1.1 + o: -1.5 + o, -0.06))
          .s((s, d, p, o) -> s.scale(0.45f, 0.45f, 0.45f)),
      -0.1
  ),
  RABBIT("rabbit",
      RabbitModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p, o) -> s.translate(0.95, p.isCrouching() ? -1 + o : -1.5 + o, -0.06))
          .s((s, d, p, o) -> s.scale(0.4f, 0.4f, 0.4f))
          .right()
          .t((s, d, p, o) -> s.translate(-0.95, p.isCrouching() ? -1 + o : -1.5 + o, -0.06))
          .s((s, d, p, o) -> s.scale(0.4f, 0.4f, 0.4f)),
      -0.1
  ),
  OCELOT("ocelot",
      OcelotModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p, o) -> s.translate(0.85, p.isCrouching() ? -1.1 + o: -1.5 + o, 0.1))
          .s((s, d, p, o) -> s.scale(0.45f, 0.45f, 0.45f))
          .right()
          .t((s, d, p, o) -> s.translate(-0.85, p.isCrouching() ? -1.1 + o: -1.5 + o, 0.1))
          .s((s, d, p, o) -> s.scale(0.45f, 0.45f, 0.45f)),
           -0.1
  ),
  FOX("fox",
      FoxModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p, o) -> s.translate(1.075, p.isCrouching() ? -0.83 + o: -1.5 + o, -0.2))
          .s((s, d, p, o) -> s.scale(0.35f, 0.35f, 0.35f))
          .right()
          .t((s, d, p, o) -> s.translate(-1.075, p.isCrouching() ? -0.83 + o: -1.5 + o, -0.2))
          .s((s, d, p, o) -> s.scale(0.35f, 0.35f, 0.35f)),
      -0.3
  ),
  PANDA("panda",
      PandaModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p, o) -> s.translate(2.47, p.isCrouching() ? -0.8 + o : -1.48 + o, 0))
          .s((s, d, p, o) -> s.scale(0.15f, 0.15f, 0.15f))
          .right()
          .t((s, d, p, o) -> s.translate(-2.47, p.isCrouching() ? -0.8 + o : -1.48 + o, 0))
          .s((s, d, p, o) -> s.scale(0.15f, 0.15f, 0.15f)),
      -0.2
  ),
  PARROT("parrot",
      ParrotModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p, o) -> s.translate(0.4, p.isCrouching() ? -1.3 + o: -1.5 + o, 0))
          .right()
          .t((s, d, p, o) -> s.translate(-0.4, p.isCrouching() ? -1.3 + o: -1.5 + o, 0)),
      -0.1
  ),
  POLAR_BEAR("polar_bear",
      PolarBearModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p, o) -> s.translate(1.85, p.isCrouching() ? -0.5 + o: -1.5 + o, 0))
          .s((s, d, p, o) -> s.scale(0.2f, 0.2f, 0.2f))
          .right()
          .t((s, d, p, o) -> s.translate(-1.85, p.isCrouching() ? -0.5 + o : -1.5 + o, 0))
          .s((s, d, p, o) -> s.scale(0.2f, 0.2f, 0.2f)),
      -0.05
  ),
  WOLF("wolf",
      WolfModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p, o) -> s.translate(0.85, p.isCrouching() ? -1.0 + o : -1.5 + o, 0))
          .s((s, d, p, o) -> s.scale(0.45f, 0.45f, 0.45f))
          .right()
          .t((s, d, p, o) -> s.translate(-0.85, p.isCrouching() ? -1.0 + o : -1.5 + o, 0))
          .s((s, d, p, o) -> s.scale(0.45f, 0.45f, 0.45f)),
      -0.05
  ),
  JERBOA("jerboa",
      JerboaModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p, o) -> s.translate(0.95, p.isCrouching() ? -1 + o : -1.48 + o, -0.06))
/*          .s((s, d, p, o) -> s.scale(0.4f, 0.4f, 0.4f))*/
          .right()
          .t((s, d, p, o) -> s.translate(-0.95, p.isCrouching() ? -1 + o: -1.48 + o, -0.06)),
/*          .s((s, d, p, o) -> s.scale(0.4f, 0.4f, 0.4f)),*/
      -0.15
  );

  private final String entity;
  private final Supplier<IShoulderRidingModel> model;
  private final ModelTransformer transforms;
  private final double armorOffset;

  ShoulderEntity(String entity, Supplier<IShoulderRidingModel> model, ModelTransformer transforms, double armorOffset) {
    this.entity = entity;
    this.model = model;
    this.transforms = transforms;
    this.armorOffset = armorOffset;
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

  public double getArmorOffset() {
    return armorOffset;
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
