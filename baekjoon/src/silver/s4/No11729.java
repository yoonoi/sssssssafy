package silver.s4;

import java.util.Scanner;

public class No11729 {
	
	static int cnt = 0;
	static String str = "";
	
	// 하노이탑
	public static void hanoi(int n, int start, int mid, int end) {
		
		cnt++;  // 함수 호출될 때마다 카운트++
		
		if(n == 1) {
			str += start + " " + end + "\n";
			return;
		}
		
		// 1. 1 ~ n-1 탑을 1에서 2으로 옮긴다.
		// 2. n 탑을 		  1에서 3으로 옮긴다.
		// 3. 1 ~ n-1 탑을 2에서 3으로 옮긴다.
		hanoi(n-1, start, end, mid);
		str += start + " " + end + "\n";
		hanoi(n-1, mid, start, end);
		
		
		
//		if(n == 1) {
//			System.out.println(start + " " + end);
//			return;
//		}
//		
//		// 1. 1 ~ n-1 탑을 1에서 2으로 옮긴다.
//		// 2. n 탑을 		  1에서 3으로 옮긴다.
//		// 3. 1 ~ n-1 탑을 2에서 3으로 옮긴다.
//		hanoi(n-1, start, end, mid);
//		System.out.println(start + " " + end);
//		hanoi(n-1, mid, start, end);
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		hanoi(n, 1, 2, 3);
		System.out.println(cnt);
		System.out.println(str);
	}
}
