package dsa;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

	private treeNode root;

	private class treeNode {
		private int data;
		private treeNode left;
		private treeNode right;

		public treeNode(int data) {
			this.data = data;
		}
	}

	public BinaryTree() {
		this.root = null;
	}

	public treeNode getroot() {
		return root;
	}
	
	public void createBinaryTree() {
		treeNode n1 = new treeNode(0);
		treeNode n2 = new treeNode(1);
		treeNode n3 = new treeNode(2);
		treeNode n4 = new treeNode(3);
		treeNode n5 = new treeNode(4);
		treeNode n6 = new treeNode(5);

		root = n1;
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.right = n6;

	}

	public void preOrder(treeNode root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + ">>");
		preOrder(root.left);
		preOrder(root.right);
	}

	public void preOrderIter() {
		if(root == null) {
			return;
		}
		Stack <treeNode> stk = new Stack<treeNode>();
		stk.push(root);
		while(!stk.isEmpty()) {
			treeNode temp = stk.pop();
			System.out.print(temp.data + ">>");
			if(temp.right != null) {
				stk.push(temp.right);
			}
			if(temp.left !=null) {
				stk.push(temp.left);
			}
		}
	}
	
	public void inOrder(treeNode root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + ">>");
		inOrder(root.right);
	}
	
	public void inOrder() {
		if(root == null) {
			return;
		}
		
		Stack<treeNode> stk = new Stack<treeNode>();
		treeNode temp = root;
		
		while(!stk.isEmpty() || temp!=null) {
			if(temp!=null) {
				stk.push(temp);
				temp = temp.left; 
			}else {
				temp = stk.pop();
				System.out.print(temp.data + ">>");
				temp = temp.right;
			}
		}
	}
	
	public void postOrder(treeNode root) {
		if(root == null) {
			return;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + ">>");
		
	}
	
	public void postIter(treeNode root) {
		Stack<treeNode> stk = new Stack<>();
		treeNode cur = root;
		
		while(cur != null || !stk.isEmpty()) {
			if(cur != null) {
				stk.push(cur);
				cur = cur.left;
			}
			else {
				treeNode temp = stk.peek().right;
				if(temp == null) {
					temp = stk.pop();
					System.out.println(temp.data);
					while(!stk.isEmpty() && temp == stk.peek().right) {
						temp = stk.pop();
						System.out.println(temp.data);
					}
				}else {
					cur = temp;
					}
				}
			}
	}
	
	
	public void levelOrder() {
		if(root == null) {
			return;
		}
		
		Queue<treeNode> que = new LinkedList<>();
		que.offer(root);
		while(!que.isEmpty()) {
			treeNode temp = que.poll();
			System.out.println(temp.data + "");
			
			if(temp.left != null) {
				que.offer(temp.left);
			}
			if(temp.right!=null) {
				que.offer(temp.right);
			}
		}
		
	}
	
	public int maxValue(treeNode root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int result = root.data;
		int left = maxValue(root.left);
		int right = maxValue(root.right);
		if(left>result) {
			result = left;
		}
		if(right>result) {
			result = right;
		}
		return result;
	}
	
}
