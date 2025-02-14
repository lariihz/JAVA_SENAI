package POO.ativ_05.entities;

public class Somas {
    public int parcela1;
    public int parcela2;
    public int resultado;

    public Somas(int parcela1, int parcela2) {
        this.parcela1 = parcela1;
        this.parcela2 = parcela2;
    }

    public void calcularResultado() {
        this.resultado = this.parcela1 + this.parcela2;
    }

    public void verificarResultado() {
        if (this.resultado>100) {
            System.out.println("O resultado da soma dos números inseridos é maior que 100");
        } else {
            System.out.println("O resultado da soma dos números inseridos é maior que 100");
        }
    }
}
