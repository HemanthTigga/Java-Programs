import java.io.*;
import java.util.*;
public class verify_email {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char fc = str.charAt(0),ch;
        boolean flag = false;
        int c=0,k=0;
        for(int i=0;i<str.length();i++)
        {
            ch = str.charAt(i);
            if(ch == ' ')
                c++;
            else if(ch == '@')
            {
                k=1;
                for(int j=i;j<str.length();j++)
                {
                    ch = str.charAt(i);
                    if(ch == '.') {
                        flag = true;
                        break;
                    }
                }
            }
        }
        if(c == 0 && k == 1 && !Character.isDigit(fc))
            flag = true;

        if(flag)
            System.out.println("Valid");
        else
            System.out.println("Not Valid");
    }
}
