import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual sua altura? (em metros)");
         double alt = scanner.nextDouble();

        System.out.println("Qual seu peso? (em kg)");
         double kg = scanner.nextDouble();

        //calcula o indice de massa corporal
        double imc = (kg / (alt * alt) );

        if(imc < 18){
            System.out.println("Seu IMC é de " + imc + " .Você está em estado de fraqueza ");
        }
        else if ((imc >= 18) && (imc <= 24.9)) {
            System.out.println("Seu IMC é de " + imc + " .Você está em estado de saudável ");
        } else if ((imc >= 25) && (imc <= 29.9)) {
            System.out.println("Seu IMC é de " + imc + " .Você está em estado de sobrepeso ");
        } else if (imc >= 30) {
            System.out.println("Seu IMC é de " + imc + " .Você está em estado de obesidade ");
        }


    }
}