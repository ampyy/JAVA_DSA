package dsa;

public class CircularSinglyLinkedList {

	private Node last;
	private int len;
	
	
	private class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
		
		
	}
	
	public CircularSinglyLinkedList() {
		this.len = 0;
		this.last = null;
	}
	
	public boolean isEmpty() {
		return len ==0;
	}
	public int getLength() {
		return len;
	}
	
	
	
}
