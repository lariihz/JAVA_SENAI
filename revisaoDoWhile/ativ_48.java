package revisaoDoWhile;
import java.util.Scanner;

public class ativ_48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Digite um número (0 para finalizar a execução): ");
            num = sc.nextInt();

            if (num != 0) {
                if (num%2==0) {
                    System.out.println("O número inserido é par.");
                } else {
                    System.out.println("O número inserido é ímpar.");
                }
            }
        } while (num != 0);
    }
}
