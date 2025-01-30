package RevisaoIfElse.DecisoesFinanceiras;

import java.util.Scanner;

public class ativ_02 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite o valor total da compra: R$ ");
                double valorCompra = scanner.nextDouble();

                if (valorCompra > 500) {
                    double desconto = valorCompra * 0.10;
                    double valorFinal = valorCompra - desconto;

                    System.out.printf("Desconto de 10%% aplicado! R$ %.2f\n", desconto);
                    System.out.printf("Valor final a pagar: R$ %.2f\n", valorFinal);
                } else {
                    System.out.println("Não há desconto disponível. O valor a pagar é: R$ " + valorCompra);
                }

                scanner.close();
            }
        }

