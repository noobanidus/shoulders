package noobanidus.libs.shoulders;

import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface Constants {
  Logger LOG = LogManager.getLogger();
  String MODID = "shoulders";
  String shoulderUrl = "https://raw.githubusercontent.com/noobanidus/shoulders/1.16.5/src/generated/resources/data/info/shoulders.json";

  static ResourceLocation rl (String path) {
    return new ResourceLocation(MODID, path);
  }

  static ResourceLocation entityTexture (String path) {
    return rl("textures/entity/" + path + ".png");
  }
}
