public class MethodChallenge {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(9999);
        System.out.println("Dev " + highScorePosition);

        highScorePosition = calculateHighScorePosition(999);
        System.out.println("Marley " + highScorePosition);

        highScorePosition = calculateHighScorePosition(99);
        displayHighScorePosition("Devil", highScorePosition);

        highScorePosition = calculateHighScorePosition(20009);
        displayHighScorePosition("Biku", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int result;
        if (playerScore >= 1000) {
            result = 1;
        } else if (playerScore >= 500) {
            result = 2;
        } else if (playerScore >= 100) {
            result = 3;
        } else {
            result = 4;
        }
        return result;
    }
}