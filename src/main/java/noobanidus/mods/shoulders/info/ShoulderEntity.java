package noobanidus.mods.shoulders.info;

import net.minecraft.client.renderer.entity.layers.MooshroomMushroomLayer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import noobanidus.mods.shoulders.client.models.*;

import java.util.function.Supplier;

@OnlyIn(Dist.CLIENT)
public enum ShoulderEntity {
  BEETLE("beetle", BeetleModel::new),
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
  PUFFERFISH("pufferfish", PufferfishModel::new);

  private String entity;
  private Supplier<IShoulderRidingModel> model;

  ShoulderEntity(String entity, Supplier<IShoulderRidingModel> model) {
    this.entity = entity;
    this.model = model;
  }

  public Supplier<IShoulderRidingModel> getModel() {
    return model;
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
