import java.io.*;
import java.util.*;
public class longest_subsequence_DP {
    int longestCommonSubseq_DP(String str1 , String str2, int m,int n,int dp[][]){
        if (m == 0 || n == 0) 
            return 0;

        if(dp[m][n] !=-1){
            return dp[m][n];
        }
        if(str1.charAt(m-1) == str2.charAt(n-1)){
            dp[m][n] =  1 + longestCommonSubseq_DP(str1,str2,m-1,n-1,dp);
            return dp[m][n];
        }
        else{
            dp[m][n] = Math.max(longestCommonSubseq_DP(str1,str2,m-1,n,dp),longestCommonSubseq_DP(str1,str2,m,n-1,dp));
            return dp[m][n];
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        longest_subsequence_DP obj = new longest_subsequence_DP();
        String str1 = sc.next();
        String str2 = sc.next();
        int dp[][] =new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<=str1.length();i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(obj.longestCommonSubseq_DP(str1, str2,str1.length(),str2.length(),dp));
    }
}