package revisaoDoWhile;

public class ativ_52 {
    public static void main(String[] args) {
        int contPrimos = 0, i = 2;

        do {
            int j = 1;
            int contDivisores = 0;
            do {
                if (i%j==0) {
                    contDivisores++;
                }
                j++;
            } while (j <= i);
            if (contDivisores == 2) {
                System.out.println(i);
                contPrimos++;
            }
            i++;
        } while (contPrimos < 10);
    }
}
