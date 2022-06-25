package at.compus02.swd.ss2022.game.gameobjects.tiles;

import at.compus02.swd.ss2022.game.gameobjects.AssetRepository;
import at.compus02.swd.ss2022.game.gameobjects.AssetType;

public class TileGrass extends Tile{
    public TileGrass() {
        super(AssetRepository.assets.get(AssetType.TILEGRASS),32,32);
    }
}
