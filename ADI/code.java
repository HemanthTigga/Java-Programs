import java.io.*;
import java.util.*;
public class code {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String fstr="";
        /*for(int i =0;i<str.length();i++)
        {
            fstr += ((char)((int)str.charAt(i)-'0'+'a'));
        }*/
        for(char c: str.toCharArray())
        {
            fstr += (char)(Character.getNumericValue(c)+97);
        }
        System.out.println(fstr);
    }
}