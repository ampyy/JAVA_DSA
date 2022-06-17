package dsa;

public class Main {

	public static void main(String[] args) {
	
//		BinaryTree br = new BinaryTree();
//		br.createBinaryTree();
//		br.preOrder(br.getroot());
//		System.out.println();
//		br.inOrder(br.getroot());
//
//		System.out.println();
//		
//		br.postOrder(br.getroot());
//		
//		System.out.println();
//		BInarySearchTree bst = new BInarySearchTree();
//		bst.insert(0);
//		bst.insert(3);
//		bst.insert(7);
//		bst.insert(2);
//		PriorityQueue PQ = new PriorityQueue(5);
//		PQ.insert(12);
//		PQ.insert(13);
//		PQ.maxHeap();
//	
//		bst.inOrder(bst.getRoot());
//		System.out.println(bst.search(7));
		
		PriorityQueue pq = new PriorityQueue(6);
		pq.insert(6);
		pq.insert(8);
		pq.insert(10);
		pq.insert(12);
		pq.insert(15);
		pq.insert(1);
		pq.print();
		pq.deleteMax();
		System.out.println();
		pq.print();
		
	}
	
}
