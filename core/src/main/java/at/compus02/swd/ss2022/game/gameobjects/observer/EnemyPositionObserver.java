package at.compus02.swd.ss2022.game.gameobjects.observer;

import at.compus02.swd.ss2022.game.gameobjects.livingbeings.EnemyGuard;
import at.compus02.swd.ss2022.game.gameobjects.livingbeings.EnemySoldier;
import at.compus02.swd.ss2022.game.gameobjects.livingbeings.LivingBeing;

public class EnemyPositionObserver implements PositionObserver{
    private EnemyGuard enemyGuard;
    private EnemySoldier enemySoldier;

    public EnemyPositionObserver(String enemyType, LivingBeing livingBeing) {
        if (enemyType == "GUARD") {
            this.enemyGuard = (EnemyGuard) livingBeing;
            this.enemyGuard.attach(this);
        } else if (enemyType == "SOLDIER") {
            this.enemySoldier = (EnemySoldier) livingBeing;
            //this.enemySoldier.attach(this);
        }
    }

    @Override
    public void update(String enemyType) {
        switch (enemyType){
            case "GUARD":
                System.out.println("Guard moved down - X: " + enemyGuard.getPositionX() + ", Y: " + enemyGuard.getPositionY());
                break;
            case "SOLDIER":
                System.out.println("Soldier moved up - X: " + enemySoldier.getPositionX() + ", Y: " + enemySoldier.getPositionY());
                break;
        }
    }
}
