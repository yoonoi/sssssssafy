package silver.s2.no11053;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// 가장 긴 증가하는 부분 수열
public class No11053_2 {
	
	static int n;
	static int[] arr; 
	static int[] dp; // arr[n] 보다 작은 arr값들의 개수
	
	static Set<Integer> set; // 중복값 빼주기 위해서 임시로 사용
							 // 예시) 1 2 1 2 3 4 -> arr[3] 에서 arr[0], arr[2]를 두번세지 않기 위해 set을 사용
	
	static int dp(int n) {
		
		for(int i=0; i<n; i++) {
			dp[i] = 1; // 무조건 1개이상이니까 1로 설정
			
			set = new HashSet<>(); // i가 초기화될때마다 set 초기화한 후
			
			// i보다 작은 j에 대해 반복문을 돌리면서
			for(int j=0; j<i; j++) {
				// arr[i]보다 작고, set에 없는 숫자이면(중복일 때 카운트 안하기 위해)
				if(arr[j] < arr[i] && !set.contains(arr[j])) {
					// 카운트 한번 세주고
					dp[i]++;
					// set에 해당 작은수를 저장해준다.
					// 이후 반복문에서 같은 숫자가 나올때 중복 카운트를 막는다.
					set.add(arr[j]);
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
