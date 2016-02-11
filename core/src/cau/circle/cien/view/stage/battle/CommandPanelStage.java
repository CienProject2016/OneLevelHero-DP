package cau.circle.cien.view.stage.battle;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

import cau.circle.cien.battle.CommandPhaseController;
import cau.circle.cien.data.BattleInfo;
import cau.circle.cien.game.OneLevelHero;
import cau.circle.cien.setting.Assets;
import cau.circle.cien.view.stage.base.OneLevelStage;

/**
 * Created by Velmont on 2016-02-09.
 */
public class CommandPanelStage extends OneLevelStage {
    public CommandPanelStage(OneLevelHero game) {
        super(game);
        Label connectionRestrictionTimeValue = makeConnectionRestrictionTimeValue();
        connectionRestrictionTimeValue.setPosition(1650, 860);
        addActor(connectionRestrictionTimeValue);

        Image commandPanelFrame = makeCommandPanelFrame();
        commandPanelFrame.setPosition(0, 200);
        addActor(commandPanelFrame);
    }

    private Label makeConnectionRestrictionTimeValue() {
        String connectionRestrictionTimeString = String.valueOf(BattleInfo.getInstance().getConnectionRestrictionTime());
        Label label = new Label(connectionRestrictionTimeString, Assets.skin);
        label.setColor(Color.BLACK);
        label.setFontScale(2.0f);
        return label;
    }

    private Image makeCommandPanelFrame() {
        Image commandPanelFrame = new Image(new Texture(Gdx.files.internal("command_panel.png")));
        return commandPanelFrame;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        super.touchDown(screenX, screenY, pointer, button);
        CommandPhaseController.doWhenTouchDown();
        return true;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        super.touchDragged(screenX, screenY, pointer);
        CommandPhaseController.doWhenTouchDragged();
        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        super.touchUp(screenX, screenY, pointer, button);
        CommandPhaseController.doWhenTouchUp();
        return true;
    }
}