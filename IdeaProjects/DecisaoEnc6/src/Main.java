import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a 1° nota");
        float nota1 = scanner.nextFloat();
        System.out.println("Digite a 2° nota");
        float nota2 = scanner.nextFloat();
        System.out.println("Digite a 3° nota");
        float nota3 = scanner.nextFloat();
        System.out.println("Digite a 4° nota");
        float nota4 = scanner.nextFloat();

        float media = ((nota1 + nota2 + nota3 + nota4) / 4);

        if (media >= 9) {
            System.out.println("Aprovado. Sua menção é A, com a nota " + media);
        } else if (media >= 7 && media < 9) {
            System.out.println("Aprovado. Sua menção é B, com a nota " + media);
        } else if (media >= 5 && media < 7) {
            System.out.println("Aprovado. Sua menção é C, com a nota " + media);
        } else if (media >= 2.5 && media < 5) {
            System.out.println("Reprovado. Sua menção é D, com a nota " + media);
        } else if (media < 2.5) {
            System.out.println("Reprovado. Sua menção é E, com a nota " + media);
        }

    }
}