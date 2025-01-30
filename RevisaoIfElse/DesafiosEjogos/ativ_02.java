package RevisaoIfElse.DesafiosEjogos;

import java.util.Scanner;

public class ativ_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num = scanner.nextInt();


        if ( num > num*2) {
            System.out.println("O numero é maior que o dobro.");
    } else
        System.out.println("O numero NAO é maior que o dobro");


    }

}

