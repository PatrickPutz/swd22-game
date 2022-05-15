package at.compus02.swd.ss2022.game.gameobjects.obstacles;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.tiles.Tile;
import at.compus02.swd.ss2022.game.gameobjects.tiles.TileType;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class Obstacle implements GameObject {
    private Texture image;
    private Sprite sprite;

    public Obstacle(String imageName) {
        image = new Texture(imageName);
        sprite = new Sprite(image);
    }
    @Override
    public void act(float delta) {

    }

    @Override
    public void setPosition(float x, float y) {
        sprite.setPosition(x, y);
    }

    @Override
    public void draw(SpriteBatch batch) {
        sprite.draw(batch);
    }

}
