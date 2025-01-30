package RevisaoIfElse.SituacoesCotidianas;

import java.util.Scanner;

public class ativ_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        System.out.println("Digite seu peso");
        double peso = scanner.nextDouble();


        if (peso >= 50) {
            if (idade < 18 || idade > 65) {
                System.out.println("Voce nao esta apta a doar sangue ");
            } else {
                System.out.println("Esta apto a doar sangue");
            }
        } else {
            System.out.println("Voce nao esta apta a doar sangue ");

        }


    }
}
