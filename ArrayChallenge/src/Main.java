import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
 
        int[] randomArray = randomArray(5);
        int[] sortedArray = sortIntegers(randomArray);
        System.out.println(Arrays.toString(sortedArray));

    }


    private static int[] sortIntegers(int[] array) {


        System.out.println(Arrays.toString(array));

        int[] sortedArrays = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while (flag) {

            flag = false;

            for (int i = 0; i < sortedArrays.length - 1; i++) {

                if (sortedArrays[i] < sortedArrays[i + 1]) {

                    temp = sortedArrays[i];
                    sortedArrays[i] = sortedArrays[i + 1];
                    sortedArrays[i + 1] = temp;
                    flag = true;
                    System.out.println("->" + Arrays.toString(sortedArrays));
                }
            }
            System.out.println(Arrays.toString(sortedArrays));
        }
        return sortedArrays;
    }


    private static int[] randomArray(int len) {

        Random random = new Random();
        int[] intArray = new int[len];

        for (int i = 0; i < len; i++) {
            intArray[i] = random.nextInt(100);
        }
        return intArray;
    }
}
