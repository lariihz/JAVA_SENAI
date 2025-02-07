package revisaoFor;
import java.util.Scanner;

public class ativ_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        System.out.println();

        System.out.println("Divisores de "+ num + ": ");

        for (int i = 1; i <= num; i++) {
            if (num%i==0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
