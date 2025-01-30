package RevisaoIfElse.Medias;

import java.util.Scanner;

public class ativ_01 {
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

                System.out.print("Digite a primeira nota: ");
                double nota1 = scanner.nextDouble();

                System.out.print("Digite a segunda nota: ");
                double nota2 = scanner.nextDouble();

                double media = (nota1 + nota2) / 2;

                if (media >= 7) {
                    System.out.println("Aluno aprovado! Média: " + media);
                } else {
                    System.out.println("Aluno reprovado! Média: " + media);
                }

                scanner.close();
            }
        }


