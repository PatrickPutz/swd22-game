package at.compus02.swd.ss2022.game.gameobjects.livingbeings;

import at.compus02.swd.ss2022.game.gameobjects.AssetRepository;
import at.compus02.swd.ss2022.game.gameobjects.AssetType;

public class EnemyGuard extends LivingBeing {

    public EnemyGuard() {
        super(AssetRepository.assets.get(AssetType.ENEMY), 2);
    }

    @Override
    public void act(float delta) {

    }
}
