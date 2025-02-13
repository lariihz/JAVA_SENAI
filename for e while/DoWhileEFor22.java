import java.util.Scanner;

public class DoWhileEFor22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        System.out.print("Divisores de " + num + ": ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
