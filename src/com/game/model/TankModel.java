package com.game.model;

/**
 *
 * @author Michal
 */
public class TankModel extends GameObjectModel {
    private float xSpeed,ySpeed;
    public static final float MAX_SPEED = 3;

    public TankModel() {
        this.xSpeed = 0;
        this.ySpeed = 0;
    }
    
    @Override
    public void update() {
        this.setX(this.getX() + xSpeed);
        this.setY(this.getY() + ySpeed);
    }
    public void setLocation(float x, float y) {
        this.setX(x);
        this.setY(y);
    }
    public void setSize(float height, float width) {
        this.setHeight(height);
        this.setWidth(width);
    }
    public void moveTop() {
        ySpeed = MAX_SPEED;
    }
    public void moveRight() {
        xSpeed = MAX_SPEED;
    }
    public void moveBottom() {
        ySpeed = -MAX_SPEED;
    }
    public void moveLeft() {
        xSpeed = -MAX_SPEED;
    }
    public void stop() {
        xSpeed = 0;
        ySpeed = 0;
    }
    
}
