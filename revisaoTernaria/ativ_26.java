package revisaoTernaria;
import java.util.Scanner;

public class ativ_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        char titulo = 'n';
        if (idade>=16) {
            System.out.println("Você possui título de eleitor? (s/n)");
            titulo = sc.nextLine().charAt(0);
        }

        String resp = ((titulo=='s') ? "P" : "Não p") + "ode votar.";

        System.out.println(resp);
    }
}