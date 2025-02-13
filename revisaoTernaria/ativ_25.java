package revisaoTernaria;

import java.util.Scanner;

public class ativ_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dias = {
                "segunda-feira",
                "terça-feira",
                "quarta-feira",
                "quinta-feira",
                "sexta-feira",
                "sábado",
                "domingo"
    };

        System.out.println("Digite um dia da semana: ");
        String dia = scanner.nextLine().toLowerCase();

        int i;
        boolean valido = false;
        for (i = 0; i < 7; i++) {
            if (dias[i].equals(dia)) {
                valido = true;
                break;
            }
        }

        String resp = ((!valido) ? "Dia inválido" : ((i<5) ? "Dia útil" : "Final de semana."));

        System.out.println(resp);
    }
}
