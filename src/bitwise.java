import java.sql.SQLOutput;
import java.util.*;
public class bitwise {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);
    }
}
