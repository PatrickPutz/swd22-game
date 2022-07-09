package at.compus02.swd.ss2022.game.gameobjects;

import at.compus02.swd.ss2022.game.gameobjects.livingbeings.EnemyGuard;
import at.compus02.swd.ss2022.game.gameobjects.livingbeings.EnemySoldier;
import at.compus02.swd.ss2022.game.gameobjects.livingbeings.LivingBeingType;
import com.badlogic.gdx.utils.Array;


public class LevelFactory {

    private MapFactory mapFactory = new MapFactory();
    private LivingBeingFactory livingBeingFactory = new LivingBeingFactory();

    public void createLevelOne(Array<GameObject> gameObjects){
        mapFactory.createStartingPointMap(gameObjects);
        gameObjects.add(livingBeingFactory.createLivingBeing(LivingBeingType.ENEMY_GUARD, -160, -160));
        gameObjects.add(livingBeingFactory.createLivingBeing(LivingBeingType.ENEMY_SOLDIER, 160, 160));
    }

}
