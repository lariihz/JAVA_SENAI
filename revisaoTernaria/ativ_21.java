package revisaoTernaria;

public class ativ_21 {
    public static void main(String[] args) {
        int numero = 10;
        String resultado1 = (numero % 2 == 0) ? "Par" : "Ímpar";
        String resultado2 = (numero > 0) ? "Positivo" : "Negativo";
        String resultado = (numero==0) ? "Nulo" : resultado1 + " " + resultado2;
        System.out.println(resultado);
    }
    }
