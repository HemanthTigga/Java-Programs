import java.io.*;
import java.util.*;
public class frequencysort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,c=0;
        String arr1 = sc.nextLine();
        String arr[] = arr1.split(" ");
        n=sc.nextInt();
        HashSet<String> ht = new HashSet<String>();
        ArrayList<Integer> freq = new ArrayList<Integer>();
        for(String i : arr)
        {
            ht.add(i);
        }
        for(String i : ht)
        {
            for(String j : arr)
            {
                if(i.equalsIgnoreCase(j))
                    c++;
            }
            freq.add(c);
            c=0;
        }
        ArrayList<String> str = new ArrayList<String>();
        for(String i : ht){
            str.add(i);
        }
        for(int i=0;i<freq.size();i++)
        {
            if(freq.get(i) >= n)
            {
                System.out.println(str.get(i));
            }
        }
    }
}