package JAVA_DSA_ASSIGNMENT_4;
//Q7. Create a Binary Tree & Print Preorder Traversal 
//Write a program to create a binary tree and print its preorder traversal. 
//Test Case: 
//Tree: 
//      1 
//     / \ 
//    2   3 
//   / \ 
//  4   5 
//Expected Output (Preorder): 1 2 4 5 3
public class PreorderTraversal 
{
	
	    static class Node {
	        int data;
	        Node left, right;

	        Node(int value) {
	            data = value;
	            left = right = null;
	        }
	    }

	    // Preorder Traversal (Root -> Left -> Right)
	    static void preorder(Node root) {
	        if (root == null) {
	            return;
	        }

	        System.out.print(root.data + " "); // Root
	        preorder(root.left);               // Left
	        preorder(root.right);              // Right
	    }

	    public static void main(String[] args) {

	        Node root = new Node(1);

	        root.left = new Node(2);
	        root.right = new Node(3);

	        root.left.left = new Node(4);
	        root.left.right = new Node(5);

	       
	        System.out.print("Preorder Traversal: ");
	        preorder(root);
	    }
	

}
