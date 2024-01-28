import java.io.*;
import java.util.*;

public class lucky {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = Integer.toString(num);
        int n = str.length();
        // System.out.println(n);
        int t=n,d=0,t1=num;
        while(t-- > 0)
        {
            // System.out.println();
            d += Math.pow(num%10,n);
            num /= 10;
            // System.out.println("d="+d);
        }
        if(d == t1)
            System.out.println("Valid Lucky number");
        else
            System.out.println("Invalid Lucky number");
    }
}