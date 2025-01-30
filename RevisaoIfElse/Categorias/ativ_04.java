package RevisaoIfElse.Categorias;
import java.util.Scanner;

public class ativ_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua pressão arterial (separe com \".\"");
        double pressao = scanner.nextDouble();

        if (pressao < 9.6 || pressao > 14.9) {
            System.out.println("Risco alto.");
        } else if (pressao < 10.4 || pressao > 13.6) {
            System.out.println("Risco moderado.");
        } else {
            System.out.println("Risco normal.");
        }
    }
}
