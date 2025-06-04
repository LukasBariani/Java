import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Combo extends JFrame {
    JFormattedTextField texNome,texClasse,textRm;
    public Combo() throws HeadlessException {
        super("Mascara");
        setLayout(null);
        setSize(400,400);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        String[] opcoes = {"Livro1","Livro2","Livro3","Livro4"};
        JComboBox<String> combo = new JComboBox<>(opcoes);
        combo.setBounds(300, 20, 100,20);
        add(combo);

        //nome--------------------------------
        JLabel nome = new JLabel("Nome:");
        nome.setBounds(10, 20, 50, 20);
        add(nome);

        texNome = new JFormattedTextField();
        texNome.setBounds(50, 20, 100,20);
        texNome.setValue(null);
        add(texNome);
        //nome--------------------------------

        //classe--------------------------------
        JLabel classe = new JLabel("Classe:");
        classe.setBounds(10, 60, 50, 20);
        add(classe);

        texClasse = new JFormattedTextField();
        texClasse.setBounds(50, 60, 100,20);
        texClasse.setValue(null);
        add(texClasse);
        //classe--------------------------------

        //rm--------------------------------
        JLabel rm = new JLabel("RM:");
        rm.setBounds(10, 100, 50, 20);
        add(rm);

        textRm = new JFormattedTextField();
        textRm.setBounds(50, 100, 100,20);
        textRm.setValue(null);
        add(textRm);
        //rm--------------------------------

        JButton butao = new JButton("Emprestar");
        butao.setBounds(150, 150, 100,30);
        add(butao);

        butao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nom = texNome.getText();
                String cla = texClasse.getText();
                String rm = textRm.getText();

                String escolha  = (String) combo.getSelectedItem();
                JOptionPane.showMessageDialog(null, "Nome: " + nom + " " +"Classe: " + cla + " " + "RM:" + rm + " " + "Livro: " + escolha);
            }
        });




        setVisible(true);
    }
}
