package noobanidus.libs.shoulders;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import noobanidus.libs.shoulders.setup.ClientInit;

@Mod(Constants.MODID)
public class Shoulders {
  public Shoulders() {
    DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> ClientInit::init);
  }
}
