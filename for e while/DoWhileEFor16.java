import java.util.Scanner;

public class DoWhileEFor16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String texto = sc.nextLine();

        System.out.println("Caracteres da palavra escolhida:");
        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.charAt(i));
        }
        sc.close();
    }
}

