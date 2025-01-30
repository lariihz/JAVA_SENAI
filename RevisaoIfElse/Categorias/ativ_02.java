package RevisaoIfElse.Categorias;
import java.util.Scanner;

public class ativ_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite um número: ");
        double num = scanner.nextDouble();

        if (num <0 || num > 30) {
            System.out.println("Número inválido.");
        } else if (num <= 10) {
            System.out.println("Classificação A.");
        } else if (num <= 20) {
            System.out.println("Classificação B.");
        } else {
            System.out.println("Classificação C");
        }
    }
}
