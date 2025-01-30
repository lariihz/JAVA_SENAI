package RevisaoIfElse.SituacoesCotidianas;

import java.util.Scanner;

public class ativ_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o codigo de acesso");
        int acesso = scanner.nextInt();

        if ( acesso == 1 ) {
            System.out.println("Codigo de acesso correto !");
        }
        else
            System.out.println("Codigo de acesso incorreto!");
        }
    }

