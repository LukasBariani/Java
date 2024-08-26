import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Formato de data Dia/Mês/Ano
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Leitura da primeira data
        System.out.print("Digite a primeira data (Dia/Mês/Ano): ");
        String data1Str = scanner.nextLine();
        LocalDate data1 = LocalDate.parse(data1Str, formato);

        // Leitura da segunda data
        System.out.print("Digite a segunda data (Dia/Mês/Ano): ");
        String data2Str = scanner.nextLine();
        LocalDate data2 = LocalDate.parse(data2Str, formato);

        // Comparação e exibição das datas em ordem crescente
        if (data1.isBefore(data2)) {
            System.out.println("As datas em ordem crescente são: " + data1.format(formato) + " e " + data2.format(formato));
        } else {
            System.out.println("As datas em ordem crescente são: " + data2.format(formato) + " e " + data1.format(formato));
        }

        scanner.close();
    }
}