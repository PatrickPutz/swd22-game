package at.compus02.swd.ss2022.game.gameobjects;

import at.compus02.swd.ss2022.game.gameobjects.obstacles.*;

public class ObstacleFactory {

    private Obstacle getObstacleType(ObstacleType obstacleType){
        switch (obstacleType) {
            case BUSH:
                return new ObstacleBush();
            case LOG:
                return new ObstacleLog();
            case SIGN:
                return new ObstacleSign();
            case STONE:
                return new ObstacleStone();
            default:
                return null;
        }
    }

    public Obstacle createObstacle(ObstacleType obstacleType, int positionX, int positionY){
        Obstacle obstacle = getObstacleType(obstacleType);
        obstacle.setPosition(positionX, positionY);
        return obstacle;
    }

}
