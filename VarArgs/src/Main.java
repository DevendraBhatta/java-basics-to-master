public class Main {
    public static void main(String... args) {


        String[] splitString = "Hello World again".split("");
        printText(splitString);


        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello","World","again");


        System.out.println("_".repeat(20));
        printText();

        System.out.println("_".repeat(20));
        printText("");

        String[] aArray = {"First","Second","Third","fourth","fifth"};
        System.out.println(String.join(",",aArray));



    }

    private static void printText(String... textList) {
        for (String t : textList) {
            System.out.println(t);
        }
    }
}
