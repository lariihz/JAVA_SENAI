package revisaoFor;

import java.util.Scanner;

public class ativ_17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Type in something: ");
        String OriginalText = sc.nextLine();
        String ReversedText = "";
        System.out.println("Original text: " + OriginalText);
        
        for (int i = 0; i < OriginalText.length(); i++) {
          ReversedText = OriginalText.charAt(i) + ReversedText;
        }
    
        System.out.println("Reversed text: "+ ReversedText);
        sc.close();
    }
}
