package noobanidus.libs.shoulders.setup;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import noobanidus.libs.shoulders.client.bootstrap.Bootstrap;
import noobanidus.libs.shoulders.gen.GenerateInfo;

public class ClientSetup {
  public static void onClientSetup(FMLClientSetupEvent event) {
    Bootstrap.init(Minecraft.getInstance());
    GenerateInfo.run();
  }
}
