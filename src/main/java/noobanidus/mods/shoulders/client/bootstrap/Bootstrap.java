package noobanidus.mods.shoulders.client.bootstrap;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.client.renderer.entity.PlayerRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import noobanidus.mods.shoulders.Constants;
import noobanidus.mods.shoulders.client.layers.NoobanidusShoulderLayer;
import noobanidus.mods.shoulders.data.ShoulderList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

public class Bootstrap {
  public static MethodHandle getLayerRenderers;

  static {
    MethodType.methodType(List.class);
    MethodHandles.Lookup lookup = MethodHandles.lookup();
    Field layerRenderers = ObfuscationReflectionHelper.findField(LivingRenderer.class, "field_177097_h");
    layerRenderers.setAccessible(true);
    try {
      getLayerRenderers = lookup.unreflectGetter(layerRenderers);
    } catch (IllegalAccessException e) {
      Constants.LOG.error("Unable to unreflect getLayerRenderers", e);
    }
  }

  @SuppressWarnings("unchecked")
  public static void init(Minecraft mc) {
    boolean found = false;

    Map<String, PlayerRenderer> skinMap = mc.getEntityRenderDispatcher().getSkinMap();

    for (PlayerRenderer renderer : skinMap.values()) {
      try {
        for (LayerRenderer<?, ?> render : (List<LayerRenderer<?, ?>>) getLayerRenderers.invokeExact((LivingRenderer<?, ?>)renderer)) {
          if (render.getClass().toString().endsWith("NoobanidusShoulderLayer")) {
            found = true;
            break;
          }
        }
      } catch (Throwable e) {
        Constants.LOG.error("Unable to iterate skinValues", e);
      }
    }

    if (found) {
      return;
    }

    ShoulderList.load();
    skinMap.values().forEach(o -> o.addLayer(new NoobanidusShoulderLayer<>(o)));
  }
}
