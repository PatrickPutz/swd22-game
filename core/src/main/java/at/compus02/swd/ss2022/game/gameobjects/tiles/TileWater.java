package at.compus02.swd.ss2022.game.gameobjects.tiles;

import at.compus02.swd.ss2022.game.gameobjects.AssetRepository;

public class TileWater extends Tile{
    public TileWater() {
        super(AssetRepository.getTileWater(),32,32);
    }
}
