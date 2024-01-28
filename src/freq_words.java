import java.util.*;
public class freq_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<String,Integer> mp = new HashMap();
        String arr[] = str.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            if(mp.get(arr[i]) == null)
            {
                mp.put(arr[i],0);
            }
            int v = mp.get(arr[i]);
            v++;
            mp.put(arr[i],v);
        }
        System.out.println(mp);
    }
}
