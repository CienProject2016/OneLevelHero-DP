package cau.circle.cien.data;

import cau.circle.cien.model.unit.Monster;

/**
 * Created by Velmont on 2016-02-07.
 * Singleton Object
 */
public class BattleInfo {
    private static BattleInfo instance;
    private int enemyCount;
    private double connectionRestrictionTime;
    private Monster currentMonster;

    private BattleInfo() {
        enemyCount = 5; //TODO 임시값
        connectionRestrictionTime = 1.5;
        currentMonster = new Monster("lizardman"); //TODO 임시값
    }

    public static BattleInfo getInstance() {
        if (instance == null) {
            instance = new BattleInfo();
        }
        return instance;
    }

    /*---------------------getter & setter --------------------------------*/
    public int getEnemyCount() {
        return enemyCount;
    }

    public void setEnemyCount(int enemyCount) {
        this.enemyCount = enemyCount;
    }

    public double getConnectionRestrictionTime() {
        return connectionRestrictionTime;
    }

    public void setConnectionRestrictionTime(double connectionRestrictionTime) {
        this.connectionRestrictionTime = connectionRestrictionTime;
    }

    public Monster getCurrentMonster() {
        return currentMonster;
    }

    public void setCurrentMonster(Monster currentMonster) {
        this.currentMonster = currentMonster;
    }
}
