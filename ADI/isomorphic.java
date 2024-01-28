
import java.util.HashMap;
import java.util.Scanner;

public class isomorphic {
    public static void main(String[] args) {
        Scanner mscan = new Scanner(System.in);
        String s1 = mscan.next();
        String s2 = mscan.next();

        HashMap<Character, Character> hm = new HashMap<>();

        boolean failed = false;
        for(int i = 0; i<s2.length();i++){
            if(!hm.containsKey(s1.charAt(i))){
                hm.put(s1.charAt(i),s2.charAt(i));
            }
            else{
                char val = hm.get(s1.charAt(i));
                if(val == s2.charAt(i)){
                    continue;
                }
                else{
                    System.out.println("no");
                    failed = true;
                    break;
                }
            }
        }
        if(!failed){
            System.out.println("yes");
        }
    }
}