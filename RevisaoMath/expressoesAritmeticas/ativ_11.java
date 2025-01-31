package RevisaoMath.expressoesAritmeticas;

public class ativ_11 {
    public static void main(String[] args) {
        int num1 = 45, num2 = 7, num3 = 3;
        int resultado = num1%(num2+num3);

        System.out.printf("%d %% (%d + %d) = %d", num1, num2, num3, resultado);
    }
}
