import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o primeiro numero: ");
        int inicio = scanner.nextInt();

        System.out.println("Escreva o segundo numero: ");
        int fim = scanner.nextInt();

        if (inicio % 2 == 0){
            inicio++;
        }

        while (inicio<=fim){
            System.out.println(inicio);
            inicio += 2;
        }
    }
}