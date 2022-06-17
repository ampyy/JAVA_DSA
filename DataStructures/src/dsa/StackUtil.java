package dsa;

import java.util.EmptyStackException;

public class StackUtil {

	private Node top;
	private int len;

	private class Node {
		private int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public StackUtil() {
		this.top = null;
		this.len = 0;
	}

	public int getLength() {
		return this.len;
	}

	public boolean isEmpty() {
		return len == 0;
	}

	public void push(int data) {
		Node nn = new Node(data);
		nn.next = top;
		top = nn;
		len++;
	}

	public String pop() {
		if (isEmpty()) {
			return "Error";
		}
		top = top.next;
		len--;
		return "Done";
	}

	public void printStack() {
		Node temp = top;
		while (temp != null) {
			System.out.print(temp.data + "~>");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public int peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;
	}

}

//Stack implementation in Java

class Stack {
	private int arr[];
	private int top;
	private int capacity;

// Creating a stack
	Stack(int size) {
		arr = new int[size];
		capacity = size;
		top = -1;
	}

// Add elements into stack
	public void push(int x) {
		if (isFull()) {
			System.out.println("OverFlow\nProgram Terminated\n");
			System.exit(1);
		}

		System.out.println("Inserting " + x);
		arr[++top] = x;
	}

// Remove element from stack
	public int pop() {
		if (isEmpty()) {
			System.out.println("STACK EMPTY");
			System.exit(1);
		}
		return arr[top--];
	}

// Utility function to return the size of the stack
	public int size() {
		return top + 1;
	}

// Check if the stack is empty
	public Boolean isEmpty() {
		return top == -1;
	}

// Check if the stack is full
	public Boolean isFull() {
		return top == capacity - 1;
	}

	public void printStack() {
		for (int i = 0; i <= top; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		Stack stack = new Stack(5);

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);

		stack.pop();
		System.out.println("\nAfter popping out");

		stack.printStack();

	}
}
