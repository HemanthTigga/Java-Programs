import java.util.*;
public class details
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, gender, and age: ");
        String name = sc.next();
       char gender = sc.next().charAt(0);
       int age = sc.nextInt();
        String fstr =" ";
        if(gender == 'M' || gender == 'm')
        {
            fstr = "Mr. " + name + ", You are a ";
            if(age >= 0 && age <= 12)
                fstr += "Boy.";
            else if(age >= 13 && age <= 20)
                fstr += "Young Guy.";
            else if(age >= 21 && age <= 30)
                fstr += "Young Male.";
            else if(age >= 31 && age <= 40)
                fstr += "Mature Male.";
            else if(age >= 41 && age <= 60)
                fstr += "Uncle.";
            else if(age > 60)
                fstr += "GrandFather.";

            System.out.println(fstr);
        }
        else if(gender == 'F' || gender == 'f')
        {
            fstr = "Miss. " + name + ", You are a ";
            if(age >= 0 && age <= 12)
                fstr += "Girl.";
            else if(age >= 13 && age <= 20)
                fstr += "Young Girl.";
            else if(age >= 21 && age <= 30)
                fstr += "Young Girl.";
            else if(age >= 31 && age <= 40)
                fstr += "Mature Girl.";
            else if(age >= 41 && age <= 60)
                fstr += "Aunty.";
            else if(age > 60)
                fstr += "GrandMother.";

            System.out.println(fstr);
        }
        else
        {
            System.out.println("Wrong Gender entered");
        }

    }
}
