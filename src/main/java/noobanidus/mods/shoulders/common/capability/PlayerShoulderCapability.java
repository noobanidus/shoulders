package noobanidus.mods.shoulders.common.capability;

import net.minecraft.nbt.CompoundNBT;
import noobanidus.mods.shoulders.common.info.Shoulder;
import noobanidus.mods.shoulders.common.info.ShoulderData;

public class PlayerShoulderCapability {
  private ShoulderData data;

  public PlayerShoulderCapability() {
  }

  public ShoulderData getData() {
    return data;
  }

  public void setData(ShoulderData data) {
    this.data = data;
  }

  public boolean hasShouldered() {
    return data == null;
  }

  public CompoundNBT writeNBT() {
    CompoundNBT result = new CompoundNBT();
    result.put("data", data.serializeNBT());
    return result;
  }

  public void readNBT(CompoundNBT incoming) {
    CompoundNBT tag = incoming;
    this.data = ShoulderData.fromNBT(incoming.getCompound("data"));
  }
}
