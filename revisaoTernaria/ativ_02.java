package revisaoTernaria;
import java.util.Scanner;

public class ativ_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        
        String resp = ((idade >= 18) ? "Maior" : "Menor") + " de idade.";
        
        System.out.println(resp);
    }
}