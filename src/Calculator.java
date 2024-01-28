import java.io.*;
import java.util.*;
public class Calculator {
    public static void main(String args[])throws IOException{
        Scanner sc=new Scanner(System.in);
        int a,b,task;
        a=sc.nextInt();
        b=sc.nextInt();
        task= sc.nextInt();
        switch(task){
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4: System.out.println(a/b);
            break;
            case 5: System.out.println(a%b);
            break;
            default: System.out.println("Invalid input");
        }
    }
}
