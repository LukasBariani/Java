import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1° Big mac");
        System.out.println("2° Quarteirão");
        System.out.println("3° MacChicken");
        System.out.println("4° Cheedar");
        System.out.println("5° Cheese Burguer");
        System.out.println("Digite o numero da sua escolha de lanche: ");
        int escolha = scanner.nextInt();

        if (escolha == 1){
            System.out.println("Você escolheu o Big mac");
        }
        else if (escolha == 2){
            System.out.println("Você escolheu o Quarteirão");
        }
        else if (escolha == 3){
            System.out.println("Você escolheu o Mac Chicken");
        }
        else if (escolha == 4){
            System.out.println("Você escolheu o Cheedar");
        }
        else if (escolha == 5){
            System.out.println("Você escolheu o Cheese Burguer");
        }
        else {
            System.out.println("Você não digitou um numero correto");
        }









    }
}