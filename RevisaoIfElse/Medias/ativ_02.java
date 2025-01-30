package RevisaoIfElse.Medias;

import java.util.Scanner;

public class ativ_02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite sua nota: ");
            double nota = scanner.nextDouble();

            if (nota >= 7) {
                System.out.println("Aluno aprovado! Média: " + nota);
            } else if (nota >= 5) {
                System.out.println("Aluno em recuperação! Média: " + nota);
            } else {
                System.out.println("Aluno reprovado! Média: " + nota);
            }
        }
    }


