import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Soma extends JFrame {

    //cria os labels
    JLabel rotulo1, rotulo2, exibir;
    //cria as caixas de texto
    JTextField texto1, texto2;
    //cria o botao
    JButton somar, subtrair, multi, div, pote, raiz;

    public Soma() {
        super("Exemplo de Calculadora");
        Container tela = getContentPane();
        setLayout(null);
        tela.setBackground(new Color(255, 182, 193));

        setLocationRelativeTo(null);

        rotulo1 = new JLabel("1° Número: ");
        rotulo2 = new JLabel("2° Número: ");
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        exibir = new JLabel("");
        subtrair = new JButton("Subtrair");
        subtrair.setForeground(Color.white);
        somar = new JButton("Somar");
        multi = new JButton("Multiplicar");
        div = new JButton("Dividir");
        pote = new JButton("Potencializar");
        pote.setForeground(Color.white);
        raiz = new JButton("Raiz Quadrada");
        rotulo1.setBounds(50, 20, 100, 20);
        rotulo2.setBounds(50, 60, 100, 20);
        texto1.setBounds(120, 20, 200, 20);
        texto2.setBounds(120, 60, 200, 20);
        exibir.setBounds(50, 180, 500, 20);
        somar.setBounds(50, 100, 80, 20);
        somar.setBackground(Color.orange);
        subtrair.setBounds(150, 100, 80, 20);
        subtrair.setBackground(Color.BLUE);
        multi.setBounds(250, 100, 80, 20);
        multi.setBackground(Color.green);
        div.setBounds(50, 150, 80, 20);
        div.setBackground(Color.CYAN);
        pote.setBounds(150, 150, 80, 20);
        pote.setBackground(Color.RED);
        raiz.setBounds(250, 150, 80, 20);
        raiz.setBackground(Color.yellow);

        somar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int numero1, numero2, soma;
                        soma = 0;
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());
                        soma = numero1 + numero2;
                        exibir.setVisible(true);
                        exibir.setText("A soma é: " + soma);
                    }
                }
        );

        subtrair.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int numero1, numero2, sub;
                        sub = 0;
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());
                        sub = numero1 - numero2;
                        exibir.setVisible(true);
                        exibir.setText("A subtração é: " + sub);
                    }
                }
        );

        multi.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int numero1, numero2, multi;
                        multi = 0;
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());
                        multi = numero1 * numero2;
                        exibir.setVisible(true);
                        exibir.setText("A Multiplicaçao é: " + multi);
                    }
                }
        );
        div.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        float numero1, numero2, div;
                        div = 0;
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());
                        div = numero1 / numero2;
                        exibir.setVisible(true);
                        exibir.setText("A Divisão é: " + div);
                    }
                }
        );

        pote.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        double numero1, numero2, pote;
                        pote = 0;
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());
                        pote = Math.pow(numero1, numero2);
                        exibir.setVisible(true);
                        exibir.setText("A potenciação é: " + pote);
                    }
                }
        );

        raiz.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        double numero1, numero2, pote, pote2;
                        pote = 0;
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());
                        pote = Math.sqrt(numero1);
                        pote2 = Math.sqrt(numero2);
                        exibir.setVisible(true);
                        exibir.setText("A raiz quadrada de " + numero1 + " é: " + pote + ", e do "+ numero2 +" é: " + pote2);
                    }
                }
        );

        exibir.setVisible(false);
        tela.add(rotulo1); tela.add(rotulo2);
        tela.add(texto1); tela.add(texto2);
        tela.add(exibir); tela.add(somar);
        tela.add(subtrair);tela.add(multi);
        tela.add(div);tela.add(pote);
        tela.add(raiz);
        setSize(400, 250);
    }
}

