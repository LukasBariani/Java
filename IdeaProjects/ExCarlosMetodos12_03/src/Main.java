//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        float n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));

        //add a panel to warp the interface
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));

        // add message
        JLabel optionQuestion = new JLabel("Escolha uma opção");
        panel.add(optionQuestion);

        //create a array with the options
        String[] opcoes = {"1 - Soma", "2 - Subtração", "3 - Divisão", "4 - Multiplicação", "5 - Resto da divisão",
                "6 - Dobro", "7 - Quadrado", "8 - Cubo", "9 - Raiz quadrada", "0 - Sair"};
        //create a new dropdown using the array
        JComboBox<String> comboBox = new JComboBox<>(opcoes);
        panel.add(comboBox);

        //create a page
        JDialog dialog = new JDialog();
        dialog.setTitle("Seleçao personalizada");
        dialog.setModal(true);
        dialog.setSize(300, 150);
        dialog.setResizable(true);
        dialog.setLocationRelativeTo(null);

        int result = JOptionPane.showConfirmDialog(
                null, panel, "Seleção", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE
        );

        if (result == JOptionPane.OK_OPTION) {
            String escolha = (String) comboBox.getSelectedItem();
            
            switch (escolha) {
                case "1 - Soma":
                    soma(n1, n2);
                    break;
                case "2 - Subtração":
                    subtracao(n1,n2);
                    break;
                case "3 - Divisão":
                    JOptionPane.showMessageDialog(null, "A divisão de " + n1 + " e " + n2 + " é igual a : " + (n1 / n2));
                    break;
                case "4 - Multiplicação":
                    mult(n1,n2);
                    break;
                case "5 - Resto da divisão":
                    mod(n1,n2);
                    break;
                case "6 - Dobro":
                    dobro(n1,n2);
                    break;
                case "7 - Quadrado":
                    quadrado(n1,n2);
                    break;
                case "8 - Cubo":
                    cubo(n1,n2);
                    break;
                case "9 - Raiz quadrada":
                    raiz(n1,n2);
                    break;
                case "0 - Sair":
                    sair();
                    break;
            }

            dialog.dispose();

        }
    }
    public static float soma(float a, float b){
        JOptionPane.showMessageDialog(null, "A soma de " + a + " e " + b + " é igual a: " + (a + b));
        return 1;
    }
    public static float subtracao(float a, float b){
        JOptionPane.showMessageDialog(null, "A subtração de " + a + " e " + b + " é igual a: " + (a - b));
        return 1;
    }
    public static float divisao(float a, float b){
        JOptionPane.showMessageDialog(null, "A divisão de " + a + " e " + b + " é igual a : " + (a / b));
        return 1;
    }
    public static float mult(float a, float b){
        JOptionPane.showMessageDialog(null, "A multiplicação de " + a + " e " + b + " é igual a : " + (a * b));
        return 1;
    }
    public static float mod(float a, float b){
        JOptionPane.showMessageDialog(null, "O resto da divisão de " + a + " e " + b + " é igual a : " + (a % b));
        return 1;
    }
    public static float dobro(float a,float b){
        JOptionPane.showMessageDialog(null, "O dobro de " + a + " e " + a + " é igual a : " + (a*2) + (b*2));
        return 1;
    }
    public static float quadrado(float a, float b){
        JOptionPane.showMessageDialog(null,"Os numeros " + a + b + " ao quadrado: " + Math.pow(a, 2) + " " + Math.pow(b, 2));
        return 1;
    }
    public static float cubo(float a, float b){
        JOptionPane.showMessageDialog(null,"Os numeros " + a + b + " ao cubo: " + Math.pow(a, 3) + " " + Math.pow(b, 3));
        return 1;
    }
    public static float raiz(float a, float b){
        JOptionPane.showMessageDialog(null,"Os numeros " + a + " " + b + " ao cubo: " + Math.sqrt(a) + " " + Math.sqrt(b));
        return 1;
    }
    public static void sair(){
        JOptionPane.showMessageDialog(null, "Saindo...");
        System.exit(0);
    }
}