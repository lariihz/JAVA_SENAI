package revisaoDoWhile;

import java.util.Scanner;

public class ativ_44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        System.out.println("Divisores de " + num + ": ");
        int i = 1;
        do {
            if (num%i==0){
                System.out.println(i);
            }
            i++;
        } while (i<=num);
    }
}
