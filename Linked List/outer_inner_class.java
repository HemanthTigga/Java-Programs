import java.util.*;
public class outer_inner_class {
    class inner{
        public void display()
        {
            System.out.println("Hello!");
        }
    }
    public static void main(String[] args) {
        outer_inner_class.inner obj = new outer_inner_class().new inner();
        obj.display();
    }
}
