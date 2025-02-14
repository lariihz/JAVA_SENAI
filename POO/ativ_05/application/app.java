package POO.ativ_05.application;

import POO.ativ_05.entities.Somas;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Somas soma = new Somas(num1, num2);

        soma.calcularResultado();
        soma.verificarResultado();

        sc.close();
    }
}

