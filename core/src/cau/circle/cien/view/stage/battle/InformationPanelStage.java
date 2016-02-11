package cau.circle.cien.view.stage.battle;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

import cau.circle.cien.game.OneLevelHero;
import cau.circle.cien.setting.Assets;
import cau.circle.cien.view.stage.base.OneLevelStage;

/**
 * Created by Velmont on 2016-02-09.
 */
public class InformationPanelStage extends OneLevelStage {
    public InformationPanelStage(OneLevelHero game) {
        super(game);
        Image informationPanelFrame = makeInformationPanelFrame();
        informationPanelFrame.setPosition(0, 958);
        addActor(informationPanelFrame);

        Label informationValue = makeInformationValue();
        informationValue.setPosition(80, 1000);
        addActor(informationValue);
    }

    private Image makeInformationPanelFrame() {
        Image informationPanelFrame = new Image(new Texture(Gdx.files.internal("information_panel.png")));
        return informationPanelFrame;
    }

    private Label makeInformationValue() {
        String informationValue = "정보패널 : 정보가 들어감";
        Label label = new Label(informationValue, Assets.skin);
        label.setColor(Color.BLACK);
        label.setFontScale(1.5f);
        return label;
    }
}
