import java.util.*;
import java.math.*;
class options
{
    int ch;
    void choice()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Option 1 : Decimal to Binary\nOption 2 : Binary to Decimal");
        System.out.println("Enter Choice");
        ch = sc.nextInt();
    }
}
class convert extends options
{
    Scanner sc = new Scanner(System.in);
    int bin_dec()
    {
        int rev =0;
        switch(ch)
        {
            case 1:
            {
                String str ="";
                System.out.println("enter a number");
                int num=sc.nextInt();
                while(num > 0)
                {
                    str = Integer.toString(num%2) + str;
                    num /=2;
                }
                rev = Integer.parseInt(str);
                break;
            }
            case 2:
            {
                int p=0;
                System.out.println("enter a number in binary");
                int num=sc.nextInt();
                while(num > 0)
                {
                    int d=num%10;
                    rev = rev+(int)(d*(Math.pow(2,p)));
                    p++;
                    num /= 10;
                }
                break;
            }
        }
        return rev;
    }
}
class print extends convert{
    void display()
    {
        choice();
        System.out.println(bin_dec());
    }
}
public class conversion {
    public static void main(String[] args) {
        print obj = new print();
        obj.display();
    }
}
