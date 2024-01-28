//recursive solution
// Time Complexity: O(2m*n)
// Auxiliary Space: O(1)

import java.io.*;
import java.util.*;
public class longest_subsequence {
    int longestCommonSubseq(String str1 , String str2, int m,int n){
        if (m == 0 || n == 0) 
            return 0;
        if(str1.charAt(m-1) == str2.charAt(n-1)){
            return 1 + longestCommonSubseq(str1,str2,m-1,n-1);
        }
        else{
            return Math.max(longestCommonSubseq(str1,str2,m-1,n),longestCommonSubseq(str1,str2,m,n-1));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        longest_subsequence obj = new longest_subsequence();
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(obj.longestCommonSubseq(str1, str2,str1.length(),str2.length()));
    }
}
