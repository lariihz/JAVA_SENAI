package revisaoDoWhile;

import java.util.Scanner;

public class ativ_54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            if (num >= 0) {
                System.out.println("A raiz quadrada de " + num + " é igual a: " + Math.sqrt(num));
            }
        } while (num >= 0);
    }
}
