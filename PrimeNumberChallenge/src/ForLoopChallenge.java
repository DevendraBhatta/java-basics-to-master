import java.util.Arrays;

public class ForLoopChallenge {

    public static void main(String[] args) {

        int count = 0;
        int[] primeNumbers = new int[11];
        int primeIndex = 0;

        for (int i = 10; i <= 50; i++) {
            if (isPrime(i)) {
                primeNumbers[primeIndex] = i;
                primeIndex++;
                count++;
            }
        }
        System.out.println("There are " + count + "Prime Numbers");
        System.out.println("They are " + Arrays.toString(primeNumbers));

    }


    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        if (wholeNumber % 2 == 0) {
            return false;
        }
        for (int divisor = 3; divisor < (wholeNumber / 2); divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
