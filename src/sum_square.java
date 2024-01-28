import java.util.*;
import java.io.*;
public class sum_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0,m=0;
        try
        {
            m = sc.nextInt();
            n = sc.nextInt();
        }catch(InputMismatchException  e)
        {
            System.out.println("data is not of Integer type");
            return;
        }
        
        if(n>0 && m>0)
        {
            if(m!=n)
            {
                System.out.println("m should be equal to n");
                return;
            }
            int arr[][] = new int[m][n];
            int sum=0;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j] = sc.nextInt();
                }
                
            }
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(arr[i][j]+"   ");
                }
                System.out.println();
                
            }
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if((i+j) == n-1)
                    {
                        System.out.println(arr[i][j]);
                        sum += arr[i][j]*arr[i][j];
                    }
                }
                
            }
            System.out.println("Sum = "+sum);
            int rev = 0;
            
            while(sum >0)
            {
                rev = (rev*10) + (sum%10);
                sum /= 10;
            }
            int temp = rev;
            sum=0;
            System.out.println("Reverse = "+rev);
            int l = Integer.toString(rev).length();
            while(rev >0)
            {
                sum += Math.pow(rev%10,l);
                rev /= 10;
            }
            if(sum == temp)
            {
                System.out.println("Armstrong");
            }
            else
            {
                System.out.println("Not Armstrong");
            }
        }
        else
        {
            System.out.println("Invalid size");
        }
    }
}
