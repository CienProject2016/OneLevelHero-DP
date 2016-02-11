package cau.circle.cien.game;

import com.badlogic.gdx.Game;

import cau.circle.cien.view.screen.BattleScreen;

public class OneLevelHero extends Game {
    @Override
    public void create() {
        setScreen(new BattleScreen(this));
    }
}
