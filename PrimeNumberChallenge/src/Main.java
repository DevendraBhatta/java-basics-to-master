public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println(i + " is " + (isPrime(i) ? " SURE" : "NOT") + " a Prime Number");
        }
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor < wholeNumber; divisor++) {
            double dividend = wholeNumber % divisor;
            if (dividend == 0) {
                return false;
            }
        }
        return true;
    }
}
