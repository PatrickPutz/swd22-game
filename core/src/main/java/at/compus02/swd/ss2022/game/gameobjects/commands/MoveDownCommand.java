package at.compus02.swd.ss2022.game.gameobjects.commands;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;

public class MoveDownCommand implements MoveCommand {
    private GameObject player;

    public MoveDownCommand(GameObject player) {
        this.player = player;
    }

    @Override
    public void execute() {
        this.player.moveDown(1);
    }
}
