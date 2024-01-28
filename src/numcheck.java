import java.util.*;
public class numcheck {

    public boolean isprime(int n)
    {
        if(n == 0 || n == 1)
            return false;
        for(int i=2;i<n;i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public boolean palindrome(int n)
    {
        int t=n,rev=0;
        while(t>0)
        {
            rev *=10+t%10;
            t /= 10;
        }
        if(rev == n)
            return true;
        else
            return false;
    }
    public boolean happy(int n)
    {
        int s=0;
        while(n>9)
        {
            while(n>0)
            {
                s = s+((n%10)*(n%10));
                n /= 10;
            }
            n=s;
            s=0;
        }
        if(n==1)
        {
            return true;
        }
        return false;
    }
    public boolean duck(int n)
    {
        if(n == 0)
            return true;
        while(n>9)
        {
            if(n%10 == 0)
                return true;
            n /= 10;
        }
        return false;
    }
    public boolean buzz(int n)
    {
        if(((n%10 == 7) && (n/7 == 0)))
        {
            return true;
        }
        return false;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        numcheck obj = new numcheck();
        int size;
        System.out.println("Enter size");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter "+size+" numbers");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("1. Prime Number. \n2. Palindrome number\n3. Happy number\n4. Duck number\n5. Buzz number");
        System.out.println("Enter choice");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1:
            {
                for(int i =0;i<size;i++)
                {
                    if(obj.isprime(arr[i]))
                    {
                        System.out.print(arr[i]+",");
                    }
                }
                break;
            }
            case 2:
            {
                for(int i =0;i<size;i++)
                {
                    if(obj.palindrome(arr[i]))
                    {
                        System.out.print(arr[i]+",");
                    }
                }
                break;
            }
            case 3:
            {
                for(int i =0;i<size;i++)
                {
                    if(obj.happy(arr[i]))
                    {
                        System.out.print(arr[i]+",");
                    }
                }
                break;
            }
            case 4:
            {
                for(int i =0;i<size;i++)
                {
                    if(obj.duck(arr[i]))
                    {
                        System.out.print(arr[i]+",");
                    }
                }
                break;
            }
            case 5:
            {
                for(int i =0;i<size;i++)
                {
                    if(obj.buzz(arr[i]))
                    {
                        System.out.print(arr[i]+",");
                    }
                }
                break;
            }
            default:
            {
                System.out.println("Invalid choice");
                break;
            }
        }
    }
}