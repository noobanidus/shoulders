package noobanidus.mods.shoulders.common.bootstrap;

import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.client.renderer.entity.PlayerRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import noobanidus.mods.shoulders.client.layers.NoobanidusShoulderLayer;
import noobanidus.mods.shoulders.common.data.ShoulderList;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;

@OnlyIn(Dist.CLIENT)
public class Bootstrap {
  @SuppressWarnings("unchecked")
  public static void init(Collection<?> map) {
    boolean found = false;

    for (Object renderer : map) {
      List<LayerRenderer> theseRenderers = ObfuscationReflectionHelper.getPrivateValue(LivingRenderer.class, (PlayerRenderer)renderer, "field_177097_h");
      if (theseRenderers == null) {
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

    ShoulderList.load();
    map.forEach(o -> ((PlayerRenderer) o).addLayer(new NoobanidusShoulderLayer<>((PlayerRenderer) o)));
  }
}
