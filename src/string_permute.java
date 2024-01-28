import java.io.*;
import java.util.*;
public class string_permute {

//    String swap(String s,int i,int j)
//    {
//        char[] arr = s.toCharArray();
//        char temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//        return String.valueOf(arr);
//    }
//    void permute(String s,int start,int end) {
//        if (start == end)
//            System.out.println(s);
//
//        for (int i = start; i <= end; i++)
//        {
//            s=swap(s,start,i);
////            System.out.println("s="+s);
//            permute(s,start+1,end);
//            s=swap(s,start,i);
//        }
//    }
    public static void main(String[] args)throws IOException {
//        Scanner sc = new Scanner(System.in);
//        string_permute obj = new string_permute();
//        String str;
//        str = sc.nextLine();
//        obj.permute(str,0,str.length()-1);
        String str="You are welcome",fstr="";
        String s[]= str.split("\\s");
        for(String a:s)
        {
            StringBuilder temp = new StringBuilder(a).reverse();
            fstr += temp.toString()+" ";
        }
        System.out.println(fstr.trim());
        str="ana%$@tomy";
        str=str.replaceAll("\\p{Punct}","");
        System.out.println(str);
    }
}
