import java.util.*;
public class motogp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,mdiff=999;
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i != j)
                {
                    int diff = Math.abs(arr[i]-arr[j]);
                    mdiff = Math.min(diff,mdiff);
                }
            }
        }
        System.out.println(mdiff);
    }
}
