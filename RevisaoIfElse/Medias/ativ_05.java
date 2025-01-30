package RevisaoIfElse.Medias;

import java.util.Scanner;

public class ativ_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite sua nota: ");
        double nota2 = scanner.nextDouble();

        if (nota1 >= 7) {
            System.out.println("Aluno aprovado! Média: " + nota1);
        } else if (nota1 < 10) {
            System.out.println("Aluno em recuperação! Média: " + nota1);
            if (nota1 >= 7) {
                System.out.println("Aluno aprovado! Média: " + nota1);
            } else if (nota1 < 10) {
            } else {
                System.out.println("Aluno reprovado! Média: " + nota2);
            }
        }
    }


}


