import java.io.*;
import java.util.*;
public class productivechar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next(),fstr="";
        int i=0;
        for(i=0;i<str.length()-1;i=i+2)
        {
            // System.out.println(i+" ");
            
            // System.out.println(str.charAt(i+1)+" ");
            if(str.charAt(i) <= str.charAt(i+1))
            {
                fstr += str.charAt(i+1);
                // System.out.print(str.charAt(i+1)+" ");
            }
            else
            {
                fstr += str.charAt(i);
                // System.out.print(str.charAt(i)+" ");
            }
        }
        if(i<str.length())
            fstr += str.charAt(i);
        System.out.println(fstr);
    }
}