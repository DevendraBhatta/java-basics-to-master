public class WhileLoopChallenge {
    public static void main(String[] args) {

        int num = 4;
        int evenCount = 0;
        int oddCount = 0;
        int finishNumber = 20;

        while (num <= finishNumber) {
            num++;
            if (!isEvenNumber(num)){
                oddCount++;
                continue;
            }
            evenCount ++;
            System.out.println("Even Number " + num);
            if (evenCount >= 5){
                break;
            }
        }
        System.out.println(evenCount+ " even numbers are found");
        System.out.println(oddCount+ " odd numbers are found");
    }

    public static Boolean isEvenNumber(int number) {

        if ((number % 2 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
