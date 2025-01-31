package RevisaoMath.expressoesAritmeticas;

public class ativ_15 {
    public static void main(String[] args) {
        int num1 = 8, num2 = 3, num3 = 6, num4 = 2;
        int resultado = (num1%num2)+(num3/num4);

        System.out.printf("(%d %% %d) + (%d / %d) = %d", num1, num2, num3, num4, resultado);
    }
}
