package noobanidus.libs.shoulders.data;

import com.google.gson.*;
import net.minecraft.entity.player.PlayerEntity;
import noobanidus.libs.shoulders.Constants;
import noobanidus.libs.shoulders.info.ShoulderData;
import org.apache.commons.io.IOUtils;

import javax.annotation.Nullable;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ShoulderList {
  private static final Map<UUID, ShoulderData> dataMap = Collections.synchronizedMap(new HashMap<>());
  private static final Gson GSON = (new GsonBuilder()).setPrettyPrinting().create();

  public static void load() {
    synchronized (dataMap) {
      dataMap.clear();

      JsonArray data;
      try {
        Constants.LOG.info("Fetching Patreon supporter information from GitHub...");
        final String response = IOUtils.toString(new URL(Constants.shoulderUrl), StandardCharsets.UTF_8);

        data = GSON.fromJson(response, JsonArray.class);
      } catch (IOException e) {
        Constants.LOG.error("Unable to load Patreon information!");
        return;
      }

      for (JsonElement element : data) {
        JsonObject object = element.getAsJsonObject();
        ShoulderData entry = ShoulderData.fromJson(object);
        dataMap.put(entry.getPlayer(), entry);
      }
    }
  }

  @Nullable
  public static ShoulderData getData(PlayerEntity player) {
    synchronized (dataMap) {
      return dataMap.get(player.getUUID());
    }
  }
}
