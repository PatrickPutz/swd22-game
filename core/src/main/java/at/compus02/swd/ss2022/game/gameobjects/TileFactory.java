package at.compus02.swd.ss2022.game.gameobjects;

import at.compus02.swd.ss2022.game.gameobjects.tiles.*;
import com.badlogic.gdx.utils.Array;

import java.util.ArrayList;

public class TileFactory {

    private Tile getTileType(TileType tileType){
        switch (tileType) {
            case GRASS:
                return new TileGrass();
            case GRAVEL:
                return new TileGravel();
            case WALL:
                return new TileWall();
            case WATER:
                return new TileWater();
            default:
                return null;
        }
    }

    public Tile createTile(TileType tileType, int positionX, int positionY){
        Tile tile = getTileType(tileType);
        tile.setPosition(positionX, positionY);
        return tile;
    }

    public ArrayList<Tile> createTileArea(TileType tileType, int topLeftX, int topLeftY, int numberOfTilesHorizontal, int numberOfTilesVertical){
        ArrayList<Tile> tiles = new ArrayList<>();
        int currentX = topLeftX;
        int currentY = topLeftY;

        for(int i = 0; i < numberOfTilesVertical; i++){
            for(int j = 0; j < numberOfTilesHorizontal; j++) {
                Tile tile = createTile(tileType, currentX, currentY);
                currentX += tile.getWidth();
                tiles.add(tile);
            }
            currentX = topLeftX;
            currentY -= tiles.get(0).getHeight();
        }

        return tiles;
    }

    public void addTileAreaToGameObjects(Array<GameObject> gameObjects, ArrayList<Tile> tiles){
        for (Tile tile : tiles) {
            gameObjects.add(tile);
        }
    }

}
