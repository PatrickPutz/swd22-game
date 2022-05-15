package at.compus02.swd.ss2022.game.gameobjects;

import at.compus02.swd.ss2022.game.gameobjects.livingbeings.LivingBeing;
import at.compus02.swd.ss2022.game.gameobjects.livingbeings.LivingBeingType;
import at.compus02.swd.ss2022.game.gameobjects.livingbeings.Player;
import at.compus02.swd.ss2022.game.gameobjects.obstacles.*;

public class LivingBeingFactory {

    private LivingBeing getLivingBeingType(LivingBeingType livingBeingType){
        switch (livingBeingType) {
            case PLAYER:
                return new Player();
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
