package RevisaoIfElse.Basicas;
import java.util.Scanner;

public class ativ_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num >= 100 && num <= 200) {
            System.out.println(num + " está dentro do intervalo entre 100 e 200.");
        } else {
            System.out.println(num + " está fora do intervalo entre 100 e 200.");
        }
    }
}
