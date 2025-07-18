import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 1;
        double sum = 0;
        double inputNumber = 0;


        do  {
            System.out.println("Enter a #"+count);
            String inputNumberInString = scanner.nextLine();
            try {
                inputNumber = Double.parseDouble(inputNumberInString);
                count++;
                sum += inputNumber;
            } catch (NumberFormatException invalidInput) {
                System.out.println("Invalid Format Enter a Number");
            }
        }while (count <= 5);
        System.out.println("The sum is " + sum);
    }
}
