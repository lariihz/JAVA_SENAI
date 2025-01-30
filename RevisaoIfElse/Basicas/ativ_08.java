package RevisaoIfElse.Basicas;
import java.util.Scanner;

public class ativ_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = sc.next().toUpperCase().charAt(0);

        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println(letra + " é uma vogal.");
        } else {
            System.out.println(letra + " não é uma vogal.");
        }
    }
}
