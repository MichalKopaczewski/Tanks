package com.game.model;

/**
 *
 * @author Michal
 */
public class TankModel extends GameObjectModel {

    @Override
    public void update() {
        
    }
    public void setLocation(float x, float y) {
        this.setX(x);
        this.setY(y);
    }
    public void setSize(float height, float width) {
        this.setHeight(height);
        this.setWidth(width);
    }
    
}
