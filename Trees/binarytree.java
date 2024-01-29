import java.io.*;
import java.util.*;

public class binarytree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree1 {
        static int index = -1;

        public static Node buildTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            // System.out.print(-1+",");
            return;
        }

        System.out.print(root.data + ",");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + ",");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + ",");
    }

    public static void levelorder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes + rightNodes + 1;
    }

    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int diameter01(Node root) {
        if (root == null) {
            return 0;
        }
        int Diam1 = diameter01(root.left);
        int Diam2 = diameter01(root.right);
        int Diam3 = height(root.left) + height(root.right) + 1;

        return Math.max(Diam1, Math.max(Diam2, Diam3));
    }

    static class Treeinfo{
        int ht;
        int diam;

        Treeinfo(int ht,int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }
    public static Treeinfo diameter02(Node root){
        if(root == null){
            return new Treeinfo(0,0);
        }
        Treeinfo left = diameter02(root.left);
        Treeinfo right = diameter02(root.right);
        int myHeight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int myDiam = Math.max(diam1,Math.max(diam2,diam3));

        Treeinfo myinfo = new Treeinfo(myHeight, myDiam);

        return myinfo;
    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree1 tree = new BinaryTree1();
        Node root = tree.buildTree(nodes);
        System.out.print("Preorder Traversel - ");
        preorder(root);
        System.out.print("\nInorder Traversel - ");
        inorder(root);
        System.out.print("\nPostorder Traversel - ");
        postorder(root);
        System.out.println("\nLevel order Traversel - ");
        levelorder(root);
        System.out.println("\nCount of Nodes = " + countOfNodes(root));
        System.out.println("\nSum of Nodes = " + sumOfNodes(root));
        System.out.println("\nHeight = " + height(root));
        System.out.println("\nDiameter by approach 1 = " + diameter01(root));
        System.out.println("\nDiameter by approach 2 = " + diameter02(root).diam);
    }
}