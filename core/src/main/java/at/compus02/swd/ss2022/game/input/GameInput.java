package at.compus02.swd.ss2022.game.input;

import at.compus02.swd.ss2022.game.gameobjects.commands.*;
import com.badlogic.gdx.InputAdapter;

import java.util.HashMap;

public class GameInput extends InputAdapter {

    private HashMap<MoveType, MoveCommand> commands;

    public GameInput(HashMap<MoveType, MoveCommand> commands) {
        this.commands = commands;
    }

    @Override
    public boolean keyDown(int keycode) {
        //System.out.println(keycode);

        switch (keycode) {
            case 19: this.commands.get(MoveType.MOVEUP).execute(); break;
            case 20: this.commands.get(MoveType.MOVEDOWN).execute(); break;
            case 21: this.commands.get(MoveType.MOVELEFT).execute(); break;
            case 22: this.commands.get(MoveType.MOVERIGHT).execute(); break;
        }

        return true;
    }
}
