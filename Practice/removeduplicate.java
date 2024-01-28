import java.io.*;
import java.util.*;
public class removeduplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String fstr="";
        int i;
        for(i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i) != str.charAt(i+1))
            {
                fstr += str.charAt(i);
            }
        }
        fstr += str.charAt(i);
        System.out.println(i);
        System.out.println(fstr);
    }
}
