package revisaoTernaria;
import java.util.Scanner;

public class ativ_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        
        String resp = ((num % 5 == 0) ? "M" : "Não é m") + "últiplo de 5.";
        
        System.out.println(resp);
    }
}