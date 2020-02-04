package noobanidus.mods.shoulders.common.info;

import net.minecraft.util.IStringSerializable;

import javax.annotation.Nullable;

public interface BiDirectional extends IStringSerializable {
  @Nullable
  static <T extends Enum<T> & IStringSerializable> T getByString (T[] values, String value) {
    for (T val : values) {
      if (val.getName().equals(value)) {
        return val;
      }
    }

    return null;
  }
}
