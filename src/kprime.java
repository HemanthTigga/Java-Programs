import java.util.*;
public class kprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,c,t=0;
        n=sc.nextInt();
        c=sc.nextInt();
        int p=0;
        for(int i=2;n!=1;i++){

            if(n%i==0) {
                t += 1;
                n /= i;

//                System.out.println(n);

                if (t == c) {
                    System.out.println(i);
                    p = 1;
                    break;
//                    System.exit(0);
                }
                i--;
            }
        }
        if(p!=1){
            System.out.println(-1);
        }

    }
}
