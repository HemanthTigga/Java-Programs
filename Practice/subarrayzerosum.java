import java.io.*;
import java.util.*;
public class subarrayzerosum {
    public static boolean isGood(ArrayList<Integer> arr)
    {
        // HashSet<Integer> st = new HashSet<Integer>();
        int sum=0;
        for(int i=0;i<arr.size();i++)
        {
            sum += arr.get(i);
        }
        if(sum == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    arr1.add(arr[k]);
                }
                if(isGood(arr1))
                {
                    System.out.println(arr1);
                    c++;
                }
                // System.out.println(arr1);
                arr1.clear();
            }
        }
        System.out.println(c);
    }
}