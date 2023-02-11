package silver.s2.no1912;

import java.util.Arrays;
import java.util.Scanner;

public class No1912 {
	
	static int n;
	static int[] arr;
	static int[] dp; // 해당 자리에서 최대 합
	
	static void dp(int n) {
		
		for(int i=2; i<=n; i++) {
			// arr[i]가 0보다 크면,
			// dp[i-1]에 본인을 더한게 최대가 된다.
			if(arr[i] >= 0)
				dp[i] = dp[i-1] + arr[i];

			// arr[i]가 음수면, 
			// 1. dp[i-1] < |arr[i]| 이면 지금까지 최대합보다 손해가 되니까 리셋
			// 2. dp[i-1] > |arr[i]| 이면 그 다음수에서 합치더라도 이득
			else {
				if(dp[i-1] < -arr[i]) {
					dp[i] = 0; // 일단 0으로 리셋시킴
				} else {
					dp[i] = dp[i-1] + arr[i];
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(dp));
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		arr = new int[n+1]; // 근데 dp 문제에서 왜 일반적으로 n+1을 하는지 모르겠음
		dp = new int[n+1];
		
		for(int i=1; i<=n; i++) 
			arr[i] = sc.nextInt();
		
		dp[1] = arr[1]; // 첫번쨰값은 최대합이 본인

		
		dp(n);
		
	}
}