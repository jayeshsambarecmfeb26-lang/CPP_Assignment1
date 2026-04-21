package JAVA_DSA_ASSIGNMENT_4;

//Q12. Height of Binary Tree 
//Write a recursive function to find the height of a binary tree. 
//Test Case: 
//Tree: 
//1 
/// \ 
//2   3 
/// \ 
//4   5 
//Height = 3

public class Tree_Height {

  
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

  
    static int height(Node root) {
        if (root == null) {
            return 0; 
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {

      
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

       
        System.out.println("Height of tree: " + height(root));
    }
}

