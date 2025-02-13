package criacaoMetodos;

import java.util.Scanner;

public class ativ_04 {
    //Verifique se uma palavra recebida é &quot;Sim&quot; ou &quot;Não&quot;.
    public static boolean verificarSim(String palavra) {
        return palavra.equalsIgnoreCase("Sim");
    }

    public static boolean verificarNao(String palavra) {
        return palavra.equalsIgnoreCase("Não");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite 'Sim' ou 'Não':");
        String palavra = scanner.nextLine();

        if (verificarSim(palavra)) {
            System.out.println("A palavra é 'Sim'.");
        } else if (verificarNao(palavra)) {
            System.out.println("A palavra é 'Não'.");
        } else {
            System.out.println("A palavra não é nem 'Sim' nem 'Não'.");
        }

        scanner.close();
    }
}
