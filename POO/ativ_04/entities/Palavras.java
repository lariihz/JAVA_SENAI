package POO.ativ_04.entities;

public class Palavras {
    public String str;

    public Palavras(String str) {
        this.str = str;
    }

    public void verificarPalavra() {
        if (this.str.equals("Sim")) {
            System.out.println("A palavra é 'Sim'.");
        } else if (this.str.equals("Não")) {
            System.out.println("A palavra é 'Não'.");
        } else {
            System.out.println("A palavra não é nem 'Sim' nem 'Não'.");
        }
    }
}
