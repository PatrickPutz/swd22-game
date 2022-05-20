package at.compus02.swd.ss2022.game.gameobjects.commands;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;

public class MoveLeftCommand implements MoveCommand {
    private GameObject player;

    public MoveLeftCommand(GameObject player) {
        this.player = player;
    }

    @Override
    public void execute() {
        this.player.moveLeft(1);
    }
}
