package revisaoTernaria;
import java.util.Scanner;

public class ativ_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        
        String resp = ((num >= 10 && num <= 50) ? "Dentro" : "Fora") + " do intervalo.";
        
        System.out.println(resp);
    }
}