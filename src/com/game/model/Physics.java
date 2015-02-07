package com.game.model;

import java.awt.Rectangle;

public class Physics {
    public static boolean isColision(GameObjectModel go1, GameObjectModel go2) {
        Rectangle r1 = new Rectangle((int) (go1.getX() - go1.getWidth() / 2),(int) (go1.getY() - go1.getHeight() / 2), (int) go1.getWidth(), (int) go1.getHeight());
        Rectangle r2 = new Rectangle((int) (go2.getX() - go2.getWidth() / 2),(int) (go2.getY() - go2.getHeight() / 2), (int) go2.getWidth(), (int) go2.getHeight());
        return r1.intersects(r2);
    }
}
