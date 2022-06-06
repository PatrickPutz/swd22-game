package at.compus02.swd.ss2022.game.gameobjects.obstacles;

import at.compus02.swd.ss2022.game.gameobjects.AssetRepository;

public class ObstacleStone extends Obstacle{
    public ObstacleStone() {
        super(AssetRepository.getStone());
    }
}
