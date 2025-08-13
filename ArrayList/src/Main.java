import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){

    public GroceryItem(String name){
        this(name,"DAIRY",1);
    }

    @Override
    public String toString(){
        return String.format("%d %s in %s",count,name.toUpperCase(),type);
    }

}

public class Main {
    public static void main(String[] args) {

        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples","PRODUCE",6);
        groceryArray[2] = new GroceryItem("oranges","PRODUCE",1);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryLists = new ArrayList<>();
        groceryLists.add(new GroceryItem("Butter"));
        groceryLists.add(new GroceryItem("milk"));
        groceryLists.add(new GroceryItem("oranges","PRODUCE",5));
        System.out.println(groceryLists);

        groceryLists.add(0,new GroceryItem("apples","PRODUCE",6));
        System.out.println(groceryLists);
        groceryLists.remove(1);
        System.out.println(groceryLists);
    }
}
