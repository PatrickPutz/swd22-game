package at.compus02.swd.ss2022.game.gameobjects.tiles;

import at.compus02.swd.ss2022.game.gameobjects.AssetRepository;

public class TileWall extends Tile{
    public TileWall() {
        super(AssetRepository.getTileWall(),32,32);
    }
}
