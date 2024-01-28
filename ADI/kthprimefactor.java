import java.io.*;
import java.util.*;
public class kthprimefactor {
    boolean checkPrime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        kthprimefactor obj = new kthprimefactor();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int c=0;
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                if(obj.checkPrime(i)){
                    c++;
                    if(k == c){
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }
}