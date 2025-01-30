package RevisaoIfElse.DecisoesFinanceiras;

import java.util.Scanner;

public class ativ_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        if (saldo > 10) {
            System.out.println("O seu saldo é suficiente");
        } else if (saldo < 10) {
            System.out.println("O seu saldo não é suficiente");
        }
    }

}
