package revisaoDoWhile;
import java.util.Scanner;

public class ativ_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int i = 0;
        do {
            System.out.println(num + " * " + i + " = " + (num*i));
            i++;
        } while (i < 10);
    }
}
