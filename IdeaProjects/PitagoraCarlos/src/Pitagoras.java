import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pitagoras extends JFrame {
    private JTextArea triangulo;
    public Pitagoras() {
        setTitle("Teorema de Pitagoras");
        setSize(500, 400);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setBackground(new Color(0, 255, 144));

        JLabel textA = new JLabel("A: ");
        textA.setBounds(25, 50, 100,30);
        textA.setFont(new Font("Arial", Font.BOLD, 20));
        add(textA);

        JTextField fieldA = new JTextField();
        fieldA.setBounds(50, 50, 50,30);
        add(fieldA);

        JLabel textB = new JLabel("B: ");
        textB.setFont(new Font("Arial", Font.BOLD, 20));
        textB.setBounds(25, 100, 100,30);
        add(textB);

        JTextField fieldB = new JTextField();
        fieldB.setBounds(50, 100, 50,30);
        add(fieldB);

        JLabel hipo = new JLabel("Hipotenusa: ");
        hipo.setFont(new Font("Arial", Font.BOLD, 20));
        hipo.setBounds(25, 150, 200,30);
        add(hipo);

        JTextField texthipo = new JTextField();
        texthipo.setBounds(40, 200, 50,30);
        texthipo.setEditable(false);
        add(texthipo);

        JButton criarTriangulo = new JButton("Calcular");
        criarTriangulo.setFont(new Font("Arial", Font.BOLD, 15));
        criarTriangulo.setBounds(25, 300, 100,30);
        add(criarTriangulo);

        triangulo = new JTextArea();
        triangulo.setBounds(150, 25, 300, 300);
        triangulo.setFont(new Font("Arial", Font.BOLD, 15));
        triangulo.setEditable(false);
        add(triangulo);

        criarTriangulo.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        int altura = Integer.parseInt(fieldA.getText());;
                        String trianguloString = conTria(altura);
                        triangulo.setText(trianguloString);

                        double a, b, h;


                        a = Double.parseDouble(fieldA.getText());
                        b = Double.parseDouble(fieldB.getText());
                        h = Math.sqrt((Math.pow(a, 2)) + Math.pow(b, 2));

                        texthipo.setText(String.format("%.2f", h));
                    }
                }
        );
        setVisible(true);
    }

    public static String conTria(int altura){
        StringBuilder triangulo = new StringBuilder();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                triangulo.append(" ◺ ");
            }
            triangulo.append("\n"); // Adiciona uma nova linha
        }
        return triangulo.toString();
    }

}
