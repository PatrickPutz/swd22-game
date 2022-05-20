package at.compus02.swd.ss2022.game;

import at.compus02.swd.ss2022.game.gameobjects.*;
import at.compus02.swd.ss2022.game.gameobjects.commands.*;
import at.compus02.swd.ss2022.game.gameobjects.livingbeings.LivingBeingType;
import at.compus02.swd.ss2022.game.input.GameInput;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

import java.util.HashMap;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
	private SpriteBatch batch;

	private ExtendViewport viewport = new ExtendViewport(480.0f, 480.0f, 480.0f, 480.0f);

	private Array<GameObject> gameObjects = new Array<>();
	private GameObject player;

	private final float updatesPerSecond = 60;
	private final float logicFrameTime = 1 / updatesPerSecond;
	private float deltaAccumulator = 0;
	private BitmapFont font;

	@Override
	public void create() {
		batch = new SpriteBatch();
		font = new BitmapFont();
		font.setColor(Color.WHITE);

		LivingBeingFactory livingBeingFactory = new LivingBeingFactory();
		player = livingBeingFactory.createLivingBeing(LivingBeingType.PLAYER, 0, 0);

		HashMap<MoveType, MoveCommand> commands = createCommands();
		GameInput gameInput = new GameInput(commands);
		Gdx.input.setInputProcessor(gameInput);

		MapFactory mapFactory = new MapFactory();

		mapFactory.createStartingPointMap(gameObjects);
		gameObjects.add(player);
	}

	private HashMap<MoveType, MoveCommand> createCommands() {
		HashMap<MoveType, MoveCommand> commands = new HashMap<>();
		commands.put(MoveType.MOVEUP, new MoveUpCommand(player));
		commands.put(MoveType.MOVEDOWN, new MoveDownCommand(player));
		commands.put(MoveType.MOVELEFT, new MoveLeftCommand(player));
		commands.put(MoveType.MOVERIGHT, new MoveRightCommand(player));
		return commands;
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