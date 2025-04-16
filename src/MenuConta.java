import javax.swing.*;

public class MenuConta extends Menu {
    private ContaCorrente contaCC;
    private ContaPoupanca contaCP;

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
        setTitle("Menu Conta");
        setSize(500, 400);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


    }

}
