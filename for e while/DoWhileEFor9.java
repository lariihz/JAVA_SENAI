import java.util.Scanner;

public class DoWhileEFor9 {
public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Type in a number to see its mutiplication table: ");
      int num = sc.nextInt();
      System.out.printf("Number %d mutiplication table: %n", num);

      for(int i = 0; i < 11; ++i) {
         System.out.println("" + num + " X " + i + " = " + num * i);
      }

      sc.close();
   }
}
