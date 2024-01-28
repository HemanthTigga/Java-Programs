import java.io.*;
import java.util.*;

public class factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        HashMap<Integer, Integer> hp = new HashMap<Integer, Integer>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                hp.put(i, n / i);
        }
        for (Integer i : hp.keySet()) {
            sum += hp.get(i) + i;
        }
        
        System.out.println(hp);
        System.out.println("Sum = " + sum);
    }
}