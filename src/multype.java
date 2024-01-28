import java.util.*;
public class multype {
    int prod(int a,int b)
    {

        return a*b;
    }
    int prod(int a,int b,int c)
    {

        return a*b*c;
    }
    int prod(int a,int b,int c,int d)
    {

        return a*b*c*d;
    }
    int prod(int a,int b,int c,int d,int e)
    {

        return a*b*c*d*e;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        multiply obj = new multiply();
        int n;
        System.out.println("Enter no. of values");
        n = sc.nextInt();
        switch(n)
        {
            case 2:
            {
                System.out.println("Enter "+n+" numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(obj.prod(a,b));
                break;
            }
            case 3: {
                System.out.println("Enter " + n + " numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                System.out.println(obj.prod(a, b, c));
                break;
            }
            case 4:
            {
                System.out.println("Enter "+n+" numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();
                System.out.println(obj.prod(a,b,c,d));
                break;
            }
            case 5:
            {
                System.out.println("Enter "+n+" numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();
                int e = sc.nextInt();
                System.out.println(obj.prod(a,b,c,d,e));
                break;
            }
            default:
            {
                System.out.println("Invalid no.");
                break;
            }
        }
    }
}
