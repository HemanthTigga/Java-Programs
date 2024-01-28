import java.util.*;
public class uns {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int arr1[]=new int[arr.length];
        for(int i=0;i<n;i++){
            arr1[i]=i;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;

                    int t1=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=t1;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }

    }
}
