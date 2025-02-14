package revisaoTernaria;
import java.util.Scanner;

public class ativ_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite sua nota: ");
        double nota = sc.nextDouble();
        
        System.out.println(((nota>=7) ? "Aprovado." : ((nota>=5) ? "Recuperação." : "Reprovado.")));
    }
}