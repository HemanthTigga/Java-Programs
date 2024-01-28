import java.util.*;
import java.io.*;
public class first_letter_word
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word = "",fstr="";
        StringTokenizer st = new StringTokenizer(str);
        while(st.hasMoreTokens())
        {
            word = st.nextToken();
            fstr += word.charAt(0)+",";
        }
        int l = fstr.length();
        fstr = fstr.substring(0,l-1);
        System.out.println(fstr.toUpperCase());
    }

}