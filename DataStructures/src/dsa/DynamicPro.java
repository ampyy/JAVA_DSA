package dsa;

public class DynamicPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = fib(100);
		System.out.println(x);
		
		int[] memo = new int[10];
		int y = fib(memo, 9);
		System.out.println(y);
		

	}

	
	// bottom up approch!
	
	public static int fib(int n) {
		int[] table = new int[n+1];
		table[0] = 0;
		table[1] = 1;
		
		for(int i=2; i<=n; i++) {
			table[i] = table[i-1] + table[i-2];
		}
		
		return table[n];
	}
	
	// top down approach
	
	public static int fib(int[] memo, int n)
	{
		if(memo[n] == 0) {
			if(n<2) {
				memo[n] = n;
			}else {
				int left = fib(memo, n-1);
				int right = fib(memo, n-2);
				return left + right;
			}
		}
		
		return memo[n];
	}
	
	
}
