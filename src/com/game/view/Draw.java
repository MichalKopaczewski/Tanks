package com.game.view;

import java.awt.Color;
import static org.lwjgl.opengl.GL11.*;

public class Draw {
    public static void rect(float x, float y, float height, float width, Color color) {
        rect(x, y, height, width, 0, color);
    }
    public static void rect(float x, float y, float height, float width, float rot, Color color) {
        glPushMatrix();
        {
            glTranslatef(x, y, 0);
            glRotatef(rot, 0, 0, 1);
            
            glColor3f((float) color.getRed(), (float) color.getGreen(), (float) color.getBlue());
            glBegin(GL_QUADS);
            {
                glVertex2f(-width/2, -height/2);
                glVertex2f(width/2, -height/2);
                glVertex2f(width/2, height/2);
                glVertex2f(-width/2, height/2);
//                glVertex2f(0, 0);
//                glVertex2f(0, height);
//                glVertex2f(width, height);
//                glVertex2f(width, 0);
            }
            glEnd();
        }
        glPopMatrix();
    }
}
