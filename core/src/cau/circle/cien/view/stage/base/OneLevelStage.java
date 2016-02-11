package cau.circle.cien.view.stage.base;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Stack;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import cau.circle.cien.game.OneLevelHero;
import cau.circle.cien.setting.Settings;

/**
 * Created by Velmont on 2016-02-07.
 */
public class OneLevelStage extends Stage {
    protected OneLevelHero game;
    protected Stack stackTable;
    protected Vector2 touchedLocation = new Vector2();

    public OneLevelStage(OneLevelHero game) {
        this.game = game;
        this.stackTable = new Stack();
        OrthographicCamera camera = new OrthographicCamera();
        Viewport viewport = new StretchViewport(Settings.GAME_WINDOW_WIDTH, Settings.GAME_WINDOW_HEIGHT, camera);
        setViewport(viewport);
        viewport.apply();
        camera.position.set(camera.viewportWidth / 2, camera.viewportHeight / 2, 0); //viewport apply 이후 camera좌표 설정

        stackTable.setWidth(Settings.GAME_WINDOW_WIDTH);
        stackTable.setHeight(Settings.GAME_WINDOW_HEIGHT);
        this.addActor(stackTable);
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        touchedLocation = screenToStageCoordinates(new Vector2(screenX, screenY));
        return super.touchDown(screenX, screenY, pointer, button);
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        touchedLocation = screenToStageCoordinates(new Vector2(screenX, screenY));
        return super.touchDragged(screenX, screenY, pointer);
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        touchedLocation = screenToStageCoordinates(new Vector2(screenX, screenY));
        return super.touchUp(screenX, screenY, pointer, button);
    }
}
