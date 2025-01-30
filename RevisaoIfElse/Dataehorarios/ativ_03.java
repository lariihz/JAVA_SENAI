package RevisaoIfElse.Dataehorarios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ativ_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um mes");
        String mes = scanner.nextLine();
        System.out.println("digite um dia");
        int dia = scanner.nextInt();

        String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        boolean valido = false;
        for (int i = 0; i < 12; i++) {
            if (mes.equals(meses[i])) {
                valido = true;
                break;
            }
        }
        if (valido == false) {
            System.out.println("Mês inválido.");
        } else {
            valido = false;
            for (int i = 0; i < 12; i++) {
                if (dia <= dias[i]) {
                    valido = true;
                    break;
                }

            }
            if (valido == false) {
                System.out.println("Dia inválido.");
            } else {
                System.out.println("Dia válido.");
            }
        }

    }
}