public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigit(1234));
        System.out.println(sumDigit(-34));
        System.out.println(sumDigit(8));
        System.out.println(sumDigit(0));
    }

    public static int sumDigit(int number) {
        if (number <= 0) {
            return -1;
        }
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
