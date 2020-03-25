package noobanidus.mods.shoulders.gen;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import noobanidus.mods.shoulders.Constants;

@Mod.EventBusSubscriber(modid = Constants.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GenerateData {
  @SubscribeEvent
  public static void onGatherData(GatherDataEvent event) {
    event.getGenerator().addProvider(new GenerateInfo(event.getGenerator()));
  }
}
