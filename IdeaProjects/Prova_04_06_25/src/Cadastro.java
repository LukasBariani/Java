import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Cadastro extends JFrame {
    JFormattedTextField texPesquisar, texId, texNome, texEnd, texMun, texCep,texTel,texCel,texCpf,texCpnpj;
    public Cadastro() throws HeadlessException, ParseException {
        super("Cadastro");
        setLayout(null);

        JLabel pesq = new JLabel("Pesquisar:");
        pesq.setBounds(10, 20, 100, 20);
        add(pesq);

        String[] opcoes = {" ","Programador","Medico","Artista","Engenheiro"};
        JComboBox<String> combo = new JComboBox<>(opcoes);
        combo.setBounds(80, 20, 100,20);
        add(combo);




        JLabel id = new JLabel("Id:");
        id.setBounds(10, 60, 50, 20);
        add(id);

        texId = new JFormattedTextField();
        texId.setBounds(80, 60, 300,20);
        texId.setValue(null);
        add(texId);


        JLabel nome = new JLabel("Nome:");
        nome.setBounds(10, 100, 50, 20);
        add(nome);

        texNome = new JFormattedTextField();
        texNome.setBounds(80, 100, 300,20);
        texNome.setValue(null);
        add(texNome);


        JLabel end = new JLabel("Endereço:");
        end.setBounds(10, 140, 50, 20);
        add(end);

        texEnd = new JFormattedTextField();
        texEnd.setBounds(80, 140, 300,20);
        texEnd.setValue(null);
        add(texEnd);


        JLabel mun = new JLabel("Municipio:");
        mun.setBounds(10, 180, 50, 20);
        add(mun);

        texMun = new JFormattedTextField();
        texMun.setBounds(80, 180, 300,20);
        texMun.setValue(null);
        add(texMun);

        //cep----------------------------
        JLabel cep = new JLabel("CEP:");
        cep.setBounds(10, 220, 50, 20);
        add(cep);

        MaskFormatter maskCep = new MaskFormatter("######-###");
        maskCep.setPlaceholderCharacter('_');


        texCep = new JFormattedTextField(maskCep);
        texCep.setBounds(50, 220, 100,20);
        texCep.setValue(null);
        add(texCep);
        //cep----------------------------

        //TEL-----------------------------------------
        JLabel tel = new JLabel("TEL:");
        tel.setBounds(10, 260, 50, 20);
        add(tel);

        MaskFormatter maskTel = new MaskFormatter("(##)####-####");
        maskTel.setPlaceholderCharacter('_');

        texTel = new JFormattedTextField(maskTel);
        texTel.setBounds(50, 260, 100,20);
        texTel.setValue(null);
        add(texTel);
        //TEl-----------------------------------------

        //CEL-----------------------------------------
        JLabel cel = new JLabel("CEL:");
        cel.setBounds(10, 300, 50, 20);
        add(cel);

        MaskFormatter maskCel = new MaskFormatter("(##)#####-####");
        maskTel.setPlaceholderCharacter('_');

        texCel = new JFormattedTextField(maskTel);
        texCel.setBounds(50, 300, 100,20);
        texCel.setValue(null);
        add(texCel);
        //CEl-----------------------------------------

        //CPF-----------------------------------------
        JLabel cpf = new JLabel("CPF:");
        cpf.setBounds(10, 340, 50, 20);
        add(cpf);

        MaskFormatter maskCpf = new MaskFormatter("###.###.###-##");
        maskCpf.setPlaceholderCharacter('_');

        texCpf = new JFormattedTextField(maskCpf);
        texCpf.setBounds(50, 340, 100,20);
        texCpf.setValue(null);
        add(texCpf);
        //CPF-----------------------------------------

        //CPF-----------------------------------------
        JLabel cpnpj = new JLabel("CNPJ:");
        cpnpj.setBounds(10, 380, 50, 20);
        add(cpnpj);

        MaskFormatter maskCnpj = new MaskFormatter("###.###.###/####-#");
        maskCnpj.setPlaceholderCharacter('_');

        texCpnpj = new JFormattedTextField(maskCnpj);
        texCpnpj.setBounds(50, 380, 100,20);
        texCpnpj.setValue(null);
        add(texCpnpj);
        //CPF-----------------------------------------

        //radio----------------------------------------------
        JLabel genero = new JLabel("Genero:");
        genero.setBounds(10, 420, 50, 20);
        add(genero);


        JRadioButton masculino = new JRadioButton("M");
        masculino.setBounds(80, 420, 40,20);
        add(masculino);

        JRadioButton feminino = new JRadioButton("F");
        feminino.setBounds(120, 420, 40,20);
        add(feminino);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(masculino);
        grupo.add(feminino);
        //radio----------------------------------------------

        JButton salvar = new JButton("Salvar");
        salvar.setBounds(10, 450, 70,50);
        add(salvar);

        JButton limpar = new JButton("Limpar");
        limpar.setBounds(100, 450, 80,50);
        add(limpar);

        JButton fechar = new JButton("Fechar");
        fechar.setBounds(190, 450, 80,50);
        add(fechar);

        limpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                texId.setValue("");
                texNome.setText("");
                texEnd.setText("");
                texMun.setText("");
                texCep.setText("");
                texTel.setText("");
                texCel.setText("");
                texCpf.setText("");
                texCpnpj.setText("");
            }
        });

        salvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String escolha  = (String) combo.getSelectedItem();
                String id = texId.getText();
                String nome = texNome.getText();
                String end =texEnd.getText();
                String mun =texMun.getText();
                String cep = texCep.getText();
                String tel = texTel.getText();
                String cel = texCel.getText();
                String cpf = texCpf.getText();
                String cnpj = texCpnpj.getText();

                JOptionPane.showMessageDialog(null,escolha + System.lineSeparator() + nome + System.lineSeparator() + id + System.lineSeparator() + end + System.lineSeparator() + mun + System.lineSeparator() + cep + System.lineSeparator()+tel+System.lineSeparator()+cel+System.lineSeparator()+cpf+System.lineSeparator()+cnpj);
            }
        });

        fechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setSize(600,600);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
