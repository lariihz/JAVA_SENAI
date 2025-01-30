package RevisaoIfElse.SituacoesCotidianas;

import java.util.Scanner;

public class ativ_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a placa do veículo: ");
        String placa = scanner.nextLine();

        char ultimoCaracter = placa.charAt(placa.length() - 1);

        if (Character.isDigit(ultimoCaracter)) {
            int numeroFinal = Character.getNumericValue(ultimoCaracter);

            if (numeroFinal % 2 == 0) {
                System.out.println("O veículo pode passar no pedágio (placa termina com número par).");
            } else {
                System.out.println("O veículo NÃO pode passar no pedágio (placa termina com número ímpar).");
            }
        } else {
            System.out.println("A placa fornecida não tem um número válido no final.");
        }

        scanner.close();
    }
}

