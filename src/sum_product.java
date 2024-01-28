import java.util.*;
public class sum_product
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,a,s=0,p=1;
        System.out.println("Enter size of array");
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
        {
            a = sc.nextInt();
            while(a == 0)
            {
                System.out.println("Enter a non-zero number");
                a = sc.nextInt();
            }
            arr[i] = a;
        }
        for(int i =0;i<n;i++)
        {
            s += arr[i];
            p *= arr[i];
        }
        System.out.println("Sum = "+s);
        System.out.println("Product = "+p);
    }
}
