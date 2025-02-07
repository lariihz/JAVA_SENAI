package revisaoFor;

import java.util.Scanner;

public class ativ_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vet = new int[10];
        int contPares = 0, contImpares = 0;

        System.out.println("Digite 10 números: ");
        for (int i = 0; i < 10; i++) {
            vet[i] = sc.nextInt();
            if (vet[i]%2==0) {
                contPares++;
            } else {
                contImpares++;
            }
        }
        System.out.println();

        System.out.println("Foram inseridos " + contPares + " número(s) par(es) e " + contImpares + " número(s) ímpar(es).");
    }
}
