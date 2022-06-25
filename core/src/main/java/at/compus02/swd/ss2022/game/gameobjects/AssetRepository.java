package at.compus02.swd.ss2022.game.gameobjects;

import com.badlogic.gdx.graphics.Texture;

public final class AssetRepository {

    private static final Texture bush = new Texture("bush.png");
    private static final Texture log = new Texture("log.png");
    private static final Texture sign = new Texture("sign.png");
    private static final Texture stone = new Texture("stone.png");
    private static final Texture tileGrass = new Texture("tile_gras.png");
    private static final Texture tileGravel = new Texture("tile_gravel.png");
    private static final Texture tileWall = new Texture("tile_wall.png");
    private static final Texture tileWater = new Texture("tile_water.png");
    private static final Texture player = new Texture("player.png");
    private static final Texture enemy = new Texture("enemy.png");

    public static Texture getBush() {
        return bush;
    }

    public static Texture getLog() {
        return log;
    }

    public static Texture getEnemy() {
        return enemy;
    }

    public static Texture getPlayer() {
        return player;
    }

    public static Texture getSign() {
        return sign;
    }

    public static Texture getStone() {
        return stone;
    }

    public static Texture getTileGrass() {
        return tileGrass;
    }

    public static Texture getTileGravel() {
        return tileGravel;
    }

    public static Texture getTileWall() {
        return tileWall;
    }

    public static Texture getTileWater() {
        return tileWater;
    }
}
