package silver.s4.no1920;

import java.util.Scanner;

public class No1920 {
	//시간초과
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		
		for(int i=0; i<m; i++) {
			int result = 0;
			int num = sc.nextInt();
			for(int j=0; j<arr.length; j++) {
				if(num == arr[j]) {
					result = 1;
					break;
				}
			}
			System.out.println(result);
		}
	}
}
