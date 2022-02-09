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

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class GenerateInfo /*implements IDataProvider*/ {
  private static final Gson GSON = (new GsonBuilder()).setPrettyPrinting().create();
  private final DataGenerator generator;

  public GenerateInfo(DataGenerator generatorIn) {
    this.generator = generatorIn;
  }

  public static void run(/*DirectoryCache cache*/) {
    List<ShoulderData> patreonData = Arrays.asList(
        new ShoulderData(UUID.fromString("a1c40d68-8734-4e16-9716-69c63bea6f15"), ShoulderEntity.SILVER_FOX, Shoulder.LEFT, 1), // Gchpaco
        new ShoulderData(UUID.fromString("d1534e8e-00f1-426f-8173-46b1e65e7e4f"), ShoulderEntity.OWL, Shoulder.RIGHT, 0), // Spammywammy
        new ShoulderData(UUID.fromString("083c3cd5-9c94-40c7-a166-5692e4dc4b2c"), ShoulderEntity.DUCK, Shoulder.LEFT, 0), // kashcah
        new ShoulderData(UUID.fromString("ec0fa42d-252e-495f-823c-cf4c50df80b3"), ShoulderEntity.FROG, Shoulder.LEFT, 1), // SeriousCreeper
        new ShoulderData(UUID.fromString("cb64826c-ffa1-4f83-a34e-8399546598a4"), ShoulderEntity.RABBIT, Shoulder.RIGHT, 4) // SirDizarm
    );

    JsonArray dataArray = new JsonArray();
    patreonData.forEach(o -> dataArray.add(o.toJson()));

    String data = GSON.toJson(dataArray);
    Path path = Paths.get("shoulders.json");
    try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
      writer.write(data);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

/*  private static Path getPath(Path pathIn) {
    return pathIn.resolve("data/info/shoulders.json");
  }*/

/*  @Override
  public String getName() {
    return "Patreon info";
  }*/
}
