import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double trackMinNumber = 0;
        double trackMaxNumber = 0;


        do {
            System.out.println("Enter any number to continue or character to quit");
            String inputData = scanner.nextLine();
            try {
                double inputNumber = Double.parseDouble(inputData);
                System.out.println("I am Senior java developer");
                if (inputNumber > trackMaxNumber){
                    trackMaxNumber = inputNumber;
                } else if (inputNumber < trackMinNumber){
                    trackMinNumber  = inputNumber;
                }
                System.out.println("Till now");
                System.out.println("Smallest Number "+trackMinNumber);
                System.out.println("Biggest Number "+trackMaxNumber);
                count++;
            } catch (NumberFormatException invalidData){
                break;
            }

        } while (count > 0);
    }
}
