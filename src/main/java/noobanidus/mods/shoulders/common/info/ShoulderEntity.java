package noobanidus.mods.shoulders.common.info;

import noobanidus.mods.shoulders.client.models.BeetleModel;
import noobanidus.mods.shoulders.client.models.ShoulderRidingModel;

import java.util.function.Supplier;

public enum ShoulderEntity implements BiDirectional {
  BEETLE("beetle", BeetleModel::new);

  private String entity;
  private Supplier<ShoulderRidingModel<?>> model;

  ShoulderEntity(String entity, Supplier<ShoulderRidingModel<?>> model) {
    this.entity = entity;
    this.model = model;
  }

  public Supplier<ShoulderRidingModel<?>> getModel() {
    return model;
  }

  @Override
  public String getName() {
    return this.entity;
  }

  public static ShoulderEntity getByName(String name) {
    return BiDirectional.getByString(values(), name);
  }
}
