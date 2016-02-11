package cau.circle.cien.data;

import cau.circle.cien.model.unit.Yongsa;

/**
 * Created by Velmont on 2016-02-09.
 */
public class HeroInfo {
    private static HeroInfo instance = new HeroInfo();
    private Yongsa yongsa;

    public static HeroInfo getInstance() {
        return instance;
    }

    private HeroInfo() {
        yongsa = new Yongsa("yongsa");
    }

    //-------------------------------------- getter & setter ---------------------------------//

    public Yongsa getYongsa() {
        return yongsa;
    }

    public void setYongsa(Yongsa yongsa) {
        this.yongsa = yongsa;
    }
}
