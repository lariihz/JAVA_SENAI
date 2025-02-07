package revisaoFor;

public class ativ_06 {
    public static void main(String[] args) {
        int somaPares = 0;
        for (int i = 1; i <= 100; i++) {
            if (i%2==0) {
                somaPares += i;
            }
        }
        System.out.println("A soma dos números pares de 1 a 100 é igual a " + somaPares);
    }
}
