import java.io.*;
import java.util.*;
public class characterinsertion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        String s = sc.nextLine();
        String fstr[] = s.split(" ");
        Arrays.sort(fstr);
        StringBuilder sb = new StringBuilder(str);
        for(int i=fstr.length-1;i>=0;i--)
        {
            sb.insert(Integer.parseInt(fstr[i]),"*");
            // System.out.println(sb);
        }
        System.out.println(sb);
    }
}