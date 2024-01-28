import java.io.*;
import java.util.*;
public class suplicatesum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int N = sc.nextInt();
        int arr[] = new int[N];
        System.out.println("enter"+N+"numbers");
        for(int i=0;i<N;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter limit");
        int start=sc.nextInt(),end=sc.nextInt();
        if((start < end) && start > 0 && end < N)
        {
            int s=0;
            for(int i=start;i<end;i++)
            {
                if(arr[i]%10 == 3 || arr[i]%10 == 2 || arr[i]%10 ==9)
                {
                    s += (arr[i]*arr[i]);
                }
            }
            System.out.println("sum= "+s);
        }
        else{
            System.out.println("Invalid limit");
        }
    }
}
