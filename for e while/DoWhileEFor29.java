import java.util.Arrays;

public class DoWhileEFor29 {
        public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        System.out.println("Array before sorting: " + Arrays.toString(array));
        
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int aux = array[minIndex];
            array[minIndex] = array[i];
            array[i] = aux;
        }
        System.out.println("Array after sorting: " + Arrays.toString(array));
    }
}
