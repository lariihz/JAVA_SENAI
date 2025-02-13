package revisaoDoWhile;

public class ativ_37 {
    public static void main(String[] args) {
        
        int number = 0;

        do {
            if (number % 2 == 0){
                System.out.print(number + " ");
            }
            number++;
        } while (number < 21);
    }
}
