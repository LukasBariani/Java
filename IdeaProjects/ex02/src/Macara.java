import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Macara extends JFrame {
    JFormattedTextField texCep, texTel, texCpf, texData;
    public Macara() throws HeadlessException, ParseException {
        super("Mascara");
        setLayout(null);

        //CEP-----------------------------------------
        JLabel cep = new JLabel("CEP:");
        cep.setBounds(10, 20, 50, 20);
        add(cep);

        MaskFormatter maskCep = new MaskFormatter("######-###");
        maskCep.setPlaceholderCharacter('_');


        texCep = new JFormattedTextField(maskCep);
        texCep.setBounds(50, 30, 100,20);
        texCep.setValue(null);
        add(texCep);
        //CEP-----------------------------------------


        //TEL-----------------------------------------
        JLabel tel = new JLabel("TEL:");
        tel.setBounds(10, 60, 50, 20);
        add(tel);

        MaskFormatter maskTel = new MaskFormatter("(##)########");
        maskTel.setPlaceholderCharacter('_');

        texTel = new JFormattedTextField(maskTel);
        texTel.setBounds(50, 60, 100,20);
        texTel.setValue(null);
        add(texTel);
        //TEl-----------------------------------------

        //CPF-----------------------------------------
        JLabel cpf = new JLabel("CPF:");
        cpf.setBounds(10, 90, 50, 20);
        add(cpf);

        MaskFormatter maskCpf = new MaskFormatter("#########-##");
        maskCpf.setPlaceholderCharacter('_');

        texCpf = new JFormattedTextField(maskCpf);
        texCpf.setBounds(50, 90, 100,20);
        texCpf.setValue(null);
        add(texCpf);
        //CPF-----------------------------------------

        //DATA-----------------------------------------
        JLabel data = new JLabel("DATA:");
        data.setBounds(10, 120, 50, 20);
        add(data);

        MaskFormatter maskData = new MaskFormatter("##/##/####");
        maskData.setPlaceholderCharacter('_');

        texData = new JFormattedTextField(maskData);
        texData.setBounds(50, 120, 100,20);
        texData.setValue(null);
        add(texData);
        //DATA-----------------------------------------

        JButton butao = new JButton("SAVE");
        butao.setBounds(50, 150, 100,20);
        add(butao);

        butao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirDados();
            }
        });

        setSize(400,400);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void abrirDados(){

        String cep = texCep.getText();
        String tel = texTel.getText();
        String cpf = texCpf.getText();
        String data = texData.getText();

        JFrame janela2 = new JFrame("DADOS");
        janela2.setSize(400,400);
        janela2.setLayout(null);
        janela2.setResizable(false);
        janela2.setLocationRelativeTo(null);
        janela2.setDefaultCloseOperation(EXIT_ON_CLOSE);


        JLabel Jcep = new JLabel("Cep:" + cep);
        Jcep.setBounds(10, 30, 400, 20);
        janela2.add(Jcep);

        JLabel Jtel = new JLabel("Tel:" + tel);
        Jtel.setBounds(10, 60, 400, 20);
        janela2.add(Jtel);

        JLabel Jcpf = new JLabel("CPF:" + cpf);
        Jcpf.setBounds(10, 90, 400, 20);
        janela2.add(Jcpf);

        JLabel Jdata = new JLabel("DATA:" + data);
        Jdata.setBounds(10, 120, 400, 20);
        janela2.add(Jdata);


        janela2.setVisible(true);
    }
}
