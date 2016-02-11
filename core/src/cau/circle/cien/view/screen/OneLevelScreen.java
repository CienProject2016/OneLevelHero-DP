package cau.circle.cien.view.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.Viewport;

import cau.circle.cien.game.OneLevelHero;

/**
 * Created by Velmont on 2016-02-07.
 */
public class OneLevelScreen implements Screen {
    protected Viewport viewport;
    protected OrthographicCamera camera;
    protected OneLevelHero game;

    public OneLevelScreen(OneLevelHero game) {
        this.game = game;
    }

    @Override
    public void show() {

    }

    /**
     * Please Override in order to clear the screen
     *
     * @param delta
     */
    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
