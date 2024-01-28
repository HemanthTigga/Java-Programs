import java.util.*;
public class nestedclass {
    static class inner{
        public void display()
        {
            System.out.println("Hello!");
        }
    }
    public static void main(String[] args) {
        inner obj = new inner();
        obj.display();
    }
}
