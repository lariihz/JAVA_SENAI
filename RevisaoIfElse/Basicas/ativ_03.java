package RevisaoIfElse.Basicas;
import java.util.Scanner;
public class ativ_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite um número: ");
        int numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println("O maior numero e:" + numero1);
        } else if (numero1 < numero2) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("Os dois números são iguais.");
        }

        sc.close();
    }
}

