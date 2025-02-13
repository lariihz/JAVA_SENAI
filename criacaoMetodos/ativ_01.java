package criacaoMetodos;

public class ativ_01 {
    //Verifique se um número é positivo ou negativo//
        public static String verificarPositivoNegativo(int numero) {
            if (numero > 0) {
                return "O número é positivo.";
            } else if (numero < 0) {
                return "O número é negativo.";
            } else {
                return "O número é zero.";
            }
        }

        public static void main(String[] args) {
            System.out.println(verificarPositivoNegativo(5));
            System.out.println(verificarPositivoNegativo(-3));
            System.out.println(verificarPositivoNegativo(0));
        }
    }

