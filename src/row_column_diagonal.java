import java.util.*;
public class row_column_diagonal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.println("Enter row and column size of array");
        m = sc.nextInt();
        n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Enter " + m * n + " elements");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}
