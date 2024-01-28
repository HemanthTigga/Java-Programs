import java.io.*;
import java.util.*;
public class string_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int l = str.length(),li=l-1;
        boolean flag = true;
        for(int i=0;i<l/2;i++)
        {
            if(str.charAt(i) != str.charAt(li--)) {
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("Palindrome string");
        else
            System.out.println("Not a Palindrome string");

    }
}
