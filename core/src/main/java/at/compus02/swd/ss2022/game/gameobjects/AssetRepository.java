package at.compus02.swd.ss2022.game.gameobjects;

import com.badlogic.gdx.graphics.Texture;

import java.util.HashMap;

public final class AssetRepository {

    public static HashMap<AssetType, Texture> assets;

    public AssetRepository() {
        assets = new HashMap<>();
        assets.put(AssetType.BUSH, new Texture("bush.png"));
        assets.put(AssetType.LOG, new Texture("log.png"));
        assets.put(AssetType.SIGN, new Texture("sign.png"));
        assets.put(AssetType.STONE, new Texture("sign.png"));
        assets.put(AssetType.TILEGRASS, new Texture("tile_gras.png"));
        assets.put(AssetType.TILEGRAVEL, new Texture("tile_gravel.png"));
        assets.put(AssetType.TILEWALL, new Texture("tile_wall.png"));
        assets.put(AssetType.TILEWATER, new Texture("tile_water.png"));
        assets.put(AssetType.PLAYER, new Texture("player.png"));
        assets.put(AssetType.ENEMY, new Texture("enemy.png"));
    }
}
