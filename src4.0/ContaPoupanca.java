public class ContaPoupanca extends Conta{

    public ContaPoupanca(double saldo, double reajusteMensal) {
        super(saldo);
        this.reajusteMensal = reajusteMensal;
    }

    private double reajusteMensal = 0;

    @Override
    public void atualizarSaldo() {

    }
}
