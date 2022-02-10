package noobanidus.libs.shoulders.client.bootstrap;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.client.renderer.entity.PlayerRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import noobanidus.libs.shoulders.Constants;
import noobanidus.libs.shoulders.client.layers.NoobanidusShoulderLayer;
import noobanidus.libs.shoulders.data.ShoulderList;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

public class Bootstrap {
  public static MethodHandle getLayerRenderers;

  private static String MODID;

  public static ResourceLocation modTex (String name) {
    return new ResourceLocation(MODID, "textures/entity/" + name + ".png");
  }

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
  public static void init(String modid, Minecraft mc) {
    boolean found = false;
    MODID = modid;

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
