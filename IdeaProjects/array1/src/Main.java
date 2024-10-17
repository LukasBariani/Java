import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nomes[] = {"Joao","Julio", "Lukas", "Daniel", "Jorge", "Gael", "Gustavo", "John", "Pedro", "Enzo"};

        Arrays.sort(nomes);

        for (String nome: nomes){
            System.out.print(nome + " ");
        }
    }
}