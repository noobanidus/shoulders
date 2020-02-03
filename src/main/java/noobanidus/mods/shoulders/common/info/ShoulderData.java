package noobanidus.mods.shoulders.common.info;

import com.google.gson.JsonObject;
import net.minecraft.nbt.CompoundNBT;
import net.minecraftforge.common.util.INBTSerializable;

import java.util.UUID;

public class ShoulderData implements INBTSerializable<CompoundNBT> {
  private UUID player;
  private ShoulderEntity entity;
  private Shoulder shoulder;
  private int variant;

  public ShoulderData(UUID player, ShoulderEntity entity, Shoulder shoulder, int variant) {
    this.player = player;
    this.entity = entity;
    this.shoulder = shoulder;
    this.variant = variant;
  }

  private ShoulderData () {
  }

  public ShoulderEntity getEntity() {
    return entity;
  }

  public Shoulder getShoulder() {
    return shoulder;
  }

  public int getVariant() {
    return variant;
  }

  public JsonObject toJson () {
    JsonObject result = new JsonObject();
    result.addProperty("player", player.toString());
    result.addProperty("entity", entity.getName());
    result.addProperty("shoulder", shoulder.getName());
    result.addProperty("variant", variant);
    return result;
  }

  public static ShoulderData fromJson (JsonObject source) {
    ShoulderEntity entity = ShoulderEntity.valueOf(source.get("entity").getAsString());
    Shoulder shoulder = Shoulder.valueOf(source.get("shoulder").getAsString());
    int variant = source.get("variant").getAsInt();
    UUID player = UUID.fromString(source.get("player").getAsString());
    return new ShoulderData(player, entity, shoulder, variant);
  }

  public static ShoulderData fromNBT (CompoundNBT tag) {
    ShoulderData data = new ShoulderData();
    data.deserializeNBT(tag);
    return data;
  }

  @Override
  public CompoundNBT serializeNBT() {
    return null;
  }

  @Override
  public void deserializeNBT(CompoundNBT nbt) {
    this.player = nbt.getUniqueId("player");
    this.shoulder = Shoulder.valueOf(nbt.getString("shoulder"));
    this.entity = ShoulderEntity.valueOf(nbt.getString("entity"));
    this.variant = nbt.getInt("variant");
  }
}
