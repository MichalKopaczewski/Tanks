package com.game.controller;

import com.game.model.TankModel;
import com.game.view.TankView;

public class TankController extends GameObjectController {
    private TankView view;
    private TankModel model;
    public TankController(TankView view, TankModel model) {
        this.model = model;
        this.view = view;
    }
    
}
