package io.xeros.content.commands.owner;


import io.xeros.content.commands.Command;
import io.xeros.model.entity.player.Player;

public class Region extends Command {

    @Override
    public void execute(Player c, String commandName, String input) {

        // TODO Auto-generated method stub
        int regionId = Integer.parseInt(input);
        int x = (regionId >> 8) << 6;
        int y = (regionId & 0xFF) << 6;
        c.getPA().movePlayer(x, y, c.heightLevel);
    }

}
