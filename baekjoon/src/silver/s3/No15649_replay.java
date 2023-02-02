package silver.s3;

import java.util.Scanner;

public class No15649_replay {
	// 백트래킹 복습
	
	static int n, m;
	static int[] arr; // m 크기 결과배열
	static boolean[] isUsed; // n 크기 배열(해당 숫자가 사용됐는지)
	
	// 재귀함수
	// 현재 k개까지 수를 택한 상황에서 arr[k]를 정하는 함수
	
	// 맨 처음에 f(0)을 호출하면 arr[0]을 정한 후 f(1)을 호출한다.
	public static void recursion(int k) {
		
		// 종료조건
		// m 개를 모두 택했으니 수열을 출력한 후 함수 종료
		if(k == m) {
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0; i<n; i++) {
			// 작은수부터 아직 사용을 안했으면
			if(!isUsed[i]) {
				arr[k] = i + 1;
				isUsed[i] = true;
				
				recursion(k+1);
				
				// arr[k] = i + 1로 둔 상태에서 f(k+1)에 들어갔다가 모든 과정을 끝내고 돌아왔으니 false로 돌림
				isUsed[i] = false;
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[m]; // m 크기 결과배열 반환
		isUsed = new boolean[n];
		
		recursion(0);
		
		
	}
}
