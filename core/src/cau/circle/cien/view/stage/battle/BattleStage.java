package cau.circle.cien.view.stage.battle;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

import cau.circle.cien.data.BattleInfo;
import cau.circle.cien.data.HeroInfo;
import cau.circle.cien.game.OneLevelHero;
import cau.circle.cien.model.unit.Monster;
import cau.circle.cien.model.unit.Yongsa;
import cau.circle.cien.setting.Assets;
import cau.circle.cien.view.stage.base.OneLevelStage;

/**
 * Created by Velmont on 2016-02-07.
 */
public class BattleStage extends OneLevelStage {

    private Image yongsa;

    public BattleStage(OneLevelHero game) {
        super(game);

        Image enemyCountSubject = makeEnemyCountSubject();
        enemyCountSubject.setPosition(50, 780);
        addActor(enemyCountSubject);

        Label enemyCountValue = makeEnemyCountValue();
        enemyCountValue.setPosition(650, 850);
        addActor(enemyCountValue);

        Image yongsaImage = makeYongsaImage();
        yongsaImage.setPosition(100, 200);
        addActor(yongsaImage);

        Image monsterImage = makeMonsterImage();
        monsterImage.setPosition(1300, 300);
        addActor(monsterImage);
    }

    private Image makeMonsterImage() {
        Monster monster = BattleInfo.getInstance().getCurrentMonster();
        return monster.getImage();
    }

    private Image makeYongsaImage() {
        Yongsa yongsa = HeroInfo.getInstance().getYongsa();
        return yongsa.getImage();
    }

    private Image makeEnemyCountSubject() {
        Image enemyCountSubject = new Image(new Texture(Gdx.files.internal("enemy_count.png")));
        return enemyCountSubject;
    }

    private Label makeEnemyCountValue() {
        String enemyCountString = String.valueOf(BattleInfo.getInstance().getEnemyCount());
        Label label = new Label(enemyCountString, Assets.skin);
        label.setColor(Color.BLACK);
        label.setFontScale(2.0f);
        return label;
    }
}
