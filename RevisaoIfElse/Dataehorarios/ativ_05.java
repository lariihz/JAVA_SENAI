package RevisaoIfElse.Dataehorarios;

import java.util.Scanner;

public class ativ_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Período letivo de MG: 10/02 - 12/12");
        System.out.println("Digite uma data (separe os dias dos meses com um espaço)  ");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();

        if (mes < 2  || mes > 12) {
            System.out.println("A data inserida está fora do perído especificado.");
        } else {
            if (mes == 2 && dia < 10) {
                System.out.println("A data inserida está fora do perído especificado.");
            } else if (mes == 12 && dia > 12) {
                System.out.println("A data inserida está fora do perído especificado.");
            } else {
                System.out.println("A data inserida está dentro do perído especificado.");
            }

        }

        }

    }
