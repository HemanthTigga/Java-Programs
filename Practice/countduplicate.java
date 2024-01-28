import java.util.*;
import java.io.*;
public class countduplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        try
        {
            n = sc.nextInt();
        }catch(InputMismatchException  e)
        {
            System.out.println("data is not of Integer type");
            return;
        }
        
        if(n>0)
        {
            int arr[] = new int[n];
            int max=-99999,s=0;
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
                if(arr[i] >= max)
                {
                    max = arr[i];
                }
            }
            int count[] = new int[max+1];
            int maxcount =-1;
            for(int i=0;i<n;i++)
            {
                count[arr[i]]++;
            }
            for(int i : count)
            {
                if(i>maxcount)
                {
                    maxcount=i;
                }
            }
            if(maxcount == 1)
            {
                System.out.println(n);
            }
            else{
                for(int i : count)
            {
                if(i>0)
                {
                    s += i-1;
                }
            }
            System.out.println(s);
            }
            
        }
        else
        {
            System.out.println("Invalid size");
        }
    }
}
