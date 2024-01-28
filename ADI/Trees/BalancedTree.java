import java.io.*;
import java.util.*;
class BST {
    private class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    Scanner sc = new Scanner(System.in);
    Node root = null;

    //insertion
    void insert() {
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int data = sc.nextInt();
            root = insert(root,data);
        }
    }
    Node insert(Node currNode , int data){
        if(currNode == null)
        {
            return new Node(data);
        }
        if(currNode.data > data){
            currNode.left = insert(currNode.left, data);
        }
        else if(currNode.data < data)
        {
            currNode.right = insert(currNode.right, data);
        }
        return currNode;
    }

    //inorder traversal

    void inorder(){
        inorderTraversal(root);
        System.out.println();
    }
    void inorderTraversal(Node currNode){
        if(currNode == null)
        {
            return;
        }
        inorderTraversal(currNode.left);
        System.out.print(currNode.data+" ");
        inorderTraversal(currNode.right);
    }

    //searching 

    //deletion
    

}
public class BalancedTree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BST obj = new BST();
        obj.insert();
        obj.inorder();
        // obj.search();
    }
}