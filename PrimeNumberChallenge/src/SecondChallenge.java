public class SecondChallenge {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; count <3 && i <= 50; i++){
            if (isPrime(i)){
                System.out.println("number "+i+" is a prime number");
                count++;
            }
        }

        System.out.println("Total number of prime found "+count);


    }


    public static boolean isPrime(int wholeNumber){
        if (wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        if (wholeNumber % 2 == 0){
            return false;
        }
        for (int divisor = 3; divisor <= wholeNumber/2;divisor++){
            if (wholeNumber% divisor == 0){
                return false;
            }
        }
        return true;
    }

}
