package RevisaoIfElse.CondicoesComStrings;

import java.util.Scanner;

public class ativ_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voce esta joia ?");
        String resposta = scanner.nextLine();

        if (resposta.equals("sim"))
        {
            System.out.println("Que bom que voce esta bem"); }
        else if  (resposta.equals("não"))  {
            System.out.println("Sinto muito");

        }
    }

}
