public class Main {
    public static void main(String[] args) {
        for (double rate = 2.0; rate <= 5.0; rate++) {
            System.out.println("10000 at " + rate + "% interest " + calculateInterest(10000.0, 1.0, rate));
        }
    }

    public static double calculateInterest(double amount, double time, double interestRate) {
        return (amount * time * interestRate) / 100;
    }

}
