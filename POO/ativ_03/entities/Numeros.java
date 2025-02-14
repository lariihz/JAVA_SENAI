package POO.ativ_03.entities;

public class Numeros {
    public int valor;

    public Numeros(int valor) {
        this.valor = valor;
    }

    public void exibirParidade() {
        if (this.valor==0) {
            System.out.println("O valor é nulo");
        } else if (this.valor%2==0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }
}
