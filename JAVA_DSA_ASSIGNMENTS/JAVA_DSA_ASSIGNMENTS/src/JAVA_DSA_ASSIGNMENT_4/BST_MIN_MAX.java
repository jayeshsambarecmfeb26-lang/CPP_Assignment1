package JAVA_DSA_ASSIGNMENT_4;

//Q11. Minimum & Maximum Node in BST 
//Find the smallest and largest element in a BST. 
//Test Case: 
//BST from Q4 → Min: 20, Max: 80

public class BST_MIN_MAX 
{
	    static class Node
	    {
	        int data;
	        Node left, right;

	        Node(int value) {
	            data = value;
	            left = right = null;
	        }
	    }
	    static Node insert(Node root, int key)
	    {
	        if (root == null) return new Node(key);

	        if (key < root.data) {
	            root.left = insert(root.left, key);
	        } else if (key > root.data) {
	            root.right = insert(root.right, key);
	        }

	        return root;
	    }

	    static int findMin(Node root) {
	        if (root == null) {
	            throw new IllegalArgumentException("Tree is empty");
	        }

	        while (root.left != null) {
	            root = root.left;
	        }

	        return root.data;
	    }

	   
	    static int findMax(Node root) {
	        if (root == null) {
	            throw new IllegalArgumentException("Tree is empty");
	        }

	        while (root.right != null) {
	            root = root.right;
	        }

	        return root.data;
	    }

	    public static void main(String[] args) {

	        int values[] = {50, 30, 20, 40, 70, 60, 80};

	        Node root = null;

	       
	        for (int val : values) {
	            root = insert(root, val);
	        }

	        System.out.println("Minimum value: " + findMin(root));
	        System.out.println("Maximum value: " + findMax(root));
	    }
	
}
