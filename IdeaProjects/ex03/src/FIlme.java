import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FIlme extends JFrame {
    public FIlme() throws HeadlessException {
        super("Seleção de filmes");
        setSize(500, 500);
        setResizable(false);
        setLayout(null);

        JCheckBox acao = new JCheckBox("Ação:");
        acao.setBounds(40, 40, 200, 20);
        add(acao);


        JCheckBox com = new JCheckBox("Comedia:");
        com.setBounds(40, 80, 200, 20);
        add(com);

        JCheckBox comR = new JCheckBox("Comedia Romântica:");
        comR.setBounds(40, 120, 200, 20);
        add(comR);

        JCheckBox fic = new JCheckBox("Ficção:");
        fic.setBounds(40, 160, 200, 20);
        add(fic);

        JCheckBox rom = new JCheckBox("Romance:");
        rom.setBounds(40, 200, 200, 20);
        add(rom);

        JCheckBox sus = new JCheckBox("Suspense:");
        sus.setBounds(40, 240, 200, 20);
        add(sus);

        JCheckBox ter = new JCheckBox("Terror:");
        ter.setBounds(40, 280, 200, 20);
        add(ter);

        JButton butao = new JButton("Mostrar");
        butao.setBounds(40, 320, 100, 50);
        add(butao);

        butao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon icon = new ImageIcon("C:/Users/SeuUsuario/SeuProjeto/foto.png");
                if (acao.isSelected()){
                    JOptionPane.showMessageDialog(
                            null,
                            null,
                            "Ação",
                            JOptionPane.PLAIN_MESSAGE,
                            icon);
                    if (icon.getIconWidth() == -1) {
                        System.out.println("Imagem não encontrada!");
                    } else {
                        System.out.println("Imagem carregada!");
                    }
                } else if (com.isSelected()) {

                } else if (comR.isSelected()) {

                } else if (fic.isSelected()) {

                }else if (rom.isSelected()){

                } else if (sus.isSelected()) {

                } else if (ter.isSelected()) {

                }
            }
        });


        setVisible(true);
    }
}
