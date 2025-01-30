package RevisaoIfElse.OperacoesMatematicas;

import java.util.Scanner;

public class ativ_03 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite o primeiro número: ");
                int num1 = scanner.nextInt();

                System.out.print("Digite o segundo número: ");
                int num2 = scanner.nextInt();

                if (num1 % num2 == 0) {
                    System.out.println(num1 + " é divisível por " + num2);
                } else if (num2 % num1 == 0) {
                    System.out.println(num2 + " é divisível por " + num1);
                } else {
                    System.out.println("Nenhum número é divisível pelo outro.");
                }

                scanner.close();
            }
        }
