package RevisaoIfElse.Dataehorarios;

import java.util.Scanner;

public class ativ_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o horário atual (separe os minutos com '.': ");
        double horario = scanner.nextDouble();

        if (horario <0 || horario >= 24) {
            System.out.println("Horário inválido.");
        } else {
            System.out.println("Horário válido.");
        }
    }
}
