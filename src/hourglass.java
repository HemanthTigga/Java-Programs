import java.util.*;
public class hourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<m;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int maxsum=-999;
        for(int i=0;i<n-2;i++)
        {
            for(int j=0;j<m-2;j++)
            {
                maxsum = Math.max(maxsum,arr[i][j]+arr[i][j+1]+arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
            }
        }
        System.out.println(maxsum);
    }
}
