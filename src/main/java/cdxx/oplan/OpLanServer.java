package cdxx.oplan;

import cdxx.oplan.commands.DeOpLanCommand;
import cdxx.oplan.commands.OpLanCommand;
import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

@Environment(EnvType.SERVER)
public class OpLanServer implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {

        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) ->
        {
            OpLanCommand.register(dispatcher);
            DeOpLanCommand.register(dispatcher);
        });
    }

}
