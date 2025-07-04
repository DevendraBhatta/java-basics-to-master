public class Challenge {
    public static void main(String[] args) {
        System.out.println("Height in CM  = " + convertToCentiMeters(90));
        System.out.println("Height in CM  = " + convertToCentiMeters(80, 12));
        System.out.println("Height in CM  = " + convertToCentiMeters(180, 4, 2));
    }

    public static double convertToCentiMeters(int heightInInches) {
        return 2.54 * heightInInches;
    }
    public static double convertToCentiMeters(int heightInFeet, int heightInInches) {
        return ((30.48 * heightInFeet) +  convertToCentiMeters(heightInInches));
    }
    public static double convertToCentiMeters(int heightInFeet, int heightInInches, int heightInCm) {
        return ((30.48 * heightInFeet) + convertToCentiMeters(heightInInches) + heightInCm);
    }


}
