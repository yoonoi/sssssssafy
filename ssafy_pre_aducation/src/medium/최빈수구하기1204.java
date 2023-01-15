package medium;

import java.util.Scanner;

public class 최빈수구하기1204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int a=0; a<tc; a++) {
			int no = sc.nextInt();
			
			int[] arr = new int[101];
			for(int i=0; i<1000; i++) {
				int idx = sc.nextInt();
				arr[idx] += 1;
			}
			
			int max = 0;
			int idx = 0;
			for(int i=0; i<arr.length; i++) {
				if(arr[i] >= max) {
					max = arr[i];
					idx = i;
				}
			}
			System.out.printf("#%d %d\n", no, idx);
		}
	}
}
