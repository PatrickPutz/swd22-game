package at.compus02.swd.ss2022.game.gameobjects.obstacles;

import at.compus02.swd.ss2022.game.gameobjects.AssetRepository;

public class ObstacleSign extends Obstacle{
    public ObstacleSign() {
        super(AssetRepository.getSign());
    }
}
