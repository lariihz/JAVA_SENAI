package RevisaoMath.expressoesAritmeticas;

public class ativ_20 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 5, num3 = 2, num4 = 2;
        double resultado = (num1+num2)/(Math.pow(num3, num4));

        System.out.printf("(%d + %d) / (%d^%d) = %.2f", num1, num2, num3, num4, resultado);
    }
}
