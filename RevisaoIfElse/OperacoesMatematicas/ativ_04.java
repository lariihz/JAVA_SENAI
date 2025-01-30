package RevisaoIfElse.OperacoesMatematicas;

import java.util.Scanner;

public class ativ_04 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite o primeiro lado do triângulo: ");
                double lado1 = scanner.nextDouble();

                System.out.print("Digite o segundo lado do triângulo: ");
                double lado2 = scanner.nextDouble();

                System.out.print("Digite o terceiro lado do triângulo: ");
                double lado3 = scanner.nextDouble();

                if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
                    System.out.println("Os números podem formar um triângulo.");
                } else {
                    System.out.println("Os números NÃO podem formar um triângulo.");
                }

                scanner.close();
            }
        }



