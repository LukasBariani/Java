//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // pega os coeficientes
        System.out.print("Digite o coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o coeficiente b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o coeficiente c: ");
        double c = scanner.nextDouble();

                if (a == 0){ // verifica se a é igual a 0
                    if (b == 0 ) { //se a é igual a 0 verifica se o b tbm é
                        System.out.println("Equação inválida");
                    }else { // se o b nao for igual a zero a equaçao n é do segundo grau ent usa outra formula
                        double x = -c /b;
                        System.out.println("A equação não é do segundo grau mas aqui está o x: " + x);
                    }
                }else {
                    // calc b ao quadrado ( dava pra fazer assim: b*b
                    double bquadrado = Math.pow(b, 2);
                    //calc delta
                    double delta = bquadrado - 4 * a * c;

                    if (delta < 0 ){
                        System.out.println("nao tem nos reais");
                    } else if (delta == 0) {
                        double x = -b / (2 *a);
                        System.out.println("possui apenas uma raiz, que é: " + x);
                    } else {
                        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                        System.out.println("O x1 é: " + x1);
                        System.out.println("O x2 é: " + x2);
                    }
                }
    }
}
