package com.game.view;

import com.game.model.GameObjectModel;

public abstract class GameObjectView {
    public void render(GameObjectModel model) {
        Draw.rect(model.getX(), model.getY(), model.getHeight(), model.getWidth(), model.getAngle(), model.getColor());
    }
}
