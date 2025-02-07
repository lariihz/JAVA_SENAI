package revisaoFor;

public class ativ_26 {
    public static void main(String[] args) {
        int[] losango = {
                0, 0, 1, 0, 0,
                0, 1, 0, 1, 0,
                1, 0, 0, 0, 1,
                0, 1, 0, 1, 0,
                0, 0, 1, 0, 0
        };
        int[] numsBase5 = new int[8];

        int num = 1;
        for (int i = 1; i<=8; i++) {
            if (i%5==0) {
                num+=5;
            }
            numsBase5[i-1] = num;
            num++;
        }

        int j = 0;
        for (int i = 0; i < 25; i++) {
            if (losango[i]==1) {
                System.out.print(numsBase5[j]);
                j++;
            } else {
                System.out.print(" ");
            }
            if ((i+1)%5==0) {
                System.out.println();
            }
        }
    }
}
