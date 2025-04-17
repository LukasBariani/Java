import javax.swing.*;

public class EntradaSaidaDados {
    public String entradaDados(String mensagemEntrada){
        return JOptionPane.showInputDialog(mensagemEntrada);
    }

    public void saidaDados(String mensagemEntrada){
        JOptionPane.showMessageDialog(null, mensagemEntrada);
    }
}