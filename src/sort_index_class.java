import java.util.*;
import java.io.*;
public class sort_index_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,j,k=1;
        System.out.println("Enter size");
        n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("\n");

//        for(int p=0;p<n;p++) {
//            for (i = 0, j = p; i < n && j < n; j++, i++) {
//                System.out.print(arr[i][j] + " ");
//            }
////            System.out.println();
//        }
//        System.out.println("\n\n");


        int t = n-1;
        for(int p=0;p<m;p++) {
            for (i = t, j = p; i < n && j < m; j++, i++) {
                System.out.print(arr[i][j] + " ");
            }
            t--;
            if(t >= 0)
                p--;
            else if(t<0)
            {
                t=0;
            }
            System.out.println();
        }
    }
}
