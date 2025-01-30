package RevisaoIfElse.Categorias;
import java.util.Scanner;

public class ativ_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        if (altura<1.65) {
            System.out.println("Altura baixa");
        } else if (altura <= 1.80) {
            System.out.println("Altura média.");
        } else {
            System.out.println("Altura alta.");
        }
    }
}
