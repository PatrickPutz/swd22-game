package at.compus02.swd.ss2022.game.gameobjects.livingbeings;

import at.compus02.swd.ss2022.game.gameobjects.AssetRepository;
import at.compus02.swd.ss2022.game.gameobjects.AssetType;
import at.compus02.swd.ss2022.game.gameobjects.commands.*;
import at.compus02.swd.ss2022.game.input.GameInput;

import java.util.HashMap;

public class Player extends LivingBeing{

    private HashMap<MoveType, Command> moveCommands;

    public Player() {
        super(AssetRepository.assets.get(AssetType.PLAYER), 3);
        this.moveCommands = new HashMap<>();
        moveCommands.put(MoveType.MOVEUP, new MoveUpCommand(this));
        moveCommands.put(MoveType.MOVEDOWN, new MoveDownCommand(this));
        moveCommands.put(MoveType.MOVELEFT, new MoveLeftCommand(this));
        moveCommands.put(MoveType.MOVERIGHT, new MoveRightCommand(this));
    }

    @Override
    public void act(float delta) {

    }

    public HashMap<MoveType, Command> getMoveCommands() {
        return moveCommands;
    }
}
