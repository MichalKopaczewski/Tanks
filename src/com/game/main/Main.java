package com.game.main;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;

public class Main {
    private static Game game;
    public static void main(String args[]) {
        initDisplay();
        initGL();
        initGame();
        gameLoop();
        cleanUp();
    }
    public static void initDisplay() {
        try {
            Display.setDisplayMode(new DisplayMode(800, 600));
            Display.create();
            Display.setVSyncEnabled(true);
            Keyboard.create();
            Display.setTitle("strzalki + spacja");
        } catch (LWJGLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void initGL() {
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0, Display.getWidth(), 0, Display.getHeight(), -1, 1);
        glMatrixMode(GL_MODELVIEW);
        glClearColor(0, 0, 0, 1);
        glDisable(GL_DEPTH_TEST);
    }

    public static void initGame() {
        game = new Game();
    }
    public static void gameLoop() {
        while (!Display.isCloseRequested()) {
            getInput();
            update();
            render();
            Display.update();
            Display.sync(60);
        }

    }
    public static void getInput() {
        game.getInput();
    }
    public static void update() {
        game.update();
    }
    public static void render() {
        glClear(GL_COLOR_BUFFER_BIT);
        glLoadIdentity();
        game.render();
    }
    public static void cleanUp() {
        Keyboard.destroy();
        Display.destroy();
    }
}
