package RevisaoIfElse.CondicoesComStrings;

import java.util.Scanner;

public class ativ_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual seu nome?");
        char nome = scanner.nextLine().toUpperCase().charAt(0);

        if (nome == 'A') {
            System.out.println("O nome digitado comeca com a letra A");
        }
            else {
            System.out.println("O nome digitado NAO comeca com a letra A");
        }
    }
    }

