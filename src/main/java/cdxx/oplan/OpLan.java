package cdxx.oplan;

import cdxx.oplan.commands.DeOpLanCommand;
import cdxx.oplan.commands.OpLanCommand;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class OpLan implements ModInitializer {
    @Override
    public void onInitialize() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) ->
        {
            OpLanCommand.register(dispatcher);
            DeOpLanCommand.register(dispatcher);
        });
    }
}