package silver.s5.no2751;

import java.util.Arrays;
import java.util.Scanner;

public class No2751_1 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		// 수 정렬하기2
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}

}
