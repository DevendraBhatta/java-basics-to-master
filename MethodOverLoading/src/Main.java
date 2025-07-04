public class Main {
    public static void main(String[] args) {
        System.out.println("New Score is " + calculateScore("Dev", 500));
        System.out.println("New Score is " + calculateScore(200));
        System.out.println("New Score is " + calculateScore());

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " Scored " + score + " Points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        return calculateScore("Anonymous", score);
    }

    public static int calculateScore() {
        System.out.println("No Player name No Player Score");
        return 0;
    }
}
