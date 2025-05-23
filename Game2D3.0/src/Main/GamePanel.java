package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class GamePanel extends JPanel implements Runnable {
    //Screen settings
    final int originalTileSize = 16; //the blocks of the game are 16x16
    final int scale = 3;

    final int tileSize = originalTileSize * scale; // 48x48px
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol; // 768px
    final int screenHeigh = tileSize * maxScreenRow; // 576px
    //position
    int x = 20;
    int y = 20;

    int x2 = 80;
    int y2 = 20;
    //velocity
    int hspd = 0;
    int vspd = 0;

    int hspd2 = 0;
    int vspd2 = 0;

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


            //System.out.println("The game loop is running");

            //UPDATE the information
            update();
            //DRAW with the update information
            repaint();
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public void update() {

    }
    public void paintComponent(Graphics g){

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.pink);
        g2.fillRect(x, y, tileSize,tileSize);
        hspd=0;
        vspd=0;
        if (KeyboardHandler.isKeyPressed(KeyEvent.VK_RIGHT)){
            hspd=10;
        }
        if (KeyboardHandler.isKeyPressed(KeyEvent.VK_LEFT) ){
            hspd=-10;
        }
        if (KeyboardHandler.isKeyPressed(KeyEvent.VK_DOWN)){
            vspd=10;
        }
        if (KeyboardHandler.isKeyPressed(KeyEvent.VK_UP)) {
            vspd=-10;
        }

        //verifica se tem sobreposiçao
        if (x + hspd < x2 + tileSize &&
            x + tileSize + hspd > x2 &&
            y + vspd < y2 + tileSize &&
            y + tileSize + vspd > y2) {

            System.out.println("COLIDIU");

            // Bloquear movimento na direção que causaria colisão
            if (x + tileSize <= x2) {
                hspd = 0;
                System.out.println("Bateu na esquerda");
            }
            if (x >= x2 + tileSize) {

                hspd = 0;
                System.out.println("Bateu na direita");
            }
            if (y + tileSize <= y2) {
                vspd = 0;
                System.out.println("Bateu em cima");
            }
            if (y >= y2 + tileSize) {
                vspd = 0;
                System.out.println("Bateu embaixo");
            }
        }
        //left
        if (x+hspd <= 0){
            while (x-1 > 0){
                x--;
                System.out.println("a");
            }
            hspd = 0;
        }
        //right
        if ((x+tileSize)+hspd >= 768){
            while (x+tileSize+1 < 768){
                x++;
                System.out.println("a");
            }
            hspd = 0;
        }
        //bottom
        if ((y+tileSize)+vspd >= 576){
            while (y+tileSize+1 < 576){
                y++;
                System.out.println("b");
            }
            vspd = 0;
        }
        //top
        if (y+vspd <=0){
            while (y-1 > 0){
                y--;
            }
            vspd = 0 ;
        }

        x+=hspd;
        y+=vspd;



//------------------------------------bloco dois

        g.setColor(Color.blue);
        g.fillRect(x2, y2, tileSize,tileSize);
        hspd2 = 0;
        vspd2 = 0;
        if (KeyboardHandler.isKeyPressed(KeyEvent.VK_D )){
            hspd2+= 10;
        }
        if (KeyboardHandler.isKeyPressed(KeyEvent.VK_A)){
            hspd2-=10;
        }
        if (KeyboardHandler.isKeyPressed(KeyEvent.VK_S)){
            vspd2+=10;
        }
        if (KeyboardHandler.isKeyPressed(KeyEvent.VK_W)) {
            vspd2-=10;
        }
        //verifica se tem sobreposiçao
        if (x2 + hspd2 < x + tileSize &&
                x2 + tileSize + hspd2 > x &&
                y2 + vspd2 < y + tileSize &&
                y2 + tileSize + vspd2 > y) {

            System.out.println("COLIDIU");

            // Bloquear movimento na direção que causaria colisão
            if (x2 + tileSize <= x) {
                while (x2 + tileSize + 1 > x){
                    x2++;
                }
                hspd2 = 0;
                System.out.println("Bateu na esquerda");
            }
            if (x2 >= x + tileSize) {

                hspd2 = 0;
                System.out.println("Bateu na direita");
            }
            if (y2 + tileSize <= y) {
                vspd2 = 0;
                System.out.println("Bateu em cima");
            }
            if (y2 >= y + tileSize) {
                vspd2 = 0;
                System.out.println("Bateu embaixo");
            }
        }

        //left
        if (x2+hspd2 <= 0){
            while (x2-1 > 0){
                x2--;
                System.out.println("a");
            }
            hspd2 = 0;
        }
        //right
        if ((x2+tileSize)+hspd2 >= 768){
            while (x2+tileSize+1 < 768){
                x2++;
                System.out.println("a");
            }
            hspd2 = 0;
        }
        //bottom
        if ((y2+tileSize)+vspd2 >= 576){
            while (y2+tileSize+1 < 576){
                y2++;
                System.out.println("b");
            }
            vspd2 = 0;
        }
        //top
        if (y2+vspd2 <=0){
            while (y2-1 > 0){
                y2--;
            }
            vspd2 = 0 ;
        }
        x2+=hspd2;
        y2+=vspd2;
    }
}
