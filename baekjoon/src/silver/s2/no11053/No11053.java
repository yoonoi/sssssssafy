package silver.s2.no11053;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// 가장 긴 증가하는 부분 수열
public class No11053 {
	
	static int n;
	static int[] arr; 
	static int[] dp; // arr[n] 보다 작은 arr값들의 개수
	
	static Set<Integer> set = new HashSet<>(); // 중복값 빼주기 위해서 임시로 사용

	
	static int dp(int n) {
		
		for(int i=0; i<n; i++) {
			dp[i] = 1;
			
			for(int j=0; j<i; j++) {
				set.add(arr[j]);
			}
			
			for(int j=0; j<i; j++) {
				if(arr[j] < arr[i] && set.contains(arr[j])) {
					dp[i]++;
					set.remove(arr[j]);
				}
			}
		}
		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(dp));
		
		int maxCnt = 0;
		for(int i=0; i<n; i++) 
			maxCnt = Math.max(dp[i], maxCnt);
				
		return maxCnt;
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n];
		dp = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) 
			arr[i] = Integer.parseInt(st.nextToken());
		
		
		
		System.out.println(dp(n));
	}
	
}
