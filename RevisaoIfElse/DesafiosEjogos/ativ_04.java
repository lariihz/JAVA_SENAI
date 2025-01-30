package RevisaoIfElse.DesafiosEjogos;

import java.util.Scanner;

public class ativ_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero");
        int num2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero");
        int num3 = scanner.nextInt();

        if ( num1 > num2 ) {
            if (num1 > num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            if (num1 > num3) {
                int temp = num1;
                num1 = num3;
                num3 = temp;
            }
            if (num2 > num3) {
                int temp = num2;
                num2 = num3;
                num3 = temp;
            }

            System.out.println("Os números em ordem crescente são: " + num1 + ", " + num2 + ", " + num3);

            scanner.close();
        }
    }
        }

