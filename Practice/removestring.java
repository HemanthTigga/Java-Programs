import java.util.*;
import java.io.*;
public class removestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        LinkedList<String> ll = new LinkedList<String>();
        for(int i=0;i<n;i++)
        {
            ll.add(sc.next());
        }
        String s1 = sc.next();
        for(int i=0;i<n;i++)
        {
            if(s1.compareTo(ll.get(i)) >= 0)
            {
                ll.remove(i);
                n--;
                i--;
            }
        }
        System.out.println(ll);
    }
}
