package noobanidus.mods.shoulders.client.bootstrap;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.PlayerRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import noobanidus.mods.shoulders.client.layers.NoobanidusShoulderLayer;
import noobanidus.mods.shoulders.data.ShoulderList;

import java.util.Map;

@OnlyIn(Dist.CLIENT)
public class Bootstrap {
  @SuppressWarnings("unchecked")
  public static void init(Minecraft mc) {
    boolean found = false;

    Map<String, PlayerRenderer> skinMap = mc.getRenderManager().getSkinMap();

    for (PlayerRenderer renderer : skinMap.values()) {
      for (LayerRenderer<?, ?> render : renderer.layerRenderers) {
        if (render.getClass().toString().endsWith("NoobanidusShoulderLayer")) {
          found = true;
          break;
        }
      }
    }

    if (found) {
      return;
    }

    ShoulderList.load();
    skinMap.values().forEach(o -> o.addLayer(new NoobanidusShoulderLayer<>(o)));
  }
}
