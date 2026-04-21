package JAVA_DSA_ASSIGNMENT_4;
//Q14. Convert Sorted Array to Balanced BST 
//Write a program to convert a sorted array into a balanced BST. 
//Test Case: 
//Input: [1, 2, 3, 4, 5, 6, 7] 
//Output (Preorder example): 4 2 1 3 6 5 7 

public class SortedArrayToBst 
{
	   	    static class Node {
	        int data;
	        Node left, right;

	        Node(int value) {
	            data = value;
	            left = right = null;
	        }
	    }

	   
	    static Node sortedArrayToBST(int arr[], int start, int end) {
	        if (start > end) return null;

	        int mid = (start + end) / 2;

	        Node root = new Node(arr[mid]);

	        root.left = sortedArrayToBST(arr, start, mid - 1);
	        root.right = sortedArrayToBST(arr, mid + 1, end);

	        return root;
	    }

	    // Preorder Traversal (Root -> Left -> Right)
	    static void preorder(Node root) {
	        if (root == null) return;

	        System.out.print(root.data + " ");
	        preorder(root.left);
	        preorder(root.right);
	    }

	    public static void main(String[] args) {

	        int arr[] = {1, 2, 3, 4, 5, 6, 7};

	        Node root = sortedArrayToBST(arr, 0, arr.length - 1);

	        System.out.print("Preorder Traversal: ");
	        preorder(root);
	    }
	
}
