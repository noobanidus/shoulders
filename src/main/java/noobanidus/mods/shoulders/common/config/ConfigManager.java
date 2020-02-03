package noobanidus.mods.shoulders.common.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.nio.file.Path;

public class ConfigManager {
  private static ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();

  public static ForgeConfigSpec CLIENT_CONFIG;
  public static ForgeConfigSpec.BooleanValue DISPLAY_EFFECT;

  static {
    DISPLAY_EFFECT = CLIENT_BUILDER.comment("whether or not patreon shoulder-riding animal rewards should be displayed").define("display_patreon_rewards", true);
    CLIENT_CONFIG = CLIENT_BUILDER.build();
  }

  public static void loadConfig(ForgeConfigSpec spec, Path path) {
    CommentedFileConfig configData = CommentedFileConfig.builder(path).sync().autosave().writingMode(WritingMode.REPLACE).build();
    configData.load();
    spec.setConfig(configData);
  }
}
