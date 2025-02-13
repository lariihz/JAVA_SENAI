public class DoWhileEFor13 {
    public static void main(String[] args) {
  
        int num1 = 0, num2 = 1;

        for (int i = 0; i < 11; i++) {

            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
  
     }
}
