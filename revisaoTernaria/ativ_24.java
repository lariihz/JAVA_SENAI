package revisaoTernaria;
import java.util.Scanner;

public class ativ_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        
        int somaDivisores = 0;
        for (int i = 1; i < num; i++) {
            somaDivisores += ((num%i==0) ? i : 0);
        }
        
        System.out.println(((somaDivisores==num) ? "P" : "Não é p") + "erfeito.");
    }
}