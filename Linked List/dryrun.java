import java.util.*;

class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
        next=null;
    }
}
public class dryrun {
    Node head=null;
     void atbegin(int d){
         Node newNode=new Node(d);
        if(head==null){
            head=newNode;
            return;
        }
        else{
            newNode.next=head;
            head=newNode;
        }

    }

    void print(){
         Node temp=head;
         while (temp!=null){
             System.out.print(temp.data+"->");
             temp=temp.next;
         }
        System.out.println("null");

    }

    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<Integer>();
        dryrun list=new dryrun();

        list.atbegin(6);
        list.atbegin(7);
        list.print();
    }
}