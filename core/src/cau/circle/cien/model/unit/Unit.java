package cau.circle.cien.model.unit;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by Velmont on 2016-02-08.
 */
public class Unit {
    protected String id;
    protected String name;
    protected Status status;
    protected Texture image;

    public Unit(String name) {
        this.name = name;
    }

    public Image getImage() {
        //TODO 상태에 따라 이미지를 다르게 가져온다.
        image = new Texture(Gdx.files.internal(name + ".png"));
        return new Image(image);
    }
}
