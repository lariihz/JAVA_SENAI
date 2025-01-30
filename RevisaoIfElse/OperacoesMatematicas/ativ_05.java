package RevisaoIfElse.OperacoesMatematicas;

import java.util.Scanner;

public class ativ_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num = scanner.nextDouble();
        boolean perfeito = false;

        for (int i = 1; i < num; i++) {
            if ((i*i)==num) {
                perfeito = true;
                break;
            }
        }

        if (perfeito) {
            System.out.println(num + " é um quadrado perfeito.");
        } else {
            System.out.println(num + " NÃO é um quadrado perfeito.");
        }

    }
}
