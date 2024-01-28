import java.util.*;
public class twisted_prime {
    boolean isprime(int num)
    {
        for(int i=2;i<num;i++)
        {
            if(num % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        twisted_prime obj = new twisted_prime();
        int ll,ul,rev;
        System.out.println("Enter lower and Upper limit");
        ll = sc.nextInt();
        ul = sc.nextInt();
        for(int i = ll;i<=ul;i++)
        {

            rev=0;
            int t=i;
            while(t>0)
            {
                rev = rev * 10 + (t % 10);
                t /= 10;
            }
            if(obj.isprime(i) && obj.isprime(rev))
            {
                System.out.print(i+" ");
            }
        }
    }
}