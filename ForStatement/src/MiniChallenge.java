public class MiniChallenge {
    public static void main(String[] args) {

        for (double rate = 7.5; rate <= 10; rate += 0.25) {
            double interestAmount = calculateInterest(10000, 1, rate);
            if (interestAmount >= 850) {
                break;
            }
            System.out.println("10000  at Interest Rate of " + rate + " is  " + interestAmount);
        }
    }

    public static double calculateInterest(double amount, double time, double rate) {
        return (amount * time * rate) / 100;
    }
}
