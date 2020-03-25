package noobanidus.mods.shoulders.info;

public enum Shoulder {
  RIGHT("right"), LEFT("left"), HEAD("head");

  private String shoulder;

  Shoulder(String shoulder) {
    this.shoulder = shoulder;
  }

  public boolean left () {
    return this == LEFT;
  }

  public boolean right () {
    return this == RIGHT;
  }

  public boolean head () {
    return this == HEAD;
  }

  public String getName() {
    return this.shoulder;
  }

  public static Shoulder getByName(String name) {
    switch (name.toLowerCase()) {
      case "right":
        return RIGHT;
      case "head":
        return HEAD;
      case "left":
      default:
        return LEFT;
    }
  }
}
