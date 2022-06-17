class Node {
	public int data;
	Node next;

	Node(int d) {
		this.data = d;
	}

}

public class LL {

	private Node head;
	private int len;

	LL() {
		this.head = null;
		this.len = 0;
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	public void prepend(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
		len++;
	}

	public void append(int data) {
		Node current = head;
		while (current.next != null) {
			current = current.next; // we'll loop until current.next is null
		}
		Node newNode = new Node(data);
		current.next = newNode;
		len++;
	}

	public void deleteFirst() {
		Node temp = head;
		head = head.next;
		len--;
	}

	public void deleteLast() {
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		len--;
	}

	public void insertnth(int data, int pos) {
		Node newNode = new Node(data);

		if (head == null) {
			this.head = newNode;
		} else if (head != null && pos == 1) {
			prepend(data);
		} else if (head != null && pos == len + 1) {
			append(data);
		} else if (pos > 1 && pos < len + 1) {
			Node prev = null;
			Node cur = head;

			int i = 0;
			while (i < pos) {
				prev = cur;
				cur = cur.next;
				i++;
			}
			prev.next = newNode;
			newNode.next = cur;
			len++;
		}

	}

	void deletenth(int pos) {
		if (isEmpty()) {
			System.out.println("Empty");
		} else if (pos == 1) {
			deleteFirst();
		} else if (pos == len) {
			deleteLast();
		} else if (pos > 1 && pos < len) {
			Node cur = head;
			Node prev = null;

			int i = 0;
			while (i < pos) {
				prev = cur;
				cur = cur.next;
				i++;
			}
			prev.next = cur.next;
			len--;

		}

	}

	public void printList() {
		Node cur = head;
		while (cur != null) {
			System.out.println(cur.data);
			cur = cur.next;
		}
		System.out.println(len);
	}

}
