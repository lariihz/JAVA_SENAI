package revisaoDoWhile;
import java.util.Scanner;

public class ativ_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira uma nova senha: ");
        String senha = sc.nextLine();
        String senhaVerif;
        do {
            System.out.print("Digite sua senha: ");
            senhaVerif = sc.nextLine();
        } while (!senha.equals(senhaVerif));
        System.out.println("Login efetuado com sucesso.");
    }
}
