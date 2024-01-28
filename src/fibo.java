import java.util.*;
public class fibo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,a=0,b=1,c;
        System.out.println("Enter a number");
        n = sc.nextInt();

        if(n == 1)
        {
            System.out.println(a);
        }
        else if(n >= 2)
        {
            System.out.print(a+","+b);
            n = n-2;
            while(n>0)
            {
                c = a + b;
                a=b;
                b=c;
                System.out.print(","+c);
                n--;
            }
        }

    }
}
