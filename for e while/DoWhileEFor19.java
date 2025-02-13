import java.util.Scanner;

public class DoWhileEFor19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Type in a number: ");
        int num = sc.nextInt();
        int factorial = 1;
        
        for (int i = 1; i <= num; i++){

            factorial *= i;

        }
        System.out.println("The factorial of the number typed is: " + factorial);
        sc.close();
    }
}
