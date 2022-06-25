package at.compus02.swd.ss2022.game.gameobjects.livingbeings;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class LivingBeing implements GameObject {
    private Texture image;
    protected Sprite sprite;
    private float positionX;
    private float positionY;
    private int health;

    public LivingBeing(Texture texture, int health) {
        image = texture;
        sprite = new Sprite(image);
        this.health = health;
    }

    @Override
    public void act(float delta) {

    }

    @Override
    public void setPosition(float x, float y) {
        sprite.setPosition(x, y);
        this.positionX = x;
        this.positionY = y;
    }

    @Override
    public void draw(SpriteBatch batch) {
        sprite.draw(batch);
    }

    public float getPositionX() {
        return positionX;
    }

    public float getPositionY() {
        return positionY;
    }

    public void moveLeft(){
        setPosition(getPositionX() - 2, getPositionY());
    }

    public void moveRight(){
        setPosition(getPositionX() + 2, getPositionY());
    }

    public void moveUp(){
        setPosition(getPositionX(), getPositionY() + 2);
    }

    public void moveDown(){
        setPosition(getPositionX(), getPositionY() - 2);
    }
}
