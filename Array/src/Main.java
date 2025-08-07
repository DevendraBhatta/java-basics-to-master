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
        newArray = new int[]{5, 4, 3, 2, 1, 0};

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}
