package criacaoMetodos;

import java.util.Scanner;

public class ativ_05 {
    public static boolean somaMaiorQueCem(int num1, int num2) {
        return (num1 + num2) > 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário os dois números
        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        // Verifica se a soma é maior que 100
        if (somaMaiorQueCem(num1, num2)) {
            System.out.println("A soma dos dois números é maior que 100.");
        } else {
            System.out.println("A soma dos dois números não é maior que 100.");
        }

        scanner.close();
    }
}

