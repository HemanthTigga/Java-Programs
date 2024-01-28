import java.io.*;
import java.util.*;
public class triplettarget {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt(),s2 = sc.nextInt(),s3 = sc.nextInt();
        int arr1[] = new int[s1];
        int arr2[] = new int[s2];
        int arr3[] = new int[s3];
        for (int i=0;i<s1;i++)
        {
            arr1[i] = sc.nextInt();
        }
        for (int i=0;i<s2;i++)
        {
            arr2[i] = sc.nextInt();
        }
        for (int i=0;i<s3;i++)
        {
            arr3[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        for(int i=0;i<s1;i++)
        {
            for(int j=0;j<s2;j++)
            {
                for(int k=0;k<s3;k++)
                {
                    if((arr1[i] + arr2[j] + arr3[k]) == target)
                    {
                        System.out.println(arr1[i] + " "+arr2[j] + " "+arr3[k]);
                        return;
                    }
                }
            }
        }
    }
}