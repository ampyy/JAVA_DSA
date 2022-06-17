package dsa;

import java.util.Stack;

public class mainclass {

	public static void main(String[] args) {
		SinglyLinked sll = new SinglyLinked();
		// DoublyLinkedList dll = new DoublyLinkedList();
		
//		sll.prepend(12);
//		sll.append(13);
//		sll.prepend(78);
//		sll.append(1789);
//		sll.printList();
//		sll.deleteFirst();
//		sll.printList();
//		sll.append(45);
//		sll.deleteLast();
//		sll.printList();
//		sll.insertAt(489, 2);
//		sll.printList();
//		sll.deleteAt(2);
//		sll.printList();
//		sll.reverse();
//		sll.printList();
//		sll.removeKey(13);
//		sll.printList();
		
		int arr[] = { 1, 2, 0, 4, 0, 0, 7, 0, 9, 0 };

		arr[0] = 12;
		arr[1] = 15;
		moveZeroes(arr);
		// resize(arr, 14);
		for (int x : arr) {
			// System.out.print(x + ",");
		}
		// System.out.println("\n");
		reverseArray(arr);
		for (int x : arr) {
			// System.out.print(x + ",");
		}
		// System.out.println();

		String str = "Madam";
		// System.out.println(isPallindrome(str));

		// StackUtil stk = new StackUtil();
		// stk.push(12);
		// stk.push(14);
		// stk.printStack();
		// stk.pop();
		// stk.printStack();

		// String S = "Heelloo!";
		// System.out.println(reverseString(S));
		// QueueUtil que = new QueueUtil();
		// que.enQueue(12);
		// que.enQueue(45);
		// que.printQueue();
		BinaryTree bn = new BinaryTree();
		bn.createBinaryTree();
//		bn.preOrder(bn.getroot());
//		System.out.println();
//		bn.preOrderIter();
//		System.out.println();
//		bn.inOrder(bn.getroot());
//		System.out.println();
//		bn.inOrder();
//		System.out.println();
//		bn.postOrder(bn.getroot());
//		System.out.println();
//		bn.levelOrder();
//		System.out.println(bn.maxValue(bn.getroot()));
		bn.postIter(bn.getroot());
		
		
		
	}

	public static void reverseArray(int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

	public static void moveZeroes(int arr[]) {
		int n = arr.length;
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if (arr[j] != 0) {
				j++;
			}
		}

	}

	public static void resize(int arr[], int capacity) {
		int[] temp = new int[capacity];
		for (int i = 0; i < arr.length - 1; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
	}

	public static boolean isPallindrome(String str) {
		char[] charArray = str.toCharArray();
		int start = 0;
		int end = str.length() - 1;

		while (start < end) {
			if (charArray[start] != charArray[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;

	}

	public static String reverseString(String str) {
		Stack<Character> stk = new Stack<>();
		char[] charArray = str.toCharArray();

		for (char c : charArray) {
			stk.push(c);
		}

		for (int i = 0; i < str.length(); i++) {
			charArray[i] = stk.pop();
		}
		return new String(charArray);
	}

}
