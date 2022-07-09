package at.compus02.swd.ss2022.game.input;

import at.compus02.swd.ss2022.game.gameobjects.commands.Command;
import at.compus02.swd.ss2022.game.gameobjects.commands.MoveType;
import at.compus02.swd.ss2022.game.gameobjects.livingbeings.EnemyGuard;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;

import java.util.HashMap;

public class GameInput extends InputAdapter {

    private HashMap<MoveType, Command> moveCommands;

    public GameInput(HashMap<MoveType, Command> moveCommands) {
        this.moveCommands = moveCommands;
    }

    @Override
    public boolean keyDown(int keycode) {
        System.out.println(keycode);
        return true;
    }

    public void executeCommands() {
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT) || Gdx.input.isKeyPressed(Input.Keys.A)) {
            this.moveCommands.get(MoveType.MOVELEFT).execute();
        }

        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT) || Gdx.input.isKeyPressed(Input.Keys.D)) {
            this.moveCommands.get(MoveType.MOVERIGHT).execute();
        }

        if (Gdx.input.isKeyPressed(Input.Keys.UP) || Gdx.input.isKeyPressed(Input.Keys.W)) {
            this.moveCommands.get(MoveType.MOVEUP).execute();
        }

        if (Gdx.input.isKeyPressed(Input.Keys.DOWN) || Gdx.input.isKeyPressed(Input.Keys.S)) {
            this.moveCommands.get(MoveType.MOVEDOWN).execute();
        }
    }

    public void moveEnemy(EnemyGuard enemy) {
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT) || Gdx.input.isKeyPressed(Input.Keys.A)) {
            enemy.moveRight();
        }

        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT) || Gdx.input.isKeyPressed(Input.Keys.D)) {
            enemy.moveLeft();
        }

        if (Gdx.input.isKeyPressed(Input.Keys.UP) || Gdx.input.isKeyPressed(Input.Keys.W)) {
            enemy.moveDown();
        }

        if (Gdx.input.isKeyPressed(Input.Keys.DOWN) || Gdx.input.isKeyPressed(Input.Keys.S)) {
            enemy.moveUp();
        }
    }
}
