import java.util.Hashtable;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class hashtable {
    public static void main(String[] args) {
        // Create an instance of Hashtable
        Hashtable<String, Integer> ht = new Hashtable<>();

        // Adding elements using put method
        ht.put("vishal", 10);
        ht.put("sachin", 30);
        ht.put("vaibhav", 20);
        System.out.println(ht);
        TreeMap<String,Integer> hh = new TreeMap<>(ht);
        NavigableMap<String, Integer> dmap = hh.descendingMap();
        System.out.println(hh);
        System.out.println(dmap);
        // Iterating using enhanced for loop
        for (Map.Entry<String, Integer> e : ht.entrySet())
            System.out.println(e.getKey() + " "
                    + e.getValue());
    }
}