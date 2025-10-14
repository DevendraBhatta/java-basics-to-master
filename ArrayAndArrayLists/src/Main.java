import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] originalArray = new String[]{"first","Second","Third"};

        var originalLists = Arrays.asList(originalArray);

        originalLists.set(0,"one");

        System.out.println("list:"+originalLists);
        System.out.println("array "+Arrays.toString(originalArray));

        System.out.println("--------------------------");
        originalLists.sort(Comparator.naturalOrder());
        System.out.println(Arrays.toString(originalArray));

        //  originalLists.remove(0);
        // originalLists.add("fourth");

        List<String> newList = Arrays.asList("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday");
        System.out.println(newList);



    }
}
