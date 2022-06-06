package at.compus02.swd.ss2022.game.gameobjects.livingbeings;

import at.compus02.swd.ss2022.game.input.GameInput;

public class Player extends LivingBeing{

    private GameInput input;

    public Player() {
        super("log.png");
        input = new GameInput();
    }

    @Override
    public void act(float delta) {
        input.movePlayer(this);
    }
}
