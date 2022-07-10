package at.compus02.swd.ss2022.game.gameobjects.livingbeings;

import at.compus02.swd.ss2022.game.gameobjects.AssetRepository;
import at.compus02.swd.ss2022.game.gameobjects.AssetType;
import at.compus02.swd.ss2022.game.gameobjects.observer.EnemyPositionObserver;
import at.compus02.swd.ss2022.game.gameobjects.observer.PositionObserver;
import at.compus02.swd.ss2022.game.input.GameInput;

import java.util.ArrayList;
import java.util.List;

public class EnemySoldier extends LivingBeing {

    private List<PositionObserver> observers = new ArrayList<>();

    public EnemySoldier() {
        super(AssetRepository.assets.get(AssetType.ENEMY), 1);
    }

    @Override
    public void act(float delta) {

    }

    public void attach(EnemyPositionObserver observer){
        observers.add(observer);
    }

    private void notifyAllObservers(){
        for (PositionObserver positionObserver : observers) {
            positionObserver.update("SOLDIER");
        }
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
        notifyAllObservers();
    }

    @Override
    public void moveRight() {
        super.moveRight();
        notifyAllObservers();
    }

    @Override
    public void moveUp() {
        super.moveUp();
        notifyAllObservers();
    }

    @Override
    public void moveDown() {
        super.moveDown();
        notifyAllObservers();
    }
}
