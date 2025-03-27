import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaB  extends JFrame {
    public TelaB(){
        setTitle("Calculadora bhaskara");
        setSize(500, 400);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel textoA = new JLabel("A");
        textoA.setFont(new Font("Arial", Font.BOLD, 30));
        textoA.setBounds(25, 50, 50,40);
        textoA.setForeground(new Color(0, 255, 255));
        add(textoA);

        JTextField fieldA = new JTextField();
        fieldA.setBounds(70, 55, 70,30);
        add(fieldA);

        JLabel textoB = new JLabel("B");
        textoB.setFont(new Font("Arial", Font.BOLD, 30));
        textoB.setBounds(25, 100, 50,40);
        textoB.setForeground(new Color(255, 0, 0));
        add(textoB);

        JTextField fieldB = new JTextField();
        fieldB.setBounds(70, 105, 70,30);
        add(fieldB);

        JLabel textoC = new JLabel("C");
        textoC.setFont(new Font("Arial", Font.BOLD, 30));
        textoC.setBounds(25, 150, 50,40);
        textoC.setForeground(new Color(255, 235, 0));
        add(textoC);

        JTextField fieldC = new JTextField();
        fieldC.setBounds(70, 155, 70,30);
        add(fieldC);

        JButton calc = new JButton("Calcular");
        calc.setFont(new Font("Arial", Font.BOLD, 15));
        calc.setBounds(25, 200, 100,30);
        add(calc);

        JButton grafico = new JButton("Grafico");
        grafico.setFont(new Font("Arial", Font.BOLD, 15));
        grafico.setBounds(25, 250, 100,30);
        add(grafico);

        JLabel x1 = new JLabel("X1: ");
        x1.setFont(new Font("Arial", Font.BOLD, 20));
        x1.setBounds(200, 50, 50,40);
        add(x1);

        JLabel boxx1 = new JLabel();
        boxx1.setFont(new Font("Arial", Font.BOLD, 20));
        boxx1.setBounds(250, 50, 50,40);
        add(boxx1);

        JLabel x2 = new JLabel("X2: ");
        x2.setFont(new Font("Arial", Font.BOLD, 20));
        x2.setBounds(200, 100, 50,40);
        add(x2);

        JLabel boxx2 = new JLabel();
        boxx2.setFont(new Font("Arial", Font.BOLD, 20));
        boxx2.setBounds(250, 100, 50,40);
        add(boxx2);

        JLabel delta = new JLabel("Delta: ");
        delta.setFont(new Font("Arial", Font.BOLD, 20));
        delta.setBounds(200, 150, 100,40);
        add(delta);

        JLabel boxDelta = new JLabel();
        boxDelta.setFont(new Font("Arial", Font.BOLD, 20));
        boxDelta.setBounds(270, 150, 100,40);
        add(boxDelta);

        calc.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        double a,b,c;
                        double delta, x1, x2;

                        a = Double.parseDouble(fieldA.getText());
                        b = Double.parseDouble(fieldB.getText());
                        c = Double.parseDouble(fieldC.getText());

                        delta = Math.pow(b, 2f) - (4 * a * c);

                        if (delta < 0){
                            JOptionPane.showMessageDialog(null, "Delta menor que 0", "Erro",JOptionPane.WARNING_MESSAGE);
                        }else {
                            x1 = (-b + Math.sqrt(delta)) / 2*a;
                            x2 = (-b - Math.sqrt(delta)) / 2*a;

                            boxx1.setText(String.format("%.2f", x1));
                            boxx2.setText(String.format("%.2f", x2));

                            boxDelta.setText(String.format("%.2f", delta));
                        }
                    }
                }
        );

        grafico.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        double a,b,c;
                        double delta, x1, x2;

                        a = Double.parseDouble(fieldA.getText());
                        b = Double.parseDouble(fieldB.getText());
                        c = Double.parseDouble(fieldC.getText());

                        delta = Math.pow(b, 2f) - (4 * a * c);

                        x1 = (-b + Math.sqrt(delta)) / 2*a;
                        x2 = (-b - Math.sqrt(delta)) / 2*a;

                        GraficoParabola.exibirGrafico(a, b, c, x1, x2);
                    }
                }
        );

        setVisible(true);
    }
}
