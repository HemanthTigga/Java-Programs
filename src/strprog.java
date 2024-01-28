import java.io.*;
import java.util.*;
public class strprog {
    public static void main(String[] args)throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);              //because util package is not imported we don't use Scanner
        BufferedReader in = new BufferedReader(read);
        String str,fstr="";
        str = in.readLine();
        System.out.println(str);
        System.out.println(str.length());
        //calculating length without using length function
        int count=0,i;
        char ch;
        for(char c:str.toCharArray())
        {
            count++;
        }
        System.out.println(count);
        for(i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }
        for(i=0;i<str.length();i++)
        {
            fstr= str.charAt(i)+fstr;
        }
        System.out.println(fstr);
        if(str.equalsIgnoreCase(fstr))
            System.out.println("Palimdrome string");
        else
            System.out.println("Not a Palimdrome string");

        //count number of alphabet,uppercase,lowercase,digits,space,special characters
        int al=0,l=0,u=0,d=0,s=0,sp=0;
        for(i=0;i<str.length();i++)
        {
            ch = str.charAt(i);
            if(Character.isLetter(ch)) {
                al++;
                if (Character.isLowerCase(ch))
                    l++;
                if (Character.isUpperCase(ch))
                    u++;
            }
            else if(Character.isDigit(ch))
                d++;
            else if(Character.isWhitespace(ch))
                s++;
            else
                sp++;
        }
        System.out.println("Number of alphabets = "+al);
        System.out.println("Number of lowercase = "+l);
        System.out.println("Number of uppercase = "+u);
        System.out.println("Number of digits = "+d);
        System.out.println("Number of spaces = "+s);
        System.out.println("Number of special character = "+sp);
    }
}

















