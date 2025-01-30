package RevisaoIfElse.Basicas;
import java.util.Scanner;

public class ativ_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        if ((num % 5) == 0) {
            System.out.println(num + " é múltiplo de 5.");
        } else {
            System.out.println(num + " não é múltiplo de 5.");
        }
        sc.close();
    }
}
