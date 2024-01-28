import java.io.*;
import java.util.*;
public class matchsubstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        String s1= sc.nextLine();
        // int  l=str.length();

        // 1st approach
        // boolean s=false;
        // for(int i=0;i<l;i++)
        // {
        //     if(str.substring(i).startsWith(s1))
        //     {
        //         System.out.print(i+",");
        //         s=true;
        //     }
        // }

        // 2nd approach
        // int l2 = s1.length();
        // for(int i=0;i<l;)
        // {
        //     int pos = str.indexOf(s1, i);
        //     if(pos == -1){
        //         System.out.println("Not found");
        //         break;
        //     }
        //     System.out.print(pos+",");
        //     i = pos+1;
        // }

        //Naive approach

        int n=str.length();
        int m=s1.length();
        int flag=0;
        for(int i=0;i<=n-m;i++)
        {
            int j;
            for(j =0;j<m;j++)
            {
                if(s1.charAt(j) != str.charAt(i+j))
                {
                    break;
                }
            }
            if(j==m){
                flag = 1;
                System.out.print(i+",");
            }
        }
        if(flag == 0)
        {
            System.out.println("not found");
        }
    }
}