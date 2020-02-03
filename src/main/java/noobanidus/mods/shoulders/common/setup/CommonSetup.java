package noobanidus.mods.shoulders.common.setup;

import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import noobanidus.mods.shoulders.common.capability.PlayerShoulderCapability;
import noobanidus.mods.shoulders.common.capability.PlayerShoulderCapabilityStorage;

public class CommonSetup {
  public static void init(FMLCommonSetupEvent event) {
    CapabilityManager.INSTANCE.register(PlayerShoulderCapability.class, new PlayerShoulderCapabilityStorage(), PlayerShoulderCapability::new);
  }
}
