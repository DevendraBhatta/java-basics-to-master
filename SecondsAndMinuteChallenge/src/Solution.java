public class Solution {
    public static void main(String[] args) {
        System.out.println(getDurationString(-390000));
        System.out.println(getDurationString(36, 30));
    }

    public static String getDurationString(int seconds) {
        int minutes = seconds / 60;
        return getDurationString(minutes, seconds);
    }


    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 60 && minutes >= 0) {

            if (seconds < 60 && seconds >= 0) {
                int hours = minutes / 60;
                int remainingMinutes = minutes % 60;
                int remainingSeconds = seconds % 60;
                return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s ";
            } else {
                return "Invalid Input for Seconds" + seconds + " Must be between 0 to 59";

            }
        } else {
            return "Invalid Input for Minutes" + minutes + " Must be between 0 to 59";
        }
    }
}
