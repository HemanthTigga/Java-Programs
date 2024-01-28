import java.util.*;
import java.math.*;
public class rotatearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,p,i;
        System.out.println("Enter size of array");
        n = sc.nextInt();
        int arr[] = new int[n];
        for(i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Sorted array : ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int t=arr[0],c=0;

        while(c++ < n-1) {
            p = arr[0];
            for (i = 1; i < n; i++) {
                arr[i - 1] = arr[i];
            }
            arr[i - 1] = p;
            for (i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            if(arr[1] == t)
                break;
        }

    }
}
