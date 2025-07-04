public class SwitchExpressionSolution {
    public static void main(String[] args) {

        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);
    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> "SUNDAY";
            case 1 -> "MONDAY";
            case 2 -> "TUESDAY";
            case 3 -> "WEDNESDAY";
            case 4 -> "THURSDAY";
            case 5 -> "FRIDAY";
            case 6 -> "SATURDAY";
            default -> "Invalid Day";
        };

        System.out.println(day + " stands for " + dayOfWeek);
    }

    public static void printWeekDay(int day) {
        String dayOfWeek = "Invalid Day";
        if (day == 0) {
            dayOfWeek = "SUNDAY";
        } else if (day == 1) {
            dayOfWeek = "MONDAY";
        } else if (day == 2) {
            dayOfWeek = "TUESDAY";
        } else if (day == 3) {
            dayOfWeek = "WEDNESDAY";
        } else if (day == 4) {
            dayOfWeek = "THURSDAY";
        } else if (day == 5) {
            dayOfWeek = "FRIDAY";
        } else if (day == 6) {
            dayOfWeek = "SATURDAY";
        }

        System.out.println(day + " stands for " + dayOfWeek);
    }
}
