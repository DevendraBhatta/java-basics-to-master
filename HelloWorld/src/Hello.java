public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello,Tim");

        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It is aliens");
            System.out.println("I am scared of aliens");
        }
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the High Score");
        }
        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }


        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not Supposed to happen");
        }


        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }


        String s = (isDomestic) ? "This  car is domestic" : "This caris not domestic";
        System.out.println(s);

        double myDoubleVar = 20.00d;
        double mySecondDoubleVar = 80.00d;
        double sum = (myDoubleVar + mySecondDoubleVar) * 100.00d;
        System.out.println("My Values total "+sum);
        double theRemainder = sum % 40.00d;

        System.out.println("The remainder is "+theRemainder);
        boolean isNoRemainder = (theRemainder == 0)? true : false;
        System.out.println("isNoRemainder"+isNoRemainder);
        if (!isNoRemainder){
            System.out.println("Got Some remainder");
        }
    }
}
