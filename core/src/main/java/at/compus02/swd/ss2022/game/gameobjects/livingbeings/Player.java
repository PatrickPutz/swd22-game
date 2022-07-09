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
    private int attackRange;

    public Player() {
        super(AssetRepository.assets.get(AssetType.PLAYER), 3);
        this.attackRange = 20;
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

    public void attackEnemyInRange(ArrayList<LivingBeing> enemies){
        for (LivingBeing enemy : enemies) {
            if(this.inAttackRange(enemy)){
                this.attack(enemy, 1);
            }
        }
    }

    private boolean inAttackDirection(LivingBeing livingBeing){
        if(this.getDirection() == getEnemyDirection(livingBeing))
            return true;
        return false;
    }

    private Direction getEnemyDirection(LivingBeing livingBeing){
        float xDistance;
        float yDistance;
        Direction directionX;
        Direction directionY;

        if(this.getPositionX() < livingBeing.getPositionX()) {
            xDistance = livingBeing.getPositionX() - this.getPositionX();
            directionX = Direction.RIGHT;
        }
        else {
            xDistance = this.getPositionX() - livingBeing.getPositionX();
            directionX = Direction.LEFT;
        }

        if(this.getPositionY() < livingBeing.getPositionY()) {
            yDistance = livingBeing.getPositionY() - this.getPositionY();
            directionY = Direction.UP;
        }
        else {
            yDistance = this.getPositionY() - livingBeing.getPositionY();
            directionY = Direction.DOWN;
        }

        if(xDistance < yDistance)
            return directionX;
        else
            return directionY;
    }

    private boolean inAttackRange(LivingBeing livingBeing){
        if(inXRange(livingBeing) && inYRange(livingBeing))
            return true;
        return false;
    }

    private boolean inXRange (LivingBeing livingBeing){
        if((this.getPositionX() < livingBeing.getPositionX()) &&
                (livingBeing.getPositionX() - this.getPositionX()) <= attackRange)
            return true;
        else if((this.getPositionX() > livingBeing.getPositionX()) &&
                (this.getPositionX() - livingBeing.getPositionX()) <= attackRange)
            return true;
        else
            return false;
    }

    private boolean inYRange(LivingBeing livingBeing){
        if((this.getPositionY() < livingBeing.getPositionY()) &&
                (livingBeing.getPositionY() - this.getPositionY()) <= attackRange)
            return true;
        else if((this.getPositionY() > livingBeing.getPositionY()) &&
                (this.getPositionY() - livingBeing.getPositionY()) <= attackRange)
            return true;
        else
            return false;
    }

}
