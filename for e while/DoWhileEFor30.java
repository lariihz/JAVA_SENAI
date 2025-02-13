public class DoWhileEFor30 {
    public static void main(String[] args) {

        int[] vetor = {10, 15, 22, 37, 40, 55};
        int pares = 0, impares = 0;
        for (int num : vetor) {
            if (num % 2 == 0) pares++;
            else impares++;
        }
        System.out.println("Pares: " + pares + ", Ímpares: " + impares);
    }
}
