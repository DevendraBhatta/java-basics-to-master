import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        System.out.println(myIntArray[5]);

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        int[] firstFive = new int[]{1, 2, 3, 4, 5};
        System.out.println(firstFive[3]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + firstTen[0]);
        System.out.println("Length of Array: " + firstTen.length);
        System.out.println("last " + firstTen[firstTen.length - 1]);

        int[] newArray;

        newArray = new int[5];

        // inserting elements
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }

        // reading elements
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
        }

        for (int element : newArray) {
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(newArray));
        Object objectVariable  = newArray;
        if (objectVariable instanceof int[]){
            System.out.println("Object Variable is really integer array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "hello";
        objectArray[1] = new StringBuilder("world");
        objectArray[2] = newArray;
        System.out.println(Arrays.toString(objectArray));





    }
}
