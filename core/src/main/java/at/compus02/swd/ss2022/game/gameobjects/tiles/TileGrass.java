package at.compus02.swd.ss2022.game.gameobjects.tiles;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class TileGrass extends Tile{
    public TileGrass() {
        image = new Texture("tile_gras.png");
        sprite = new Sprite(image);
    }
}
