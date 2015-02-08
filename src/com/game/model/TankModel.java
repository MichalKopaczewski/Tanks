package com.game.model;

import com.game.main.Bullet;
import java.awt.Color;
import static java.lang.Math.round;
import java.util.ArrayList;
import org.lwjgl.opengl.Display;

public class TankModel extends GameObjectModel {
    public static final float MAX_SPEED = 5;
    public static final float MAX_X_AREA = Display.getWidth(), MAX_Y_AREA = Display.getHeight() / 2, MIN_X_AREA = 0, MIN_Y_AREA = 0;
    private float xSpeed,ySpeed;
    public ArrayList<Bullet> bullets;
    public TankModel(float x, float y, float height, float width, Color color, float angle) {
        setColor(color);
        setAngle(angle);
        setLocation(x, y);
        setSize(height, width);
        this.xSpeed = 0;
        this.ySpeed = 0;
        bullets = new ArrayList<>();
        
    }
    
    @Override
    public void update() {
        if (xSpeed != 0 || ySpeed != 0) {
            for (float i=0; i<MAX_SPEED; i ++) {
                keepInArea();
                this.setX(this.getX() + xSpeed);
                this.setY(this.getY() + ySpeed);
            }
        }
        updateBullets();
        checkBullets();
    }
    public void addBullet() {
        bullets.add(new Bullet(this));
    }
    public void updateBullets() {
        for (Bullet object : bullets) {
            object.update();
        }
    }
    public void checkBullets() {
        for (int i = bullets.size()-1; i >= 0; i --) {
            if (bullets.get(i).getModel().isIsOverArea()) {
                bullets.remove(i);
            }
        }
    }
    public void keepInArea() {
        if (round(getX() + getHalfWidth()) == MAX_X_AREA) {
            stopX();
            setX(MAX_X_AREA - getHalfWidth() - 1);
        }
        if (round(getX() - getHalfWidth()) == MIN_X_AREA) {
            stopX();
            setX(MIN_X_AREA + getHalfWidth() + 1);
        }
        if (round(getY() + getHalfHeight())== MAX_Y_AREA) {
            stopY();
            setY(MAX_Y_AREA - getHalfHeight()- 1);
        }
        if (round(getY() - getHalfHeight())== MIN_Y_AREA) {
            stopY();
            setY(MIN_Y_AREA + getHalfHeight()+ 1);
        }
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
        ySpeed = 1;
    }
    public void moveRight() {
        xSpeed = 1;
    }
    public void moveBottom() {
        ySpeed = -1;
    }
    public void moveLeft() {
        xSpeed = -1;
    }
    public void stop() {
        xSpeed = 0;
        ySpeed = 0;
    }
    public void stopX() {
        xSpeed = 0;
    }
    public void stopY() {
        ySpeed = 0;
    }
    
}
