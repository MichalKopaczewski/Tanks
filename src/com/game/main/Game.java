package com.game.main;

import java.awt.Color;
import java.util.ArrayList;

public class Game {
    private ArrayList<GameObject> objects;
    private Tank tank;
    public Game() {
        objects = new ArrayList<>();
        tank = new Tank(300, 300, 50, 100, Color.BLUE, 0);
        objects.add(tank);
    }
    public void getInput() {
        tank.getInput();
    }
    public void update() {
        for (GameObject object : objects) {
            object.update();
        }
    }
    public void render() {
        for (GameObject object : objects) {
            object.render();
        }
    }
}
