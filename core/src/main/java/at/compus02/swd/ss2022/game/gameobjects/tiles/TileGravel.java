package at.compus02.swd.ss2022.game.gameobjects.tiles;

import at.compus02.swd.ss2022.game.gameobjects.AssetRepository;
import at.compus02.swd.ss2022.game.gameobjects.AssetType;

public class TileGravel extends Tile{
    public TileGravel() {
        super(AssetRepository.assets.get(AssetType.TILEGRAVEL),32,32);
    }
}
