package noobanidus.mods.shoulders.client.transforms;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import noobanidus.mods.shoulders.info.Shoulder;
import noobanidus.mods.shoulders.info.ShoulderData;

import java.util.*;

public class ModelTransformer {
  public static final ModelTransformer EMPTY = new ModelTransformer();

  private final Map<Shoulder, List<ITransformer>> translations = new HashMap<>();
  private final Map<Shoulder, List<ITransformer>> rotations = new HashMap<>();
  private final Map<Shoulder, List<ITransformer>> scales = new HashMap<>();

  private Shoulder shoulder;

  protected ModelTransformer() {
  }

  public ModelTransformer translate(ITransformer... translations) {
    this.translations.computeIfAbsent(shoulder, s -> new ArrayList<>()).addAll(Arrays.asList(translations));
    return this;
  }

  public ModelTransformer t(ITransformer... translations) {
    return translate(translations);
  }

  public ModelTransformer rotate(ITransformer... rotations) {
    this.rotations.computeIfAbsent(shoulder, s -> new ArrayList<>()).addAll(Arrays.asList(rotations));
    return this;
  }

  public ModelTransformer r(ITransformer... rotations) {
    return rotate(rotations);
  }

  public ModelTransformer scale(ITransformer... scales) {
    this.scales.computeIfAbsent(shoulder, s -> new ArrayList<>()).addAll(Arrays.asList(scales));
    return this;
  }

  public ModelTransformer s(ITransformer... scales) {
    return scale(scales);
  }

  public void transform(MatrixStack stack, ShoulderData data, PlayerEntity player) {
    translations.getOrDefault(data.getShoulder(), Collections.emptyList()).forEach(t -> t.transform(stack, data, player));
    rotations.getOrDefault(data.getShoulder(), Collections.emptyList()).forEach(r -> r.transform(stack, data, player));
    scales.getOrDefault(data.getShoulder(), Collections.emptyList()).forEach(s -> s.transform(stack, data, player));
  }

  public static ModelTransformer transformer () {
    return new ModelTransformer();
  }

  public ModelTransformer left () {
    this.shoulder = Shoulder.LEFT;
    return this;
  }

  public ModelTransformer right () {
    this.shoulder = Shoulder.RIGHT;
    return this;
  }

  public ModelTransformer head () {
    this.shoulder = Shoulder.HEAD;
    return this;
  }
}
