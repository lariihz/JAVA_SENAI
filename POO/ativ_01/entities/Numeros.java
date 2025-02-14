package POO.ativ_01.entities;

public class Numeros {
    public int valor;

    public Numeros(int valor) {
        this.valor = valor;
    }

    public String verificacaoPositivoNegativo() {
        if (this.valor>0) {
            return "O número é positivo.";
        } else if (this.valor<0) {
            return "O número é negativo.";
        }
        return "O número é zero.";
    }
}
