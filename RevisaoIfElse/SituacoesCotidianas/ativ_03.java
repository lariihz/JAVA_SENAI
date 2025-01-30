package RevisaoIfElse.SituacoesCotidianas;

import java.util.Scanner;

public class ativ_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        System.out.println("Escolha a conversão:");
        System.out.println("1 - Para Fahrenheit");
        System.out.println("2 - Para Kelvin");
        System.out.print("Digite a sua opção (1 ou 2): ");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.printf("%.2f°C equivale a %.2f°F\n", celsius, fahrenheit);
        } else if (escolha == 2) {
            double kelvin = celsius + 273.15;
            System.out.printf("%.2f°C equivale a %.2fK\n", celsius, kelvin);
        } else {
            System.out.println("Opção inválida! Escolha 1 para Fahrenheit ou 2 para Kelvin.");
        }

        scanner.close();
    }
}
