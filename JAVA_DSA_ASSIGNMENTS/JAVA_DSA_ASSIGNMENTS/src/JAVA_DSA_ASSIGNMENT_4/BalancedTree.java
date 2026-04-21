package JAVA_DSA_ASSIGNMENT_4;
//Q13. Check if a Binary Tree is Balanced 
//A balanced tree means the height difference of left and right subtrees for every node is 
//≤ 1. 
//Test Cases: 
//• Input: Balanced tree → Output: True 
//• Input: Skewed tree (like linked list: 1→2→3→4) → Output: False

public class BalancedTree 
{

	    static class Node {
	        int data;
	        Node left, right;

	        Node(int value) {
	            data = value;
	            left = right = null;
	        }
	    }

	 
	    static int checkHeight(Node root) {
	        if (root == null) return 0;

	        int left = checkHeight(root.left);
	        if (left == -1) return -1;

	        int right = checkHeight(root.right);
	        if (right == -1) return -1;

	        if (Math.abs(left - right) > 1) {
	            return -1; 
	        }

	        return 1 + Math.max(left, right);
	    }

	    static boolean isBalanced(Node root) {
	        return checkHeight(root) != -1;
	    }

	    public static void main(String[] args) {

	       
	        Node root1 = new Node(1);
	        root1.left = new Node(2);
	        root1.right = new Node(3);
	        root1.left.left = new Node(4);
	        root1.left.right = new Node(5);

	        System.out.println("Balanced Tree: " + isBalanced(root1));

	       
	        Node root2 = new Node(1);
	        root2.right = new Node(2);
	        root2.right.right = new Node(3);
	        root2.right.right.right = new Node(4);

	        System.out.println("Skewed Tree: " + isBalanced(root2));
	    }
	
}
