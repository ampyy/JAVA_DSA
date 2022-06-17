package dsa;

public class PriorityQueue {

	private Integer[] heap;
	private int n;
	
	
	public PriorityQueue(int capacity) {
		heap = new Integer[capacity+1];
		n=0;
	}
	
	public boolean isEmpty() {
		if (n==0) {
			return true;
		}
		return false;
	}
	
	public int getSize() {
		return n;
	}
	
	public void insert(int data) {
		if(n == heap.length) {
			resize(2*heap.length);
		}
		n++;
		heap[n] = data;
		swim(n);
	}
	
	private void resize(int capacity) {
		Integer[] temp = new Integer[capacity];
		for(int i=0; i<heap.length; i++) {
			temp[i] = heap[i];
		}
		heap = temp;
	}
	private void swim(int k) {
		while(k>1 && heap[k/2]<heap[k]){
			int temp = heap[k];
			heap[k] = heap[k/2];
			heap[k/2] = temp;
			k = k/2;
		}
	}
	
	public void maxHeap() {
		for(int i=1; i<heap.length; i++) {
			System.out.println(heap[i] + "..>");
		}
	}
	
	
	public int deleteMax()
	{
		int max = heap[1];
		swap(1, n);
		n--;
		sink(1);
		heap[n+1] = null;
 		if(n>0 && (n==(heap.length-1)/4)) {
 			resize(heap.length/2);
 		}
 		
 		return max;
		
	}
	
	public void sink(int k) {
		while(2*k <= n) {
			int j = 2*k;
			if(j<n && heap[j] < heap[j+1]) {
				j++;
			}
			if(heap[k] >= heap[j]) {
				break;
			}
			swap(k, j);
			k=j;
		}
	}
	
	public void swap(int a, int b) {
		int temp = heap[a];
		heap[a] = heap[b];
		heap[b] = temp;
	}
	
	public void print() {
		for(Integer x : heap) {
			System.out.print(x + " ");
		}
	}
	
}
