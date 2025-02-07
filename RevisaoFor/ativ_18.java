package revisaoFor;

import java.util.Scanner;

public class ativ_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String string = sc.nextLine();
        char[] stringChar = new char[string.length()], stringCharInvertido = new char[string.length()];
        int j = string.length() - 1;
        for (int i = 0; i < string.length(); i++) {
            stringChar[i] = string.charAt(i);
            stringCharInvertido[i] = string.charAt(j);
            j--;
        }
        boolean palindromo = true;
        for (int i = 0; i < string.length(); i++) {
            if (stringChar[i]!=stringCharInvertido[i]) {
                palindromo = false;
                break;
            }
        }
        if (palindromo) {
            System.out.println("A palavra inserida é um palíndromo.");
        } else {
            System.out.println("A palavra inserida NÃO é um palíndromo.");
        }
    }
}
