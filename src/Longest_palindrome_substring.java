//Not Optimised
import java.util.*;
import java.io.*;

public class Longest_palindrome_substring {
    public static boolean check_palindrome(String sub)
    {
        int arr[] = new int[26];
        int count = 0;
//        Arrays.fill(arr,0);
        for(int i=0;i<sub.length();i++)
        {
            arr[sub.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i] % 2 == 1)
            {
                count++;
            }
        }
        if(count > 1)
            return false;

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(),fstr = "";
        str = str.toLowerCase();
        int l = str.length(),maxl=-1;
        for(int i=0;i<l;i++)
        {
            for(int j=l;j>i;j--)
            {
                String s = str.substring(i,j);
                if(check_palindrome(s))
                {
                    int ls = s.length();
                    System.out.println(s);
                    if(ls > maxl)
                    {
                        maxl = ls;
                        fstr = s;
                    }
                }
            }
        }
        System.out.println(fstr);
    }
}
