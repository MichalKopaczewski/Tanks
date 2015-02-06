package com.game.view;

import com.game.main.GameObject;
import com.game.model.TankModel;

public class TankView extends GameObjectView {
    private TankModel model;
    public TankView(TankModel model) {
        this.model = model;
    }
    
}
