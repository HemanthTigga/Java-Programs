import java.io.*;
import java.util.*;
public class sortlimit {
    void sortArray(int arr[],int f,int e){
        Arrays.sort(arr,f,e);
    }
    public static void main(String[] args){
        sortlimit obj = new sortlimit();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if(k==1)
        {
            obj.sortArray(arr,0,3);
        }
        else if(k==2)
        {
            if((n/2)+3 <= n)
                obj.sortArray(arr,n/2,(n/2)+3);
            else
                obj.sortArray(arr,n/2,n);
        }
        else if(k==3)
        {
            obj.sortArray(arr,n-3,n);
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+",");
        }
    }
}