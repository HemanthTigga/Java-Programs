import java.util.*;
public class second_max_min {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter size of array");
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int maxnum=arr[0],minnum=arr[0];
        for(int i =0;i<n;i++)
        {
            if(arr[i] >= maxnum)
                maxnum = arr[i];
            if(arr[i] <= minnum)
                minnum = arr[i];
        }
        System.out.println("Maximum number = "+maxnum);
        System.out.println("Minimum number = "+minnum);
        int sl=-1,sm=-1;
        for(int i =0;i<n;i++)
        {
            if(arr[i] != maxnum)
            {
                if(sl == -1)
                    sl = i;
                if(arr[i] >= arr[sl])
                    sl = i;
            }
            if(arr[i] != minnum){
                if(sm == -1)
                    sm = i;
                if (arr[i] <= arr[sm])
                    sm = i;
            }
        }
        System.out.println("Second maximum number = "+arr[sl]);
        System.out.println("Second minimum number = "+arr[sm]);
    }
}