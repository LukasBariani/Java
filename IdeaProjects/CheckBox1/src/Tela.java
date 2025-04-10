import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela extends JFrame {
    public Tela(){
        setTitle("Exemplo de CheckBox");
        setSize(500, 350);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JRadioButton ch1 = new JRadioButton("Rio de Janeiro");
        ch1.setBounds(50, 50, 150, 30);
        add(ch1);

        JRadioButton ch2 = new JRadioButton("São Paulo");
        ch2.setBounds(50, 80, 150, 30);
        add(ch2);

        JRadioButton ch3 = new JRadioButton("Minas Gerais");
        ch3.setBounds(50, 110, 150, 30);
        add(ch3);

        JRadioButton ch4 = new JRadioButton("Amazonas");
        ch4.setBounds(50, 140, 150, 30);
        add(ch4);

        JRadioButton ch5 = new JRadioButton("Rio Grande do Sul");
        ch5.setBounds(50, 170, 150, 30);
        add(ch5);

        JButton exibir = new JButton("Exibir");
        exibir.setBounds(100, 200,100, 35);
        add(exibir);
        exibir.setToolTipText("Botao para exobir a cidade escolhida");

        JLabel rotulo = new JLabel();
        rotulo.setBounds(100, 230,500, 35);
        add(rotulo);

        exibir.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(ch1.isSelected() == true){
                            rotulo.setText("A cidade escolhida foi: " + ch1.getText());
                        } else if (ch2.isSelected() == true) {
                            rotulo.setText("A cidade escolhida foi: " + ch2.getText());
                        } else if (ch3.isSelected() == true) {
                            rotulo.setText("A cidade escolhida foi: " + ch3.getText() );
                        }else if (ch4.isSelected() == true) {
                            rotulo.setText("A cidade escolhida foi: " + ch4.getText() );
                        }else if (ch5.isSelected() == true) {
                            rotulo.setText("A cidade escolhida foi: " + ch5.getText() );
                        }
                    }
                }
        );

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(ch1);
        grupo.add(ch2);
        grupo.add(ch3);
        grupo.add(ch4);
        grupo.add(ch5);

        setVisible(true);
    }
}
