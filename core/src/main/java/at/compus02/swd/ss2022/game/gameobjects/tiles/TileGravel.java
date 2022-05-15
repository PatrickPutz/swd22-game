package at.compus02.swd.ss2022.game.gameobjects.tiles;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class TileGravel extends Tile{
    public TileGravel() {
        super(32,32);
        image = new Texture("tile_gravel.png");
        sprite = new Sprite(image);
    }
}
