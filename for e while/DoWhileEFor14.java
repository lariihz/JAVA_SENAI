public class DoWhileEFor14 {
    public static void main(String[] args) {
        System.out.println("Números primos entre 1 e 50:");

        for (int num = 2; num <= 50; num++) {
            if (ehPrimo(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean ehPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

