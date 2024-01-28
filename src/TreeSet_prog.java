import java.util.*;
class TreeSet_prog
{
    public static void main(String[] args)
    {
        TreeSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        System.out.println(set); // display the elements of the TreeSet

        set.add("Pineapple");
        System.out.println(set); // display the elements of the TreeSet after adding Pineapple

        System.out.println(set.contains("Banana")); // check if the TreeSet contains the element "Banana"

        set.remove("Orange");
        System.out.println(set); // display the elements of the TreeSet after removing Orange

        System.out.println(set.size()); // get the size of the TreeSet

        System.out.println(set.first()); // get the first element in the TreeSet

        set.clear();
        System.out.println(set); // display the elements of the TreeSet after clearing it
    }
}
