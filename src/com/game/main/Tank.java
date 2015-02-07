package com.game.main;

import com.game.controller.TankController;
import com.game.model.TankModel;
import com.game.view.TankView;
import java.awt.Color;

public class Tank extends GameObject {
    private TankModel model;
    private TankView view;
    private TankController controller;
    public Tank(int x, int y, int height, int width, Color color, float angle) {
        model = new TankModel();
        model.setColor(color);
        model.setAngle(angle);
        model.setLocation(x, y);
        model.setSize(height, width);
        view = new TankView(model);
        controller = new TankController(view, model);
    }
    public void getInput() {
        controller.getInput();
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
