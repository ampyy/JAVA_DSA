package dsa;

public class SinglyLinked {

	private Node head;
	private int len;

	private static class Node {
		private int data;
		private Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	SinglyLinked() {
		this.head = null;
		this.len = 0;
	}

	public void prepend(int data) {
		Node nn = new Node(data);
		if (head == null) {
			head = nn;
		} else {
			nn.next = head;
			head = nn;
		}
		len++;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("");
	}

	public void append(int data) {
		Node nn = new Node(data);
		if (head == null) {
			head = nn;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = nn;
			len++;
		}

	}

	public String deleteFirst() {
		if (head == null) {
			return "Invalid Empty";
		} else {
			head = head.next;
			len--;
			return "Done!!";
		}

	}

	public String deleteLast() {
		if (head == null) {
			return "Empty";
		} else {
			Node cur = head;
			Node prev = null;
			while (cur.next != null) {
				prev = cur;
				cur = cur.next;

			}
			prev.next = null;
			len--;
			return "Success!";
		}
	}
	
	public void insertAt(int data, int pos) {
		Node nn = new Node(data);
		if(head == null) {
			return;
		}else if(pos == 1){
			prepend(data);
		}else if(pos == len+1) {
			append(data);
		}
		else {
			int count = 1;
			Node prev = head;
			while(count < pos-1) {
				prev = prev.next;
				count++;
			}
			Node cur = prev.next;
			prev.next = nn;
			nn.next = cur;
			len++;
			
			
		}
	}
	
	public void deleteAt(int pos)
	{
		if(pos ==1)
		{
			deleteFirst();
		}else if(pos == len+1) {
			deleteLast();
		}else {
			int count =1;
			Node prev = head;
			while(count < pos-1) {
				prev = prev.next;
				count++;
			}
			Node cur = prev.next;
			prev.next = cur.next;
			len--;
		}
}
	
	public boolean Search(int data) {
		Node cur = head;
		while(cur != null) {
			if(cur.data == data) {
				return true;
			}
			cur = cur.next;
		}
		return false;
	}
	
	public void reverse() {
		if(head == null) {
			return;
		}else {
			Node cur = head;
			Node prev = null;
			Node next = null;
			while(cur != null) {
				next = cur.next;
				cur.next = prev;
				prev = cur;
				cur = next;
			}
			head = prev;
		}
		
	}
	
	public Node findMidEle() {
		Node slowPtr = head;
		Node fastPtr = head;
		while(fastPtr!=null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr;
	}
	
	public void removeDup() {
		Node temp = head;
		while(temp!=null && temp.next != null) {
			if(temp.data == temp.next.data) {
				temp.next = temp.next.next;
			}else {
				temp = temp.next;
			}
		}
	}
	
	public void removeKey(int data) {
		Node cur = head;
		Node temp = null;
		while(cur!=null && cur.data !=data) {
		temp = cur;
		cur = cur.next;
		}
		
		if(cur == null)return;
		temp.next = cur.next;
	}
	public void createLoop() {
		Node n1 = new Node(5);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		
		head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n3;	
	}	
}