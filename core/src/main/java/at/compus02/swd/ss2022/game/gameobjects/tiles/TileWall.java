package at.compus02.swd.ss2022.game.gameobjects.tiles;

import at.compus02.swd.ss2022.game.gameobjects.AssetRepository;
import at.compus02.swd.ss2022.game.gameobjects.AssetType;

public class TileWall extends Tile{
    public TileWall() {
        super(AssetRepository.assets.get(AssetType.TILEWALL),32,32);
    }
}
