package noobanidus.mods.shoulders.common.info;

import net.minecraft.util.IStringSerializable;

public enum Shoulder implements IStringSerializable {
  RIGHT("right"), LEFT("left"), HEAD("head");

  private String shoulder;

  Shoulder(String shoulder) {
    this.shoulder = shoulder;
  }

  @Override
  public String getName() {
    return this.shoulder;
  }
}
