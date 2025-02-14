package POO.ativ_02.entities;

public class Alunos {
    public double nota1;
    public double nota2;
    public double media;

    public Alunos(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void calcularMedia() {
        this.media = (this.nota1 + this.nota2) / 2;
    }

    public void exibirStatus() {
        if (this.media >= 7) {
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado.");
        }
    }
}
