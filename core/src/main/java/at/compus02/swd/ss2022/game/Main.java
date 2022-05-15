package at.compus02.swd.ss2022.game;

import at.compus02.swd.ss2022.game.gameobjects.GameObject;
import at.compus02.swd.ss2022.game.gameobjects.LivingBeingFactory;
import at.compus02.swd.ss2022.game.gameobjects.ObstacleFactory;
import at.compus02.swd.ss2022.game.gameobjects.TileFactory;
import at.compus02.swd.ss2022.game.gameobjects.livingbeings.LivingBeingType;
import at.compus02.swd.ss2022.game.gameobjects.obstacles.ObstacleLog;
import at.compus02.swd.ss2022.game.gameobjects.obstacles.ObstacleType;
import at.compus02.swd.ss2022.game.gameobjects.tiles.Tile;
import at.compus02.swd.ss2022.game.gameobjects.tiles.TileType;
import at.compus02.swd.ss2022.game.input.GameInput;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

import java.util.ArrayList;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
	private SpriteBatch batch;

	private ExtendViewport viewport = new ExtendViewport(480.0f, 480.0f, 480.0f, 480.0f);
	private GameInput gameInput = new GameInput();

	private Array<GameObject> gameObjects = new Array<>();

	private final float updatesPerSecond = 60;
	private final float logicFrameTime = 1 / updatesPerSecond;
	private float deltaAccumulator = 0;
	private BitmapFont font;

	@Override
	public void create() {
		batch = new SpriteBatch();
		font = new BitmapFont();
		font.setColor(Color.WHITE);
		Gdx.input.setInputProcessor(this.gameInput);

		TileFactory tileFactory = new TileFactory();
		ObstacleFactory obstacleFactory = new ObstacleFactory();
		LivingBeingFactory livingBeingFactory = new LivingBeingFactory();

		ArrayList<Tile> startBackground = tileFactory.createTileBackgroundArea(TileType.GRASS, -240, 240, 16,16);
		tileFactory.addTileAreaToGameObjects(gameObjects, startBackground);

		ArrayList<Tile> surrounding = tileFactory.createTileBackgroundArea(TileType.GRAVEL, 70, 176, 4,4);
		tileFactory.addTileAreaToGameObjects(gameObjects, surrounding);

		ArrayList<Tile> pond = tileFactory.createTileBackgroundArea(TileType.WATER, 102, 144, 2, 2);
		tileFactory.addTileAreaToGameObjects(gameObjects, pond);

		gameObjects.add(obstacleFactory.createObstacle(ObstacleType.SIGN, 140, 80));
		gameObjects.add(obstacleFactory.createObstacle(ObstacleType.LOG, 70, 176));
		gameObjects.add(obstacleFactory.createObstacle(ObstacleType.STONE, 210, -240));
		gameObjects.add(obstacleFactory.createObstacle(ObstacleType.STONE, 210, -208));
		gameObjects.add(obstacleFactory.createObstacle(ObstacleType.STONE, 178, -240));
		gameObjects.add(obstacleFactory.createObstacle(ObstacleType.BUSH, -232, -208));
		gameObjects.add(obstacleFactory.createObstacle(ObstacleType.BUSH, -200, -208));
		gameObjects.add(obstacleFactory.createObstacle(ObstacleType.BUSH, -168, -208));
		gameObjects.add(obstacleFactory.createObstacle(ObstacleType.BUSH, -136, -208));
		gameObjects.add(obstacleFactory.createObstacle(ObstacleType.BUSH, -136, -240));

		gameObjects.add(livingBeingFactory.createLivingBeing(LivingBeingType.PLAYER, 0, 0));
	}

	private void act(float delta) {
		for(GameObject gameObject : gameObjects) {
			gameObject.act(delta);
		}
	}

	private void draw() {
		batch.setProjectionMatrix(viewport.getCamera().combined);
		batch.begin();
		for(GameObject gameObject : gameObjects) {
			gameObject.draw(batch);
		}
		font.draw(batch, "Hello Game", -220, -220);
		batch.end();
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(0.15f, 0.15f, 0.2f, 1f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		float delta = Gdx.graphics.getDeltaTime();
		deltaAccumulator += delta;
		while(deltaAccumulator > logicFrameTime) {
			deltaAccumulator -= logicFrameTime;
			act(logicFrameTime);
		}
		draw();
	}

	@Override
	public void dispose() {
		batch.dispose();
	}

	@Override
	public void resize(int width, int height){
		viewport.update(width,height);
	}
}