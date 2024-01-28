import java.util.*;
public class subsequence {
    public static void printseq(String in,String op){
        if(in.length()==0){
            System.out.println(op);
            return;
        }
        printseq(in.substring(1),op);
        printseq(in.substring(1),op+in.charAt(0));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();

        printseq(str,"");
    }
}