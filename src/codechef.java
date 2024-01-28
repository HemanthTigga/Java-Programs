/* package code-chef; // don't place package name! */



import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
public class codechef
{
    public static void main (String[] args)
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int T,N,A,B;
        double P,p1;
        T=sc.nextInt();
        while(T>0)
        {
            N=sc.nextInt();
            P=0;
            A=sc.nextInt();
            B=sc.nextInt();
            if(((A-B)==-1 || (A-B)==1)&&(A!=1&&B!=1))
            {
                P=2.0/N;
                //System.out.println(int(P));
                //System.out.println(2/N);
            }
            else if((A+1==B||A-1==B))
            {

                P=1.0/N;
                //System.out.println(int(P));
            }
            else if((A-B)==-2 || (A-B)==2)
            {
                P=1.0/N;
            }
            p1=P*N;
            System.out.println((int)p1);
            T=T-1;
        }
    }
}
