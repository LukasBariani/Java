//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIc bosta";
        c1.cor = "blue";
        c1.ponta = 0.5f;
        c1.carga = 80;
        c1.destampar();
        c1.rabiscar();
        c1.status();

    }
}