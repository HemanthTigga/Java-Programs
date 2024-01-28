//Not Optimised
import java.util.*;
import java.io.*;
public class string_replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(),st="aba",s,fstr="";
        int l = str.length();
        for(int i=0;i<l;i++)
        {
            int p = i+st.length();
            if(p<l)
                s = str.substring(i,p);
            else {
                s = str.substring(i);
            }
//            System.out.println(s);
            if(s.equals(st))
            {
                fstr += "a";
                i = p-1;
            }
            else {
//                System.out.println("p="+p);
                fstr += str.charAt((p-st.length()));
            }
        }
        System.out.println(fstr);
    }
}
