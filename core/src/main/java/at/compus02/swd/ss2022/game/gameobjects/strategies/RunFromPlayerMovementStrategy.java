package at.compus02.swd.ss2022.game.gameobjects.strategies;

import at.compus02.swd.ss2022.game.gameobjects.livingbeings.LivingBeing;
import at.compus02.swd.ss2022.game.gameobjects.livingbeings.Player;

public class RunFromPlayerMovementStrategy implements MovementStrategy{

    private Player player;
    private int triggerRange;

    public RunFromPlayerMovementStrategy(Player player) {
        this.player = player;
        this.triggerRange = 120;
    }

    public void setTriggerRange(int triggerRange) {
        this.triggerRange = triggerRange;
    }

    @Override
    public void startMovementStrategy(LivingBeing livingBeing) {
        if(inXRange(livingBeing)
                && inYRange(livingBeing)){
            if(playerIsLeft(livingBeing)){
                while(livingBeing.getPositionX() < 200.0){
                    livingBeing.moveRight();
                }
            }
            if(playerIsRight(livingBeing)){
                while(livingBeing.getPositionX() > -200.0){
                    livingBeing.moveLeft();
                }
            }
            if(playerIsAbove(livingBeing)){
                while(livingBeing.getPositionY() > -200.0){
                    livingBeing.moveDown();
                }
            }
            if(playerIsBelow(livingBeing)){
                while(livingBeing.getPositionY() < 200.0){
                    livingBeing.moveUp();
                }
            }
        }
    }


    private boolean playerIsLeft(LivingBeing livingBeing){
        return player.getPositionX() < livingBeing.getPositionX();
    }

    private boolean playerIsRight(LivingBeing livingBeing){
        return player.getPositionX() > livingBeing.getPositionX();
    }

    private boolean playerIsBelow(LivingBeing livingBeing){
        return player.getPositionY() < livingBeing.getPositionY();
    }

    private boolean playerIsAbove(LivingBeing livingBeing){
        return player.getPositionY() > livingBeing.getPositionY();
    }

    private boolean inXRange (LivingBeing livingBeing){
        if((player.getPositionX() < livingBeing.getPositionX()) &&
                (livingBeing.getPositionX() - player.getPositionX()) <= triggerRange)
            return true;
        else if((player.getPositionX() > livingBeing.getPositionX()) &&
                (player.getPositionX() - livingBeing.getPositionX()) <= triggerRange)
            return true;
        else
            return false;
    }

    private boolean inYRange(LivingBeing livingBeing){
        if((player.getPositionY() < livingBeing.getPositionY()) &&
                (livingBeing.getPositionY() - player.getPositionY()) <= triggerRange)
            return true;
        else if((player.getPositionY() > livingBeing.getPositionY()) &&
                (player.getPositionY() - livingBeing.getPositionY()) <= triggerRange)
            return true;
        else
            return false;
    }

}
