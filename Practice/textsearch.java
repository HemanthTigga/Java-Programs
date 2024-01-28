import java.io.*;
import java.util.*;

public class textsearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        String str1 = sc.next();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i =0;i<str.length();i++)
        {
            if(str.contains(str1))
            {
                arr.add(str.indexOf(str1, i));
                i = i+str1.length()-1;
            }
        }
        if(arr.size() != 0)
            System.out.println(arr);
        else
            System.out.println(-1);
    }
}
