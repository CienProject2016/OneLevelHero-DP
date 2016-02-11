package cau.circle.cien.view.stage.battle;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import java.util.ArrayList;

import cau.circle.cien.game.OneLevelHero;
import cau.circle.cien.view.stage.base.OneLevelStage;

/**
 * Created by Velmont on 2016-02-09.
 */
public class CharacterPanelStage extends OneLevelStage {
    private final int POSITION_X = 0;
    private final int POSITION_Y = 1;
    private final int NUMBER_OF_MEMBER = 3;
    private final int[][] CHARACTER_POSITION = {{150, 80}, {750, 80}, {1350, 80}};

    public CharacterPanelStage(OneLevelHero game) {
        super(game);
        ArrayList<Image> characterImageList = makeCharacterImageList();
        for (int i = 0; i < NUMBER_OF_MEMBER; i++) {
            Image characterBarImage = new Image(new Texture(Gdx.files.internal("character_bar.png")));
            characterBarImage.setPosition(CHARACTER_POSITION[i][POSITION_X] - 20, CHARACTER_POSITION[i][POSITION_Y]);
            characterBarImage.setScale(2.0f);
            addActor(characterBarImage);

            Image characterImage = characterImageList.get(i);
            characterImage.setPosition(CHARACTER_POSITION[i][POSITION_X], CHARACTER_POSITION[i][POSITION_Y]);
            characterImage.setScale(2.0f);
            addActor(characterImage);
        }
    }

    public ArrayList<Image> makeCharacterImageList() {
        ArrayList<Image> characterImageList = new ArrayList<Image>();

        Image yongsaImage = new Image(new Texture(Gdx.files.internal("circle_yongsa.png")));
        characterImageList.add(yongsaImage);
        Image parathImage = new Image(new Texture(Gdx.files.internal("circle_parath.png")));
        characterImageList.add(parathImage);
        Image lilithImage = new Image(new Texture(Gdx.files.internal("circle_lilith.png")));
        characterImageList.add(lilithImage);

        return characterImageList;
    }
}
