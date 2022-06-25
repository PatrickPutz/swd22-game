package at.compus02.swd.ss2022.game.gameobjects.livingbeings;

import at.compus02.swd.ss2022.game.gameobjects.AssetRepository;
import at.compus02.swd.ss2022.game.gameobjects.AssetType;
import at.compus02.swd.ss2022.game.input.GameInput;

public class Enemy extends LivingBeing {

    private GameInput input;

    public Enemy() {
        super(AssetRepository.assets.get(AssetType.ENEMY), 1);
    }

    @Override
    public void act(float delta) {

    }
}
