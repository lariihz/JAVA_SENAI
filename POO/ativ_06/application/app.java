package POO.ativ_06.application;

import POO.ativ_06.entities.Vetores;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[3];

        System.out.println("Digite 3 números: ");
        vet[0] = sc.nextInt();
        vet[1] = sc.nextInt();
        vet[2] = sc.nextInt();

        Vetores vetor = new Vetores(vet);

        vetor.exibirMaiorElemento();
    }
}
