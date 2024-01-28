import java.io.*;
import java.util.*;
public class min_distance {
    public static int mindistance(int n){
        if(n<0){                      //n excluded
            return 0;
        }
        if(n==0)
        {
            return 1;
        }
        else{
            return mindistance(n-1)+mindistance(n-2)+mindistance(n-3);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(mindistance(n));
    }
}