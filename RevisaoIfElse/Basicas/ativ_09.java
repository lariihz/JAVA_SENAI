package RevisaoIfElse.Basicas;
import java.util.Scanner;

public class ativ_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num >= 10 && num <= 50) {
            System.out.println(num + " está no intervalo entre 10 e 50.");
        } else {
            System.out.println(num + " não está no intervalo entre 10 e 50.");
        }
    }
}
