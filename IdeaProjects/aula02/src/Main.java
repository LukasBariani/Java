//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Caneta c1 = new Caneta();

    c1.cor = "azul";
    c1.ponta = 0.5f;
    c1.modelo = "Bic Crystal";
    c1.carga = 100;

    c1.destampar();
    c1.status();
    c1.rabiscar();

    Caneta c2 = new Caneta();

    c2.modelo = "Leo Leo";
    c2.cor = "Vermelha";

    c2.tampar();
    c2.rabiscar();
    c2.status();

    }
}