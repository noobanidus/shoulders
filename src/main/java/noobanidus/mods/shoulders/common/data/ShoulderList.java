package noobanidus.mods.shoulders.common.data;

import noobanidus.mods.shoulders.common.info.Shoulder;
import noobanidus.mods.shoulders.common.info.ShoulderData;
import noobanidus.mods.shoulders.common.info.ShoulderEntity;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ShoulderList {
  private static Map<UUID, ShoulderData> dataMap = new HashMap<>();

  public static UUID DevId = UUID.fromString("380df991-f603-344c-a090-369bad2a924a");

  static {
    dataMap.put(DevId, new ShoulderData(DevId, ShoulderEntity.BEETLE, Shoulder.RIGHT, 0));
  }

  public static void load () {

  }


}
