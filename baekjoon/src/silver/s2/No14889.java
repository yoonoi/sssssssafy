package silver.s2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No14889 {
// 빽트래킹 스타트와 링크
// 지금까지 풀었던 백트래킹 문제들처럼 1~n까지 숫자들 중 2개씩 짝지으면 될듯
	
	static int n;
	static int[][] team; // 입력값 받을 배열(능력치)
	static StringTokenizer st;
	
	static int[] arr;
	static boolean[] isUsed;
	static StringBuilder sb = new StringBuilder();
	
	public static void recursion(int k) {
		
		if(k == n/2) {
			for(int i=0; i<n/2; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			
			return;
		}
		
		for(int i=0; i<n; i++) {
			
			if(!isUsed[i]) {
				arr[k] = i+1;
				isUsed[i] = true;
				
				recursion(k+1);
				
				isUsed[i] = false;
			}
		}
		
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		team = new int[n][n];
		arr = new int[n/2];
		isUsed = new boolean[n];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				team[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		recursion(0);
		System.out.println(sb);
		
	}
}
