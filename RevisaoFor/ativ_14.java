package revisaoFor;

public class ativ_14 {
    public static void main(String[] args) {
        for (int i = 2; i <= 50; i++) {
            int contDivisores = 0;
            boolean primo = true;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    contDivisores++;
                }
                if (contDivisores==2) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(i);
            }
        }
    }
}
