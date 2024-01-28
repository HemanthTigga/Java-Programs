import java.util.*;
public class unique_ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> ht = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            ht.add(sc.nextInt());
        }
        System.out.println(ht);
    }
}
