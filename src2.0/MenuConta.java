import javax.swing.*;

public class MenuConta extends Menu {
    private ContaCorrente contaCC;
    private ContaPoupanca contaCP;

    EntradaSaidaDados inputoutput = new EntradaSaidaDados();


    @Override
    protected void executarMenu() {
        super.executarMenu();
    }

    @Override
    public void avaliarOpcaoEscolhida() {
        super.avaliarOpcaoEscolhida();
    }

    public void operarContaCC(){

    }

    public void operarContaCP(){

    }

    public MenuConta(){
        avaliarOpcaoEscolhida();

        ContaCorrente contaCC = new ContaCorrente(500,100);
        ContaPoupanca contaCP = new ContaPoupanca(5000,0.01f);

        setTitle("Menu Conta");
        setSize(500, 400);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setVisible(true);


    }

}
