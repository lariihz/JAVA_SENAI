package RevisaoIfElse.Basicas;
import java.util.Scanner;
public class ativ_04 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                // Solicitar ao usuário que insira sua idade
                System.out.print("Digite a sua idade: ");
                int idade = scanner.nextInt();

                // Verificar se a pessoa pode votar
                if (idade >= 16) {
                    System.out.println("Você pode votar!");
                } else {
                    System.out.println("Você não pode votar.");
                }

                // Fechar o scanner
                scanner.close();
            }

}
