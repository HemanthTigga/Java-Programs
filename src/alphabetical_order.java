import java.io.*;
import java.util.*;
public class alphabetical_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine(),fstr="";
        int l = str.length();
        char[] arr = str.toCharArray();
        for(int i=0;i<l;i++)
        {
            for(int j =0;j<l-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i<l;i++)
        {
            fstr += arr[i];
        }
        System.out.println(fstr);
    }
}
