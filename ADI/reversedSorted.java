import java.io.*;
import java.util.*;
public class reversedSorted {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] index = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            index[i]=i;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    temp = index[j];
                    index[j] = index[j+1];
                    index[j+1] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(index[i]+" ");
        }
    }
}