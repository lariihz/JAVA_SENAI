package revisaoFor;

public class ativ_27 {
    public static void main(String[] args) {
        
        int[] numA = {2, 3, 5, 10, 15, 25};
        int sum = 0; 

        for (int i = 0; i < numA.length; i++) {

            sum += numA[i];
        }

        System.out.println("The sum is: " + sum);
    }
}
