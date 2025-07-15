public class WhileLoopChallenge {
    public static void main(String[] args) {

        int num = 5;
        int finishNumber = 20;

        while (num <= finishNumber) {

            System.out.println(num + " is " + (isEvenNumber(num) ? " even " : " odd") + " number");
            num++;

        }
    }

    public static Boolean isEvenNumber(int number) {

        if ((number % 2 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
