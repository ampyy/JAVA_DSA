package dsa;

public class BInarySearchTree {

	private TreeNode root;

	private class TreeNode {

		private int data;
		private TreeNode left;
		private TreeNode right;

		TreeNode(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

	}

	public TreeNode getRoot() {
		return root;
	}
	
	public void inOrder() {
		inOrder(root);
	}
	
	public void insert(int value) {
		root = insert(root, value);
	}
	
	public TreeNode insert(TreeNode root, int value) {

		if (root == null) {
			root = new TreeNode(value);
			return root;
		}

		if (value < root.data) {
			root.left = insert(root.left, value);
		} else {
			root.right = insert(root.right, value);
		}
		return root;

	}
	
	public void inOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + "------->>>>");
		inOrder(root.right);
	}
	
	public TreeNode search(int key) {
		return search(root, key);
	}
	
	public TreeNode search(TreeNode root, int key) {
		if(root == null || root.data== key ) {
			return root;
		}
		if(root.data > key) {
			root = search(root.right, key);
		}else {
			root = search(root.left, key);
		}
		return root;
	}
	

}
