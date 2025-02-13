package revisaoTernaria;

public class ativ_05 {
    public static void main(String[] args) {
        int ano = 2024;
        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0) ? true : false;

    }
}
