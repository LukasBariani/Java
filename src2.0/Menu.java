import javax.swing.*;

public class Menu extends JFrame {
    private int opcao;
    private String mensagemMenu;

    public void executar(){

    }

    protected void executarMenu(){
        JFrame telaMenu = new JFrame();

    }

    public void avaliarOpcaoEscolhida(){
        EntradaSaidaDados inputOutput = new EntradaSaidaDados();

        inputOutput.entradaDados("escolha uma opção" +
                "1 - Conta Corrente" +
                "2 - Conta Poupança" +
                "0 - Sair Do programa");

    }


}
