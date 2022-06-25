package at.compus02.swd.ss2022.game.gameobjects.livingbeings;

import at.compus02.swd.ss2022.game.gameobjects.AssetRepository;
import at.compus02.swd.ss2022.game.input.GameInput;

public class Enemy extends LivingBeing {

    private GameInput input;

    public Enemy() {
        super(AssetRepository.getEnemy(), 1);
        input = new GameInput();
    }

    @Override
    public void act(float delta) {
        input.moveEnemy(this);
    }
}
