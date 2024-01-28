import java.util.*;
import java.io.*;
public class runningwithAliceBob {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        int A[]=new int[N];
        int B[]=new int[N];
        int c=0;
        for(int i=0;i<N;i++)
        {
            A[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            B[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            if((B[i]*2 >=A[i]) && (A[i]*2 >=B[i]))
            {
                c++;
            }
        }
        System.out.println(c);
    }
}
