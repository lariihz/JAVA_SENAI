package revisaoFor;

import java.util.Scanner;

public class ativ_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vet = new int[10];
        int somaVet = 0;

        System.out.println("Digite 10 números: ");
        for (int i = 0; i < 10; i++) {
            vet[i] = sc.nextInt();
            somaVet += vet[i];
        }
        System.out.println();

        System.out.println("A soma dos números inseridos é igual: " + somaVet);
    }
}
