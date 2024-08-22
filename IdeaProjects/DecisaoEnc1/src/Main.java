//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a hora de inicio do turno (0-23): ");
        int HoraInicio = scanner.nextInt();

        if(HoraInicio >= 5 && HoraInicio < 13){

            System.out.println("Você esta no turno da manhã");
        }
        else if(HoraInicio >= 13 && HoraInicio < 21){

            System.out.println("Você esta no turno da tarde");
        }
        else if((HoraInicio >= 21 && HoraInicio <= 23) || (HoraInicio >= 0 && HoraInicio < 5)){

            System.out.println("Você esta no turno da noite");
        }
        }
    }
