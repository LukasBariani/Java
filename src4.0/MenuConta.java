import javax.swing.*;

public class MenuConta extendsMenu {
    private ContaCorrente contaCC;
    private ContaPoupanca contaCP;

    EntradaSaidaDados inputoutput = new EntradaSaidaDados();


    public void operarContaCC(){
        super.executarMenu();

        switch (getOpcao()){
            case 1:
                String Saldo = contaCC.toString();
                break;
            case 2:
                double valorDeposito = (new ConversorNumeros()).stringToDouble(inputoutput.entradaDados("Insira valor de deposito"));
                contaCC.depositar(valorDeposito);
                break;
            case 3:
                double valorSaque = (new ConversorNumeros()).stringToDouble(inputoutput.entradaDados("Insira valor do saque"));
                contaCC.sacar(valorSaque);
                break;
            case 4:
                contaCC.atualizarSaldo();
            case 0:
                setOpcao(-1);
                return;
                break;
            default:
                inputoutput.saidaDados("Opção inválida. Tente novamente.");
                avaliarOpcaoEscolhida();
        }
    }

    public void operarContaCP(){
        super.executarMenu();
        switch (getOpca0()){
            case 1:
                String Saldo = contaCP.toString();
                break;
            case 2:
                double valorDeposito = (new ConversorNumeros()).stringToDouble(inputoutput.entradaDados("Insira valor de deposito"));
                contaCC.depositar(valorDeposito);
                break;
            case 3:
                double valorSaque = (new ConversorNumeros()).stringToDouble(inputoutput.entradaDados("Insira valor do saque"));
                contaCP.sacar(valorSaque);
                break;
            case 4:
                contaCP.atualizarSaldo();
            case 0:
                setOpcao(-1);
                return;
            break;
            default:
                inputoutput.saidaDados("Opção inválida. Tente novamente.");
                avaliarOpcaoEscolhida();
        }

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
