package linkedlists;


public class SinglyLinkedList {
		private Node head;
		private int len;
		
		private static class Node{
			private int data;
			private Node next;
			
			Node(int data){
				this.data = data;
				this.next = null;
				}
		}
		
		SinglyLinkedList(){
			this.head = null;
			this.len = 0;
		}
		
		public void prepend(int data)
		{
			Node nn = new Node(data);
			if(head == null) {
				head = nn;
			}else {
				nn.next = head;
				head = nn;
			}
			len++;
		}
		
		public void printList() {
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.print("null");
			System.out.println("");
			
		}
		public void append(int data) {
			Node nn = new Node(data);
			
			if(head == null) {
				head = nn;
			}else {
				Node temp = head;
				while(temp.next!=null) {
					temp = temp.next;
				}
				
				temp.next = nn;
				
			}
			len++;
		}
		public void deleteFirst(){
			if(head == null) {
				System.out.println("Empty List");
			}else {
				head = head.next;
				len--;
			}
		}
		
		public void deleteLast() {
			if(head == null) {
				System.out.println("Empty");
			}else {
				Node cur = head;
				Node temp = null;
				while(cur.next!=null) {
					temp = cur;
					temp = temp.next;
				}
				
				temp.next = null;
				len--;
				
			}
		}
		
		public void insertAt(int data, int pos) {
			Node nn = new Node(data);
			if(head == null) {
				head = nn;
			}else if(pos == 1) {
				prepend(data);
			}else if(pos == len+1) {
				append(data);
			}else {
				int count = 1;
				Node prev = head;
				while(count<pos) {
					prev = prev.next;
					count++;
				}
				
				Node cur = prev.next;
				prev.next = nn;
				nn.next = cur;
				len++;
				
			}
			
		}
		
		public void deleteAt(int pos) {
			if(head == null) {
				System.out.println("Empty");
			}else if(pos == 1) {
				deleteFirst();
			}else if(pos == len+1) {
				deleteLast();
			}else {
				int count = 1;
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
		
		public boolean detectLoop() {
			Node fast = head;
			Node slow = head;
	
			while(fast != null && fast.next != null)
			{
				fast = fast.next.next;
				slow = slow.next;
				if(fast == slow) {
					return true;
				}
			}
			return false;	
		}
		
		public Node getNode() {
			Node fast = head;
			Node slow = head;
	
			while(fast != null && fast.next != null)
			{
				fast = fast.next.next;
				slow = slow.next;
				
				if(fast == slow) {
					return getStartNode(slow);
				}
			}
			
			return null;
			
		}
			
		public Node getStartNode(Node slow) {
			Node temp = head;
			while(slow != temp) {
				temp = temp.next;
				slow = slow.next;
			}
			return temp;
		}
		
		public Node remove() {
			Node fast = head;
			Node slow = head;
	
			while(fast != null && fast.next != null)
			{
				fast = fast.next.next;
				slow = slow.next;
				
				if(fast == slow) {
					removeLoop(slow);
				}
			}
			
			return null;
			
		}
		
		public void removeLoop(Node slow) {
			Node temp = head;
			while(slow.next != temp.next) {
				temp = temp.next;
				slow = slow.next;
			}
			slow.next = null;
		}
		
}








