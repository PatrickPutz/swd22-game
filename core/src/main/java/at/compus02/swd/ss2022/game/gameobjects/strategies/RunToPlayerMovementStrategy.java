package at.compus02.swd.ss2022.game.gameobjects.strategies;

import at.compus02.swd.ss2022.game.gameobjects.livingbeings.LivingBeing;
import at.compus02.swd.ss2022.game.gameobjects.livingbeings.Player;

public class RunToPlayerMovementStrategy implements MovementStrategy{

    private Player player;
    private int triggerRange;

    public RunToPlayerMovementStrategy(Player player) {
        this.player = player;
        this.triggerRange = 64;
    }

    public void setTriggerRange(int triggerRange) {
        this.triggerRange = triggerRange;
    }

    @Override
    public void startMovementStrategy(LivingBeing livingBeing) {
        moveLeftToPlayer(livingBeing);
        moveRightToPlayer(livingBeing);
        moveUpToPlayer(livingBeing);
        moveDownToPlayer(livingBeing);
    }

    private void moveLeftToPlayer(LivingBeing livingBeing){
        if(player.getPositionX() < livingBeing.getPositionX()){
            if((livingBeing.getPositionX() - player.getPositionX()) <= triggerRange){
                while(livingBeing.getPositionX() > (player.getPositionX() + 12)
                    && inXRange(livingBeing)
                    && inYRange(livingBeing)){
                    livingBeing.moveLeft();
                }
            }
        }
    }
    private void moveRightToPlayer(LivingBeing livingBeing){
        if(player.getPositionX() > livingBeing.getPositionX()){
            if((player.getPositionX() - livingBeing.getPositionX()) <= triggerRange){
                while(livingBeing.getPositionX() < (player.getPositionX() - 12)
                        && inXRange(livingBeing)
                        && inYRange(livingBeing)){
                    livingBeing.moveRight();
                }
            }
        }
    }
    private void moveUpToPlayer(LivingBeing livingBeing){
        if(player.getPositionY() > livingBeing.getPositionY()){
            if((player.getPositionY() - livingBeing.getPositionY()) <= triggerRange){
                while(livingBeing.getPositionY() < (player.getPositionY() - 12)
                        && inXRange(livingBeing)
                        && inYRange(livingBeing)){
                    livingBeing.moveUp();
                }
            }
        }
    }
    private void moveDownToPlayer(LivingBeing livingBeing){
        if(player.getPositionY() < livingBeing.getPositionY()){
            if((livingBeing.getPositionY() - player.getPositionY()) <= triggerRange){
                while(livingBeing.getPositionY() > (player.getPositionY() + 12)
                        && inXRange(livingBeing)
                        && inYRange(livingBeing)){
                    livingBeing.moveDown();
                }
            }
        }
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
