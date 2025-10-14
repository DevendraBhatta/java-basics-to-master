import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();

        while (flag) {
            printActions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }

    }

    private static void addItems(ArrayList<String> groceries) {
        System.out.println("Add item(s) [Separate items by comma]");
        String[] items = scanner.nextLine().split(",");
        // groceries.addAll(List.of(items));
        for (String i : items) {

            String trimmed = i.trim();

            if (groceries.indexOf(trimmed) < 0) {
                groceries.add(trimmed);
            }
        }

    }


    private static void removeItems(ArrayList<String> groceries) {
        System.out.println("Remove item(s) [Separate items by comma]");
        String[] items = scanner.nextLine().split(",");
        for (String i : items) {
            String trimmed = i.trim();
                groceries.remove(trimmed);
        }
    }


    private static void printActions() {
        String textBlock = """
                Available Actions:
                0 -- Shutdown
                1 -- To add item(s) in the list
                2 -- To remove the item in the list
                Enter a Number for which action you want to do:
                """;
        System.out.println(textBlock + " ");
    }
}
