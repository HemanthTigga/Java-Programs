import java.io.*;
import java.util.*;
public class ascending_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine(),fstr="",w="";

        int wl=0,k=0;
        char ch;
        str = str + " ";
        int l = str.length();
        String[] arr = new String[100];
        for(int i=0;i<l;i++)
        {
            ch = str.charAt(i);
            if(ch != ' ')
                w += ch;
            else {
                arr[k++] = w;
                w = "";
                wl++;
            }
        }

        for(int i=0;i<k;i++)
        {
            for(int j =0;j<k-i-1;j++)
            {
                if(arr[j].compareTo(arr[j+1]) > 0)
                {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i<k;i++)
        {
            fstr += arr[i] + " ";
        }
        System.out.println("\n"+fstr);
    }
}
