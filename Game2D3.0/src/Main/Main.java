package Main;

import javax.swing.*;

public class Main{
    public static void main(String[] args) {
        //seting the window of the game
        JFrame window = new JFrame("Bagugadores");
        window.setDefaultCloseOperation(3);
        window.setResizable(false);
        window.addKeyListener(new KeyboardHandler());

        GamePanel gamePanel = new GamePanel();// class JPanel
        window.add(gamePanel);
        window.pack();



        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanel.startGameThread();
    }
}
