import java.io.*;
import java.util.*;
public class kthfromend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k,i=0,num;
        num= sc.nextInt();
        LinkedList<Integer> ll = new LinkedList<Integer>();
        while(num != -1)
        {
            ll.addLast(num);
            num = sc.nextInt();
        }
        k = sc.nextInt();
        int size = ll.size();
        LinkedList<Integer> list = ll;
        while(i<size-k)
        {
            i++;
            list.poll();
        }
        System.out.println(list.getFirst());
    }
}
