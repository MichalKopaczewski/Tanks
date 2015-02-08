package com.game.model;

import java.awt.Color;
import org.lwjgl.opengl.Display;

public abstract class GameObjectModel {
    private float x,y,height,width,angle;
    private Color color;
    
    public abstract void update();

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public float getHalfHeight() {
        return height / 2;
    }

    public float getHalfWidth() {
        return width / 2;
    }

    public float getAngle() {
        return angle;
    }
    
    public Color getColor() {
        return color;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
