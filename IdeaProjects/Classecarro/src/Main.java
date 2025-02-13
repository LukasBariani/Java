//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //criando o obj/instancia da classe carro
        Carro onix = new Carro();

        onix.cor = "Vermelho";
        onix.modelo = "Onix";
        onix.motor = "1.0";

        onix.ligarCarro();
        onix.acelerar();
        onix.marcha();
        onix.frear();

        System.out.println("A cor desse carro "+ onix.modelo +" é " + onix.cor);

        onix = null;
    }
}