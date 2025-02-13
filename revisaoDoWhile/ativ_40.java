package revisaoDoWhile;
import java.util.Scanner;

public class ativ_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0, num;
        System.out.println("Digite números: (0 para finalizar a execução)");
        do {
            num = sc.nextInt();
            cont++;
        } while (num != 0);
        System.out.println("Foi inserido um total de " + (cont-1) + " número(s).");
    }
}
