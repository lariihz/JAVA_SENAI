package RevisaoIfElse.DecisoesFinanceiras;

import java.util.Scanner;

public class ativ_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Valor do produto: R$ 1200");
        System.out.print("Digite o valor do salario: ");
        double salario = scanner.nextDouble();
        System.out.print("Digite em quantas parcelas deseja pagar: ");
        double totalParcelas = scanner.nextDouble();

        double parcela = 1200 / totalParcelas;

        System.out.println();
        if (parcela <= (salario*0.10)) {
            System.out.println("Você pode efetuar a compra.");
        } else {
            System.out.println("Você não pode efetuar a compra.");
        }

    }
}
