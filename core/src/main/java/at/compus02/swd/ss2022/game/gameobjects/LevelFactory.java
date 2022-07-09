package at.compus02.swd.ss2022.game.gameobjects;

import at.compus02.swd.ss2022.game.gameobjects.livingbeings.*;
import at.compus02.swd.ss2022.game.gameobjects.strategies.MovementStrategy;
import at.compus02.swd.ss2022.game.gameobjects.strategies.RunFromPlayerMovementStrategy;
import at.compus02.swd.ss2022.game.gameobjects.strategies.RunToPlayerMovementStrategy;
import com.badlogic.gdx.utils.Array;

import java.util.ArrayList;
import java.util.HashMap;


public class LevelFactory {

    private MapFactory mapFactory = new MapFactory();
    private LivingBeingFactory livingBeingFactory = new LivingBeingFactory();

    private Player player;
    private RunToPlayerMovementStrategy runToPlayer;
    private RunFromPlayerMovementStrategy runFromPlayer;

    private HashMap<LivingBeing, MovementStrategy> movementStrategies;

    public LevelFactory(Player player) {
        this.player = player;
        movementStrategies = new HashMap<>();
        runToPlayer = new RunToPlayerMovementStrategy(player);
        runFromPlayer = new RunFromPlayerMovementStrategy(player);
    }

    public void createLevelOne(Array<GameObject> gameObjects){
        mapFactory.createStartingPointMap(gameObjects);

        EnemyGuard enemyGuard = (EnemyGuard) livingBeingFactory.createLivingBeing(LivingBeingType.ENEMY_GUARD, -160, -160);
        gameObjects.add(enemyGuard);
        EnemySoldier enemySoldier = (EnemySoldier) livingBeingFactory.createLivingBeing(LivingBeingType.ENEMY_SOLDIER, 160, 160);
        gameObjects.add(enemySoldier);

        movementStrategies.put(enemyGuard, runToPlayer);
        movementStrategies.put(enemySoldier, runFromPlayer);
    }

    public void startMovementStrategies(){
        for (LivingBeing livingBeing : movementStrategies.keySet()) {
            movementStrategies.get(livingBeing).startMovementStrategy(livingBeing);
        }
    }
}
