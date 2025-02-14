package revisaoTernaria;
import java.util.Scanner;

public class ativ_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor do produto: ");
        double valor = sc.nextDouble();
        
        System.out.println("Frete grátis " + ((valor>=100) ? "" : "in") + "dísponivel.");
    }
}