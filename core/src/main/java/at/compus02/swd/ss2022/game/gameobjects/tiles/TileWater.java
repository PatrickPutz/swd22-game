package at.compus02.swd.ss2022.game.gameobjects.tiles;

import at.compus02.swd.ss2022.game.gameobjects.AssetRepository;
import at.compus02.swd.ss2022.game.gameobjects.AssetType;

public class TileWater extends Tile{
    public TileWater() {
        super(AssetRepository.assets.get(AssetType.TILEWATER),32,32);
    }
}
