import java.io.*;
import java.util.*;
public class largesttriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        largesttriangle obj = new largesttriangle();
        System.out.println("Enter the number elements");
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        TreeMap<Integer,Integer> hp = new TreeMap<Integer,Integer>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            
            hp.put(arr[i],hp.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(hp);
        for(int c:hp.keySet()){
            int v = hp.get(c);
            if(v/3 >0){
                System.out.println(c+" : "+v/3);
            }
        }
    }
}