import java.io.*;
import java.util.*;
public class validparenthesis {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if((ch == ')' && st.peek() == '(')
            || (ch == '}' && st.peek() == '{' )
            || (ch == ']' && st.peek() == '['))
            {
                st.pop();
            }
            else if(ch == '(' || ch == '{' || ch == '[')
            {
                st.push(ch);
            }
            
        }
        if(st.isEmpty())
            System.out.println(true);
        else
            System.out.println(false);
    }
}