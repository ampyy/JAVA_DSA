import java.util.ArrayList;

public class Apk1 {
	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
		rvereseArray(arr1);
		for (int x : arr1) {
			System.out.println(x);

		}
		System.out.println("Hello World");

	}

	static void rvereseArray(int arr[]) {
		int start=0;
		int end= arr.length-1;
		int temp;

		while (start <= end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
		
	
	
	
}

