package revisaoDoWhile;

public class ativ_38 {
    public static void main(String[] args) {
        int i = 1, soma = 0;
        do {
            soma += ((i%2>0) ? i : 0);
            i++;
        } while (i<=20);
        System.out.println("A soma dos números ímpares entre 1 e 20 é igual a: " + soma);
    }
}
