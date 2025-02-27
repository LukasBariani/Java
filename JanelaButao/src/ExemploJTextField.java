import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ExemploJTextField extends JFrame {
    JLabel rotulo1, rotulo2, rotulo3, rotulo4;
    JTextField texto1, texto2, texto3, texto4;
    JButton closeButton = new JButton("Fechar Página");

    public ExemploJTextField() {
        super("Exemplo com JTextField");
        //setExtendedState(ICONIFIED);
        setResizable(false);
        Container tela = getContentPane();
        tela.setBackground(Color.GRAY);
        setLayout(null);

        // Criando e configurando o botão de fechar
        closeButton = new JButton("Fechar Página");
        closeButton.setBounds(110, 180, 150, 30); // Ajuste a posição do botão
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Fechar a janela
                dispose();  // Não precisa de "frame", pois a classe já herda JFrame
            }
        });

        rotulo1 = new JLabel("Nome");
        rotulo2 = new JLabel("Idade");
        rotulo3 = new JLabel("Telefone");
        rotulo4 = new JLabel("Celular");
        texto1 = new JTextField(50);
        texto2 = new JTextField(3);
        texto3 = new JTextField(10);
        texto4 = new JTextField(10);
        rotulo1.setBounds(50, 20, 80, 20);
        rotulo1.setForeground(new Color(0, 0, 0));
        rotulo1.setFont(new Font("Arial",Font.BOLD,14));
        rotulo2.setBounds(50, 60, 80, 20);
        rotulo2.setForeground(Color.WHITE);
        rotulo2.setFont(new Font("Comic Sans MS",Font.BOLD,16));
        rotulo3.setBounds(50, 100, 80, 20);
        rotulo3.setFont(new Font("Times New Roman",2,14));
        rotulo3.setForeground(Color.BLACK);
        rotulo4.setBounds(50, 140, 80, 20);
        rotulo4.setForeground(Color.white);
        rotulo4.setFont(new Font("Counter New",Font.BOLD,14));
        texto1.setBounds(110, 20, 200, 20);
        texto2.setBounds(110, 60, 20, 20);
        texto3.setBounds(110, 100, 80, 20);
        texto4.setBounds(110, 140, 80, 20);
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(closeButton);

        setSize(400, 250);
        setVisible(true);
        setLocationRelativeTo(null);

    }
}
