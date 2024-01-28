import java.util.*;
public class Mathe {
    int pwr(int e,int b)
    {
        int s=1;
        for(int i=0;i<e;i++)
        {
            s*=b;
        }
        return s;
    }
    int absolute(int num)
    {
        if(num < 0)
        {
            num = num * (-1);
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        Mathe obj=new Mathe();
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(obj.pwr(a,b));
        System.out.println(obj.absolute(a));
    }
}
