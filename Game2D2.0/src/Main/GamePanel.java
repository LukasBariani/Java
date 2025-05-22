package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class GamePanel extends JPanel implements Runnable {
    //Screen settings
    final int originalTileSize = 16; //the blocks of the game are 16x16
    final int scale = 3;

    final int tileSize = originalTileSize * scale; // 48x48
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol; // 768px
    final int screenHeigh = tileSize * maxScreenRow; // 576px
    int x = 50;
    int y = 0;

    Thread gameThread;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth,screenHeigh)); //definition panel
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
    }

    public void startGameThread(){ // where the game start run
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        while(gameThread != null){


            //ggSystem.out.println("The game loop is running");

            //UPDATE the information
            update();
            //DRAW with the update information
            repaint();
        }
    }


    public void update() {

    }
    public void paintComponent(Graphics g){

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.pink);
        g2.fillRect(x, y, tileSize,tileSize);
        g2.dispose();

        if (KeyboardHandler.isKeyPressed(KeyEvent.VK_D) && x < 740 ){
            x++;
        }
        if (KeyboardHandler.isKeyPressed(KeyEvent.VK_A) && x > 0 ){
            x--;
        }
        if (KeyboardHandler.isKeyPressed(KeyEvent.VK_S)){
            y++;
        }
        if (KeyboardHandler.isKeyPressed(KeyEvent.VK_W)){
            y--;
        }
    }
}
