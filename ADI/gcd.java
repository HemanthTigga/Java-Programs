import java.io.*;
import java.util.*;
public class gcd {
    public static int findGCD(int a, int b) {
        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }
    public static void main(String[] args){
        System.out.println(findGCD(15,20));
    }
}