import java.util.*;
public class employee
{
    float salary=40000.53f;
}
class programmer extends employee
{
    int bonus=10000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        programmer p = new programmer();
        System.out.println(p.salary);
        System.out.println(p.bonus);
        System.out.println(p.salary*12 + p.bonus);
        System.out.println(String.format("%.2f",p.salary));
    }
}