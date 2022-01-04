package noobanidus.mods.shoulders.setup;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import noobanidus.mods.shoulders.client.bootstrap.Bootstrap;

public class ClientSetup {
  public static void onClientSetup(FMLClientSetupEvent event) {
    Bootstrap.init(Minecraft.getInstance());
  }
}
