import java.util.*;
import java.io.*;
class bin_to_dec
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String fstr="";
        String bin = Integer.toBinaryString(N);
        for(int i=0;i<bin.length();i++)
        {
            if(i%2 == 1){
                if(bin.charAt(i) == '0')
                {
                    fstr += '1';
                }
                else
                {
                    fstr += '0';
                }
            }
            else
            {
                fstr += bin.charAt(i);
            }
        }
        System.out.println("After changing");
        System.out.println("Binary:"+fstr);
        int dec = Integer.parseUnsignedInt(fstr,2);
        System.out.println("Decimal:"+dec);
    }
}
