package at.compus02.swd.ss2022.game.gameobjects.livingbeings;

import at.compus02.swd.ss2022.game.gameobjects.AssetRepository;
import at.compus02.swd.ss2022.game.gameobjects.AssetType;
import at.compus02.swd.ss2022.game.gameobjects.commands.*;
import at.compus02.swd.ss2022.game.gameobjects.observer.GameObserver;
import at.compus02.swd.ss2022.game.gameobjects.observer.ObservableType;
import at.compus02.swd.ss2022.game.input.GameInput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Player extends LivingBeing{

    private HashMap<MoveType, Command> moveCommands;
    private List<GameObserver> observers = new ArrayList<GameObserver>();

    public Player() {
        super(AssetRepository.assets.get(AssetType.PLAYER), 3);
        this.moveCommands = new HashMap<>();
        moveCommands.put(MoveType.MOVEUP, new MoveUpCommand(this));
        moveCommands.put(MoveType.MOVEDOWN, new MoveDownCommand(this));
        moveCommands.put(MoveType.MOVELEFT, new MoveLeftCommand(this));
        moveCommands.put(MoveType.MOVERIGHT, new MoveRightCommand(this));
    }

    public void attach(GameObserver observer){
        observers.add(observer);
    }

    @Override
    public void act(float delta) {

    }

    public HashMap<MoveType, Command> getMoveCommands() {
        return moveCommands;
    }

    private void notifyAllObservers(ObservableType observableType){
        for (GameObserver observer : observers) {
            observer.update(observableType);
        }
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
        notifyAllObservers(ObservableType.PLAYERMOVEDLEFT);
    }

    @Override
    public void moveRight() {
        super.moveRight();
        notifyAllObservers(ObservableType.PLAYERMOVEDRIGHT);
    }

    @Override
    public void moveUp() {
        super.moveUp();
        notifyAllObservers(ObservableType.PLAYERMOVEDUP);
    }

    @Override
    public void moveDown() {
        super.moveDown();
        notifyAllObservers(ObservableType.PLAYERMOVEDDOWN);
    }
}
