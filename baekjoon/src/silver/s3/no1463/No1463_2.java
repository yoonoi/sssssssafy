package silver.s3.no1463;

import java.util.Arrays;
import java.util.Scanner;

public class No1463_2 {
	// 1로 만들기
	
	static int n;
	static int[] dp;
	
	static int dp(int n) {
		
		if(n >= 1) 
			dp[0] = 0;
		
		if(n >= 2)
			dp[1] = 1;
		
		if(n >= 3)
			dp[2] = 1;
		
		
		for(int i=3; i<=n; i++) {
			
			dp[i] = Math.min(dp[i], dp[i-1] + 1);
			
			if((i+1) % 3 == 0) {
				dp[i] = Math.min(dp[i], dp[i/3] + 1);
			}
			
			if((i+1) % 2 == 0) {
				dp[i] = Math.min(dp[i], dp[i/2] + 1);
			}
		}
		
		System.out.println(Arrays.toString(dp));
		return dp[n-1];
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		dp = new int[n];
		
		for(int i=0; i<dp.length; i++) {
			dp[i] = 100001;
		}
		
		System.out.println(dp(n));
	}
}
