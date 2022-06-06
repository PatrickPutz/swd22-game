package at.compus02.swd.ss2022.game.gameobjects.obstacles;

import at.compus02.swd.ss2022.game.gameobjects.AssetRepository;

public class ObstacleLog extends Obstacle{
    public ObstacleLog() {
        super(AssetRepository.getLog());
    }
}
