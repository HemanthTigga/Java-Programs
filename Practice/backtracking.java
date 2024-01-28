import java.util.Scanner;

class backtracking
{
    public static void printPermutation(String str,String output,int index)
    {
        if(str.length() == 0)
        {
            System.out.println(output);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char cc = str.charAt(i);
            String ns = str.substring(0, i)+str.substring(i+1);
            printPermutation(str,);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPermutation
        
    }
}
/*
 * n-queen problem
 * hamiltonian path problem
 * maze path solution
 */