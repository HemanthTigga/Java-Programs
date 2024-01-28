import java.util.*;
import java.io.*;
class addequation
{
    Node head;
    static class Node{
        // int c;
        // int p;
        String data;
        Node next;
        Node(String data)
        {
            // this.c = c;
            // this.p = p;
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(String d)
    {
        Node newNode=new Node(d);
        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String str)
    {
        Node newNode=new Node(str);
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next  != null)
        {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void printlist()
    {
        if(head == null)
        {
            return;
        }
        Node currNode = head;
        while(currNode != null)
        {
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        addequation obj = new addequation();
        String str = "5+3x^2+5x^3+7x^6";
       String str1="";
       String s[] = str.split("[+-]+");
       for(String s1:s)
        {
            // obj.addLast(s1);
            if(!s1.contains("x"))
            {
                str1 += s1+"x^0+";
            }
            else
            {
                str1 +=s1+"+";
            }
        }
       System.out.println(str1);
       
       
        String fstr[] = str1.split("[x^+-]+");
        System.out.println("parts = "+s.length);
        for(String s1:fstr)
        {
            obj.addLast(s1);
        }
        obj.printlist();
    }
}
