package com.game.model;

import java.awt.Color;
import org.lwjgl.opengl.Display;

public class BulletModel extends GameObjectModel {
    public final float MAX_SPEED = 3;
    public static final float HEIGHT = 5, WIDTH = 5;
    public static final float MAX_X_AREA = Display.getWidth(), MAX_Y_AREA = Display.getHeight(), MIN_X_AREA = 0, MIN_Y_AREA = 0;
    private float ySpeed;
    private TankModel parent;
    private boolean isOverArea;
    public BulletModel(TankModel parent) {
        setX(parent.getX());
        setY(parent.getY() + parent.getHalfHeight());
        setHeight(HEIGHT);
        setWidth(WIDTH);
        setAngle(0);
        setColor(Color.yellow);
        ySpeed = MAX_SPEED;
        this.parent = parent;
        this.isOverArea = false;
    }
    
    @Override
    public void update() {
        if (ySpeed != 0) {
            for (float i=0; i<MAX_SPEED; i ++) {
                this.setY(this.getY() + ySpeed);
                keepInArea();
            }
        }
    }
    public void keepInArea() {
        if (getY() > MAX_Y_AREA) {
            this.isOverArea = true;
        }
    }

    public boolean isIsOverArea() {
        return isOverArea;
    }
    
}
