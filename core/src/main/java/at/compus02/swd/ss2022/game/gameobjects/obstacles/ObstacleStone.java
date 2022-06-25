package at.compus02.swd.ss2022.game.gameobjects.obstacles;

import at.compus02.swd.ss2022.game.gameobjects.AssetRepository;
import at.compus02.swd.ss2022.game.gameobjects.AssetType;

public class ObstacleStone extends Obstacle{
    public ObstacleStone() {
        super(AssetRepository.assets.get(AssetType.STONE));
    }
}
