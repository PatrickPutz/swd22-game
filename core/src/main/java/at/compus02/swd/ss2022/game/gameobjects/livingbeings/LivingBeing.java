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
    private float spawnPositionX;
    private float spawnPositionY;
    private int baseHealth;
    private Direction direction;

    public int getBaseHealth() {
        return baseHealth;
    }

    public LivingBeing(Texture texture, int health) {
        image = texture;
        sprite = new Sprite(image);
        this.health = health;
        this.baseHealth = health;
        this.direction = Direction.DOWN;
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

    public void setSpawnPosition(float x, float y){
        this.spawnPositionX = x;
        this.spawnPositionY = y;
    }

    public float getSpawnPositionX() {
        return spawnPositionX;
    }

    public float getSpawnPositionY() {
        return spawnPositionY;
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
        setDirection(Direction.LEFT);
    }

    public void moveRight(){
        setPosition(getPositionX() + 2, getPositionY());
        setDirection(Direction.RIGHT);
    }

    public void moveUp(){
        setPosition(getPositionX(), getPositionY() + 2);
        setDirection(Direction.UP);
    }

    public void moveDown(){
        setPosition(getPositionX(), getPositionY() - 2);
        setDirection(Direction.DOWN);
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack(LivingBeing target, int damage){
        target.setHealth(target.getHealth() - damage);
        if(target.health <= 0)
            respawn(target);
    }

    public void respawn(LivingBeing livingBeing){
        livingBeing.setHealth(livingBeing.getBaseHealth());
        livingBeing.setPosition(getSpawnPositionX(), getSpawnPositionY());
    }
}
