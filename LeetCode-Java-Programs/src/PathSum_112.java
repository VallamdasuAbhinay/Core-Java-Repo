/*
 * Given the root of a binary tree and an integer targetSum, 
 * return true if the tree has a root-to-leaf path such that 
 * adding up all the values along the path equals targetSum.
 * 
 * A leaf is a node with no children.

	Example 1:
					5
				  /	  \
				4		8
			  /       /   \
			11		13		4
		  /   \              \
		7		2			  1

	Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
	Output: true
	Explanation: The root-to-leaf path with the target sum is shown.
 */
public class PathSum_112 {

	/**
	 * Definition for a binary tree node.
	 */
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public static void main(String[] args) {
		//Constructing the TreeNode entries
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.right.right = new TreeNode(1);

		int targetSum = 22;

		Boolean result = hasPathSum(root, targetSum);
		System.out.println("Is Root Exists?...." + result);
	}

	public static boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null) {
			return false;
		}
		// Leaf Node Condition and checking if it is equal to targetSum
		if (root.left == null && root.right == null) {
			return root.val == targetSum;
		}

		return (hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val));

	}

}

//Time Complexity = O(n), where n -> number of nodes in given tree
//Space Complexity = O(h), where h -> height of tree (due to recursion stack)
