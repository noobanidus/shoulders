package noobanidus.mods.shoulders.common.data;

import com.google.gson.*;
import net.minecraft.entity.player.PlayerEntity;
import noobanidus.mods.shoulders.Shoulders;
import noobanidus.mods.shoulders.common.info.Shoulder;
import noobanidus.mods.shoulders.common.info.ShoulderData;
import noobanidus.mods.shoulders.common.info.ShoulderEntity;
import org.apache.commons.io.IOUtils;

import javax.annotation.Nullable;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ShoulderList {
  private static Map<UUID, ShoulderData> dataMap = new HashMap<>();
  private static String shoulderUrl = "https://raw.githubusercontent.com/noobanidus/shoulders/1.14/src/generated/resources/data/info/shoulders.json";
  private static final Gson GSON = (new GsonBuilder()).setPrettyPrinting().create();

  public static void load () {
    dataMap.clear();

    JsonArray data = null;
    try {
      Shoulders.LOG.info("Fetching Patreon supporter information from GitHub...");
      final String response = IOUtils.toString(new URL(shoulderUrl), StandardCharsets.UTF_8);

      data = GSON.fromJson(response, JsonArray.class);
    } catch (IOException e) {
      Shoulders.LOG.error("Unable to load Patreon information!");
      return;
    }

    for (JsonElement element : data) {
      JsonObject object = element.getAsJsonObject();
      ShoulderData entry = ShoulderData.fromJson(object);
      dataMap.put(entry.getPlayer(), entry);
    }
  }

  @Nullable
  public static ShoulderData getData (PlayerEntity player) {
    return dataMap.get(player.getUniqueID());
  }
}
