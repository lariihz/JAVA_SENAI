package RevisaoIfElse.Dataehorarios;

import java.util.Scanner;

public class ativ_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um horario");
        int horas = scanner.nextInt();

        if (horas<0 || horas > 24) {
            System.out.println("Horário inválido");
        } else if (horas < 12) {
            System.out.println("Manhã");
        } else if (horas < 18) {
            System.out.println("Tarde");
        } else {
            System.out.println("Noite.");
        }
    }
}
