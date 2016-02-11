package cau.circle.cien.view.screen;

import cau.circle.cien.game.OneLevelHero;
import cau.circle.cien.view.stage.battle.BattleStage;
import cau.circle.cien.view.stage.battle.CharacterPanelStage;
import cau.circle.cien.view.stage.battle.CommandPanelStage;
import cau.circle.cien.view.stage.battle.InformationPanelStage;

/**
 * Created by Velmont on 2016-02-07.
 */
public class BattleScreen extends OneLevelScreen {
    private BattleStage battleStage;
    private CommandPanelStage commandPanelStage;
    private InformationPanelStage informationPanelStage;
    private CharacterPanelStage characterPanelStage;

    public BattleScreen(OneLevelHero game) {
        super(game);
        battleStage = new BattleStage(game);
        commandPanelStage = new CommandPanelStage(game);
        informationPanelStage = new InformationPanelStage(game);
        characterPanelStage = new CharacterPanelStage(game);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        commandPanelStage.draw();
        battleStage.draw();

        informationPanelStage.draw();
        characterPanelStage.draw();
    }

    @Override
    public void show() {

    }
}
