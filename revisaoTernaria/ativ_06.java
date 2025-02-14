package revisaoTernaria;
import java.util.Scanner;

public class ativ_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        char carteira = 'n';
        if (idade>=18) {
            System.out.println("Você possui carteira de motorista? (s/n)");
            carteira = sc.nextLine().charAt(0);
        }
        
        String resp = ((carteira=='s') ? "P" : "Não p") + "ode dirigir.";
        
        System.out.println(resp);
    }
}