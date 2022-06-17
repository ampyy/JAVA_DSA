package dsa;

public class Index {

	public static void main(String[] args) {
		 int[] nums1 = { 2, 1, 4, 6, 9, 5, 3 };

		// MergeSort mg = new MergeSort();
		
		// mg.sort(nums1, new int[nums1.length],0, (nums1.length-1));
		
		// System.out.println(searchBinary(nums, 47));

		System.out.println("Aman");
	 bubbleSort(nums1);

		// insertionSort(nums2);
		// MergeSorted ms = new MergeSorted();
		// selectionSort(nums);
		// int[] result = ms.merge(nums1, nums2);
		  for (int x : nums1) {
			System.out.println(x);
		}
		
	}

	public static int searchBinary(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key)
				return mid;
			if (key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	public static void bubbleSort(int[] arr) {
		boolean isSwapped;
		for (int i = 0; i < arr.length - 1; i++) {
			isSwapped = true;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSwapped = true;
				}
			} 
			if (isSwapped == false) {
				break;
			}
		}
	}

	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = temp;
		}
	}

	public static void selectionSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

}
