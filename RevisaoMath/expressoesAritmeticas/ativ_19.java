package RevisaoMath.expressoesAritmeticas;

public class ativ_19 {
    public static void main(String[] args) {
        int num1 = 16, num2 = 5, num3 = 7, num4 = 3;
        int resultado = (num1%num2)*(num3-num4);

        System.out.printf("(%d %% %d) * (%d - %d) = %d", num1, num2, num3, num4, resultado);
    }
}
