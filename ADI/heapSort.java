import java.io.*;
import java.util.*;
public class heapSort {

    public static void sort(int arr[],int N){
        for(int i=N/2-1;i>=0;i--){
            heapify(arr,N,i);
        }

        for(int i=N-1;i>=0;i--){
            int t = arr[i];
            arr[i] = arr[0];
            arr[0] = t;
            heapify(arr,i,0);
        }
    }
    public static void heapify(int arr[],int N,int i)
    {
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left < N && arr[left] > arr[largest])
        {
            largest = left;
        }
        if(right < N && arr[right] > arr[largest])
        {
            largest = right;
        }
        if(largest != i){
            int t = arr[i];
            arr[i] = arr[largest];
            arr[largest] = t;
            heapify(arr,N,largest);
        }
    }
    public static void print(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+",");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        // sort(arr,n);
        // print(arr,n);
        // String str = "Sunset the over dancing",fstr="";
        // String s[] = str.split(" ");
        // for(int i=s.length-1;i>=0;i--){
        //     // System.out.print(s[i]+" ");
        //     fstr += s[i]+" ";
        // }
        // System.out.print(fstr.trim());
        char ch='a';
        String str="Hea";
        str+=ch;
        System.out.println(str);
    }
}