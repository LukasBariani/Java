//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    ContaBanco bradesco = new ContaBanco();
    bradesco.abrirConta("cc");
    bradesco.sacar(25f);
        System.out.println(bradesco.getSaldo());
    }
}