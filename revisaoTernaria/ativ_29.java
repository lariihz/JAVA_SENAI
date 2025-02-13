package revisaoTernaria;

public class ativ_29 {
    public static void main(String[] args) {
        int idade = 18;
        String resultado = (idade>60) ? "Idoso" : ((idade>18) ? "Adulto" : "Jovem");
        System.out.println(resultado);
    }
}
