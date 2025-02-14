package revisaoTernaria;
import java.util.Scanner;

public class ativ_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        
        System.out.println((num>100) ? "Alto." : "Baixo.");
    }
}