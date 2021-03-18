package gfg_Amazon;

public class BurningTree {
	
	TreeNode root;
	static class Data { 
		int leftDepth, rightDepth, time; 
		boolean contains; 

		Data() 
		{ 
			contains = false; 
			leftDepth = rightDepth = 0; 
			time = -1; 
		} 
	} 
	
	public static int res; 

	public static void getResult(TreeNode node, Data data, int target) 
	{ 

		if (node == null) { 
			return; 
		} 

		// If current node is leaf 
		if (node.left == null && node.right == null) { 

			// If current node is the first burnt node 
			if (node.data == target) { 
				data.contains = true; 
				data.time = 0; 
			} 
			return; 
		} 

		// Information about left child 
		Data leftData = new Data(); 
		getResult(node.left, leftData, target); 

		// Information about right child 
		Data rightData = new Data(); 
		getResult(node.right, rightData, target); 

		// If left subtree contains the fired node then 
		// time required to reach fire to current node 
		// will be (1 + time required for left child) 
		data.time = (leftData.contains) ? (leftData.time + 1) : -1; 

		// If right subtree contains the fired node then 
		// time required to reach fire to current node 
		// will be (1 + time required for right child) 
		if (data.time == -1) 
			data.time = (rightData.contains) ? (rightData.time + 1) : -1; 

		// Storing(true or false) if the tree rooted at 
		// current node contains the fired node 
		data.contains = (leftData.contains || rightData.contains); 

		// Calculate the maximum depth of left subtree 
		data.leftDepth = (node.left == null) ? 0 : (1 + Math.max(leftData.leftDepth, leftData.rightDepth)); 

		// Calculate the maximum depth of right subtree 
		data.rightDepth = (node.right == null) ? 0 : (1 + Math.max(rightData.leftDepth, rightData.rightDepth)); 

		// Calculating answer 
		if (data.contains) { 

			// If left subtree exists and 
			// it contains the fired node 
			if (leftData.contains) { 

				// calculate result 
				res = Math.max(res, data.time + data.rightDepth); 
			} 

			// If right subtree exists and it 
			// contains the fired node 
			if (rightData.contains) { 

				// calculate result 
				res = Math.max(res, data.time + data.leftDepth); 
			} 
		} 
	} 

	public static void main(String[] args) {

		BurningTree tree= new BurningTree();
		
		 tree.root = new TreeNode(1); 
		 tree.root.left = new TreeNode(2); 
		 tree.root.right = new TreeNode(3); 
		 tree.root.left.left = new TreeNode(4); 
		 tree.root.left.right = new TreeNode(5); 
		 tree.root.right.left = new TreeNode(6); 
		 tree.root.left.left.left = new TreeNode(8); 
		 tree.root.left.right.left = new TreeNode(9); 
		 tree.root.left.right.right = new TreeNode(10); 
		 tree.root.left.right.left.left = new TreeNode(11); 

		int target = 11; 
		res = 0; 
		getResult(tree.root, new Data(), target); 
		System.out.println(res); 
	}

}







