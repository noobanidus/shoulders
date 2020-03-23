package noobanidus.mods.shoulders.common.bootstrap;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.client.renderer.entity.PlayerRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import noobanidus.mods.shoulders.client.layers.NoobanidusShoulderLayer;
import noobanidus.mods.shoulders.common.data.ShoulderList;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@OnlyIn(Dist.CLIENT)
public class Bootstrap {
  @SuppressWarnings("unchecked")
  public static void init(Minecraft mc) {
    final Field renderers = ObfuscationReflectionHelper.findField(LivingRenderer.class, "field_177097_h");
    renderers.setAccessible(true);

    final Map<String, PlayerRenderer> skinMap = mc.getRenderManager().getSkinMap();
    boolean found = false;

    for (PlayerRenderer renderer : skinMap.values()) {
      List<LayerRenderer> theseRenderers;
      try {
        theseRenderers = (List<LayerRenderer>) renderers.get(renderer);
      } catch (IllegalAccessException e) {
        continue;
      }

      for (LayerRenderer render : theseRenderers) {
        if (render.getClass().toString().endsWith("NoobanidusShoulderLayer")) {
          found = true;
          break;
        }
      }
    }

    if (found) {
      return;
    }

    DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> {
      loadList();
      loadSkin(skinMap);
    });

  }

  private static void loadList() {
    ShoulderList.load();
  }

  private static void loadSkin(Map<String, PlayerRenderer> skinMap) {
    skinMap.values().forEach(o -> o.addLayer(new NoobanidusShoulderLayer<>(o)));
  }
}
