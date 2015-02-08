package com.game.main;

import com.game.model.BulletModel;
import com.game.model.TankModel;
import com.game.view.BulletView;

public class Bullet extends GameObject {
    private BulletView view;
    private BulletModel model;
    public Bullet(TankModel parent) {
        model = new BulletModel(parent);
        view = new BulletView(model);
    }

    @Override
    public void update() {
        model.update();
    }

    @Override
    public void render() {
        view.render(model);
    }

    public BulletModel getModel() {
        return model;
    }
    
}
