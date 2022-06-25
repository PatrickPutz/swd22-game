package at.compus02.swd.ss2022.game.gameobjects.livingbeings;

import at.compus02.swd.ss2022.game.gameobjects.AssetRepository;
import at.compus02.swd.ss2022.game.gameobjects.AssetType;
import at.compus02.swd.ss2022.game.input.GameInput;

public class Player extends LivingBeing{

    private GameInput input;

    public Player() {
        super(AssetRepository.assets.get(AssetType.PLAYER), 3);
        input = new GameInput();
    }

    @Override
    public void act(float delta) {
        input.movePlayer(this);
    }
}
