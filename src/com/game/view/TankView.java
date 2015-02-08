package com.game.view;

import com.game.main.Bullet;
import com.game.main.GameObject;
import com.game.model.TankModel;

public class TankView extends GameObjectView {
    private TankModel model;
    public TankView(TankModel model) {
        this.model = model;
    }
    public void renderBullets() {
        for (Bullet object : model.bullets) {
            object.render();
        }
    }
    
}
