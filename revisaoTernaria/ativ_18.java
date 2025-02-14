package revisaoTernaria;
import java.util.Scanner;

public class ativ_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite as medidas do triângulo: ");
        double l1 = sc.nextDouble();
        double l2 = sc.nextDouble();
        double l3 = sc.nextDouble();
        
        String resp = "Triângulo " + ((l1==l2 && l2==l3) ? "equilátero" : ((l1==l2 || l2==l3 || l1==l3) ? "isósceles" : "escaleno"));
        
        System.out.println(resp);
    }
}