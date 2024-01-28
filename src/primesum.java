import java.util.*;
class first{
    int n1,n2;
    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
    }
}
class second extends first{
    boolean isprime(int n)
    {
        if(n<1)
            return false;
        for(int i=2;i<n;i++)
        {
            if(n%i == 0)
                return false;
        }
        return true;
    }
    int sum()
    {
        int s=0,c=0,d;
        for(int i=n1;i<=n2;i++)
        {
            if(isprime(i))
                s += i;
        }
        System.out.println("Sum of prime numbers b/w "+n1+" and "+n2+" = "+s);
        while(s>0)
        {
            d= s%10;
            if(d%2 == 0)
                c++;
            s /=10;
        }
        return c;
    }
}
class third extends second{
    void display()
    {
        System.out.println("Number of even digits =  "+sum());
    }
}
public class primesum {
    public static void main(String[] args)
    {
        third obj = new third();
        obj.input();
        obj.display();
    }
}
