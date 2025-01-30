package RevisaoIfElse.CondicoesComStrings;

import java.util.Scanner;

public class ativ_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a senha correta ?");
        int senha = scanner.nextInt();

        if (senha == 1234)
        {
            System.out.println("A senha esta correta ! ");
        } else {
            System.out.println("A senha esta incorrta!");

        }
    }
}
