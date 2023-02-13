package day0213;

import java.util.Scanner;

public class Gravity {
	// 가로길이, 쌓인 개수를 입력값으로 받는다고 치기
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 가로길이
		
		// 가로, 세로 최대 100이지만 입력받은 만큼만 계산해야 시간이 줄어드니까 배열도 그렇게 설정(층수는 최대100이니 유지)
		int[][] map = new int[100][n];
		
		for(int i=0; i<n; i++) {
			int height = sc.nextInt(); // 입력받은 층수
			
			for(int j=99; j>99-height; j--) 
				map[j][i] = 1;
		}
		
		// 잘 들어갔나 확인용
		for(int i=0; i<100; i++) {
			for(int j=0; j<n; j++) 
				System.out.print(map[i][j] + " ");
			System.out.println();
		}
		
		int maxCnt = Integer.MIN_VALUE; // 최대 낙차 구하기 위한 변수
		
		for(int i=89; i<100; i++) {
			int cnt = 0; // 연속인 0 세기
			
			for(int j=0; j<n; j++) {
				if(map[i][j] == 0) // 0 이면 cnt 세주고
					cnt++;
				else { // 1이면 maxCnt에 최대카운트 넣어준 뒤 cnt 초기화시키고 다시세기
					maxCnt = Math.max(maxCnt, cnt);
					cnt = 0;
					continue;
				}
			}
			if(cnt != n) 
				maxCnt = Math.max(maxCnt, cnt); // map[i]가 다 0이거나, 1 이후에 마지막까지 0일때를 대비			
		}
		System.out.println(maxCnt);		
	}
}
