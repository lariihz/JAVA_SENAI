package revisaoTernaria;
import java.util.Scanner;

public class ativ_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um valor booleano (true/false): ");
        boolean booleano = sc.nextBoolean();
        
        System.out.println((booleano) ? "Sim." : "Não.");
    }
}