package POO.ativ_04.application;

import POO.ativ_04.entities.Palavras;

import java.util.Scanner;

public class app {
    //Verifique se uma palavra recebida é &quot;Sim&quot; ou &quot;Não&quot;.
    public static boolean verificarSim(String palavra) {
        return palavra.equalsIgnoreCase("Sim");
    }

    public static boolean verificarNao(String palavra) {
        return palavra.equalsIgnoreCase("Não");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite uma palavra: ");
        String str = sc.nextLine();

        Palavras palavra = new Palavras(str);

        palavra.verificarPalavra();

        sc.close();
    }
}
