package JAVA_DSA_ASSIGNMENT_4;
//Q10. Insert into a BST 
//Write a program to insert nodes into a BST and print inorder traversal. 
//Test Case: 
//Insert: 50, 30, 20, 40, 70, 60, 80 
//Tree (BST) Inorder: 20 30 40 50 60 70 80
public class BST_INSERTATION 
{
	    static class Node {
	        int data;
	        Node left, right;

	        Node(int value) {
	            data = value;
	            left = right = null;
	        }
	    }
	    static Node insert(Node root, int key) {
	        if (root == null) {
	            return new Node(key);
	        }

	        if (key < root.data) {
	            root.left = insert(root.left, key);
	        } else if (key > root.data) {
	            root.right = insert(root.right, key);
	        }

	        return root;
	    }

	    static void inorder(Node root) {
	        if (root == null) return;

	        inorder(root.left);
	        System.out.print(root.data + " ");
	        inorder(root.right);
	    }

	    public static void main(String[] args) {

	        int values[] = {50, 30, 20, 40, 70, 60, 80};

	        Node root = null;

	        for (int val : values) {
	            root = insert(root, val);
	        }

	        System.out.print("Inorder Traversal: ");
	        inorder(root);
	    }
	

}
