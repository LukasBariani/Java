public class Conta {
    private double saldo = 0;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if(valor <= 0){
            EntradaSaidaDados inputOutput = new EntradaSaidaDados();
            inputOutput.saidaDados("Valor de deposito inválido");
            return;
        }
        saldo += valor;
    }

    public void sacar(double valor) throws Exception{
        EntradaSaidaDados inputOutput = new EntradaSaidaDados();
        if(valor > saldo || valor <= 0 ){
            inputOutput.saidaDados("Valor de saque inválido");
            return;
        }
        inputOutput.saidaDados("Saque de R$" + valor + " realizado com sucesso!");
        saldo -= valor;
    }

    public void atualizarSaldo(){
        if(saldo < 0 ){
            double porcent = 0.08f * -(saldo);
            saldo -= porcent;
        }
    }

}
