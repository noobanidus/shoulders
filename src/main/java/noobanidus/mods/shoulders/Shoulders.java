package noobanidus.mods.shoulders;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import noobanidus.mods.shoulders.common.config.ConfigManager;
import noobanidus.mods.shoulders.common.data.ShoulderList;
import noobanidus.mods.shoulders.common.info.ShoulderData;
import noobanidus.mods.shoulders.common.setup.ClientSetup;
import noobanidus.mods.shoulders.common.setup.CommonSetup;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("shoulders")
public class Shoulders {
  public static final Logger LOG = LogManager.getLogger();
  public static final String MODID = "shoulders";

  public Shoulders() {
    ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, ConfigManager.CLIENT_CONFIG);
    ConfigManager.loadConfig(ConfigManager.CLIENT_CONFIG, FMLPaths.CONFIGDIR.get().resolve(Shoulders.MODID + "-client.toml"));
    IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
    modBus.addListener(CommonSetup::init);

    DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> {
      modBus.addListener(ClientSetup::init);
    });

    MinecraftForge.EVENT_BUS.addListener(Shoulders::playerLoggedOn);
  }

  public static void playerLoggedOn(PlayerEvent.PlayerLoggedInEvent event) {
    PlayerEntity player = event.getPlayer();
    ShoulderData data = ShoulderList.getData(player);
    if (data != null) {
      Shoulders.LOG.info("Patreon Player " + player.getScoreboardName() + " with UUID: " + player.getCachedUniqueIdString() + " just logged in!!!!!!!");
    }
  }
}
