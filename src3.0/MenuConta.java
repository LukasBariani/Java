import javax.swing.*;

public class MenuConta extends Menu {
    private ContaCorrente contaCC;
    private ContaPoupanca contaCP;

    EntradaSaidaDados inputoutput = new EntradaSaidaDados();


    public void operarContaCC(){

    }

    public void operarContaCP(){

    }


    @Override
    protected void executarMenu() {
        super.executarMenu();
    }

    @Override
    public void avaliarOpcaoEscolhida() {
        super.avaliarOpcaoEscolhida();

        switch (getOpcao()){
            case 1:
                operarContaCC();
                break;
            case 2:
                operarContaCP();
                break;
            case 0:
                inputoutput.saidaDados("Saindo do programa");
                System.exit(0);
                break;
            default:
                inputoutput.saidaDados("Opção inválida. Tente novamente.");
                avaliarOpcaoEscolhida();


        }

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
