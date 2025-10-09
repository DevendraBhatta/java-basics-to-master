package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class Main {
    public static void main(String[] args) {

        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("Oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");
        System.out.println(objectList);


        ArrayList<GroceryItem> groceryItemsArrayList = new ArrayList<>();
        groceryItemsArrayList.add(new GroceryItem("Butter"));
        groceryItemsArrayList.add(new GroceryItem("milk"));
        groceryItemsArrayList.add(new GroceryItem("oranges", "PRODUCE", 5));
        groceryItemsArrayList.set(0, new GroceryItem("apples", "PRODUCE", 4));
        groceryItemsArrayList.remove(1);
        System.out.println(groceryItemsArrayList);
    }
}
