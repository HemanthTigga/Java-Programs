import java.io.*;
class Person
{
    String name;
    int age;

    void setName(String name)
    {
        this.name = name;
    }

    void setAge(int age)
    {
        this.age = age;
    }

    void display()
    {
        System.out.println("We are in Person class");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person
{
    String empId;
    float salary;

    void setEmpId(String empId)
    {
        this.empId = empId;
    }

    void setSalary(float salary)
    {
        this.salary = salary;
    }

    void display() {
        super.display();
        System.out.println("We are in Employee class");
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    void setDepartment(String department)
    {
        this.department = department;
    }

    void display() {
        super.display();
        System.out.println("We are in Manager class");
        System.out.println("Department: " + department);
    }
}

public class MultilevelInheritanceDemo
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        Manager manager = new Manager();
        String name,empid,dept;
        int age,sal;
        System.out.println("Type in your name");
        name=in.readLine();
        System.out.println("Type in your employee id");
        empid=in.readLine();
        System.out.println("Type in your dept");
        dept=in.readLine();
        System.out.println("What's your true age");
        age=Integer.parseInt(in.readLine());
        System.out.println("How much are you earning annually?");
        sal=Integer.parseInt(in.readLine());
        manager.setName(name);
        manager.setAge(age);
        manager.setEmpId(empid);
        manager.setSalary(sal);
        manager.setDepartment(dept);
        manager.display();
    }
}