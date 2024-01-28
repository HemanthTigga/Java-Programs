import java.util.*;
import java.io.*;
public class sort_index {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter size");
        n = sc.nextInt();
        int arr[] = new int[n];
        int index[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            index[i] = i;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp1 = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp1;
                    temp1 = index[j];
                    index[j] = index[j+1];
                    index[j+1] = temp1;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(index[i]+" ");
        }
    }
}
