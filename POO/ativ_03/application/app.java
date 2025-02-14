package POO.ativ_03.application;

import POO.ativ_03.entities.Numeros;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        Numeros numero = new Numeros(num);

        numero.exibirParidade();
    }
}
