public class ContaCorrente extends Conta {
    private double limiteEspecial = 0;

    @Override
    public void sacar(double valor) throws Exception {
        if (valor <= 0) {
            throw new Exception("Valor de saque deve ser maior que zero.");
        }

        if (getSaldo() - valor < -limiteEspecial) {
            throw new Exception("Saque excede o limite especial.");
        }
        setSaldo(getSaldo() - valor);

    }
    @Override
    public String toString() {
        return "ContaCorrente{" +
                "saldo=" + getSaldo() +
                ", limiteEspecial=" + limiteEspecial +
                '}';
    }
}