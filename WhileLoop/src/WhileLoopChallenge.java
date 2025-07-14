public class WhileLoopChallenge {
    public static void main(String[] args) {

        int num = 5;

        while (num <= 20) {
            System.out.println(num +" is "+(isEvenNumber(num)?" even ":" odd")+" number");
            num++;

        }
    }

    public static Boolean isEvenNumber(int number) {
        while (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
