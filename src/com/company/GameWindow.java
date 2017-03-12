package com.company;

import controllers.PlayerPlaneController;
import javafx.scene.input.KeyCode;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by HongUyen on 09-Mar-17.
 */
public class GameWindow extends Frame {
    public static final int SCREEN_WIDTH = 400;
    public static final int SCREEN_WHEIGHT = 600;
    private PlayerPlaneController playerPlaneController;

    public GameWindow (){
        setVisible(true);
        setSize(SCREEN_WIDTH, SCREEN_WHEIGHT);
       // setLocationRelativeTo(null);

      //  playerPlaneController = new PlayerPlaneController();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                super.windowClosing(windowEvent);
                System.out.println("closing");
                System.exit(0);
            }
        });

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                switch (e.getKeyCode()){
                    case (KeyEvent.VK_RIGHT):{
                        playerPlaneController.run();
                    }

                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
            }
        });
    }


    public void start() {
    }
}
