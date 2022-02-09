package noobanidus.libs.shoulders.info;

public enum Shoulder {
  RIGHT("right"), LEFT("left"), HEAD("head");

  private String position;

  Shoulder(String position) {
    this.position = position;
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
    return this.position;
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
