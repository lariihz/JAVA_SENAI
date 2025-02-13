package revisaoDoWhile;
import java.io.*;
import java.util.Scanner;

public class ativ_42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String string = sc.nextLine();

        int i = string.length() - 1;

        do {
            System.out.print(string.charAt(i));
            i--;
        } while (i >= 0);
    }
}
