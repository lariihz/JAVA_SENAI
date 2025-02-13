package revisaoDoWhile;

import java.util.Scanner;

public class ativ_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        System.out.println("Digite números: (Digite 0 para exibir a soma)");
        int num;
        do {
            num = sc.nextInt();
            soma += num;
        } while (num > 0);
        System.out.println("A soma dos números inseridos é igual a: " + soma);
    }
}
