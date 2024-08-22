
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual sua altura?");
        float altura = scanner.nextFloat();

        System.out.println("Qual seu peso?");
        float peso = scanner.nextFloat();

        System.out.println("Qual sua idade?");
        float idade = scanner.nextFloat();

        if (peso > altura && idade > peso) {
            System.out.println("Você é um velho obeso");
        }else {
            System.out.println("Tudo nos conformes");
        }

    }
}