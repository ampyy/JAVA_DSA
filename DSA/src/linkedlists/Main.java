package linkedlists;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList sll = new SinglyLinkedList();
		
		sll.createLoop();
		System.out.println(sll.detectLoop()); 
		// System.out.println(sll.getNode());
		
		sll.remove();
		System.out.println(sll.detectLoop()); 
		
	}
	

}
