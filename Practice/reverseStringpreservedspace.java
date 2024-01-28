import java.io.*;
import java.util.*;

public class reverseStringpreservedspace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        int s = 0, e = ch.length - 1;
        for (int i = 0; i < ch.length / 2; i++) {
            if (ch[s] == ' ')
                s++;
            else if (ch[e] == ' ')
                e--;
            else {
                char t = ch[s];
                ch[s] = ch[e];
                ch[e] = t;
            }
            s++;
            e--;
        }
        System.out.println(new String(ch));
    }
}
