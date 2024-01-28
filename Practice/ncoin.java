import java.util.*;
class ncoin {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String arr[] = new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.next();
        }
        Arrays.sort(arr);
        Collections.reverse(Arrays.asList(arr)); 
        
        for (String s : arr) {
            System.out.print(s + "");
        }
    }
}