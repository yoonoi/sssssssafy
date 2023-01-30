package bronze.b2;

import java.util.Scanner;

public class No2798 {
	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int sum;
		int similar = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<n; k++) {
					// sum 초기화
					sum = 0;
					
					if(i != j && j != k && k != i) {
						sum += arr[i] + arr[j] + arr[k];
					}
					
					if(sum > m) continue;
					
					if(similar <= sum)
						similar = sum;
				}
			}
		}
		
		System.out.println(similar);
		
		long endTime = System.nanoTime();
		
		System.out.printf("%,d\n", endTime - startTime);
		
	}
}
