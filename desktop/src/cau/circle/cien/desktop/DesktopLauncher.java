package cau.circle.cien.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import cau.circle.cien.game.OneLevelHero;

public class DesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "OneLevelHero";
        config.width = 960;
        config.height = 540;
        config.resizable = false;
        new LwjglApplication(new OneLevelHero(), config);
    }
}
