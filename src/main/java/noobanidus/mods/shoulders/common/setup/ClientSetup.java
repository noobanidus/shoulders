package noobanidus.mods.shoulders.common.setup;

import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import noobanidus.mods.shoulders.client.layers.ShoulderLayer;

@OnlyIn(Dist.CLIENT)
public class ClientSetup {
  public static void init(FMLClientSetupEvent event) {
    Minecraft.getInstance().getRenderManager().getSkinMap().values().forEach(o -> o.addLayer(new ShoulderLayer<>(o)));
  }
}
