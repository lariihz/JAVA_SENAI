package RevisaoIfElse.Dataehorarios;

import java.util.Scanner;

public class ativ_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome de um mês: ");
        String mes = scanner.nextLine();

        String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        boolean valido = false;
        for (int i = 0; i < 12; i++) {
            if (mes.equals(meses[i])) {
                valido = true;
                break;
            }
        }
        if (valido) {
            System.out.println("Mês válido.");
        } else {
            System.out.println("Mês inválido.");
        }
    }
}
