public class WhileLoopChallenge {
    public static void main(String[] args) {

        int num = 5;
        int finishNumber = 20;

        while (num <= finishNumber) {

            // This code will remove not even Number (odd Number)
//            if (!isEvenNumber(num)){
//                continue;
//            }

            System.out.println(num + " is " + (isEvenNumber(num) ? " even " : " odd") + " number");
            num++;

        }
    }

    public static Boolean isEvenNumber(int number) {
        // this will also work but if is recommended
//        while (number % 2 == 0) {
//            return true;
//        }
//        return false;

        if ((number % 2 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
