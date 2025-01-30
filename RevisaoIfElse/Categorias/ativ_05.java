package RevisaoIfElse.Categorias;
import java.util.Scanner;

public class ativ_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite a temperatura atual em °C: ");
        double temperatura = scanner.nextDouble();

        if (temperatura <= 19) {
            System.out.println("Clima frio.");
        } else if (temperatura <= 25) {
            System.out.println("Clima agradável.");
        } else {
            System.out.println("Clima quente.");
        }
    }
}
