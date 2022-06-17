package dsa;

public class DoublyLinkedList {

	private Node head;
	private Node tail;
	private int len;
	
	public static class Node {

		int data;
		Node next;
		Node prev;

		Node(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}

	public DoublyLinkedList() {
		len = 0;
		this.head = null;
		this.tail = null;
	}
	
	public boolean isEmpty() {
		return len==0;
	}
	public int length()
	{
		return len;
	}
	
	public void printList() {
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data  + "--> ");
			temp = temp.next;
		}
		
		System.out.println("null");
	}
	
	public void prepend(int data) {
		Node nn = new Node(data);
		if(isEmpty()) {
			tail = nn;
		}
		else {
			head.prev = nn;
		}
		nn.next = head;
		head = nn;
		len++;
	}
	public void append(int data) {
		Node nn = new Node(data);
		if(isEmpty()) {
			head =nn;
		}else {
			tail.next = nn;
			nn.prev = tail;
		}
		tail = nn;
		len++;
	}
	public String deleteFirst() {
		if(isEmpty()) {
			return "Error";
		}
		Node temp = head;
		if(head == tail) {
			tail = null;
		}else {
			head.next.prev = null;
		}
		head = head.next;
		temp.next = null;
		return "Done";
		
		
	}
	
	public String deleteLast() {
		if(isEmpty()) {
			return "Empty";
		}
		Node temp = tail;
		if(head==tail) {
			head = null;
		}else {
			tail.prev.next = null;
		}
		tail = tail.prev;
		tail.prev = null;
		return "Done";
	}
	
}
