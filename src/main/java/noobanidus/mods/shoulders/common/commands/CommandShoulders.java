package noobanidus.mods.shoulders.common.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import noobanidus.mods.shoulders.common.data.ShoulderList;

public class CommandShoulders {
  private final CommandDispatcher<CommandSource> dispatcher;

  public CommandShoulders(CommandDispatcher<CommandSource> dispatcher) {
    this.dispatcher = dispatcher;
  }

  public CommandShoulders register() {
    this.dispatcher.register(builder(Commands.literal("shoulders")));
    return this;
  }

  public LiteralArgumentBuilder<CommandSource> builder(LiteralArgumentBuilder<CommandSource> builder) {
    builder.executes(c -> {
      c.getSource().sendFeedback(new StringTextComponent("Usage: /shoulders reload"), false);
      return 1;
    });
    builder.then(Commands.literal("reload").executes(c -> {
      if (ShoulderList.load()) {
        c.getSource().sendFeedback(new TranslationTextComponent("command.shoulders.reload.success"), true);
      } else {
        c.getSource().sendFeedback(new TranslationTextComponent("command.shoulders.reload.failure"), true);
      }
      return 1;
    }));
    return builder;
  }
}
