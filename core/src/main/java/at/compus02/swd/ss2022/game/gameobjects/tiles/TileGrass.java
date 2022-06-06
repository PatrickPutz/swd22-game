package at.compus02.swd.ss2022.game.gameobjects.tiles;

import at.compus02.swd.ss2022.game.gameobjects.AssetRepository;

public class TileGrass extends Tile{
    public TileGrass() {
        super(AssetRepository.getTileGrass(),32,32);
    }
}
