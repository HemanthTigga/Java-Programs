import java.util.*;
import java.io.*;
public class stringsplit {
    public static void main(String[] args) {
        String str = "5+3x^2+5x^3+7x^6";
        String s[] = str.split("[x^+-]+");
        System.out.println("parts = "+s.length);
        for(String s1:s)
        {
            System.out.println(s1);
        }
    }
}
