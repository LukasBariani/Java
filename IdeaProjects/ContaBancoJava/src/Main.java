//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(111);
        p1.setDono("Jubileu");
        p1.abrirConta("cc");
        p1.depositar(300f);
        p1.status();

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(222);
        p2.setDono("Creuza");
        p2.abrirConta("cp");
        p2.depositar(5000f);
        p2.status();
        p2.sacar(5150f);
        p2.fecharConta();

    }
}