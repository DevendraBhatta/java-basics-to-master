public class ForLoopChallenge {
    public static void main(String[] args) {


        for (int i = 0; i <= 1000; i++) {
            System.out.println(i + " is " + (isPrime(i) ? " " : " Not ") + " a prime Number");
        }
    }

    public static boolean isPrime(int wholeNumber) {

        return true;

    }
}
