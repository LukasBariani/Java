import javax.swing.*;
import java.awt.*;

public class PrimeiraJanela extends JFrame {
    public PrimeiraJanela() throws HeadlessException {
        super("Nossa primeira janela");
        setResizable(true);
        setSize(300, 150);
        setVisible(true);
        //setExtendedState(ICONIFIED);
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
    }
}
