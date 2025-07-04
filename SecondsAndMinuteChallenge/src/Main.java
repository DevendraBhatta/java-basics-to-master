public class Main {

    static char hour = 'h';
    static char minute = 'm';
    static char second = 's';

    public static void main(String[] args) {

        System.out.println(" " + getDurationString(390000));
        System.out.println(" " + getDurationString(3600, 3000));

    }

    public static String getDurationString(int seconds) {
        int secondsToHour = seconds / 3600;
        int remainingSecondToMinute = (seconds % 3600) / 60;
        int remainingSeconds = (seconds % 3600) % 60;
        return String.format("" + secondsToHour + hour + " " + remainingSecondToMinute + minute + " " + remainingSeconds + second);
    }

    public static String getDurationString(int minutes, int seconds) {
        int totalSeconds = (minutes * 60) + seconds;
        return getDurationString(totalSeconds);
    }
}

