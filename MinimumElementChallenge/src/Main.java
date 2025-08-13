import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] returnedArray = readInteger();
        System.out.println(Arrays.toString(returnedArray));

//        int returnedMin = findMin(returnedArray);
//        System.out.println("min = " + returnedMin);

        reverseArray(returnedArray);
        System.out.println("Final: "+Arrays.toString(returnedArray));

        int reversedCopyy = reversedCopy(returnedArray);
        System.out.println("After reverse"+Arrays.toString(returnedArray));
        System.out.println("After reverse"+Arrays.toString(reversedCopyy));

    }

    private static int[] readInteger() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of Integers");
        String input = scanner.nextLine();
        String[] splits = input.split(",");

        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());

        }
        return values;
    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;

        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }

    private static void reverseArray(int[] array) {

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 1; i < halfLength; i++) {

            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;

            System.out.println("min = "+Arrays.toString(array));
        }
    }

    private static int[] reversedCopy(int[] array){
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length-1;
        for (int el:array){
            reversedArray[maxIndex --] = el;
        }
        return reversedArray;
    }


}
