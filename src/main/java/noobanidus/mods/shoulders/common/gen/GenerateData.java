package noobanidus.mods.shoulders.common.gen;

import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import noobanidus.mods.shoulders.Shoulders;

@Mod.EventBusSubscriber(modid = Shoulders.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GenerateData {
  @SubscribeEvent
  public static void onGatherData(GatherDataEvent event) {
    event.getGenerator().addProvider(new GenerateInfo(event.getGenerator()));
    event.getGenerator().addProvider(new LanguageProvider(event.getGenerator(), "shoulders", "en_us") {
      @Override
      protected void addTranslations() {
        add("command.shoulders.reload.success", "Successfully reloaded Shoulders information!");
        add("command.shoulders.reload.failure", "An error occurred while reloading Shoulders information. Please see the log for more details.");
      }
    });
  }
}
