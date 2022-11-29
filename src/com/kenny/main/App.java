package com.kenny.main;

import javax.swing.JFrame;

public class App {

    public static void main(String[] args) {

        // create window
        JFrame window = new JFrame();

        // close window when users clicks 'x' button
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // so users cannot resize window
        window.setResizable(false);

        // set title on the window
        window.setTitle("Kenny's Adventure");

        // add panel to the window
        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        /*
         * the window will size to fit the preferred size
         * and layouts of its subcomponents (=gamePanel)
         */
        window.pack();

        // window will be displayed on the center of the screen
        window.setLocationRelativeTo(null);

        // to see the window
        window.setVisible(true);

        // calling all setup before the game starts
        gamePanel.setupGame();

        // start the game
        gamePanel.startGameThread();
    }

}
