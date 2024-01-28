import java.io.*;
import java.util.*;
public class sum_series extends Exception {
    sum_series(){ }
    sum_series(String str) { super(str); }
    public static void main(String[] args)throws IOException{
        int sum=0,i;
        try {
            for ( i = -10; i <= 10; i++) {
                if (i < 10)
                    System.out.print("(1" + "/" + i + ")+");
                else if (i == 10)
                    System.out.print("(1" + "/" + i + ")");
                if (i == 0){
                    sum_series me = new sum_series("Divided by Zero");
                    throw me;
                }
                sum += 1 / i;
            }

        }
        catch(sum_series e)
        {
            e.printStackTrace();
        }
        System.out.println("\n\nsum of series = "+sum);
    }
}


//class Main {
//    public static void main(String args[]) {
//        try {
//            throw 10;
//        }
//        catch(int e) {
//            System.out.println("Got the  Exception " + e);
//        }
//    }
//}

//class Test extends Exception { }
//
//class Main {
//    public static void main(String args[]) {
//        try {
//            throw new Test();
//        }
//        catch(Test t) {
//            System.out.println("Got the Test Exception");
//        }
//        finally {
//            System.out.println("Inside finally block ");
//        }
//    }
//}

//
//class Main {
//    public static void main(String args[]) {
//        int x = 0;
//        int y = 10;
//        int z = y/x;
//    }
//}

//class Ba
