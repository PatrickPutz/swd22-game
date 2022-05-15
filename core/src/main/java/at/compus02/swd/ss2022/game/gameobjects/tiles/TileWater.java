package at.compus02.swd.ss2022.game.gameobjects.tiles;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class TileWater extends Tile{
    public TileWater() {
        super(32,32);
        image = new Texture("tile_water.png");
        sprite = new Sprite(image);
    }
}
