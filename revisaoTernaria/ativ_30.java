package revisaoTernaria;
import java.util.Scanner;

public class ativ_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite suas notas: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double media = (nota1+nota2)/2;

        System.out.println((media>=6) ? "Aprovado" : "Reprovado");
    }
}