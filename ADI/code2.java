import java.io.*;
import java.util.*;

public class code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = 0;
        /*while (n >= 26) {
            while (n > 0) {
                s += n % 10;
                n /= 10;
            }
            n = s;
            s = 0;
        }*/
        while(n!=0 || s>=26)
        {
            if(s>26)
            {
                n=s;
                s=0;
            }
            s+=n%10;
            n /=10;
        }
        System.out.println((char)(s+64));
    }
}