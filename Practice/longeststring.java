import java.io.*;
import java.util.*;
public class longeststring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer st=new StringTokenizer(str);
        int max=0;
        while(st.hasMoreTokens())
        {
            String s= st.nextToken();
            if(s.length() > max)
                max = s.length();
        }
        System.out.println(max);
        System.out.println(str.substring(0,3));
    }
}
