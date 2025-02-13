package criacaoMetodos;

import java.util.Scanner;

public class ativ_02 {
    //Receba duas notas e informe se o aluno foi aprovado (média &gt;= 7)./
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            double nota1 = obterNota(scanner, 1);
            double nota2 = obterNota(scanner, 2);

            double media = calcularMedia(nota1, nota2);
            verificarAprovacao(media);
        }

        public static double obterNota(Scanner scanner, int numeroNota) {
            System.out.print("Digite a nota " + numeroNota + ": ");
            return scanner.nextDouble();
        }

        public static double calcularMedia(double nota1, double nota2) {
            return (nota1 + nota2) / 2;
        }

        public static void verificarAprovacao(double media) {
            if (media >= 7) {
                System.out.println("Aprovado! Sua média foi: " + media);
            } else {
                System.out.println("Reprovado! Sua média foi: " + media);
            }
        }
    }



