package Main;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class KeyboardHandler  implements KeyListener {
    private final static List<Integer> pressedKeys = new ArrayList<>();
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (!pressedKeys.contains(e.getKeyCode())){
            pressedKeys.add(e.getKeyCode());
            System.out.printf("presssaaaoo");
    }
    }


    @Override
    public void keyReleased(KeyEvent e) {
        if (pressedKeys.contains(e.getKeyCode())) pressedKeys.removeIf((key)-> key == e.getKeyCode());
    }

    public static boolean isKeyPressed(int keyCode){
        return pressedKeys.contains(keyCode);
    }
}
