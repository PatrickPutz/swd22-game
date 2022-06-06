package at.compus02.swd.ss2022.game.gameobjects.tiles;

import at.compus02.swd.ss2022.game.gameobjects.AssetRepository;

public class TileGravel extends Tile{
    public TileGravel() {
        super(AssetRepository.getTileGravel(),32,32);
    }
}
