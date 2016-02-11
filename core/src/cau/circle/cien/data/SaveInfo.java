package cau.circle.cien.data;

import cau.circle.cien.model.unit.Yongsa;

/**
 * Created by Velmont on 2016-02-07.
 */
public class SaveInfo {
    private static SaveInfo instance;
    private Yongsa yongsa;

    private SaveInfo() {
    }

    public SaveInfo getInstance() {
        if (instance == null) {
            instance = new SaveInfo();
        }
        return instance;
    }
}
