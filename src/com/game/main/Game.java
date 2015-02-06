package com.game.main;

import java.util.ArrayList;

public class Game {
    private ArrayList<GameObject> objects;
//    private ArrayList<Tank> objects;
    private Tank tank;
    public Game() {
        objects = new ArrayList<>();
        tank = new Tank(100, 100, 100, 200);
        objects.add(tank);
    }
    public void getInput() {
    }
    public void update() {
        for (GameObject object : objects) {
            object.update();
        }
//        for (Tank object : objects) {
//            object.update();
//        }
    }
    public void render() {
        for (GameObject object : objects) {
            object.render();
        }
//        for (Tank object : objects) {
//            object.render();
//        }
    }
}
