package at.compus02.swd.ss2022.game.gameobjects.commands;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;

public class MoveUpCommand implements MoveCommand {

    private GameObject player;

    public MoveUpCommand(GameObject player) {
        this.player = player;
    }

    @Override
    public void execute() {
        this.player.moveUp(1);
    }
}
