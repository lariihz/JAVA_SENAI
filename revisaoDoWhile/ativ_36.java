package revisaoDoWhile;

public class ativ_36 {
    public static void main(String[] args) {
        int i = 1, soma = 0;
        do {
            soma += i;
            i++;
        } while (i<=50);
        System.out.println("A soma dos números de 1 a 50 é igual a: " + soma);
    }
}
