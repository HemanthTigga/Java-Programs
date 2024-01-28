import java.io.*;
import java.util.*;
public class atbeginLL
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for(int i =0;i<N;i++)
        {
            ll.addFirst(sc.nextInt());
        }
        // System.out.println(ll);
        // ll.poll();
        // ll.removeFirst();
        // ll.removeFirst();
        System.out.println(ll);
        for (Integer element : ll) {
            System.out.print(element+" ");
        }
        
    }
}