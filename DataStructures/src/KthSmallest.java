import java.util.ArrayList;

public class KthSmallest {
	public static void main(String[] args) {
		int[] arr1 = {1, -2, 4, -5, -23, 56, 87};
		
		int[] arr2 = {2, 3, 4, -12};
		
		int x = doUnion(arr1, 7, arr2, 4);
		System.out.println(x);
	}

	static void rearrange(int arr[], int n)
    {
        int j = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
	
	
	public static int doUnion(int a[], int n, int b[], int m) 
    {
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		for(int ele: a) {arr3.add(ele);}
		for(int ele: b) {arr3.add(ele);}
		
		for(int i=0; i<arr3.size()-1; i++) {
			if(arr3.get(i-1) == arr3.get(i)) {
				arr3.remove(i);
			}
		}
		
		return arr3.size();
    }
	
	
	
}
