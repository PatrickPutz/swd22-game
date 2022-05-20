package at.compus02.swd.ss2022.game.gameobjects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public interface GameObject {
    void act(float delta);
    void setPosition(float x, float y);
    void moveDown(int count);
    void moveUp(int count);
    void moveLeft(int count);
    void moveRight(int count);
    void draw(SpriteBatch batch);
}
