import java.io.*;
import java.util.*;

public class messageprocessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("\\s+","");
        // str = str.replace(" ","");
        System.out.println(str);
        str=String.valueOf(Character.toUpperCase(str.charAt(0))+str.substring(1));
        System.out.println(str);
    }
}
