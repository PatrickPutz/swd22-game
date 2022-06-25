package at.compus02.swd.ss2022.game.gameobjects.observer;

import at.compus02.swd.ss2022.game.gameobjects.livingbeings.Player;

public class ConsoleGameObserver implements GameObserver{

    private Player player;

    public ConsoleGameObserver(Player player) {
        this.player = player;
        this.player.attach(this);
    }

    @Override
    public void update(ObservableType observableType) {
        switch (observableType){
            case PLAYERMOVEDDOWN:
                System.out.println("Player moved down - X: " + player.getPositionX() + ", Y: " + player.getPositionY());
                break;
            case PLAYERMOVEDUP:
                System.out.println("Player moved up - X: " + player.getPositionX() + ", Y: " + player.getPositionY());
                break;
            case PLAYERMOVEDLEFT:
                System.out.println("Player moved left - X: " + player.getPositionX() + ", Y: " + player.getPositionY());
                break;
            case PLAYERMOVEDRIGHT:
                System.out.println("Player moved right - X: " + player.getPositionX() + ", Y: " + player.getPositionY());
                break;
        }
    }

}
