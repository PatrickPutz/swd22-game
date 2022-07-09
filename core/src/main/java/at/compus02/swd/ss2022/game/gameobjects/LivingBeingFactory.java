package at.compus02.swd.ss2022.game.gameobjects;

import at.compus02.swd.ss2022.game.gameobjects.livingbeings.*;

public class LivingBeingFactory {

    private LivingBeing getLivingBeingType(LivingBeingType livingBeingType){
        switch (livingBeingType) {
            case PLAYER:
                return new Player();
            case ENEMY_GUARD:
                return new EnemyGuard();
            case ENEMY_SOLDIER:
                return new EnemySoldier();
            default:
                return null;
        }
    }

    public LivingBeing createLivingBeing(LivingBeingType livingBeingType, int positionX, int positionY){
        LivingBeing livingBeing = getLivingBeingType(livingBeingType);
        livingBeing.setPosition(positionX, positionY);
        return livingBeing;
    }

}
