package revisaoTernaria;
import java.util.Scanner;

public class ativ_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        
        String resp1 = ((num % 2 == 0) ? "Par" : "Ímpar");
        String resp2 = ((num > 0) ? "Positivo." : "Negativo.");
        String resp = ((num==0) ? "Nulo." : resp1+" e "+resp2);
        
        System.out.println(resp);
    }
}