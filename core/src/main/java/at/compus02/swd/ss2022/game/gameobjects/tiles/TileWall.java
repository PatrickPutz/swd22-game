package at.compus02.swd.ss2022.game.gameobjects.tiles;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class TileWall extends Tile{
    public TileWall() {
        super(32,32);
        image = new Texture("tile_wall.png");
        sprite = new Sprite(image);
    }
}
