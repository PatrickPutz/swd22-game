package at.compus02.swd.ss2022.game.gameobjects.commands;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;

public class MoveRightCommand implements MoveCommand {

    private GameObject player;

    public MoveRightCommand(GameObject player) {
        this.player = player;
    }

    @Override
    public void execute() {
        this.player.moveRight(1);
    }
}
