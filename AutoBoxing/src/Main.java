import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer boxedInt = Integer.valueOf(15); // preferred but unnecessary
        Integer depBoxing = new Integer(15); // deprecated since JDK 9
        int unboxedInt  = boxedInt.intValue(); //   unnecessary


        // Autoboxing
        Integer autoBoxed = 15;
        int autoUnBoxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
        // System.out.println(autoUnBoxed.getClass().getName());

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObjects();


        Integer[] wrapperArray  = new Integer[5];
        wrapperArray[0]  = 50;
        System.out.println(Arrays.toString(wrapperArray));

        System.out.println(wrapperArray[0].getClass().getName());
        Character[] characterArray = {'A','B','C'};
        System.out.println(Arrays.toString(characterArray));
        System.out.println(characterArray[0].getClass().getName());

        var ourList = getList(1,2,3,4,5);
        System.out.println(ourList);
    }

    private static Double getDoubleObjects(){
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive(){
        return 100.0;
    }


    private static int returnedAnInt(Integer i){
        return i;
    }

    private static Integer returnedAnInteger(int i){
        return i;
    }

    private static ArrayList<Integer> getList(Integer ... varargs){
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i: varargs){
            aList.add(i+5);
        }
        return aList;
    }
    
}
