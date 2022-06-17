package dsa;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2, -3, 4, 6, -1, -6, 4, 19, 2, 0};
		int low = 0;
		int high = arr.length-1;
		sort(arr, low, high);
		
		for(int x  : arr) {
			System.out.println(x);
		}
		

	}
	
	
	static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low;
		int j = low;
		
		while(i<=high) {
			if(arr[i]<=pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
			i++;
		}
		return j-1;
	}
	
	static void sort(int[] arr, int low, int high) {
		if(low<high) {
			int p = partition(arr, low, high);
			sort(arr, low, p-1);
			sort(arr, p+1, high);
		}
		
	}

}
