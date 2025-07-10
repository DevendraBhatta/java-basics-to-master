public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " is " + (isPrime(i) ? "" : "NOT") + " a Prime Number");
        }
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        if (wholeNumber % 2 == 0){
            return false; // even number are out
        }

        for (int divisor = 3; divisor <= Math.sqrt(wholeNumber); divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
