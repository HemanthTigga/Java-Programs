import java.util.*;
public class spiralmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        int arr[] = new int[n*m];
        for(int i =0;i<n*m;i++)
        {
            arr[i] = sc.nextInt();
        }
        int mat[][] = new int[n][m];
        int count=0,r=0,c=0,re=n-1,ce = m-1,p=0;
        while(count < n*m)
        {
            for(int i=c;i<=ce && count<n*m;i++)
            {
                mat[r][i] = arr[p++];
                count++;
            }
            r++;
            for(int i=r;i<=re && count<n*m;i++)
            {
                mat[i][ce] = arr[p++];
                count++;
            }
            ce--;
            for(int i=ce;i>=c && count<n*m;i--)
            {
                mat[re][i] = arr[p++];
                count++;
            }
            re--;
            for(int i=re;i>=r && count<n*m;i--)
            {
                mat[i][c] = arr[p++];
                count++;
            }
            c++;
        }
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<m;j++)
            {
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
