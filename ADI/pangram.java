import java.io.*;
import java.util.*;
public class pangram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        str.toLowerCase();
        int alphabet[] = new int[26];
        String arr[] = str.split(" ");
        for (int i=0; i<str.length(); i++){
            
            if(str.charAt(i) != ' ')
                alphabet[str.charAt(i)-'a']++;
        }
        boolean flag = true;
        for(int i=0;i<26;i++)
        {
            if(alphabet[i] == 0)
            {
                flag = false;
                break;
            }
        }
        if(flag)
        {
            System.out.println("Pangram");
        }
        else
        {
            System.out.println("Not Pangram");
        }
    }
}