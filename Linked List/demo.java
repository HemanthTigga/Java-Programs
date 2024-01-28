public class demo {
    Node head;
    static class Node
    {
        String data;
        Node next;
        Node(String data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(String str)
    {
        Node newNode=new Node(str);
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
    public void deleteFirst()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    public void deleteLast()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        if(head .next == null)
        {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
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
        demo obj = new demo();
        // obj.addFirst("Hi,");
        // obj.addFirst("My");
        // obj.addFirst("name");
        // obj.addFirst("is");
        // obj.addFirst("Hemanth");
        obj.addLast("Hi,");
        obj.addLast("My");
        obj.addLast("name");
        obj.addLast("is");
        obj.addLast("Hemanth");
        obj.deleteFirst();
        obj.deleteLast();
        obj.printlist();
    }
}