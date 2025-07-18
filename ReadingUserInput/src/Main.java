import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int currentYear = 2025;
        System.out.println(getInputFromScanner(currentYear));

    }

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, What is your Name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + " Thanks for Taking the course");

        System.out.println("What year were you born");

        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + (currentYear));

            try {
                String dateOfBirth = scanner.nextLine();
                age = validateData(currentYear, dateOfBirth);
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters are not Allowed");
            }
            validDOB = age > 0 ? true : false;

        } while (!validDOB);

        return "So you are " + age + " years old";
    }

    public static int validateData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;
        if (dob < minimumYear || dob > currentYear) {
            return -1;
        }
        return currentYear - dob;
    }
}
