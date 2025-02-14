package revisaoTernaria;
import java.util.Scanner;

public class ativ_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite sua nota: ");
        double nota = sc.nextDouble();
        
        System.out.println((nota>=7) ? "Aprovado" : "Reprovado");
    }
}