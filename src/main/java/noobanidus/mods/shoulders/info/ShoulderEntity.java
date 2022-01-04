package noobanidus.mods.shoulders.info;

import noobanidus.mods.shoulders.client.models.BeetleModel;
import noobanidus.mods.shoulders.client.models.IShoulderRidingModel;
import noobanidus.mods.shoulders.client.transforms.ModelTransformer;

import java.util.function.Supplier;

public enum ShoulderEntity {
  BEETLE("beetle",
      BeetleModel::new,
      ModelTransformer.transformer()
          .left()
          .t((s, d, p) -> s.translate(0.375, p.isCrouching() ? -0.3 : -0.5, 0))
          .s((s, d, p) -> s.scale(0.35f, 0.35f, 0.35f))
  );
  /*
  RABBIT("rabbit", RabbitModel::new),
  OCELOT("ocelot", OcelotModel::new),
  BAT("bat", BatModel::new),
  TURTLE("turtle", TurtleModel::new),
  CHICKEN("chicken", ChickenModel::new),
  COW("cow", CowModel::new),
  HORSE("horse", HorseModel::new),
  PIG("pig", PigModel::new),
  SHEEP("sheep", SheepModel::new),
  DOLPHIN("dolphin", DolphinModel::new),
  COD("cod", CodModel::new),
  FOX("fox", FoxModel::new),
  LLAMA("llama", LlamaModel::new),
  MOOSHROOM("mooshroom", MooshroomModel::new),
  PANDA("panda", PandaModel::new),
  PARROT("parrot", ParrotModel::new),
  PUFFERFISH("pufferfish", PufferfishModel::new),
  POLAR_BEAR("polar_bear", PolarBearModel::new),
  SALMON("salmon", SalmonModel::new),
  SNOW_GOLEM("snow_golem", SnowGolemModel::new),
  SQUID("squid", SquidModel::new),
  LARGE_TROPICAL_FISH("large_tropical_fish", LargeTropicalFishModel::new),
  SMALL_TROPICAL_FISH("small_tropical_fish", SmallTropicalFishModel::new),
  WOLF("wolf", WolfModel::new),
  DEER("deer", DeerModel::new),
  FROG("frog", FrogModel::new),
  OWL("owl", OwlModel::new),
  SILVER_FOX("silver_fox", SilverFoxModel::new),
  SPROUT("sprout", SproutModel::new),
  SILKWORM("silkworm", SilkwormModel::new);*/

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
