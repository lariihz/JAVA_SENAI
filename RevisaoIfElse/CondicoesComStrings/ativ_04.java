package RevisaoIfElse.CondicoesComStrings;

import java.util.Scanner;

public class ativ_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra : ");
        String palavra = scanner.nextLine();

        if (palavra.length() > 5) {
            System.out.println("A palavra tem mais de 5 letras");
        } else {
            System.out.println("A palavra tem menos de 5 letras");
        }
    }

}