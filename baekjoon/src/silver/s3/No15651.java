package silver.s3;

import java.util.Scanner;

public class No15651 {
	// 시간초과
	
	static int n, m;
	
	static int[] arr;
	static boolean[] isUsed;
	
	// k개를 고르고 arr[k]를 찾을 차례
	public static void recursion(int k) {
		
		// 종료조건
		if(k == m) {
			
			for(int i=0; i<m; i++) 
				System.out.print(arr[i] + " ");
			System.out.println();
			
			return;
		}
		
		
		for(int i=0; i<n; i++) {
			
			arr[k] = i + 1;
			isUsed[i] = true;
			
			recursion(k+1);
			
			isUsed[i] = false;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();	m = sc.nextInt();
		
		arr = new int[m];
		isUsed = new boolean[n];
		
		recursion(0);
		
	}

}
