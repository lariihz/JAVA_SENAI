package RevisaoIfElse.DesafiosEjogos;

import java.util.Scanner;

public class ativ_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero");
        int num2 = scanner.nextInt();

        if (num1 > 0 && num2 > 0) {
            System.out.println("Ambos os números são positivos.");
        } else if (num1 < 0 && num2 < 0) {
            System.out.println("Ambos os números são negativos.");
        } else {
            System.out.println("Os números têm sinais diferentes.");
        }

        scanner.close();
    }
}
