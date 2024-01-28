import java.io.*;
import java.util.*;
public class costofgroceries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int A[] = new int[N];
        int B[] = new int[N];
        int amount=0;
        for(int i =0;i<N;i++)
        {
            A[i] = sc.nextInt();
        }
        for(int i =0;i<N;i++)
        {
            B[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            if(A[i] >= X)
            {
                amount += B[i];
            }
        }
        System.out.println(amount);
    }
}
