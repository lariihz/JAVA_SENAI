package POO.ativ_06.entities;

public class Vetores {
    public int[] vetor;

    public Vetores(int[] vetor) {
        this.vetor = vetor;
    }

    public void exibirMaiorElemento() {
        int maior = this.vetor[0];
        for (int i = 1; i < this.vetor.length; i++) {
            if (this.vetor[i]>maior) {
                maior = this.vetor[i];
            }
        }

        System.out.println("O maior elemento do vetor é: " + maior);
    }
}
