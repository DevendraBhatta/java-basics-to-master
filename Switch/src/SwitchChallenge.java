public class SwitchChallenge {
    public static void main(String[] args) {
        char charValue = 'X';
        System.out.println(" " + convertNATO(charValue));
    }

    public static String convertNATO(char c) {
        return switch (c) {
            case 'A' -> "Able";
            case 'B' -> "Baker";
            case 'C' -> "Charlie";
            case 'D' -> "Dog";
            case 'E' -> "Easy";
            case 'F' -> "Fox";
            case 'G' -> "George";
            case 'H' -> "How";
            case 'I' -> "Item";
            case 'J' -> "Jig";
            case 'K' -> "King";
            case 'L' -> "Love";
            case 'M' -> "Mike";
            case 'N' -> "Nan";
            case 'O' -> "Oboe";
            case 'P' -> "peter";
            case 'Q' -> "Queen";
            case 'R' -> "Roger";
            case 'S' -> "Sugar";
            case 'T' -> "Tare";
            case 'U' -> "Uncle";
            case 'V' -> "Victor";
            case 'W' -> "William";
            case 'X' -> "X-ray";
            case 'Y' -> "Yoke";
            case 'Z' -> "Zebra";
            default -> "Letter " + c + " was not found in the switch";
        };
    }


}
