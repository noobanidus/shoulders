package noobanidus.mods.shoulders;

import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import noobanidus.mods.shoulders.client.bootstrap.Bootstrap;

@Mod("shoulders")
public class Shoulders {

  public Shoulders() {
    IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

    DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> {
      modBus.addListener(this::onClientSetup);
    });
  }

  @OnlyIn(Dist.CLIENT)
  public void onClientSetup(FMLClientSetupEvent event) {
    Bootstrap.init(Minecraft.getInstance());
  }
}
