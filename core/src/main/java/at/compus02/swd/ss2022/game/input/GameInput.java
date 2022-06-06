package at.compus02.swd.ss2022.game.input;

import at.compus02.swd.ss2022.game.gameobjects.livingbeings.Player;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class GameInput extends InputAdapter {
    @Override
    public boolean keyDown(int keycode) {
        System.out.println(keycode);
        return true;
    }

    public void movePlayer(Player player) {
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT) || Gdx.input.isKeyPressed(Input.Keys.A)) {
            player.moveLeft();
        }

        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT) || Gdx.input.isKeyPressed(Input.Keys.D)) {
            player.moveRight();
        }

        if (Gdx.input.isKeyPressed(Input.Keys.UP) || Gdx.input.isKeyPressed(Input.Keys.W)) {
            player.moveUp();
        }

        if (Gdx.input.isKeyPressed(Input.Keys.DOWN) || Gdx.input.isKeyPressed(Input.Keys.S)) {
            player.moveDown();
        }
    }
}
