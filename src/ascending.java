import java.util.*;
public class ascending {
    public static void main(String[] args) {
        int a, b, c,min_num=0,max_num=0,middle=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 nos.");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        //min number
        if (a >= b && a >= c) {
            max_num = a;
        } else if (b >= a && b>= c) {
            max_num = b;
        } else if (c >= a && c >= b) {
            max_num = c;
        }

        //min number
        if (a <= b && a <= c) {
            min_num = a;
        } else if (b <= a && b <= c) {
            min_num = b;
        } else if (c <= a && c <= b) {
            min_num = c;
        }

        if(min_num  == 0)
            min_num = b;

        //middle number
        if (a != max_num && a != min_num) {
            middle = a;
        } else if (b != max_num && b != min_num) {
            middle = b;
        } else if (c != max_num && c != min_num) {
            middle = c;
        }
        if(middle == 0)
            middle = min_num;
        System.out.println(min_num+","+middle+","+max_num);
    }
}
