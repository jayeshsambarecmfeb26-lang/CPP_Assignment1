package JAVA_DSA_ASSIGNMENT_4;
//Q10. Search in BST 
//Write a program to search for a value in a BST. Return true if found, false otherwise. 
//Test Case: 
//BST from Q4 → Search for 40 → Output: Found 
//BST from Q4 → Search for 90 → Output: Not Found
public class BST_SEARCH {
	
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

	        if (key < root.data) 
	        {
	            root.left = insert(root.left, key);
	        } else if (key > root.data) {
	            root.right = insert(root.right, key);
	        }

	        return root;
	    }

	   
	    static boolean search(Node root, int key) 
	    {
	        if (root == null) 
	        {
	            return false; 
	        }

	        if (root.data == key) 
	        {
	            return true; 
	        } 
	        else if (key < root.data) 
	        {
	            return search(root.left, key); 
	        }
	        else
	        {
	            return search(root.right, key);
	        }
	    }

	    public static void main(String[] args)
	    {

	        int values[] = {50, 30, 20, 40, 70, 60, 80};

	        Node root = null;

	        for (int val : values) 
	        {
	            root = insert(root, val);
	        }

	        int key1 = 40;
	        int key2 = 90;

	        System.out.println("Search for " + key1 + ": " + 
	            (search(root, key1) ? "Found" : "Not Found"));

	        System.out.println("Search for " + key2 + ": " + 
	            (search(root, key2) ? "Found" : "Not Found"));
	    }
	
}
