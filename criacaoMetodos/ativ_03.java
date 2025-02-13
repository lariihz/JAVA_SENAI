package criacaoMetodos;

import java.util.Scanner;

public class ativ_03 {

    public static boolean verificarPar(int numero) {
        return numero % 2 == 0;
    }

    public static boolean verificarImpar(int numero) {
        return numero % 2 != 0;
    }

    public static void main(String[] args) {
        int numero = 7;


        if (verificarPar(numero)) {
            System.out.println(numero + " é par.");
        } else if (verificarImpar(numero)) {
            System.out.println(numero + " é ímpar.");
        }
    }
}
