package silver.s3.no1463;

import java.util.Scanner;

public class No1463_재귀로풀어보기 {
	// 1로 만들기
	
	static int n;
	static int cnt = 0;
	
	static int dp(int n) {
		
		if(n == 1) return 0;
		
		if(n % 3 == 0) {
			cnt++;
			dp(n/3);
		}
		else if(n % 2 == 0) {
			cnt++;
			dp(n/2);
		}
		else {
			cnt++;
			dp(n-1);
		}
		
		return cnt;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		System.out.println(dp(n));
	}
}
