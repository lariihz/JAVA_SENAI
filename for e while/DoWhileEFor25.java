public class DoWhileEFor25 {
    public static void main(String[] args) {
        
        int numlines = 5;

        for(int i = 1; i <= numlines; i++){

            for(int j = 1; j <= i; j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
