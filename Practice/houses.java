import java.io.*;
import java.util.*;
public class houses {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int it=0;
        while(N>0)
        {
            if((it%3 == 2) && it%M != 0)
            {
                System.out.println(it);
                N--;
            }
            it++;

        }
    }
}