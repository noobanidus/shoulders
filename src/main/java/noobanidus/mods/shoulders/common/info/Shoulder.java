package noobanidus.mods.shoulders.common.info;

public enum Shoulder implements BiDirectional {
  RIGHT("right"), LEFT("left"), HEAD("head");

  private String shoulder;

  Shoulder(String shoulder) {
    this.shoulder = shoulder;
  }

  @Override
  public String getName() {
    return this.shoulder;
  }

  public static Shoulder getByName(String name) {
    return BiDirectional.getByString(values(), name);
  }
}
