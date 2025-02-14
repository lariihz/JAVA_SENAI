package POO.ativ_02.application;

import POO.ativ_02.entities.Alunos;

import java.util.Scanner;

public class app {
    //Receba duas notas e informe se o aluno foi aprovado (média &gt;= 7)./
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite as notas do aluno: ");
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();

            Alunos aluno = new Alunos(nota1, nota2);

            aluno.calcularMedia();

            aluno.exibirStatus();
        }
}



