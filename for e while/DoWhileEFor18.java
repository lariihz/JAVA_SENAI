import java.util.Scanner;

public class DoWhileEFor18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Verificaçao se a palavra e um palindromo: ");
        String palavra = sc.next();

        String invertida = new StringBuilder(palavra).reverse().toString();
        System.out.println(palavra.equalsIgnoreCase(invertida) ? "É palindromo" : "Não é palindromo");

        sc.close();
    }
}

