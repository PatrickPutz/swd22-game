package at.compus02.swd.ss2022.game.gameobjects;

import at.compus02.swd.ss2022.game.gameobjects.obstacles.ObstacleType;
import at.compus02.swd.ss2022.game.gameobjects.tiles.TileType;
import com.badlogic.gdx.utils.Array;

public class MapFactory {

    private TileFactory tileFactory = new TileFactory();
    private ObstacleFactory obstacleFactory = new ObstacleFactory();

    public void createStartingPointMap(Array<GameObject> gameObjects){
        tileFactory.addTileAreaToGameObjects(gameObjects,
                tileFactory.createTileBackgroundArea(TileType.GRASS, -240, 240, 16,16));
        tileFactory.addTileAreaToGameObjects(gameObjects,
                tileFactory.createTileBackgroundArea(TileType.GRAVEL, 70, 176, 4,4));
        tileFactory.addTileAreaToGameObjects(gameObjects,
                tileFactory.createTileBackgroundArea(TileType.WATER, 102, 144, 2, 2));

        gameObjects.add(obstacleFactory.createObstacle(ObstacleType.SIGN, 140, 80));
        gameObjects.add(obstacleFactory.createObstacle(ObstacleType.LOG, 70, 176));
        gameObjects.add(obstacleFactory.createObstacle(ObstacleType.STONE, 210, -240));
        gameObjects.add(obstacleFactory.createObstacle(ObstacleType.STONE, 210, -208));
        gameObjects.add(obstacleFactory.createObstacle(ObstacleType.STONE, 178, -240));
        gameObjects.add(obstacleFactory.createObstacle(ObstacleType.BUSH, -232, -208));
        gameObjects.add(obstacleFactory.createObstacle(ObstacleType.BUSH, -200, -208));
        gameObjects.add(obstacleFactory.createObstacle(ObstacleType.BUSH, -168, -208));
        gameObjects.add(obstacleFactory.createObstacle(ObstacleType.BUSH, -136, -208));
        gameObjects.add(obstacleFactory.createObstacle(ObstacleType.BUSH, -136, -240));

    }

}
