package at.compus02.swd.ss2022.game.gameobjects.strategies;

import at.compus02.swd.ss2022.game.gameobjects.livingbeings.LivingBeing;
import at.compus02.swd.ss2022.game.gameobjects.livingbeings.Player;

public class RunToPlayerMovementStrategy implements MovementStrategy{

    private Player player;

    public RunToPlayerMovementStrategy(Player player) {
        this.player = player;
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
            if((livingBeing.getPositionX() - player.getPositionX()) <= 32){
                while(livingBeing.getPositionX() > (player.getPositionX() + 2)){
                    livingBeing.moveLeft();
                }
            }
        }
    }
    private void moveRightToPlayer(LivingBeing livingBeing){
        if(player.getPositionX() > livingBeing.getPositionX()){
            if((player.getPositionX() - livingBeing.getPositionX()) <= 32){
                while(livingBeing.getPositionX() < (player.getPositionX() - 2)){
                    livingBeing.moveRight();
                }
            }
        }
    }
    private void moveUpToPlayer(LivingBeing livingBeing){
        if(player.getPositionY() > livingBeing.getPositionY()){
            if((player.getPositionY() - livingBeing.getPositionY()) <= 32){
                while(livingBeing.getPositionY() < (player.getPositionY() - 2)){
                    livingBeing.moveUp();
                }
            }
        }
    }
    private void moveDownToPlayer(LivingBeing livingBeing){
        if(player.getPositionY() < livingBeing.getPositionY()){
            if((livingBeing.getPositionY() - player.getPositionY()) <= 32){
                while(livingBeing.getPositionY() < (player.getPositionY() + 2)){
                    livingBeing.moveDown();
                }
            }
        }
    }
}
