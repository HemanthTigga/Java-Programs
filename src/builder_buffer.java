import java.io.*;
import java.util.*;
public class builder_buffer {
    public static void main(String[] args)throws IOException {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.append("World");
        sb.insert(2,"world");
        System.out.println(sb);
    }
}