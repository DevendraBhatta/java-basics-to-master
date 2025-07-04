public class Solution {
    public static void main(String[] args) {


        System.out.println("5ft, 8 inc  = "+ convertToCentimeters(5,8)+"cm");
        System.out.println("5ft, inc  = "+ convertToCentimeters(5)+"cm");

    }

    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet,int inches){
        //return convertToCentimeters((feet * 12) + inches);
        int feetToInches = feet * 12;
        int totalInches =  feetToInches + inches;
        double result = convertToCentimeters(totalInches);
        return result;

    }


}
