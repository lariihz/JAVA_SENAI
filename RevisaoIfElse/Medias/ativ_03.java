package RevisaoIfElse.Medias;

import java.util.Scanner;

public class ativ_03 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o primeira nota: ");
            double num1 = scanner.nextInt();

            System.out.print("Digite a seguda nota: ");
            double num2 = scanner.nextInt();

            System.out.print("Digite a terceira nota: ");
            double num3 = scanner.nextInt();

            double maior = num1;

            if (num2 > maior) {
                maior = num2;
            }

            if (num3 > maior) {
                maior = num3;
            }
            System.out.println("O maior número é: " + maior);
            scanner.close();

        }
    }

