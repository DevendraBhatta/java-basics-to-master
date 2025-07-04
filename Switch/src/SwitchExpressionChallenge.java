public class SwitchExpressionChallenge {
    public static void main(String[] args) {
        printDayOfWeek(1);
        printWeekDay(1);
    }

    public static void printDayOfWeek(int day) {
        switch (day) {
            case 0 -> System.out.println("SUNDAY");
            case 1 -> System.out.println("MONDAY");
            case 2 -> System.out.println("TUESDAY");
            case 3 -> System.out.println("WEDNESDAY");
            case 4 -> System.out.println("THURSDAY");
            case 5 -> System.out.println("FRIDAY");
            case 6 -> System.out.println("SATURDAY");
            default -> System.out.println("Invalid Day");
        }
    }

    public static void printWeekDay(int day) {
        if (day == 0) {
            System.out.println("SUNDAY");
        } else if (day == 1) {
            System.out.println("MONDAY");
        } else if (day == 2) {
            System.out.println("TUESDAY");
        } else if (day == 3) {
            System.out.println("WEDNESDAY");
        } else if (day == 4) {
            System.out.println("THURSDAY");
        } else if (day == 5) {
            System.out.println("FRIDAY");
        } else if (day == 6) {
            System.out.println("SATURDAY");
        } else {
            System.out.println("Invalid Day");
        }
    }
}
