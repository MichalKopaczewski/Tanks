package com.game.main;

import com.game.controller.TankController;
import com.game.model.TankModel;
import com.game.view.TankView;
import java.awt.Color;

public class Tank extends GameObject{
    private TankModel model;
    private TankView view;
    private TankController controller;
    public Tank(int x, int y, int height, int width) {
        model = new TankModel();
        model.setColor(Color.yellow);
        model.setAngle(0);
        model.setLocation(100, 100);
        model.setSize(100, 200);
        view = new TankView(model);
        controller = new TankController(view, model);
    }
    @Override
    public void render() {
        view.render(model);
    }
    @Override
    public void update() {
        model.update();
    }
}
