package noobanidus.mods.shoulders.gen;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DirectoryCache;
import net.minecraft.data.IDataProvider;
import noobanidus.mods.shoulders.info.Shoulder;
import noobanidus.mods.shoulders.info.ShoulderData;
import noobanidus.mods.shoulders.info.ShoulderEntity;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class GenerateInfo implements IDataProvider {
  private static final Gson GSON = (new GsonBuilder()).setPrettyPrinting().create();
  private final DataGenerator generator;

  public GenerateInfo(DataGenerator generatorIn) {
    this.generator = generatorIn;
  }

  @Override
  public void act(DirectoryCache cache) throws IOException {
    Path path = this.generator.getOutputFolder();

    List<ShoulderData> patreonData = Arrays.asList(
        new ShoulderData(UUID.fromString("380df991-f603-344c-a090-369bad2a924a"), ShoulderEntity.RABBIT, Shoulder.RIGHT, 0) // Dev
    );

    JsonArray dataArray = new JsonArray();
    patreonData.forEach(o -> dataArray.add(o.toJson()));

    IDataProvider.save(GSON, cache, dataArray, getPath(path));
  }

  private static Path getPath(Path pathIn) {
    return pathIn.resolve("data/info/shoulders.json");
  }

  @Override
  public String getName() {
    return "Patreon info";
  }
}
