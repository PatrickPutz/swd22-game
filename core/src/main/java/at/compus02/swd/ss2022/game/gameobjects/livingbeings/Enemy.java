package at.compus02.swd.ss2022.game.gameobjects.livingbeings;

import at.compus02.swd.ss2022.game.gameobjects.AssetRepository;
import at.compus02.swd.ss2022.game.input.GameInput;

public class Enemy extends LivingBeing {

    private GameInput input;
    private int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Enemy() {
        super(AssetRepository.getStone());
        input = new GameInput();
        health = 100;
    }

    @Override
    public void act(float delta) {
        input.moveEnemy(this);
    }
}
