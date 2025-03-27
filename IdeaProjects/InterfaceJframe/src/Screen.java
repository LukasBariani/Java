import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame {
    public Screen() {
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(800, 500);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton botao1 = new JButton("Invencivel");

        botao1.setBounds(340, 220, 120, 30);
        botao1.setFont(new Font("Arial", Font.BOLD, 12));
        botao1.setForeground(new Color(5, 57, 255, 165));
        botao1.setBackground(new Color(255, 221, 0));
        add(botao1);

        botao1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(null, "INVENCIVEL", "Cuscuz", JOptionPane.WARNING_MESSAGE);
                    }
                }
        );

    }
}
