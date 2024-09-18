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

        int soma = 0;

        if (inicio % 2 == 0){
            inicio++;
        }

        while (inicio<fim){
          soma += inicio;
          inicio += 2;
        }
        System.out.println("A soma dos nuemeros impares desse intervalo é "+ soma );
    }
}