import java.util.*;
public class fibo_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter size of array");
        n = sc.nextInt();
        int arr[] = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}