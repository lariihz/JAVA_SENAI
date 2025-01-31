package RevisaoMath.expressoesAritmeticas;

public class ativ_14 {
    public static void main(String[] args) {
        int num1 = 15, num2 = 5, num3 = 3, num4 = 2;
        double resultado = (num1-num2)*(Math.pow(num3,num4));

        System.out.printf("(%d - %d) * (%d^%d) = %.0f", num1, num2, num3, num4, resultado);
    }
}
