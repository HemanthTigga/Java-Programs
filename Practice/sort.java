import java.io.*;
import java.util.*;
public class sort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(sc.hasNextInt())
        {
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        System.out.println(arr);
    }
}