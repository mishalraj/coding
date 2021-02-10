package trees;

import java.util.Stack;

// time complexity - O(N)  
// space complexity -  O(N)  
class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int val)
	{
		this.data= val;
		left=right=null;
	}
}

public class ZigZag {
//this will be a level order traversal 
	public static void printZig(TreeNode root) {
		if (root == null)
			return;

		Stack<TreeNode> currentLevel = new Stack<>();
		Stack<TreeNode> nextLevel = new Stack<>();

		currentLevel.push(root);
		boolean leftToRight = true;

		while (!currentLevel.isEmpty()) {
			TreeNode temp = currentLevel.pop();
			System.out.println(temp.data);

			if (leftToRight) {
				if (temp.left != null) {
					nextLevel.push(temp.left);

				}

				if (temp.right != null) {
					nextLevel.push(temp.right);

				}
			}

			else {
				if (temp.right != null) {
					nextLevel.push(temp.right);

				}

				if (temp.left != null) {
					nextLevel.push(temp.left);

				}
			}

			if (currentLevel.isEmpty()) {
				leftToRight = !leftToRight;
				Stack<TreeNode> tStack = currentLevel;
				currentLevel = nextLevel;

				// here setting nextLevel to an empty stack because we need the nextLevel as an
				// empty stack to again fill it with nodes
				// we can also write nextLevel = new Stack<>();
				nextLevel = tStack;
			}

		}
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);

		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(7);
		root.left.right = new TreeNode(6);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(4);

		printZig(root);
	}

}
