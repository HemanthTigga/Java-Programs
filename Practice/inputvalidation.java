import java.io.*;
import java.util.*;

public class inputvalidation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            String name = sc.next();
            int id = sc.nextInt();
            if(id<=0)
            {
                System.out.println("Invalid id");
                continue;
            }
            int salary = sc.nextInt();
            if(salary < 0)
            {
                System.out.println("Invalid salary");
                continue;
            }
            System.out.println("ALl good");
            break;
        }
    }
}