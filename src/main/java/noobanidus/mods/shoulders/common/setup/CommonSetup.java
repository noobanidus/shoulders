package noobanidus.mods.shoulders.common.setup;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import noobanidus.mods.shoulders.common.data.ShoulderList;

public class CommonSetup {
  public static void init(FMLCommonSetupEvent event) {
    ShoulderList.load();
  }
}
