package noobanidus.libs.shoulders.gen;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import net.minecraft.data.DataGenerator;
import noobanidus.libs.shoulders.info.Shoulder;
import noobanidus.libs.shoulders.info.ShoulderData;
import noobanidus.libs.shoulders.info.ShoulderEntity;

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
        new ShoulderData(UUID.fromString("9902e63b-d02d-4689-8c5c-9653f45cc268"), ShoulderEntity.PANDA, Shoulder.RIGHT, 0), // nooblybear
        new ShoulderData(UUID.fromString("a1c40d68-8734-4e16-9716-69c63bea6f15"), ShoulderEntity.SILVER_FOX, Shoulder.LEFT, 1), // Gchpaco
        new ShoulderData(UUID.fromString("d1534e8e-00f1-426f-8173-46b1e65e7e4f"), ShoulderEntity.OWL, Shoulder.RIGHT, 0), // Spammywammy
        new ShoulderData(UUID.fromString("083c3cd5-9c94-40c7-a166-5692e4dc4b2c"), ShoulderEntity.DUCK, Shoulder.LEFT, 0), // kashcah
        new ShoulderData(UUID.fromString("ec0fa42d-252e-495f-823c-cf4c50df80b3"), ShoulderEntity.FROG, Shoulder.LEFT, 1), // SeriousCreeper
        new ShoulderData(UUID.fromString("cb64826c-ffa1-4f83-a34e-8399546598a4"), ShoulderEntity.RABBIT, Shoulder.RIGHT, 4), // SirDizarm
        new ShoulderData(UUID.fromString("4154b07d-76ef-41c9-967b-da1770e0b480"), ShoulderEntity.OCELOT, Shoulder.LEFT, 1), // Lenyeto
        new ShoulderData(UUID.fromString("4eb20d4f-987c-473d-8f34-878f1c9fe321"), ShoulderEntity.OCELOT, Shoulder.LEFT, 2), // mickelus
        new ShoulderData(UUID.fromString("dce1900d-0761-4471-9a09-48b575c03457"), ShoulderEntity.OCELOT, Shoulder.RIGHT, 11), // febilian
        new ShoulderData(UUID.fromString("e5e2b89d-3884-4190-8b69-97863eb95bc6"), ShoulderEntity.FROG, Shoulder.LEFT, 0), // katubug
        new ShoulderData(UUID.fromString("e3298bd7-61bf-427f-af89-4e418a20bf57"), ShoulderEntity.FOX, Shoulder.RIGHT, 1), // ChosenArchitect
new ShoulderData(UUID.fromString("59199808-a261-42dc-aff9-6df568615020"), ShoulderEntity.SPROUT, Shoulder.RIGHT, 0), // CosmicParticle
/*        new ShoulderData(UUID.fromString("564267c7-2ad2-4059-866a-6ca980b32777"), ShoulderEntity.JERBOA, Shoulder.RIGHT, 3) // VallenFrostweavr*/
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
