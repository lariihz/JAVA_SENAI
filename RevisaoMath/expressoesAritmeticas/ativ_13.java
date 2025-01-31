package RevisaoMath.expressoesAritmeticas;

public class ativ_13 {
    public static void main(String[] args) {
        int num1 = 2, num2 = 3, num3 = 5, num4 = 2;
        double resultado = Math.pow(num1, num2) + num3 * num4;

        System.out.printf("%d^%d + %d * %d = %.0f", num1, num2, num3, num4, resultado);
    }
}
